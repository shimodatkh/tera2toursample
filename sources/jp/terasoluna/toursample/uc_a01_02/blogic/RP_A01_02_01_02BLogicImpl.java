/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_02.blogic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import jp.terasoluna.fw.service.thin.BLogic;
import jp.terasoluna.fw.service.thin.BLogicResult;
import jp.terasoluna.fw.util.PropertyUtil;
import jp.terasoluna.toursample.common.Constants;
import jp.terasoluna.toursample.common.blogic.PriceCalculateBLogic;
import jp.terasoluna.toursample.common.blogic.ReserveDetailAcquireBLogic;
import jp.terasoluna.toursample.common.dto.PriceCalculateOutput;
import jp.terasoluna.toursample.common.dto.ReserveDetailAcquireInput;
import jp.terasoluna.toursample.common.dto.ReserveDetailAcquireOutput;
import jp.terasoluna.toursample.common.exception.RecordNotFoundException;
import jp.terasoluna.toursample.uc_a01_02.dto.RP_A01_02_01_02Input;
import jp.terasoluna.toursample.uc_a01_02.dto.RP_A01_02_01_02Output;

/**
 * �c�A�[�\��ڍ׏��擾�r�W�l�X���W�b�N�B
 * <p>
 * �E�\��ڍ׏����擾����(���ʏ���CP0006)�B<br>
 * �E���������\���񂪂Ȃ��ꍇ�A��O�������s���B<br>
 * ��O�N���X�FRecordNotFoundException<BR>
 * �E�������v�Z����(���ʏ����FCP0009)�B
 * </p>
 * 
 * 
 * 
 */

public class RP_A01_02_01_02BLogicImpl implements BLogic<RP_A01_02_01_02Input> {

    /**
     * ���ʏ������s��Null���ԋp���ꂽ�ꍇ�̃G���[���b�Z�[�W�B
     */
    public static final String ERROR_NOT_RESERVED = "error.common.00008";

    /**
     * ���O�N���X�B
     */
    private static final Log log = 
        LogFactory.getLog(RP_A01_02_01_02BLogicImpl.class);

    /**
     * �\��ڍ׏��擾�N���X(���ʏ���CP0006)�B Spring�ɂ��C���X�^���X��������ݒ肳���B
     */
    protected ReserveDetailAcquireBLogic reserveDetailAcquireBLogic = null;

    /**
     * �����v�Z�N���X(���ʏ���CP0009)�B Spring�ɂ��C���X�^���X��������ݒ肳���B
     */
    protected PriceCalculateBLogic priceCalculateBLogic = null;

    /**
     * �����v�Z�N���X��Ԃ��B
     * 
     * @return �����v�Z�N���X
     */
    public PriceCalculateBLogic getPriceCalculateBLogic() {

        return priceCalculateBLogic;
    }

    /**
     * �����v�Z�N���X��ݒ肷��B
     * 
     * @param priceCalculateBLogic
     *            �����v�Z�N���X
     */
    public void setPriceCalculateBLogic(
            PriceCalculateBLogic priceCalculateBLogic) {

        this.priceCalculateBLogic = priceCalculateBLogic;
    }

    /**
     * �\��ڍ׏��擾�N���X��Ԃ��B
     * 
     * @return �\��ڍ׏��擾�N���X
     */
    public ReserveDetailAcquireBLogic getReserveDetailAcquireBLogic() {

        return reserveDetailAcquireBLogic;
    }

    /**
     * �\��ڍ׏��擾�N���X��ݒ肷��B
     * 
     * @param reserveDetailAcquireBLogic
     *            �\��ڍ׏��擾�N���X
     */
    public void setReserveDetailAcquireBLogic(
            ReserveDetailAcquireBLogic reserveDetailAcquireBLogic) {

        this.reserveDetailAcquireBLogic = reserveDetailAcquireBLogic;
    }

    /**
     * �\��ڍ׏����擾����B <BR>
     * �\��ڍ׏��̎擾�����Ɉ�v����\��ڍ׏���ԋp����B
     * 
     * @param param
     *            �\��ڍ׏��擾����
     * @return �\��ڍ׏�񃊃X�g
     * 
     * @exception
     * jp.terasoluna.toursample.common.exception.RecordNotFoundException
     * �f�[�^�x�[�X����擾�������ʂ��Ȃ��ꍇ�ɔ���
     */
    public BLogicResult execute(RP_A01_02_01_02Input param) {

        // ���s���ʂ��i�[����B
        BLogicResult result = new BLogicResult();

        // �o�͏����i�[����N���X�𐶐�����B
        RP_A01_02_01_02Output rp_a01_02_01_02BLogicOutput = 
            new RP_A01_02_01_02Output();

        // �\��ڍ׏��擾�����̈����̃N���X�𐶐�����B
        ReserveDetailAcquireInput reserveDetailAcquireInput = 
            new ReserveDetailAcquireInput();

        // �\��ڍ׏��擾�����̈�����ݒ肷��B
        reserveDetailAcquireInput.setReserveNo(param.getReserveNo());
        reserveDetailAcquireInput.setCustomerCode(param.getUSER_VALUE_OBJECT()
            .getCustomerCode());

        // �\��ڍ׏����擾����(���ʏ���CP0006)�B
        ReserveDetailAcquireOutput reserveDetail = 
            reserveDetailAcquireBLogic.execute(reserveDetailAcquireInput);

        // ���������\���񂪂Ȃ��ꍇ�A��O�������s���B
        // ��O�N���X�FRecordNotFoundException
        if (reserveDetail == null) {

            if (log.isErrorEnabled()) {
                log.error(ERROR_NOT_RESERVED + ":�\���񂪌�����܂���B");
            }

            throw new RecordNotFoundException(ERROR_NOT_RESERVED);
        }

        // �������v�Z����(���ʏ����FCP0009)�B
        PriceCalculateOutput price = priceCalculateBLogic.execute(reserveDetail
            .getBasePrice(), reserveDetail.getAdultCount(), reserveDetail
            .getChildCount());

        // �c�A�[�\��ڍ׏����o�͒l�ɃZ�b�g����B
        rp_a01_02_01_02BLogicOutput.setReserveDetail(reserveDetail);
        rp_a01_02_01_02BLogicOutput.setPrice(price);
        rp_a01_02_01_02BLogicOutput.setPaymentMethod(PropertyUtil
            .getProperty(Constants.PAYMENT_METHOD));
        rp_a01_02_01_02BLogicOutput.setPaymentCompanyName(PropertyUtil
            .getProperty(Constants.PAYMENT_COMPANY_NAME));
        rp_a01_02_01_02BLogicOutput.setPaymentAccount(PropertyUtil
            .getProperty(Constants.PAYMENT_ACCOUNT));
        rp_a01_02_01_02BLogicOutput.setReferenceName(PropertyUtil
            .getProperty(Constants.COMPANY_NAME));
        rp_a01_02_01_02BLogicOutput.setReferenceEmail(PropertyUtil
            .getProperty(Constants.COMPANY_MAIL));
        rp_a01_02_01_02BLogicOutput.setReferenceTel(PropertyUtil
            .getProperty(Constants.COMPANY_TEL));

        // ���ʂ��Z�b�g����B
        result.setResultObject(rp_a01_02_01_02BLogicOutput);
        result.setResultString("success");

        return result;
    }

}
