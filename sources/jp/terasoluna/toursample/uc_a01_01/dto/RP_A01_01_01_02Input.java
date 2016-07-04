/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_01.dto;

import java.io.Serializable;

/**
 * RP_A01_01_01_02BLogic�̓��͒l�N���X�B
 *
 * 
 */
public class RP_A01_01_01_02Input implements Serializable {

    /**
     * �V���A���o�[�W����UID�B
     */
	private static final long serialVersionUID = 430989495912837712L;

	/**
     * �ړI�n�����B
     */
    private String arrCodeCondition = null;
    
    /**
     * �o���n�����B
     */
    private String depCodeCondition = null;

    /**
     * �o����(�N)�����B
     */
    private String depDayYearCondition = null;

    /**
     * �o����(��)�����B
     */
    private String depDayMonthCondition = null;
    
    /**
     * �o����(��)�����B
     */
    private String depDayDayCondition = null;
    
    /**
     * ���������B
     */
    private String tourDaysCondition = null;

    /**
     * �l��(��l)�����B
     */
    private String adultCountCondition = null;

    /**
     * �l��(�q�ǂ�)�����B
     */
    private String childCountCondition = null;

    /**
     * ��{���������B
     */
    private String basePriceCondition = null;

    /**
     * �J�n�C���f�b�N�X�B
    */
    private Integer startIndex = null;
    
    /**
     * �\���s���B
     */
    private Integer row = 10;
    
    /**
     * �J�n�C���f�b�N�X���擾����B
     * @return startIndex
     */
    public Integer getStartIndex() {
        return startIndex;
    }

    /**
     * �J�n�C���f�b�N�X��ݒ肷��B
     * @param startIndex 
    */
    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

	/**
     * �l��(��l)�������擾����B
     * @return adultCountCondition
     */
    public String getAdultCountCondition() {
        return adultCountCondition;
    }

    /**
     * �l��(��l)������ݒ肷��B
     * @param adultCountCondition
     */
    public void setAdultCountCondition(String adultCountCondition) {
        this.adultCountCondition = adultCountCondition;
    }

    /**
     * �ړI�n�������擾����B
     * @return arrCodeCondition
     */
    public String getArrCodeCondition() {
        return arrCodeCondition;
    }

    /**
     * �ړI�n������ݒ肷��B
     * @param arrCodeCondition
     */
    public void setArrCodeCondition(String arrCodeCondition) {
        this.arrCodeCondition = arrCodeCondition;
    }

    /**
     * ��{�����������擾����B
     * @return basePriceCondition
     */
    public String getBasePriceCondition() {
        return basePriceCondition;
    }

    /**
     * ��{����������ݒ肷��B
     * @param basePriceCondition
     */
    public void setBasePriceCondition(String basePriceCondition) {
        this.basePriceCondition = basePriceCondition;
    }

    /**
     * �l��(�q�ǂ�)�������擾����B
     * @return childCountCondition
     */
    public String getChildCountCondition() {
        return childCountCondition;
    }

    /**
     * �l��(�q�ǂ�)������ݒ肷��B
     * @param childCountCondition
     */
    public void setChildCountCondition(String childCountCondition) {
        this.childCountCondition = childCountCondition;
    }

    /**
     * �o���n�������擾����B
     * @return depCodeCondition
     */
    public String getDepCodeCondition() {
        return depCodeCondition;
    }

    /**
     * �o���n������ݒ肷��B
     * @param depCodeCondition
     */
    public void setDepCodeCondition(String depCodeCondition) {
        this.depCodeCondition = depCodeCondition;
    }

    /**
     * �o����(��)�������擾����B
     * @return depDayDayCondition
     */
    public String getDepDayDayCondition() {
        return depDayDayCondition;
    }

    /**
     * �o����(��)������ݒ肷��B
     * @param depDayDayCondition
     */
    public void setDepDayDayCondition(String depDayDayCondition) {
        this.depDayDayCondition = depDayDayCondition;
    }

    /**
     * �o����(��)�������擾����B
     * @return depDayMonthCondition
     */
    public String getDepDayMonthCondition() {
        return depDayMonthCondition;
    }

    /**
     * �o����(��)������ݒ肷��B
     * @param depDayMonthCondition
     */
    public void setDepDayMonthCondition(String depDayMonthCondition) {
        this.depDayMonthCondition = depDayMonthCondition;
    }

    /**
     * �o����(�N)�������擾����B
     * @return depDayYearCondition
     */
    public String getDepDayYearCondition() {
        return depDayYearCondition;
    }

    /**
     * �o����(�N)������ݒ肷��B
     * @param depDayYearCondition
     */
    public void setDepDayYearCondition(String depDayYearCondition) {
        this.depDayYearCondition = depDayYearCondition;
    }

    /**
     * �����������擾����B
     * @return tourDaysCondition
     */
    public String getTourDaysCondition() {
        return tourDaysCondition;
    }

    /**
     * ����������ݒ肷��B
     * @param tourDaysCondition
     */
    public void setTourDaysCondition(String tourDaysCondition) {
        this.tourDaysCondition = tourDaysCondition;
    }

    /**
     * �\���s�����擾����B
     * @return row
    */
    public Integer getRow() {
        return row;
    }

    /**
     * �\���s����ݒ肷��B
     * @param row �ݒ肷�� row
    */
    public void setRow(Integer row) {
        this.row = row;
    }

}