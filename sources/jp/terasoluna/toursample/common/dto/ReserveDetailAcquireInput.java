/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.common.dto;

import java.io.Serializable;

/**
 * �\��ڍ׏��̌����������i�[����N���X�B
 * <br>
 * �E���ʏ���CP0006�F�\��ڍ׎擾
 * 
 * 
 */
public class ReserveDetailAcquireInput implements Serializable {
    
    /**
     * �V���A���o�[�W����UID�B
     */
    private static final long serialVersionUID = -4602719187723119151L;

    /**
     * �\��ԍ��B
     */
    private String reserveNo = null;

    /**
     * �ڋqID�B
     */
    private String customerCode = null;

    /**
     * �ڋqID��Ԃ��B
     * @return �ڋqID
     */
    
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * �ڋqID��ݒ肷��B
     * @param customerCode �ڋqID
     */
    
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

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
    
    

}
