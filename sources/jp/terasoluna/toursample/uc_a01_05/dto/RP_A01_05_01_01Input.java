/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_05.dto;

import java.io.Serializable;

import jp.terasoluna.toursample.common.TourUVO;

/**
 * RP_A01_05_01_01BLogic�̓��͒l�N���X�B
 *
 * 
 */
public class RP_A01_05_01_01Input implements Serializable {

    /**
     * serialVersionUID�B
     */
    private static final long serialVersionUID = -7823029922697449605L;

    /**
     * �\��ԍ��B
     */
    private String reserveNo = null;
    
    /**
     * �ڋq���B
     */
    private TourUVO tourUVO = null;

    
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
     * �ڋq����Ԃ��B
     * @return �ڋq���
     */
    public TourUVO getTourUVO() {
    
        return tourUVO;
    }

    
    /**
     * �ڋq����ݒ肷��B
     * @param tourUVO �ڋq���
     */
    public void setTourUVO(TourUVO tourUVO) {
    
        this.tourUVO = tourUVO;
    }
}