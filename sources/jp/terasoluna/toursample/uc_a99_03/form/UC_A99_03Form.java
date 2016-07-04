/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a99_03.form;

import jp.terasoluna.fw.web.struts.form.ValidatorActionFormEx;

/**
 * �ڋq�o�^�p��ActionForm�B<br>
 * 
 * �EUC_A99_03�F�ڋq�o�^
 * 
 * 
 */
public class UC_A99_03Form extends ValidatorActionFormEx{
    
    /**
     * �V���A���o�[�W����UID�B
     */
    private static final long serialVersionUID = 3235292996344910981L;
    
    /**
     *�t���K�i�B
     */
    private String customerKana = null;
    
    /**
     *�����B
     */
    private String customerName = null;
    
    /**
     *�N�B
     */
    private String customerBirthYear = "1965";
    
    /**
     *���B
     */
    private String customerBirthMonth = "01";
    
    /**
     *���B
     */
    private String customerBirthDay = "01";
    
    /**
     *�E�ƁB
     */
    private String customerJob = null;
    
    /**
     *E���[���B
     */
    private String customerMail = null;    
    
    /**
     *�d�b�ԍ��B
     */
    private String customerTel = null;
    
    /**
     *�X�֔ԍ��B
     */
    private String customerPost = null;
    
    /**
     *�Z���B
     */
    private String customerAdd = null;
    
    /**
     *�p�X���[�h�B
     */
    private String customerPass = null;
    
    /**
     *�m�F�p�X���[�h�B
     */
    private String checkPass = null;
    
    /**
     *�ڋqID�B
     */
    private String customerCode = null;    
    
    
    /**
     * �ڋqID��Ԃ��B
     * @return customerCode �ڋqID
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
     * �m�F�p�X���[�h��Ԃ��B
     * @return �m�F�p�X���[�h
     */
    public String getCheckPass() {
        return checkPass;
    }
    
    /**
     * �m�F�p�X���[�h��ݒ肷��B
     * @param checkPass �m�F�p�X���[�h
     */
    public void setCheckPass(String checkPass) {
        this.checkPass = checkPass;
    }
    
    /**
     * �Z����Ԃ��B
     * @return �Z��
     */
    public String getCustomerAdd() {
        return customerAdd;
    }
    
    /**
     * �Z����ݒ肷��B
     * @param customerAdd �Z��
     */
    public void setCustomerAdd(String customerAdd) {
        this.customerAdd = customerAdd;
    }
    
    /**
     * ����Ԃ��B
     * @return ��
     */
    public String getCustomerBirthDay() {
        return customerBirthDay;
    }
    
    /**
     * ����ݒ肷��B
     * @param customerBirthDay ��
     */
    public void setCustomerBirthDay(String customerBirthDay) {
        this.customerBirthDay = customerBirthDay;
    }
    
    /**
     * ����Ԃ��B
     * @return ��
     */
    public String getCustomerBirthMonth() {
        return customerBirthMonth;
    }
    
    /**
     * ����ݒ肷��B
     * @param customerBirthMonth ��
     */
    public void setCustomerBirthMonth(String customerBirthMonth) {
        this.customerBirthMonth = customerBirthMonth;
    }
    
    /**
     * �N��Ԃ��B
     * @return �N
     */
    public String getCustomerBirthYear() {
        return customerBirthYear;
    }
    
    /**
     * �N��ݒ肷��B
     * @param customerBirthYear �N
     */
    public void setCustomerBirthYear(String customerBirthYear) {
        this.customerBirthYear = customerBirthYear;
    }
    
    /**
     * �E�Ƃ�Ԃ��B
     * @return �E��
     */
    public String getCustomerJob() {
        return customerJob;
    }
    
    /**
     * �E�Ƃ�ݒ肷��B
     * @param customerJob �E��
     */
    public void setCustomerJob(String customerJob) {
        this.customerJob = customerJob;
    }
    
    /**
     * �t���K�i��Ԃ��B
     * @return �t���K�i
     */
    public String getCustomerKana() {
        return customerKana;
    }
    
    /**
     * �t���K�i��ݒ肷��B
     * @param customerKana �t���K�i
     */
    public void setCustomerKana(String customerKana) {
        this.customerKana = customerKana;
    }
    
    /**
     * E���[����Ԃ��B
     * @return E���[��
     */
    public String getCustomerMail() {
        return customerMail;
    }
    
    /**
     * E���[����ݒ肷��B
     * @param customerMail E���[��
     */
    public void setCustomerMail(String customerMail) {
        this.customerMail = customerMail;
    }
    
    /**
     * ������Ԃ��B
     * @return ����
     */
    public String getCustomerName() {
        return customerName;
    }
    
    /**
     * ������ݒ肷��B
     * @param customerName ����
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    /**
     * �p�X���[�h��Ԃ��B
     * @return �p�X���[�h
     */
    public String getCustomerPass() {
        return customerPass;
    }
    
    /**
     * �p�X���[�h��ݒ肷��B
     * @param customerPass �p�X���[�h
     */
    public void setCustomerPass(String customerPass) {
        this.customerPass = customerPass;
    }
    
    /**
     * �X�֔ԍ���Ԃ��B
     * @return �X�֔ԍ�
     */
    public String getCustomerPost() {
        return customerPost;
    }
    
    /**
     * �X�֔ԍ���ݒ肷��B
     * @param customerPost �X�֔ԍ�
     */
    public void setCustomerPost(String customerPost) {
        this.customerPost = customerPost;
    }
    
    /**
     * �d�b�ԍ���Ԃ��B
     * @return �d�b�ԍ�
     */
    public String getCustomerTel() {
        return customerTel;
    }
    
    /**
     * �d�b�ԍ���ݒ肷��B
     * @param customerTel �d�b�ԍ�
     */
    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }

}
