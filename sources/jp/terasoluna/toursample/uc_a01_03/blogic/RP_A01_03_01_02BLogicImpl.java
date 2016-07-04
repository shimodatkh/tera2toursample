/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_03.blogic;

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
import jp.terasoluna.toursample.uc_a01_03.dto.RP_A01_03_01_02Input;
import jp.terasoluna.toursample.uc_a01_03.dto.RP_A01_03_01_02Output;

/**
 * �c�A�[�\��ύX�m�F��BLogic�N���X�B<br>
 * 
 * �EUC_A01_03�F�c�A�[�\��ύX
 * 
 * 
 */
public class RP_A01_03_01_02BLogicImpl implements BLogic<RP_A01_03_01_02Input> {

    /**
     * ���ʏ������s��Null���ԋp���ꂽ�ꍇ�̃G���[���b�Z�[�W�B
     */
    public static final String ERROR_NOT_RESERVED = "error.common.00008";

    /**
     * �\��ڍ׏��擾�N���X(���ʏ���CP0006)�B Spring�ɂ��C���X�^���X��������ݒ肳���B
     */
    protected ReserveDetailAcquireBLogic reserveDetailAcquireBLogic = null;

    /**
     * ���ʏ���CP0006��ݒ肷��B
     * 
     * @param reserveDetailAcquireBLogic
     *            �ݒ肷�鋤�ʏ���CP0006
     */
    public void setReserveDetailAcquireBLogic(
            ReserveDetailAcquireBLogic reserveDetailAcquireBLogic) {

        this.reserveDetailAcquireBLogic = reserveDetailAcquireBLogic;
    }

    /**
     * ���O�N���X�B
     */
    private static final Log log = 
        LogFactory.getLog(RP_A01_03_01_02BLogicImpl.class);
    
    /**
     * �����v�Z�N���X(���ʏ���CP0009)�B Spring�ɂ��C���X�^���X��������ݒ肳���B
     */
    protected PriceCalculateBLogic priceCalculateBLogic = null;

    /**
     * �c�A�[�\��ύX�m�F�r�W�l�X���W�b�N�B<br>
     * �c�A�[�ƃc�A�[�ɎQ������l������P���A���v�������v�Z���A �\����e���m�F����B<br>
     * 
     * @param params
     *            �����v�Z�p�̏��
     * @return �c�A�[�\��ڍ׏��
     */
    public BLogicResult execute(RP_A01_03_01_02Input params) {

        // �o�͏����i�[����N���X�𐶐�����B
        RP_A01_03_01_02Output result = new RP_A01_03_01_02Output();
        
        // �\��ڍ׏��擾�����̈����̃N���X�𐶐�����B
        ReserveDetailAcquireInput reserveDetailAcquireInput = 
            new ReserveDetailAcquireInput();

        // �\��ڍ׏��擾�����̈�����ݒ肷��B
        reserveDetailAcquireInput.setReserveNo(params.getReserveNo());
        reserveDetailAcquireInput.setCustomerCode(params.getUSER_VALUE_OBJECT()
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
        
        //���ӌ����v�]�Ƒ�l�l���A�q���l����ݒ肷��
        reserveDetail.setAdultCount(params.getReserveDetail().getAdultCount());
        reserveDetail.setChildCount(params.getReserveDetail().getChildCount());
        reserveDetail.setRemarks(params.getReserveDetail().getRemarks());
        
        // �������v�Z����(���ʏ����FCP0009)�B
        PriceCalculateOutput price = 
            priceCalculateBLogic.execute(reserveDetail.getBasePrice(), 
                                        reserveDetail.getAdultCount(), 
                                        reserveDetail.getChildCount());

        // �c�A�[�\��m�F�����o�͒l�ɃZ�b�g����B
        result.setReserveDetail(reserveDetail);
        result.setPrice(price);
        result.setPaymentMethod(PropertyUtil
            .getProperty(Constants.PAYMENT_METHOD));
        result.setPaymentCompanyName(PropertyUtil
            .getProperty(Constants.PAYMENT_COMPANY_NAME));
        result.setPaymentAccount(PropertyUtil
            .getProperty(Constants.PAYMENT_ACCOUNT));
        result.setReferenceName(PropertyUtil
            .getProperty(Constants.COMPANY_NAME));
        result.setReferenceEmail(PropertyUtil
            .getProperty(Constants.COMPANY_MAIL));
        result.setReferenceTel(PropertyUtil.getProperty(Constants.COMPANY_TEL));

        // �o�͒l�𐶐�����B
        BLogicResult bResult = new BLogicResult();
        bResult.setResultObject(result);
        bResult.setResultString("success");

        return bResult;
    }

    /**
     * �����v�Z�N���X(���ʏ���CP0009)��ݒ肷��B
     * 
     * @param priceCalculateBLogic
     *            �����v�Z�N���X(���ʏ���CP0009)
     */
    public void setPriceCalculateBLogic(
            PriceCalculateBLogic priceCalculateBLogic) {

        this.priceCalculateBLogic = priceCalculateBLogic;
    }

}