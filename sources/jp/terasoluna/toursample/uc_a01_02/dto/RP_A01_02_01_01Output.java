/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_02.dto;

import java.io.Serializable;

/**
 * RP_A01_02_01_01BLogic�̏o�͒l�N���X�B
 *
 * 
 */
public class RP_A01_02_01_01Output implements Serializable {
    
    /**
     * serialVersionUID�B
     */
    private static final long serialVersionUID = -5294130490486913518L;

    /**
     * �c�A�[�\���񃊃X�g�B
     */
    private SelectReservationInfoOutput[] reservationInfo = null;
    
    /**
     * �\�񌏐��B
     */
    private Integer reservationsCount = null;

    
    /**
     * �c�A�[�\���񃊃X�g��Ԃ��B
     * @return �c�A�[�\���񃊃X�g
     */
    public SelectReservationInfoOutput[] getReservationInfo() {
    
        return reservationInfo;
    }

    
    /**
     * �c�A�[�\���񃊃X�g��ݒ肷��B
     * @param reservationInfo �c�A�[�\���񃊃X�g
     */
    public void setReservationInfo(SelectReservationInfoOutput[] reservationInfo) {
    
        this.reservationInfo = reservationInfo;
    }

    
    /**
     * �\�񌏐���Ԃ��B
     * @return �\�񌏐�
     */
    public Integer getReservationsCount() {
    
        return reservationsCount;
    }

    
    /**
     * �\�񌏐���ݒ肷��B
     * @param reservationsCount �\�񌏐�
     */
    public void setReservationsCount(Integer reservationsCount) {
    
        this.reservationsCount = reservationsCount;
    }
        
}
