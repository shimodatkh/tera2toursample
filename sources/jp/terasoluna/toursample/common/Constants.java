/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.common;

import java.io.Serializable;

/**
 * �萔�t�B�[���h�l�̐ݒ�N���X�B
 * <p>
 * �@�EPAYMENT_METHOD:�x�����@<br>
 * �@�EPAYMENT_COMPANY_NAME:��s��<br>
 * �@�EPAYMENT_ACCOUNT:��s����<br>
 * �@�ECOMPANY_NAME:�⍇���於<br>
 * �@�ECOMPANY_MAIL:�⍇���惁�[���A�h���X<br>
 * �@�ECOMPANY_TEL:�⍇����d�b�ԍ�
 * </p>
 * 
 * 
 *
 */
public class Constants implements Serializable {

    /**
     * serialVersionUID�B
     */
    private static final long serialVersionUID = -3092695814650199675L;

    /**
     * �v���p�e�B�t�@�C���̎x�����@�B
     */
    public static final String PAYMENT_METHOD = "payment.method";
    
    /**
     * �v���p�e�B�t�@�C���̋�s���B
     */
    public static final String PAYMENT_COMPANY_NAME = "payment.company.name";
    
    /**
     * �v���p�e�B�t�@�C���̋�s�����B
     */
    public static final String PAYMENT_ACCOUNT = "payment.account";
    
    /**
     * �v���p�e�B�t�@�C���̖⍇���於�B
     */
    public static final String COMPANY_NAME = "company.name";
    
    /**
     * �v���p�e�B�t�@�C���̖⍇���惁�[���A�h���X�B
     */
    public static final String COMPANY_MAIL = "company.mail";
    
    /**
     * �v���p�e�B�t�@�C���̖⍇����d�b�ԍ��B
     */
    public static final String COMPANY_TEL = "company.tel";

}