/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_05.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * RP_A01_05_01_01BLogic�̏o�͒l�N���X�B
 *
 * 
 */
public class RP_A01_05_01_01Output implements Serializable {

    /**
     * serialVersionUID�B
     */
    private static final long serialVersionUID = 8484195082751620345L;

    /**
     * �\��ԍ��B
     */
    private String reserveNo = null;

    /**
     * �쐬���B
     */
    private Date printDay = null;
    
    /**
     * �c�A�[���B
     */
    private String tourName = null;
    
    /**
     * �\�����ݓ��B
     */
    private Date reservedDay = null;
    
    /**
     * �o�����B
     */
    private Date depDay = null;
    
    /**
     * �����B
     */
    private String tourDays = null;
    
    /**
     * �o���n�B
     */
    private String depName = null;
    
    /**
     * �ړI�n�B
     */
    private String arrName = null;
    
    /**
     * �Y����B
     */
    private String conductor = null;
    
    /**
     * �h���{�݁B
     */
    private String accomName = null;
    
    /**
     * �h���{�ݘA����B
     */
    private String accomTel = null;
    
    /**
     * �T�v�B
     */
    private String tourAbs = null;
    
    /**
     * ���ӌ����v�]�B
     */
    private String remarks = null;
    
    /**
     * �ڋq�ԍ��B
     */
    private String customerCode = null;
    
    /**
     * �ڋq�t���K�i�B
     */
    private String customerKana = null;
    
    /**
     * �ڋq���B
     */
    private String customerName = null;
    
    /**
     * �ڋq�a�����B
     */
    private Date customerBirth = null;
    
    /**
     * �ڋq�E�ƁB
     */
    private String customerJob = null;
    
    /**
     * �ڋq���[���B
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
     * �l���i��l�j�B
     */
    private Integer adultCount = null;
    
    /**
     * �l���i�q�ǂ��j�B
     */
    private Integer childCount = null;
    
    /**
     * �P���i��l�j�B
     */
    private Integer adultUnitPrice = null;
    
    /**
     * �P���i�q�ǂ��j�B
     */
    private Integer childUnitPrice = null;

    /**
     * �����i��l�j�B
     */
    private Integer adultPrice = null;
    
    /**
     * �����i�q�ǂ��j�B
     */
    private Integer childPrice = null;
    
    /**
     * ���v�����B
     */
    private Integer sumPrice = null;
    
    /**    
     * �x�������B
     */
    private String paymentTimeLimit = null;

    
    /**
     * �h���{�݂�Ԃ��B
     * @return �h���{��
     */
    public String getAccomName() {
    
        return accomName;
    }

    
    /**
     * �h���{�݂�ݒ肷��B
     * @param accomName �h���{��
     */
    public void setAccomName(String accomName) {
    
        this.accomName = accomName;
    }

    
    /**
     * �h���{�ݘA�����Ԃ��B
     * @return �h���{�ݘA����
     */
    public String getAccomTel() {
    
        return accomTel;
    }

    
    /**
     * �h���{�ݘA�����ݒ肷��B
     * @param accomTel �h���{�ݘA����
     */
    public void setAccomTel(String accomTel) {
    
        this.accomTel = accomTel;
    }

    
    /**
     * �l���i��l�j��Ԃ��B
     * @return �l���i��l�j
     */
    public Integer getAdultCount() {
    
        return adultCount;
    }

    
    /**
     * �l���i��l�j��ݒ肷��B
     * @param adultCount �l���i��l�j
     */
    public void setAdultCount(Integer adultCount) {
    
        this.adultCount = adultCount;
    }

    
    /**
     * �����i��l�j��Ԃ��B
     * @return �����i��l�j
     */
    public Integer getAdultPrice() {
    
        return adultPrice;
    }

    
    /**
     * �����i��l�j��ݒ肷��B
     * @param adultPrice �����i��l�j
     */
    public void setAdultPrice(Integer adultPrice) {
    
        this.adultPrice = adultPrice;
    }

    
    /**
     * �P���i��l�j��Ԃ��B
     * @return �P���i��l�j
     */
    public Integer getAdultUnitPrice() {
    
        return adultUnitPrice;
    }

    
    /**
     * �P���i��l�j��ݒ肷��B
     * @param adultUnitPrice �P���i��l�j
     */
    public void setAdultUnitPrice(Integer adultUnitPrice) {
    
        this.adultUnitPrice = adultUnitPrice;
    }

    
    /**
     * �ړI�n��Ԃ��B
     * @return �ړI�n
     */
    public String getArrName() {
    
        return arrName;
    }

    
    /**
     * �ړI�n��ݒ肷��B
     * @param arrName �ړI�n
     */
    public void setArrName(String arrName) {
    
        this.arrName = arrName;
    }

    
    /**
     * �l���i�q�ǂ��j��Ԃ��B
     * @return �l���i�q�ǂ��j
     */
    public Integer getChildCount() {
    
        return childCount;
    }

    
    /**
     * �l���i�q�ǂ��j��ݒ肷��B
     * @param childCount �l���i�q�ǂ��j
     */
    public void setChildCount(Integer childCount) {
    
        this.childCount = childCount;
    }

    
    /**
     * �����i�q�ǂ��j��Ԃ��B
     * @return �����i�q�ǂ��j
     */
    public Integer getChildPrice() {
    
        return childPrice;
    }

    
    /**
     * �����i�q�ǂ��j��ݒ肷��B
     * @param childPrice �����i�q�ǂ��j
     */
    public void setChildPrice(Integer childPrice) {
    
        this.childPrice = childPrice;
    }

    
    /**
     * �P���i�q�ǂ��j��Ԃ��B
     * @return �P���i�q�ǂ��j
     */
    public Integer getChildUnitPrice() {
    
        return childUnitPrice;
    }

    
    /**
     * �P���i�q�ǂ��j��ݒ肷��B
     * @param childUnitPrice �P���i�q�ǂ��j
     */
    public void setChildUnitPrice(Integer childUnitPrice) {
    
        this.childUnitPrice = childUnitPrice;
    }

    
    /**
     * �Y�����Ԃ��B
     * @return �Y���
     */
    public String getConductor() {
    
        return conductor;
    }

    
    /**
     * �Y�����ݒ肷��B
     * @param conductor �Y���
     */
    public void setConductor(String conductor) {
    
        this.conductor = conductor;
    }

    
    /**
     * �ڋq�Z����Ԃ��B
     * @return �ڋq�Z��
     */
    public String getCustomerAdd() {
    
        return customerAdd;
    }

    
    /**
     * �ڋq�Z����ݒ肷��B
     * @param customerAdd �ڋq�Z��
     */
    public void setCustomerAdd(String customerAdd) {
    
        this.customerAdd = customerAdd;
    }

    
    /**
     * �ڋq�a������Ԃ��B
     * @return �ڋq�a����
     */
    public Date getCustomerBirth() {
    
        return customerBirth;
    }

    
    /**
     * �ڋq�a������ݒ肷��B
     * @param customerBirth �ڋq�a����
     */
    public void setCustomerBirth(Date customerBirth) {
    
        this.customerBirth = customerBirth;
    }

    
    /**
     * �ڋq�ԍ���Ԃ��B
     * @return �ڋq�ԍ�
     */
    public String getCustomerCode() {
    
        return customerCode;
    }

    
    /**
     * �ڋq�ԍ���ݒ肷��B
     * @param customerCode �ڋq�ԍ�
     */
    public void setCustomerCode(String customerCode) {
    
        this.customerCode = customerCode;
    }

    
    /**
     * �ڋq�E�Ƃ�Ԃ��B
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
     * �ڋq���[����Ԃ��B
     * @return �ڋq���[��
     */
    public String getCustomerMail() {
    
        return customerMail;
    }

    
    /**
     * �ڋq���[����ݒ肷��B
     * @param customerMail �ڋq���[��
     */
    public void setCustomerMail(String customerMail) {
    
        this.customerMail = customerMail;
    }

    
    /**
     * �ڋq����Ԃ��B
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

    
    /**
     * �o������Ԃ��B
     * @return �o����
     */
    public Date getDepDay() {
    
        return depDay;
    }

    
    /**
     * �o������ݒ肷��B
     * @param depDay �o����
     */
    public void setDepDay(Date depDay) {
    
        this.depDay = depDay;
    }

    
    /**
     * �o���n��Ԃ��B
     * @return �o���n
     */
    public String getDepName() {
    
        return depName;
    }

    
    /**
     * �o���n��ݒ肷��B
     * @param depName �o���n
     */
    public void setDepName(String depName) {
    
        this.depName = depName;
    }

    
    /**
     * �x��������Ԃ��B
     * @return �x������
     */
    public String getPaymentTimeLimit() {
    
        return paymentTimeLimit;
    }

    
    /**
     * �x��������ݒ肷��B
     * @param paymentTimeLimit �x������
     */
    public void setPaymentTimeLimit(String paymentTimeLimit) {
    
        this.paymentTimeLimit = paymentTimeLimit;
    }

    
    /**
     * �쐬����Ԃ��B
     * @return �쐬��
     */
    public Date getPrintDay() {
    
        return printDay;
    }

    
    /**
     * �쐬����ݒ肷��B
     * @param printDay �쐬��
     */
    public void setPrintDay(Date printDay) {
    
        this.printDay = printDay;
    }

    
    /**
     * ���ӌ����v�]��Ԃ��B
     * @return ���ӌ����v�]
     */
    public String getRemarks() {
    
        return remarks;
    }

    
    /**
     * ���ӌ����v�]��ݒ肷��B
     * @param remarks ���ӌ����v�]
     */
    public void setRemarks(String remarks) {
    
        this.remarks = remarks;
    }

    
    /**
     * �\�����ݓ���Ԃ��B
     * @return �\�����ݓ�
     */
    public Date getReservedDay() {
    
        return reservedDay;
    }

    
    /**
     * �\�����ݓ���ݒ肷��B
     * @param reservedDay �\�����ݓ�
     */
    public void setReservedDay(Date reservedDay) {
    
        this.reservedDay = reservedDay;
    }

    
    /**�\��ԍ�
     * reserveNo��Ԃ��B
     * @return rese�\��ԍ�rveNo
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
     * ���v������Ԃ��B
     * @return ���v����
     */
    public Integer getSumPrice() {
    
        return sumPrice;
    }

    
    /**
     * ���v������ݒ肷��B
     * @param sumPrice ���v����
     */
    public void setSumPrice(Integer sumPrice) {
    
        this.sumPrice = sumPrice;
    }

    
    /**
     * �T�v��Ԃ��B
     * @return �T�v
     */
    public String getTourAbs() {
    
        return tourAbs;
    }

    
    /**
     * �T�v��ݒ肷��B
     * @param tourAbs �T�v
     */
    public void setTourAbs(String tourAbs) {
    
        this.tourAbs = tourAbs;
    }

    
    /**
     * ������Ԃ��B
     * @return ����
     */
    public String getTourDays() {
    
        return tourDays;
    }

    
    /**
     * ������ݒ肷��B
     * @param tourDays ����
     */
    public void setTourDays(String tourDays) {
    
        this.tourDays = tourDays;
    }

    
    /**
     * �c�A�[����Ԃ��B
     * @return �c�A�[��
     */
    public String getTourName() {
    
        return tourName;
    }

    
    /**
     * �c�A�[����ݒ肷��B
     * @param tourName �c�A�[��
     */
    public void setTourName(String tourName) {
    
        this.tourName = tourName;
    }
    
}
