/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_02.dto;

import java.io.Serializable;

import jp.terasoluna.toursample.common.TourUVO;

/**
 * RP_A01_02_01_02BLogic�̓��͒l�N���X�B
 *
 * 
 */
public class RP_A01_02_01_02Input implements Serializable {
    
    /**
     * serialVersionUID�B
     */
    private static final long serialVersionUID = 6414107453404025742L;

    /**
     * �\��ԍ��B
     */
    private String reserveNo = null;

    /**
     * �ڋq���B
     */
    private TourUVO USER_VALUE_OBJECT = null;

    
    /**
     * �\��ԍ���Ԃ��B
     * @return �\��ԍ�
     */
    public String getReserveNo() {
    
        return reserveNo;
    }

    
    /**
     * �\��ԍ���ݒ肷��B
     * @param reserveNo �\��ԍ�
     */
    public void setReserveNo(String reserveNo) {
    
        this.reserveNo = reserveNo;
    }

    
    /**
     * �ڋq����Ԃ��B
     * @return �ڋq���
     */
    public TourUVO getUSER_VALUE_OBJECT() {
    
        return USER_VALUE_OBJECT;
    }

    
    /**
     * �ڋq����ݒ肷��B
     * @param user_value_object �ڋq���
     */
    public void setUSER_VALUE_OBJECT(TourUVO user_value_object) {
    
        USER_VALUE_OBJECT = user_value_object;
    }

}
