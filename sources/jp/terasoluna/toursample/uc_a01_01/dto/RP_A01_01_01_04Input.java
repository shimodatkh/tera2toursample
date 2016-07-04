/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_01.dto;

import java.io.Serializable;

/**
 * 
 * �y�[�W�J�ڂ���Ƃ��̓��͒l�N���X�B
 * 
 *
 */
public class RP_A01_01_01_04Input implements Serializable {

	/**
	 * �V���A���o�[�W����UID�B
	 */
	private static final long serialVersionUID = 8878398219213889139L;
	
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
	private String depDay = null;
	
	/**
	 * ���������B
	 */
	private String tourDaysCondition = null;
	
	/**
	 * ��{���������B
	 */
	private String basePriceCondition = null;
	
	/**
	 * �ꗗ���S�s���B
	 */
	private Integer allListInfoLineCount = null;
	
	/**
	 * �J�n�C���f�b�N�X�B
	 */
    private Integer startIndex = null;
    
    /**
     * �c�A�[����
     */
    private String tourDays = null;

	/**
	 * @return tourDays
	 */
	public String getTourDays() {
		return tourDays;
	}

	/**
	 * @param tourDays �ݒ肷�� tourDays
	 */
	public void setTourDays(String tourDays) {
		this.tourDays = tourDays;
	}

	/**
	 * �ꗗ���S�s�����擾����B
	 * 
	 * @return allListInfoLineCount
	 */
	public Integer getAllListInfoLineCount() {
		return allListInfoLineCount;
	}

	/**
	 * �ꗗ���S�s����ݒ肷��B
	 * 
	 * @param allListInfoLineCount
	 */
	public void setAllListInfoLineCount(Integer allListInfoLineCount) {
		this.allListInfoLineCount = allListInfoLineCount;
	}

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
	 * @param arrCodeCondition
	 */
	public void setArrCodeCondition(String arrCodeCondition) {
		this.arrCodeCondition = arrCodeCondition;
	}

	/**
	 * ��{�����������擾����B
	 * 
	 * @return basePriceCondition
	 */
	public String getBasePriceCondition() {
		return basePriceCondition;
	}

	/**
	 * ��{����������ݒ肷��B
	 * 
	 * @param basePriceCondition
	 */
	public void setBasePriceCondition(String basePriceCondition) {
		this.basePriceCondition = basePriceCondition;
	}

	/**
	 * �����������擾����B
	 * 
	 * @return dayCondition
	 */
	public String getTourDaysCondition() {
		return tourDaysCondition;
	}

	/**
	 * ����������ݒ肷��B
	 * 
	 * @param tourDaysCondition
	 */
	public void setTourDaysCondition(String tourDaysCondition) {
		this.tourDaysCondition = tourDaysCondition;
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
	 * @param depCodeCondition
	 */
	public void setDepCodeCondition(String depCodeCondition) {
		this.depCodeCondition = depCodeCondition;
	}

	/**
	 * �o�������擾����B
	 * 
	 * @return depDay
	 */
	public String getDepDay() {
		return depDay;
	}

	/**
	 * �o������ݒ肷��B
	 * 
	 * @param depDay
	 */
	public void setDepDay(String depDay) {
		this.depDay = depDay;
	}

	/**
	 * �J�n�C���f�b�N�X���擾����B
	 * 
	 * @return startIndex
	 */
	public Integer getStartIndex() {
		return startIndex;
	}

	/**
	 * �J�n�C���f�b�N�X��ݒ肷��B
	 * 
	 * @param startIndex
	 */
	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

}
