/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_05.form;

import jp.terasoluna.fw.web.struts.form.ValidatorActionFormEx;

/**
 * �c�A�[���o�͗p��ActionForm�B<br>
 * 
 * �EUC_A01_05�F�c�A�[���o��
 * 
 * 
 */
public class UC_A01_05Form extends ValidatorActionFormEx {

    /**
     * serialVersionUID�B
     */
    private static final long serialVersionUID = 9149389442234864994L;

    /**
     * �\��ԍ��B
     */
    private String reserveNo = null;
    
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