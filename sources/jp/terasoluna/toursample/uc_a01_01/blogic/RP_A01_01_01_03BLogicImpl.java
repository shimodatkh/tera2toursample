/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_01.blogic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import jp.terasoluna.fw.service.thin.BLogic;
import jp.terasoluna.fw.service.thin.BLogicMessage;
import jp.terasoluna.fw.service.thin.BLogicMessages;
import jp.terasoluna.fw.service.thin.BLogicResult;
import jp.terasoluna.toursample.common.blogic.PriceCalculateBLogic;
import jp.terasoluna.toursample.common.blogic.TourDetailAcquireBLogic;
import jp.terasoluna.toursample.common.dto.PriceCalculateOutput;
import jp.terasoluna.toursample.common.dto.TourDetailAcquireOutput;
import jp.terasoluna.toursample.common.exception.RecordNotFoundException;
import jp.terasoluna.toursample.uc_a01_01.dto.RP_A01_01_01_03Input;
import jp.terasoluna.toursample.uc_a01_01.dto.RP_A01_01_01_03Output;

/**
 * <p>
 * �c�A�[�ڍ׏��擾�r�W�l�X���W�b�N�B<br>
 * ���ʋ@�\�𗘗p���ăc�A�[�ڍ׏�񓙂��擾���A�c�A�[�ڍ׉�ʂ�\�����邽�߂̏������s���B
 * </p>
 * 
 * 
 * 
 */
public class RP_A01_01_01_03BLogicImpl
        implements BLogic<RP_A01_01_01_03Input> {

    /**
     * ���ʏ������s��Null���ԋp���ꂽ�ꍇ�̃G���[���b�Z�[�W�B
     */
    public static final String ERROR_NOT_TOURCODE = "error.UC_A01_01.00002";

    /**
     * ���O�N���X�B
     */
    private static final Log log =
        LogFactory.getLog(RP_A01_01_01_03BLogicImpl.class);

    /**
     * �ڍ׏��擾���W�b�N(���ʏ���)
     */
    protected TourDetailAcquireBLogic tourDetailAcquireBLogic = null;

    /**
     * �ڍ׏��擾���W�b�N�̏�����
     * 
     * @param tourDetailAcquireBLogic �ڍ׏��擾���W�b�N
     */
    public void setTourDetailAcquireBLogic(
            TourDetailAcquireBLogic tourDetailAcquireBLogic) {

        this.tourDetailAcquireBLogic = tourDetailAcquireBLogic;
    }

    /**
     * �����Z�o���W�b�N (���ʏ���)
     */
    protected PriceCalculateBLogic priceCalculateBLogic = null;

    /**
     * �����Z�o���W�b�N�̏������B
     * 
     * @param priceCalculateBLogic �����Z�o���W�b�N
     */
    public void setPriceCalculateBLogic(
            PriceCalculateBLogic priceCalculateBLogic) {

        this.priceCalculateBLogic = priceCalculateBLogic;
    }

    /**
     * RP_A01_01_01_03 �ڍ׏��擾����
     * 
     * �c�A�[�ڍ׏��̎擾���s���A�w�肳�ꂽ�c�A�[�ڍ׏��̎擾�Ɏ��s�����ꍇ�͗�O�������s���B<br>
     *
     * @exception RecordNotFoundException �f�[�^�x�[�X����擾�������ʂ��Ȃ��ꍇ�ɔ��������O�N���X
     * @param input ��������
     * @return �r�W�l�X���W�b�N�̎��s���ʁABLogicResult�C���X�^���X
     *          ResultObject RP_A01_01_01_03Output �c�A�[�ڍ׏��
     */
    public BLogicResult execute(RP_A01_01_01_03Input input) {

        // �ԋp�l�̏���
        BLogicResult result = new BLogicResult();
        RP_A01_01_01_03Output output = new RP_A01_01_01_03Output();
        BLogicMessages messages = new BLogicMessages();


        // �c�A�[�ڍ׏��̎擾
        TourDetailAcquireOutput tourDetail = tourDetailAcquireBLogic
            .execute(input.getTourCode());

        // �c�A�[�ڍ׏�񂪎擾�ł��Ȃ��ꍇ�A��O�������s���B
        if (tourDetail == null) {
            if (log.isErrorEnabled()) {
                log.error(ERROR_NOT_TOURCODE
                          + ":�c�A�[�ڍ׏�񂪎擾�ł��܂���ł����B");
            }
            throw new RecordNotFoundException(ERROR_NOT_TOURCODE);
        }

        // �����̌v�Z ���ʏ����𗘗p���ăc�A�[��{�����A�l�����P���A�����Ȃǂ��擾����
        PriceCalculateOutput priceOutput = priceCalculateBLogic
            .execute(tourDetail.getBasePrice(), (Integer.parseInt(input.getAdultCountCondition())),
            		 Integer.parseInt(input.getChildCountCondition()));

        // �ԋp�l�̐ݒ�
        output.setTourDetail(tourDetail);
        output.setPriceOutput(priceOutput);

        // ��\�ҏ��擾���� ��\�ҏ�񂪑��݂��Ă��邩�m�F���s��
        if (input.getUSER_VALUE_OBJECT() == null) {

            messages.add(this.getClass().getName(),
                         new BLogicMessage("info.UC_A01_01.00002"));
            result.setMessages(messages);
        } else {
            messages.add(this.getClass().getName(),
                         new BLogicMessage("info.UC_A01_01.00001"));
            result.setMessages(messages);
        }
        
        // ���ӌ��E���v�]��������
        output.setRemarks(null);

        result.setResultObject(output);
        result.setResultString("success");
        return result;
    }
}
