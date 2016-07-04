/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.common;

import java.util.Date;

import jp.terasoluna.fw.web.UserValueObject;

/**
 * �c�A�[�\��V�X�e���̌ڋq���N���X
 * <p>
 * ���O�C�������ڋq�̌ڋq����ێ�����B
 * </p>
 * 
 * @see jp.terasoluna.fw.web.UserValueObject
 */
public class TourUVO extends UserValueObject {
    
    /**
     * �V���A���o�[�W����UID�B
     */
    private static final long serialVersionUID = -2080310363535630863L;

    /**
     * �ڋqID�B
     */
    private String customerCode = null;
    
    /**
     * �ڋq���B
     */
    private String customerName = null;
    
    /**
     * �ڋq�t���K�i�B
     */
    private String customerKana = null;
    
    /**
     * �ڋq���N�����B
     */
    private Date customerBirth = null;
    
    /**
     * �ڋq�E�ƁB
     */
    private String customerJob = null;
    
    /**
     * �ڋq���[���A�h���X�B
     */
    private String customerMail = null;
    
    /**
     * �ڋq�d�b�ԍ��B
     */
    private String customerTel = null;
    
    /**
     * �ڋq�X�֔ԍ��B
     */
    private String customerPost = null;
    
    /**
     * �ڋq�Z���B
     */
    private String customerAdd = null;
    
    /** 
     * �ڋq�Z����Ԃ��B
     * 
     * @return �ڋq�Z��
     */
    public String getCustomerAdd() {
        return customerAdd;
    }
    
    /**
     * �ڋq�Z����ݒ肷��B
     * 
     * @param customerAdd �ڋq�Z��
     */
    public void setCustomerAdd(String customerAdd) {
        this.customerAdd = customerAdd;
    }
    
    /**
     * �ڋq���N������Ԃ��B
     * 
     * @return �ڋq���N����
     */
    public Date getCustomerBirth() {
        return customerBirth;
    }
    
    /**
     * �ڋq���N������ݒ肷��B
     * 
     * @param customerBirth �ڋq���N����
     */
    public void setCustomerBirth(Date customerBirth) {
        this.customerBirth = customerBirth;
    }
    
    /**
     * �ڋqID��Ԃ��B
     * 
     * @return �ڋqID
     */
    public String getCustomerCode() {
        return customerCode;
    }
    
    /**
     * �ڋqID��ݒ肷��B
     * 
     * @param customerCode �ڋqID
     */
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }
    
    /**
     * �ڋq�E�Ƃ�Ԃ��B
     * 
     * @return �ڋq�E��
     */
    public String getCustomerJob() {
        return customerJob;
    }
    
    /**
     * �ڋq�E�Ƃ�ݒ肷��B
     * @param customerJob �ڋq�E��
     */
    public void setCustomerJob(String customerJob) {
        this.customerJob = customerJob;
    }
    
    /**
     * �ڋq�t���K�i��Ԃ��B
     * 
     * @return �ڋq�t���K�i
     */
    public String getCustomerKana() {
        return customerKana;
    }
    
    /**
     * �ڋq�t���K�i��ݒ肷��B
     * @param customerKana �ڋq�t���K�i
     */
    public void setCustomerKana(String customerKana) {
        this.customerKana = customerKana;
    }
    
    /**
     * �ڋq���[���A�h���X��Ԃ��B
     * 
     * @return �ڋq���[���A�h���X
     */
    public String getCustomerMail() {
        return customerMail;
    }
    
    /**
     * �ڋq���[���A�h���X��ݒ肷��B
     * @param customerMail �ڋq���[���A�h���X
     */
    public void setCustomerMail(String customerMail) {
        this.customerMail = customerMail;
    }
    
    /**
     * �ڋq����Ԃ��B
     * 
     * @return �ڋq��
     */
    public String getCustomerName() {
        return customerName;
    }
    
    /**
     * �ڋq����ݒ肷��B
     * @param customerName �ڋq��
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    /**
     * �ڋq�X�֔ԍ���Ԃ��B
     * 
     * @return �ڋq�X�֔ԍ�
     */
    public String getCustomerPost() {
        return customerPost;
    }
    
    /**
     * �ڋq�X�֔ԍ���ݒ肷��B
     * @param customerPost �ڋq�X�֔ԍ�
     */
    public void setCustomerPost(String customerPost) {
        this.customerPost = customerPost;
    }
    
    /**
     * �ڋq�d�b�ԍ���Ԃ��B
     * 
     * @return �ڋq�d�b�ԍ�
     */
    public String getCustomerTel() {
        return customerTel;
    }
    
    /**
     * �ڋq�d�b�ԍ���ݒ肷��B
     * @param customerTel �ڋq�d�b�ԍ�
     */
    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }
    

}
