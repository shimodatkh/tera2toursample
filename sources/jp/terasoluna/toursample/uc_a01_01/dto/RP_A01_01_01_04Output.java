/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_01.dto;

import java.io.Serializable;

/**
 * �y�[�W�J�ڂ���Ƃ��̏o�͒l�N���X�B
 * 
 * 
 *
 */
public class RP_A01_01_01_04Output implements Serializable {

	/**
	 * �V���A���o�[�W����UID�B
	 */
	private static final long serialVersionUID = -8280550864355488098L;
	
    /**
     * �c�A�[���ꗗ�B
     */
    private TourInfo[] tourInfoList = null;
    
    /**
     * �ꗗ���S�s���B
     */
    private Integer allListInfoLineCount = 0;

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
	 * �c�A�[���ꗗ���擾����B
	 * 
	 * @return tourInfoList
	 */
	public TourInfo[] getTourInfoList() {
		return tourInfoList;
	}

	/**
	 * �c�A�[���ꗗ��ݒ肷��B
	 * 
	 * @param tourInfoList
	 */
	public void setTourInfoList(TourInfo[] tourInfoList) {
		this.tourInfoList = tourInfoList;
	}

}
