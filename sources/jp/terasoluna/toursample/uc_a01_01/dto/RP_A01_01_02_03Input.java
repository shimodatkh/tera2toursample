/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_01.dto;

import java.io.Serializable;

/**
 * RP_A01_01_02_03BLogic�̓��͒l�N���X�B
 *
 * 
 */
public class RP_A01_01_02_03Input implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -1934524108139283082L;
    
    /**
     * ���������B
     */
    private SearchCondition condition = null;
    
    /**
     * ����������Ԃ��B
     * @return condition
     */
    public SearchCondition getCondition() {
    
        return condition;
    }
    
    /**
     * ����������ݒ肷��B
     * @param condition ��������
     */
    public void setCondition(SearchCondition condition) {
    
        this.condition = condition;
    }
    
}
