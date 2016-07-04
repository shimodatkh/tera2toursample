/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_02.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * �c�A�[�\����N���X�B
 *
 * 
 */
public class SelectReservationInfoOutput implements Serializable {

    /**
     * serialVersionUID�B
     */
    private static final long serialVersionUID = 1503502910183145807L;

    /**
     * �\��ԍ��B
     */
    private String reserveNo = null;
    
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
     * �l��(��l)�B
     */
    private Integer adultCount = null;

    /**
     * �l��(�q�ǂ�)�B
     */
    private Integer childCount = null;

    /**
     * ���v�����B
     */
    private Integer sumPrice = null;

    /**
     * �U���t���O�B
     */
    private boolean transfer = false;

    /**
     * �U���������߃t���O�B
     */
    private boolean limitExcessFlag = false;

    
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

    
    /**
     * �U���������߃t���O��Ԃ��B
     * @return �U�������t���O
     */
    public boolean isLimitExcessFlag() {
    
        return limitExcessFlag;
    }

    
    /**
     * �U���������߃t���O��ݒ肷��B
     * @param limitExcessFlag �U���������߃t���O
     */
    public void setLimitExcessFlag(boolean limitExcessFlag) {
    
        this.limitExcessFlag = limitExcessFlag;
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
}
