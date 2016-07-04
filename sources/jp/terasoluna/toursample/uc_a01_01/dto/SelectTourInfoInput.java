/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_01.dto;

import java.io.Serializable;

/**
 * �c�A�[���������p���͒l�N���X
 * 
 * 
 * 
 *
 */
public class SelectTourInfoInput implements Serializable{

    /**
     * �V���A���o�[�W����UID�B
     */
    private static final long serialVersionUID = -8095447526890897928L;

	/**
	 * �ړI�n�����B
	 */
	private String arrCodeCondition = null;
	
	/**
	 * �o���n�����B
	 */
	private String depCodeCondition = null;
	
	/**
	 * �o�����B
	 */
	private String depDayCondition = null;
	
	/**
	 * �����B
	 */
	private Integer tourDays = null;
    
    /**
     * �l��(��l)�����B
     */
    private String adultCountCondition = null;
    
    /**
     * �l��(�q�ǂ�)�����B
     */
    private String childCountCondition = null; 
	
	/**
	 * ��{�����B
	 */
	private Integer basePrice = null;

	/**
	 * �ړI�n�������擾����B
	 * 
	 * @return arrCodeCondition
	 */
	public String getArrCodeCondition() {
		return arrCodeCondition;
	}

	/**
	 * �ړI�n������ݒ肷��B
	 * 
	 * @param arrCodeCondition �ړI�n����
	 */
	public void setArrCodeCondition(String arrCodeCondition) {
		this.arrCodeCondition = arrCodeCondition;
	}

	/**
	 * ��{�����������擾����B
	 * 
	 * @return basePrice
	 */
	public Integer getBasePrice() {
		return basePrice;
	}

	/**
	 * ��{����������ݒ肷��B
	 * 
	 * @param basePrice ��{��������
	 */
	public void setBasePrice(Integer basePrice) {
		this.basePrice = basePrice;
	}

	/**
	 * �����������擾����B
	 * 
	 * @return tourDays
	 */
	public Integer getTourDays() {
		return tourDays;
	}

	/**
	 * ����������ݒ肷��B
	 * 
	 * @param tourDays ��������
	 */
	public void setTourDays(Integer tourDays) {
		this.tourDays = tourDays;
	}

	/**
	 * �o���n�������擾����B
	 * 
	 * @return depCodeCondition
	 */
	public String getDepCodeCondition() {
		return depCodeCondition;
	}

	/**
	 * �o���n������ݒ肷��B
	 * 
	 * @param depCodeCondition �o���n����
	 */
	public void setDepCodeCondition(String depCodeCondition) {
		this.depCodeCondition = depCodeCondition;
	}

	/**
	 * �o�������擾����B 
	 * @return depDayCondition
	 */
	public String getDepDayCondition() {
		return depDayCondition;
	}

	/**
	 * �o������ݒ肷��B
	 * @param depDayCondition �o����
	 */
	public void setDepDayCondition(String depDayCondition) {
		this.depDayCondition = depDayCondition;
	}

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

}
