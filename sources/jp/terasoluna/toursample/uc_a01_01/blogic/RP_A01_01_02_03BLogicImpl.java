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
import jp.terasoluna.fw.service.thin.BLogicResult;
import jp.terasoluna.toursample.common.exception.TourSystemException;
import jp.terasoluna.toursample.uc_a01_01.dto.RP_A01_01_02_03Input;
import jp.terasoluna.toursample.uc_a01_01.dto.RP_A01_01_02_03Output;
import jp.terasoluna.toursample.uc_a01_01.dto.SearchCondition;


/**
 * �c�A�[�\��o�^�����擾�r�W�l�X���W�b�N�B<br>
 * RP_A01_01_02_02BLogic�Ńo�b�N�A�b�v�����c�A�[�����������擾���A�t�H�[���ւ�
 * ���f���s�Ȃ��B<br>
 * �o�b�N�A�b�v�����c�A�[���������̎擾�Ɏ��s�����ꍇ��
 * {@link TourSystemException}�����������B
 * 
 * 
 * 
 * 
 */
public class RP_A01_01_02_03BLogicImpl
        implements BLogic<RP_A01_01_02_03Input> {

    /**
     * ���O�N���X�B
     */
    private static final Log log = 
        LogFactory.getLog(RP_A01_01_02_03BLogicImpl.class);

    /**
     * �Z�b�V��������o�b�N�A�b�v�����c�A�[���������̎擾�Ɏ��s�����ꍇ��
     * �G���[���b�Z�[�W�R�[�h�B
     */
    private static final String GET_CONDITION_ERROR =
        "error.UC_A01_01.00003";
    
    /**
     * �Z�b�V�����ɐݒ肳��Ă��������i�[�I�u�W�F�N�g���� �����������擾���A
     * success��ԋp����B<br>
     * �擾�ł��Ȃ������ꍇ��{@link TourSystemException}�����������B
     * 
     * @param param
     *            �����i�[�I�u�W�F�N�g
     * @return ��������
     * 
     * @throws TourSystemException �c�A�[���������i�[�I�u�W�F�N�g�̎擾��
     *              ���s�����ꍇ
     */
    public BLogicResult execute(RP_A01_01_02_03Input param) {

        // �ԋp�l�𐶐�����B
        BLogicResult result = new BLogicResult();

        // �Z�b�V�����ɓ����I�u�W�F�N�g�𐶐�����B
        RP_A01_01_02_03Output output = new RP_A01_01_02_03Output();

        // �������擾�ł��Ȃ������Ƃ��ɂ̓G���[��ԋp����
        if (param.getCondition() == null) {
            if (log.isErrorEnabled()) {
                log.error(GET_CONDITION_ERROR + ": �p�b�N�A�b�v�����c�A�[����"
                            + "�����̎擾�����s���܂����B");
            }
            throw new TourSystemException(GET_CONDITION_ERROR);
            
        } else {

            // �������擾���o�͒l�ɃZ�b�g����B
            SearchCondition condition = param.getCondition();
            output.setAdultCountCondition(condition.getAdultCountCondition());
            output.setArrCodeCondition(condition.getArrCodeCondition());
            output.setBasePriceCondition(condition.getBasePriceCondition());
            output.setChildCountCondition(condition.getChildCountCondition());
            output.setDepCodeCondition(condition.getDepCodeCondition());
            output.setDepDayDayCondition(condition.getDepDayDayCondition());
            output.setDepDayMonthCondition(condition.getDepDayMonthCondition());
            output.setDepDayYearCondition(condition.getDepDayYearCondition());
            output.setTourCode(condition.getTourCode());
            output.setTourDaysCondition(condition.getTourDaysCondition());
            output.setStartIndex(condition.getStartIndex());
            output.setRow(condition.getRow());

            // �ԋp�l�ɐݒ肷��
            result.setResultString("success");
            result.setResultObject(output);
            return result;
        }
    }
}
