/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_01.dto;

import java.io.Serializable;

/**
 * RP_A01_01_02_03BLogic�̏o�͒l�N���X�B
 *
 * 
 */
public class RP_A01_01_02_03Output implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -4060132366528767394L;

    /**
     * �c�A�[�R�[�h�B
     */
    private String tourCode = null;
    
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
    private Integer row = null;
    
    /**
     * �l��(��l)������Ԃ��B
     * @return �l��(��l)����
     */
    public String getAdultCountCondition() {
    
        return adultCountCondition;
    }

    
    /**
     * �l��(��l)������ݒ肷��B
     * @param adultCountCondition �l��(��l)����
     */
    public void setAdultCountCondition(String adultCountCondition) {
    
        this.adultCountCondition = adultCountCondition;
    }

    
    /**
     * �ړI�n������Ԃ��B
     * @return �ړI�n����
     */
    public String getArrCodeCondition() {
    
        return arrCodeCondition;
    }

    
    /**
     * �ړI�n������ݒ肷��B
     * @param arrCodeCondition �ړI�n����
     */
    public void setArrCodeCondition(String arrCodeCondition) {
    
        this.arrCodeCondition = arrCodeCondition;
    }

    
    /**
     * ��{����������Ԃ��B
     * @return ��{��������
     */
    public String getBasePriceCondition() {
    
        return basePriceCondition;
    }

    
    /**
     * ��{����������ݒ肷��B
     * @param basePriceCondition ��{��������
     */
    public void setBasePriceCondition(String basePriceCondition) {
    
        this.basePriceCondition = basePriceCondition;
    }

    
    /**
     * �l��(�q�ǂ�)������Ԃ��B
     * @return �l��(�q�ǂ�)����
     */
    public String getChildCountCondition() {
    
        return childCountCondition;
    }

    
    /**
     * �l��(�q�ǂ�)������ݒ肷��B
     * @param childCountCondition �l��(�q�ǂ�)����
     */
    public void setChildCountCondition(String childCountCondition) {
    
        this.childCountCondition = childCountCondition;
    }

    
    /**
     * �o���n������Ԃ��B
     * @return �o���n����
     */
    public String getDepCodeCondition() {
    
        return depCodeCondition;
    }

    
    /**
     * �o���n������ݒ肷��B
     * @param depCodeCondition �o���n����
     */
    public void setDepCodeCondition(String depCodeCondition) {
    
        this.depCodeCondition = depCodeCondition;
    }

    
    /**
     * �o����(��)������Ԃ��B
     * @return �o����(��)����
     */
    public String getDepDayDayCondition() {
    
        return depDayDayCondition;
    }

    
    /**
     * �o����(��)������ݒ肷��B
     * @param depDayDayCondition �o����(��)����
     */
    public void setDepDayDayCondition(String depDayDayCondition) {
    
        this.depDayDayCondition = depDayDayCondition;
    }

    
    /**
     * �o����(��)������Ԃ��B
     * @return �o����(��)����
     */
    public String getDepDayMonthCondition() {
    
        return depDayMonthCondition;
    }

    
    /**
     * �o����(��)������ݒ肷��B
     * @param depDayMonthCondition �o����(��)����
     */
    public void setDepDayMonthCondition(String depDayMonthCondition) {
    
        this.depDayMonthCondition = depDayMonthCondition;
    }

    
    /**
     * �o����(�N)������Ԃ��B
     * @return �o����(�N)����
     */
    public String getDepDayYearCondition() {
    
        return depDayYearCondition;
    }

    
    /**
     * �o����(�N)������ݒ肷��B
     * @param depDayYearCondition �o����(�N)����
     */
    public void setDepDayYearCondition(String depDayYearCondition) {
    
        this.depDayYearCondition = depDayYearCondition;
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
     * ����������Ԃ��B
     * @return ��������
     */
    public String getTourDaysCondition() {
    
        return tourDaysCondition;
    }

    
    /**
     * ����������ݒ肷��B
     * @param tourDaysCondition ��������
     */
    public void setTourDaysCondition(String tourDaysCondition) {
    
        this.tourDaysCondition = tourDaysCondition;
    }
    
    /**
     * �\���s����ԋp����B
     * 
     * @return �ێ�����\���s��
     */
    public Integer getRow() {
    
        return row;
    }
    
    /**
     * �\���s����ݒ肷��B
     * 
     * @param row �ݒ肷��\���s��
     */
    public void setRow(Integer row) {
    
        this.row = row;
    }
    
    /**
     * �J�n�C���f�b�N�X��ԋp����B
     * 
     * @return �ێ�����J�n�C���f�b�N�X
     */
    public Integer getStartIndex() {
    
        return startIndex;
    }
    
    /**
     * �J�n�C���f�b�N�X��ݒ肷��B
     * 
     * @param startIndex �ݒ肷��J�n�C���f�b�N�X
     */
    public void setStartIndex(Integer startIndex) {
    
        this.startIndex = startIndex;
    }

}
