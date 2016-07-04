/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.common.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * �\��ڍ׏����i�[����N���X�B
 * <br>
 * �E���ʏ���CP0006�F�\��ڍ׎擾
 * 
 * 
 */
public class ReserveDetailAcquireOutput implements Serializable {
    
    /**
     * �V���A���o�[�W����UID�B
     */
    private static final long serialVersionUID = 3418316001953789728L;
    
    /**
     * �\�����ݓ��B
     */
    private Date reservedDay = null;

    /**
     * �c�A�[�R�[�h�B
     */
    private String tourCode = null;
    
    /**
     * �c�A�[���B
     */
    private String tourName = null;

    /**
     * �o�����B
     */
    private Date depDay = null;

    /**
     * �����B
     */
    private String tourDays = null;

    /**
     * ����(����)�B
     */
    private Integer intTourDays = null;
    
    /**
     * �o���n�B
     */
    private String depName = null;

    /**
     * �ړI�n�B
     */
    private String arrName = null;

    /**
     * �Y����I�v�V�����B
     */
    private boolean conductor = false;

    /**
     * �h���{�݁B
     */
    private String accomName = null;

    /**
     * �A����B
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
     * ��{�����B
     */
    private Integer basePrice = null;

    /**
     * �l��(��l)�B
     */
    private Integer adultCount = null;

    /**
     * �l��(�q�ǂ�)�B
     */
    private Integer childCount = null;

    /**
     * �U���t���O�B
     */
    private boolean transfer = false;

    /**
     * �U�������B
     */
    private Date paymentTimeLimit = null;

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
     * �A�����Ԃ��B
     * @return �A����
     */
    public String getAccomTel() {
        return accomTel;
    }

    /**
     * �A�����ݒ肷��B
     * @param accomTel �A����
     */
    public void setAccomTel(String accomTel) {
        this.accomTel = accomTel;
    }

    /**
     * �l��(��l)��Ԃ��B
     * @return �l��(��l)
     */
    public Integer getAdultCount() {
        return adultCount;
    }

    /**
     * �l��(��l)��ݒ肷��B
     * @param adultCount �l��(��l)
     */
    public void setAdultCount(Integer adultCount) {
        this.adultCount = adultCount;
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
     * ��{������Ԃ��B
     * @return ��{����
     */
    public Integer getBasePrice() {
        return basePrice;
    }

    /**
     * ��{������ݒ肷��B
     * @param basePrice ��{����
     */
    public void setBasePrice(Integer basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * �l��(�q�ǂ�)��Ԃ��B
     * @return �l��(�q�ǂ�)
     */
    public Integer getChildCount() {
        return childCount;
    }

    /**
     * �l��(�q�ǂ�)��ݒ肷��B
     * @param childCount �l��(�q�ǂ�)
     */
    public void setChildCount(Integer childCount) {
        this.childCount = childCount;
    }

    /**
     * �Y����I�v�V������Ԃ��B
     * @return �Y����I�v�V����
     */
    public boolean getConductor() {
        return conductor;
    }

    /**
     * �Y����I�v�V������ݒ肷��B
     * @param conductor �Y����I�v�V����
     */
    public void setConductor(boolean conductor) {
        this.conductor = conductor;
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
     * �c�A�[�R�[�h��Ԃ��B
     * @return �c�A�[�R�[�h
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * �c�A�[�R�[�h��ݒ肷��B
     * @param tourCode �c�A�[�R�[�h
     */
    public void setTourCode(String tourCode) {
        this.tourCode = tourCode;
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

    /**
     * �U���t���O��Ԃ��B
     * @return �U���t���O
     */
    public boolean isTransfer() {
        return transfer;
    }

    /**
     * �U���t���O��ݒ肷��B
     * @param transfer �U���t���O
     */
    public void setTransfer(boolean transfer) {
        this.transfer = transfer;
    }

    
    /**
     * �U��������Ԃ��B
     * @return �U������
     */
    
    public Date getPaymentTimeLimit() {
    
        return paymentTimeLimit;
    }

    
    /**
     * �U��������ݒ肷��B
     * @param paymentTimeLimit �U������
     */
    
    public void setPaymentTimeLimit(Date paymentTimeLimit) {
    
        this.paymentTimeLimit = paymentTimeLimit;
    }

    /**
     * ����(����)��Ԃ��B
     * @return ����(����)
     */
    public Integer getIntTourDays() {
    
        return intTourDays;
    }

    /**
     * ����(����)��ݒ肷��B
     * @param intTourDays ����(����)
     */
    public void setIntTourDays(Integer intTourDays) {
    
        this.intTourDays = intTourDays;
    }

}
