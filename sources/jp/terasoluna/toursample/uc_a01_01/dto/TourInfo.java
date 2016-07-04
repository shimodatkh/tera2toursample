/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_01.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * �c�A�[�������ێ��N���X�B<br>
 * 
 * 
 * 
 * 
 */
public class TourInfo implements Serializable {

	/**
	 * �V���A���o�[�W����UID�B
	 */
	private static final long serialVersionUID = 1211045869426150198L;
	
	/**
	 * �c�A�[�R�[�h�B
	 */
	private String tourCode = null;

	/**
	 * �c�A�[���́B
	 */
	private String tourName = null;

	/**
	 * �c�A�[�o�����B
	 */
	private Date   depDay = null;

	/**
	 * �c�A�[�����B
	 */
	private String tourDays = null;

	/**
	 * �c�A�[����(int)�B
	 */
	private Integer tourIntDays = null;	

	/**
	 * ��{�����B
	 */
	private Integer basePrice = null;

	/**
	 * �o���n���́B
	 */	
	private String depName = null;

	/**
	 * �ړI�n���́B
	 */	
	private String arrName = null;

	/**
	 * �c�A�[�R�[�h���擾����B
	 * 
	 * @return tourCode
	 */
	public String getTourCode() {
		return tourCode;
	}
	
	/**
	 * �c�A�[�R�[�h��ݒ肷��B
	 * 
	 * @param tourCode
	 */
	public void setTourCode(String tourCode) {
		this.tourCode = tourCode;
	}
	
	/**
	 * �c�A�[���̂��擾����B
	 * 
	 * @return tourName
	 */
	public String getTourName() {
		return tourName;
	}
	
	/**
	 * �c�A�[���̂�ݒ肷��B
	 * 
	 * @param tourName �ݒ肷��
	 */
	public void setTourName(String tourName) {
		this.tourName = tourName;
	}

	/**
	 * �c�A�[�o�������擾����B
	 * 
	 * @return depDay
	 */
	public Date getDepDay() {
		return depDay;
	}

	/**
	 * �c�A�[�o������ݒ肷��B
	 * 
	 * @param depDay
	 */
	public void setDepDay(Date depDay) {
		this.depDay = depDay;
	}

	/**
	 * �c�A�[�������擾����B
	 * 
	 * @return tourDays
	 */
	public String getTourDays() {
		return tourDays;
	}

	/**
	 * �c�A�[������ݒ肷��B
	 * 
	 * @param tourDays
	 */
	public void setTourDays(String tourDays) {
		this.tourDays = tourDays;
	}

	/**
	 * �c�A�[����(int)���擾����B
	 * 
	 * @return tourIntDays
	 */
	public Integer getTourIntDays() {
		return tourIntDays;
	}

	/**
	 * �c�A�[����(int)��ݒ肷��B
	 * 
	 * @param tourIntDays �ݒ肷��
	 */
	public void setTourIntDays(Integer tourIntDays) {
		this.tourIntDays = tourIntDays;
	}

	/**
	 * ��{�������擾����B
	 * 
	 * @return basePrice
	 */
	public Integer getBasePrice() {
		return basePrice;
	}

	/**
	 * ��{������ݒ肷��B
	 * 
	 * @param basePrice
	 */
	public void setBasePrice(Integer basePrice) {
		this.basePrice = basePrice;
	}

	/**
	 * �o���n���̂��擾����B
	 * 
	 * @return depName
	 */
	public String getDepName() {
		return depName;
	}

	/**
	 * �o���n���̂�ݒ肷��B
	 * 
	 * @param depName
	 */
	public void setDepName(String depName) {
		this.depName = depName;
	}

	/**
	 * �ړI�n���̂��擾����B
	 * 
	 * @return arrName
	 */
	public String getArrName() {
		return arrName;
	}
	
	/**
	 * �ړI�n���̂�ݒ肷��B
	 * 
	 * @param arrName
	 */
	public void setArrName(String arrName) {
		this.arrName = arrName;
	}
		
}