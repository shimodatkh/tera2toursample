/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_01.dto;

import java.io.Serializable;

/**
 * RP_A01_01_01_02BLogic�̏o�͒l�N���X�B
 *
 * 
 */
public class RP_A01_01_01_02Output implements Serializable {

    /**
     * �V���A���o�[�W����UID�B
     */
    private static final long serialVersionUID = 2437295829383621433L;

	/**
     * �c�A�[���ꗗ�B
     */
    private TourInfo[] tourInfoList = null;
    
    /**
     * �ꗗ���S�s���B
     */
    private Integer allListInfoLineCount = 0;

    /**
     * �c�A�[���ꗗ���擾����B
     * @return allListInfoLineCount
     */
    public Integer getAllListInfoLineCount() {
        return allListInfoLineCount;
    }

    /**
     * �c�A�[���ꗗ��ݒ肷��B
     * @param allListInfoLineCount
     */
    public void setAllListInfoLineCount(Integer allListInfoLineCount) {
        this.allListInfoLineCount = allListInfoLineCount;
    }

    /**
     * �ꗗ���S�s�����擾����B
     * @return tourInfoList
     */
    public TourInfo[] getTourInfoList() {
        return tourInfoList;
    }

    /**
     * �ꗗ���S�s����ݒ肷��B
     * @param tourInfoList
     */
    public void setTourInfoList(TourInfo[] tourInfoList) {
        this.tourInfoList = tourInfoList;
    }

}