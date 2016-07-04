/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *ac
 */
package jp.terasoluna.toursample.uc_a01_01.blogic;

import jp.terasoluna.fw.service.thin.BLogic;
import jp.terasoluna.fw.service.thin.BLogicResult;
import jp.terasoluna.toursample.uc_a01_01.dto.RP_A01_01_01_02Output;

/**
 * <p>
 * �c�A�[�������̓G���[���̌��ʃN���A�������s�Ȃ��r�W�l�X���W�b�N
 * </p>
 * 
 * 
 */

public class RP_A01_01_01_02_01BLogicImpl implements BLogic<Object> {

     /**
      * ���ʃN���A�������s�Ȃ��B<br>
      * <br>
      * 1:���͏��ƃR�[�h���X�g��񂩂猟�������𐶐����āA���������擾����B
      * <br>
      * 2:���̓G���[�ɂ��A�������ʂ̏o�̓N���X�ɓ��錋�ʂ͏�����Ԃ̂܂܁B 
      * <br>
      * 3:�y�[�W�����N�@�\����������B
      * 
      * @param param ���͒l�B
      * @return �N���A���ꂽ�������ʁB
      */
     public BLogicResult execute(Object param) {

        // ���s���ʂ�p�ӂ���B
        BLogicResult result = new BLogicResult();

        // �o�͏����i�[����N���X�𐶐�����B
        RP_A01_01_01_02Output rp_a01_01_01_02Output = 
            new RP_A01_01_01_02Output();
        
        // ���ʂ��Z�b�g����B
        result.setResultObject(rp_a01_01_01_02Output);
        result.setResultString("success");
        return result;
    }
}
