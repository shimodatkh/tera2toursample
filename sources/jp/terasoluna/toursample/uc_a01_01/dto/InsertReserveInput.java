/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_01.dto;

import java.io.Serializable;
import java.util.Date;

import jp.terasoluna.toursample.common.TourUVO;

/**
 * �\������邽�߂̓��̓N���X�B
 * 
 * 
 * 
 */
public class InsertReserveInput implements Serializable {

    /**
     * �V���A���o�[�W����UID�B
     */
    private static final long serialVersionUID = -814234513258971804L;

    /**
     * �\��ԍ��B
     */
    private String reserveNo = null;

    /**
     * �\�����ݓ��B
     */
    private Date reservedDay = null;

    /**
     * �ڋq���B
     */
    private TourUVO USER_VALUE_OBJECT = null;

    /**
     * �c�A�[�R�[�h�B
     */
    private String tourCode = null;

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
     * ���ӌ����v�]�B
     */
    private String remarks = null;

    /**
     * @return �l��(��l)�B
     */
    public Integer getAdultCount() {
        return adultCount;
    }

    /**
     * �l��(��l)��ݒ肷��B
     * 
     * @param adultCount
     */
    public void setAdultCount(Integer adultCount) {
        this.adultCount = adultCount;
    }

    /**
     * �l��(��l)���擾����B
     * 
     * @return childCount
     */
    public Integer getChildCount() {
        return childCount;
    }

    /**
     * �l��(�q�ǂ�)��ݒ肷��B
     * 
     * @param childCount
     */
    public void setChildCount(Integer childCount) {
        this.childCount = childCount;
    }

    /**
     * ���ӌ����v�]���擾����B
     * 
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * ���ӌ����v�]�ݒ肷��B
     * 
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * ���v�������擾����B
     * 
     * @return sumPrice
     */
    public Integer getSumPrice() {
        return sumPrice;
    }

    /**
     * ���v������ݒ肷��B
     * 
     * @param sumPrice
     */
    public void setSumPrice(Integer sumPrice) {
        this.sumPrice = sumPrice;
    }

    /**
     * �c�A�[�R�[�h���擾����B
     * 
     * @return tourCode
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * �c�A�[�R�[�h�ݒ肷��B
     * 
     * @param tourCode
     */
    public void setTourCode(String tourCode) {
        this.tourCode = tourCode;
    }

    /**
     * �\��ԍ����擾����B
     * 
     * @return reverseNo
     */
    public String getReserveNo() {
        return reserveNo;
    }

    /**
     * �\��ԍ���ݒ肷��B
     * 
     * @param reserveNo
     */
    public void setReserveNo(String reserveNo) {
        this.reserveNo = reserveNo;
    }

    /**
     * �ڋq�����擾����B
     * 
     * @return USER_VALUE_OBJECT
     */
    public TourUVO getUSER_VALUE_OBJECT() {
        return USER_VALUE_OBJECT;
    }

    /**
     * �ڋq����ݒ肷��B
     * 
     * @param USER_VALUE_OBJECT
     */
    public void setUSER_VALUE_OBJECT(TourUVO USER_VALUE_OBJECT) {
        this.USER_VALUE_OBJECT = USER_VALUE_OBJECT;
    }

    /**
     * �\�����ݓ����擾����B
     * 
     * @return reservedDay
     */
    public Date getReservedDay() {
        return reservedDay;
    }

    /**
     * �\�����ݓ���ݒ肷��B
     * 
     * @param reservedDay
     */
    public void setReservedDay(Date reservedDay) {
        this.reservedDay = reservedDay;
    }

}
