/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a99_03.dto;

import java.io.Serializable;

/**
 * �ڋq�o�^�r�W�l�X���W�b�N�̏o�͏��ێ��N���X�B<br>
 * 
 * �EUC_A99_03�F�ڋq�o�^
 * 
 * 
 */
public class RP_A99_03_02_01Output implements Serializable {

    /**
     * �V���A���o�[�W����UID�B
     */
    private static final long serialVersionUID = 3822549983670186061L;

    /**
     *�V�K�ڋqID�B
     */
    private String customerCode = null;

    
    /**
     * �V�K�ڋqID��Ԃ��B
     * @return �V�K�ڋqID
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * �V�K�ڋqID��ݒ肷��B
     * @param customerCode �V�K�ڋqID
     */
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

}