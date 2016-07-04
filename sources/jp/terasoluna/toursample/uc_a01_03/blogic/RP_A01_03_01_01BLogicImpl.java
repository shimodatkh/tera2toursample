/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_03.blogic;

import jp.terasoluna.fw.service.thin.BLogic;
import jp.terasoluna.fw.service.thin.BLogicResult;
import jp.terasoluna.toursample.common.blogic.ReserveDetailAcquireBLogic;
import jp.terasoluna.toursample.common.dto.ReserveDetailAcquireInput;
import jp.terasoluna.toursample.common.dto.ReserveDetailAcquireOutput;
import jp.terasoluna.toursample.common.exception.RecordNotFoundException;
import jp.terasoluna.toursample.uc_a01_03.dto.RP_A01_03_01_01Input;
import jp.terasoluna.toursample.uc_a01_03.dto.RP_A01_03_01_01Output;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * �c�A�[�\��ύX���擾��BLogic�N���X�B<br>
 * 
 * �EUC_A01_03�F�c�A�[�\��ύX
 * 
 * 
 */
public class RP_A01_03_01_01BLogicImpl implements BLogic<RP_A01_03_01_01Input> {

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
        LogFactory.getLog(RP_A01_03_01_01BLogicImpl.class);

    /**
     * �c�A�[�\��ڍ׏��擾�r�W�l�X���W�b�N�B<br>
     * �\��ڍ׏��擾�N���X(���ʏ���CP0006)�ŗ\������擾
     * 
     * @param params
     *            �F�\��ԍ��A�ڋq�ԍ�
     * @return �c�A�[�\��ڍ׏��
     * @exception RecordNotFoundException
     *                �\���񂪂Ȃ��ꍇ�̗�O
     */
    public BLogicResult execute(RP_A01_03_01_01Input params) {

        // �o�͏����i�[����N���X�𐶐�����B
        RP_A01_03_01_01Output result = new RP_A01_03_01_01Output();

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
        
        // �c�A�[�\��ڍ׏����o�͒l�ɃZ�b�g����B
        result.setReserveDetail(reserveDetail);

        // �o�͒l�𐶐�����B
        BLogicResult bResult = new BLogicResult();
        bResult.setResultObject(result);
        bResult.setResultString("success");

        return bResult;

    }

}