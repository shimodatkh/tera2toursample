/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *ac
 */
package jp.terasoluna.toursample.uc_a01_01.blogic;

import java.util.HashMap;
import java.util.Map;

import jp.terasoluna.fw.service.thin.BLogic;
import jp.terasoluna.fw.service.thin.BLogicResult;

/**
 * �c�A�[�\�񊮗���ʂ���c�A�[������ʑJ�ڎ��A���������E���ʂ̃N���A���s�Ȃ�
 * �r�W�l�X���W�b�N<br>
 * 
 * �c�A�[�\�񊮗���c�A�[������ʂ�\�����A������Ԃŕ\�����邽�߂̏����ł���B
 * <br>
 * 
 * 
 */

public class RP_A01_01_04_01BLogicImpl implements BLogic<Object> {

     /**
      * �c�A�[���������ƌ��ʂ̃N���A�������s�Ȃ��B<br>
      * �c�A�[�o�^������A�c�A�[������ʂɑJ�ڂ���Ƃ��A�O��̌������e��
      * �N���A���邽�߂̏����ł���B
      * 
      * @param param ���͒l�B
      * @return �N���A���B
      */
     public BLogicResult execute(Object param) {

        // ���s���ʂ�p�ӂ���B
        BLogicResult result = new BLogicResult();

        // �o�͏����i�[����N���X�𐶐�����B
        Map<String, Object> resultObject = new HashMap<String, Object>();
        
        // �N���A����v���p�e�B��ݒ肷��B
        resultObject.put("arrCodeCondition", null);
        resultObject.put("depCodeCondition", null);
        resultObject.put("depDayYearCondition", null);
        resultObject.put("depDayMonthCondition", null);
        resultObject.put("depDayDayCondition", null);
        resultObject.put("tourDaysCondition", null);
        resultObject.put("adultCountCondition", null);
        resultObject.put("childCountCondition", null);
        resultObject.put("basePriceCondition", null);
        resultObject.put("tourInfoList", null);
        resultObject.put("allListInfoLineCount", 0);
        
        // ���ʂ��Z�b�g����B
        result.setResultObject(resultObject);
        result.setResultString("success");
        return result;
    }
}
