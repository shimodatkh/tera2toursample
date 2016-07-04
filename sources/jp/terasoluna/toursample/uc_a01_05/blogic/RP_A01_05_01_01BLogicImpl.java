/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_05.blogic;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import jp.terasoluna.toursample.common.blogic.PriceCalculateBLogic;
import jp.terasoluna.toursample.common.blogic.ReserveDetailAcquireBLogic;
import jp.terasoluna.toursample.common.dto.PriceCalculateOutput;
import jp.terasoluna.toursample.common.dto.ReserveDetailAcquireInput;
import jp.terasoluna.toursample.common.dto.ReserveDetailAcquireOutput;
import jp.terasoluna.toursample.common.exception.RecordNotFoundException;
import jp.terasoluna.toursample.common.util.DateUtil;
import jp.terasoluna.toursample.uc_a01_05.dto.RP_A01_05_01_01Input;
import jp.terasoluna.toursample.uc_a01_05.dto.RP_A01_05_01_01Output;

/**
 * ���[�o�͏��擾�r�W�l�X���W�b�N�B
 * <p>
 * �E�\��ڍ׏��擾�r�W�l�X���W�b�N(���ʏ����FCP0006)�����s����B<br>
 * �E���������\���񂪂Ȃ��ꍇ�A��O�������s���B<br>
 * ��O�N���X�FRecordNotFoundException<br>
 * �E�Y����𕶎���ɕϊ�����B<br>
 * �E�x�������𕶎���ɕϊ�����B<br>
 * �E�������v�Z����N���X(���ʏ����FCP0009)�����s����B<br>
 * �E�������ݒ肷��B<br>
 * </p>
 * 
 * 
 */
public class RP_A01_05_01_01BLogicImpl implements RP_A01_05_01_01BLogic {

    /**
     * ���O�N���X�B
     */
    private static final Log log = 
        LogFactory.getLog(RP_A01_05_01_01BLogicImpl.class);

    /**
     * �\��ڍ׏��擾�N���X�B(���ʏ���CP0006) Spring�ɂ��C���X�^���X��������ݒ肳���B
     */
    protected ReserveDetailAcquireBLogic reserveDetailAcquireBLogic = null;

    /**
     * �����v�Z�N���X�B(���ʏ���CP0009) Spring�ɂ��C���X�^���X��������ݒ肳���B
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
     * ���[�o�͏����擾����B
     * <p>
     * �E�\��ԍ����擾���A���ʏ���CP0006��CP0009�����s����B<br>
     * �E�ڋq�����擾����B<br>
     * �E��������擾����B<br>
     * �E�擾���������o�͒l�ɐݒ肷��B
     * </P>
     * 
     * @param param
     *            ���[�o�͏��擾����
     * @return ���[�o�͏�񃊃X�g
     * 
     * @exception
     * jp.terasoluna.toursample.common.exception.RecordNotFoundException
     * �f�[�^�x�[�X����擾�������ʂ��Ȃ��ꍇ�ɔ���
     */
    public List<RP_A01_05_01_01Output> selectReportData(
            RP_A01_05_01_01Input param) {

        // �\��ڍ׏��擾�r�W�l�X���W�b�N�̏o�͒l�N���X�𐶐�����B
        RP_A01_05_01_01Output blogicOutput = new RP_A01_05_01_01Output();

        // �\��ڍ׏��擾�r�W�l�X���W�b�N�̓��͒l�N���X�𐶐�����B
        ReserveDetailAcquireInput reserveDetailAcquireInput = new ReserveDetailAcquireInput();

        // �p�����[�^����\��ԍ��A�ڋq�I�u�W�F�N�g�����o���B
        // �\��ڍ׏��擾�r�W�l�X���W�b�N�̓��͒l�N���X�ɏ���ݒ肷��B
        reserveDetailAcquireInput.setReserveNo(param.getReserveNo());
        reserveDetailAcquireInput.setCustomerCode(param.getTourUVO()
            .getCustomerCode());

        // �\��ڍ׏��擾�r�W�l�X���W�b�N(���ʏ����FCP0006)�����s����B
        ReserveDetailAcquireOutput reserveDetailResult = reserveDetailAcquireBLogic
            .execute(reserveDetailAcquireInput);

        // ���������\���񂪂Ȃ��ꍇ�A��O�������s���B
        // ��O�N���X�FRecordNotFoundException
        if (reserveDetailResult == null) {

            if (log.isErrorEnabled()) {
                log.error("error.common.00008:�\���񂪌�����܂���B");
            }

            throw new RecordNotFoundException("error.common.00008");
        }

        // �Y����𕶎���ɕϊ�����B
        String conductor = null;
        if (reserveDetailResult.getConductor()) {
            conductor = "�L";

        } else {
            conductor = "��";
        }
        
        // �x�������𕶎���i"yyyy�NMM��dd��"or"�x���ς�"�j�ɕϊ�����B
        String paymentTimeLimit = null;
        if (reserveDetailResult.isTransfer()){
            paymentTimeLimit = "�x���ς�";
            
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy�NMM��dd��");
            paymentTimeLimit = sdf.format(reserveDetailResult.
                                                 getPaymentTimeLimit());
        }

        // �\������o�͒l�ɐݒ肷��B
        blogicOutput.setReserveNo(param.getReserveNo());
        blogicOutput.setTourName(reserveDetailResult.getTourName());
        blogicOutput.setReservedDay(reserveDetailResult.getReservedDay());
        blogicOutput.setDepDay(reserveDetailResult.getDepDay());
        blogicOutput.setTourDays(reserveDetailResult.getTourDays());
        blogicOutput.setDepName(reserveDetailResult.getDepName());
        blogicOutput.setArrName(reserveDetailResult.getArrName());
        blogicOutput.setConductor(conductor);
        blogicOutput.setAccomName(reserveDetailResult.getAccomName());
        blogicOutput.setAccomTel(reserveDetailResult.getAccomTel());
        blogicOutput.setTourAbs(reserveDetailResult.getTourAbs());
        blogicOutput.setAdultCount(reserveDetailResult.getAdultCount());
        blogicOutput.setChildCount(reserveDetailResult.getChildCount());
        blogicOutput.setRemarks(reserveDetailResult.getRemarks());
        blogicOutput.setPaymentTimeLimit(paymentTimeLimit);

        // �������v�Z����N���X(���ʏ����FCP0009)�����s����B
        PriceCalculateOutput priceCalcResult = priceCalculateBLogic
            .execute(reserveDetailResult.getBasePrice(), reserveDetailResult
                .getAdultCount(), reserveDetailResult.getChildCount());

        // ���������o�͒l�ɐݒ肷��B
        blogicOutput.setAdultUnitPrice(priceCalcResult.getAdultUnitPrice());
        blogicOutput.setChildUnitPrice(priceCalcResult.getChildUnitPrice());
        blogicOutput.setAdultPrice(priceCalcResult.getAdultPrice());
        blogicOutput.setChildPrice(priceCalcResult.getChildPrice());
        blogicOutput.setSumPrice(priceCalcResult.getSumPrice());

        // �ڋq�����o�͒l�ɐݒ肷��B
        blogicOutput.setCustomerCode(param.getTourUVO().getCustomerCode());
        blogicOutput.setCustomerKana(param.getTourUVO().getCustomerKana());
        blogicOutput.setCustomerName(param.getTourUVO().getCustomerName());
        blogicOutput.setCustomerBirth(param.getTourUVO().getCustomerBirth());
        blogicOutput.setCustomerJob(param.getTourUVO().getCustomerJob());
        blogicOutput.setCustomerMail(param.getTourUVO().getCustomerMail());
        blogicOutput.setCustomerTel(param.getTourUVO().getCustomerTel());
        blogicOutput.setCustomerPost(param.getTourUVO().getCustomerPost());
        blogicOutput.setCustomerAdd(param.getTourUVO().getCustomerAdd());

        // ��������o�͒l�ɐݒ肷��B
        Date printDay = DateUtil.getTodayDate();
        blogicOutput.setPrintDay(printDay);

        // ���[�o�͏�񃊃X�g�𐶐�����B
        List<RP_A01_05_01_01Output> list = new ArrayList<RP_A01_05_01_01Output>();

        // ���X�g�ɒ��[�o�͂�������B
        list.add(blogicOutput);

        return list;
    }

}