/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_04.blogic;

import jp.terasoluna.fw.service.thin.BLogic;
import jp.terasoluna.fw.service.thin.BLogicResult;
import jp.terasoluna.toursample.common.TourUVO;
import jp.terasoluna.toursample.common.blogic.PriceCalculateBLogic;
import jp.terasoluna.toursample.common.blogic.ReserveDetailAcquireBLogic;
import jp.terasoluna.toursample.common.dto.PriceCalculateOutput;
import jp.terasoluna.toursample.common.dto.ReserveDetailAcquireInput;
import jp.terasoluna.toursample.common.dto.ReserveDetailAcquireOutput;
import jp.terasoluna.toursample.common.exception.RecordNotFoundException;
import jp.terasoluna.toursample.uc_a01_04.dto.RP_A01_04_01_01Input;
import jp.terasoluna.toursample.uc_a01_04.dto.RP_A01_04_01_01Output;
import jp.terasoluna.toursample.uc_a01_04.exception.CannotCancelException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * �\����擾�����N���X�B<br>
 * 
 * 
 */
public class RP_A01_04_01_01BLogicImpl implements BLogic<RP_A01_04_01_01Input> {

    /**
     * �����Z�o�N���X�B
     */
    private PriceCalculateBLogic priceCalculateBLogic = null;

    /**
     * �\����擾�N���X �B
     */
    private ReserveDetailAcquireBLogic reserveDetailAcquireBLogic = null;

    /**
     * �����Z�o�N���X���擾����B
     * 
     * @return priceCalculateBLogic
     */
    public PriceCalculateBLogic getPriceCalculateBLogic() {

        return this.priceCalculateBLogic;
    }

    /**
     * �����Z�o�N���X��ݒ肷��B
     * 
     * @param priceCalculateBLogic
     */
    public void setPriceCalculateBLogic(
            PriceCalculateBLogic priceCalculateBLogic) {

        this.priceCalculateBLogic = priceCalculateBLogic;
    }

    /**
     * �\����擾�N���X���擾����B
     * 
     * @return reserveDetailAcquireBLogic
     */
    public ReserveDetailAcquireBLogic getReserveDetailAcquireBLogic() {

        return this.reserveDetailAcquireBLogic;
    }

    /**
     * �\����擾�N���X��ݒ肷��B
     * 
     * @param reserveDetailAcquireBLogic
     */
    public void setReserveDetailAcquireBLogic(
            ReserveDetailAcquireBLogic reserveDetailAcquireBLogic) {

        this.reserveDetailAcquireBLogic = reserveDetailAcquireBLogic;
    }

    /**
     * ���O�N���X�B
     */
    private static final Log log = 
        LogFactory.getLog(RP_A01_04_01_01BLogicImpl.class);

    /**
     * �\����A�����������ʏ������擾����B<br>
     * �擾���������o�͒l�ɃZ�b�g����B<br>
     * 
     * @exception RecordNotFoundException
     *                ���������\���񂪂Ȃ��ꍇ�B
     * @exception CannotCancelException
     *                �������U���ς݂̏ꍇ�B
     * @param rp_a01_04_01_01Input
     * @return �r�W�l�X���W�b�N�̎��s���ʁABLogicResult�C���X�^���X�B
     */
    public BLogicResult execute(RP_A01_04_01_01Input rp_a01_04_01_01Input) {

        // ���s���ʂ��i�[����B
        BLogicResult result = new BLogicResult();

        // �o�͏����i�[����N���X�𐶐�����B
        RP_A01_04_01_01Output rp_A01_04_01_01Output = new RP_A01_04_01_01Output();

        // �\�����������������̃N���X�𐶐�����B
        ReserveDetailAcquireInput input = new ReserveDetailAcquireInput();

        // ReserveDetailAcquireInput�ɗ\��ԍ����i�[����B
        input.setReserveNo(rp_a01_04_01_01Input.getReserveNo());

        // �ڋq�����i�[����B
        TourUVO uvo = rp_a01_04_01_01Input.getUSER_VALUE_OBJECT();

        // ReserveDetailAcquireInput�Ɍڋq�ԍ����i�[����B
        input.setCustomerCode(uvo.getCustomerCode());

        // ���ʏ������\������擾����B
        ReserveDetailAcquireOutput reserveDetail = reserveDetailAcquireBLogic
                .execute(input);

        // ���������\���񂪂Ȃ��ꍇ�A��O�������s���B
        if (reserveDetail == null) {

            if (log.isErrorEnabled()) {
                log.error("error.common.00008:�\���񂪌�����܂���B");
            }

            throw new RecordNotFoundException("error.common.00008");
        }

        // �c�A�[�̊�{�����B
        int basePrice = reserveDetail.getBasePrice();

        // ��l�̗\��l���B
        int adultCount = reserveDetail.getAdultCount();

        // �q�ǂ��̗\��l���B
        int childCount = reserveDetail.getChildCount();

        // ���ʏ�����藿�������擾���A�Z�o����B
        PriceCalculateOutput price = priceCalculateBLogic.execute(basePrice,
                adultCount, childCount);

        // �\����A���������o�͒l�ɃZ�b�g����B
        rp_A01_04_01_01Output.setReserveDetail(reserveDetail);
        rp_A01_04_01_01Output.setPrice(price);

        // ���ʂ��Z�b�g����B
        result.setResultObject(rp_A01_04_01_01Output);
        result.setResultString("success");

        return result;
    }
}