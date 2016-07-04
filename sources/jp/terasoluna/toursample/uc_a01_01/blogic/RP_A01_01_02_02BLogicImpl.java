/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_01.blogic;

import jp.terasoluna.fw.service.thin.BLogic;
import jp.terasoluna.fw.service.thin.BLogicResult;
import jp.terasoluna.toursample.uc_a01_01.dto.RP_A01_01_02_02Input;
import jp.terasoluna.toursample.uc_a01_01.dto.RP_A01_01_02_02Output;
import jp.terasoluna.toursample.uc_a01_01.dto.SearchCondition;


/**
 * �c�A�[�\��o�^�����i�[�r�W�l�X���W�b�N�B
 * <p>
 * </p>
 * 
 * 
 * 
 */
public class RP_A01_01_02_02BLogicImpl implements BLogic<RP_A01_01_02_02Input> {

    /**
     * �����������Z�b�V�����Ɋi�[����I�u�W�F�N�g�� <BR>
     * �ݒ肷��B
     * 
     * @param param
     *            ��������
     * @return �����i�[�I�u�W�F�N�g
     */
    public BLogicResult execute(RP_A01_01_02_02Input param) {

        // �����������Z�b�V�����ɓ����^�ɃZ�b�g����B
        SearchCondition condition = new SearchCondition();
        condition.setAdultCountCondition(param.getAdultCountCondition());
        condition.setArrCodeCondition(param.getArrCodeCondition());
        condition.setBasePriceCondition(param.getBasePriceCondition());
        condition.setChildCountCondition(param.getChildCountCondition());
        condition.setDepCodeCondition(param.getDepCodeCondition());
        condition.setDepDayDayCondition(param.getDepDayDayCondition());
        condition.setDepDayMonthCondition(param.getDepDayMonthCondition());
        condition.setDepDayYearCondition(param.getDepDayYearCondition());
        condition.setTourCode(param.getTourCode());
        condition.setTourDaysCondition(param.getTourDaysCondition());
        condition.setStartIndex(param.getStartIndex());
        condition.setRow(param.getRow());

        // �����������o�͒l�̃Z�b�g������B
        RP_A01_01_02_02Output output = new RP_A01_01_02_02Output();
        
        output.setCondition(condition);

        // �ԋp�l�ɐݒ肷��B
        BLogicResult result = new BLogicResult();
        result.setResultString("success");
        result.setResultObject(output);
        return result;
    }

}
