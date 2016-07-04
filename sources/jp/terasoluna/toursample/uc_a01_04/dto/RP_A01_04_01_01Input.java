/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_04.dto;

import java.io.Serializable;

import jp.terasoluna.toursample.common.TourUVO;

/**
 * �\����擾�̂��߂̓��͒l�N���X�B
 * 
 * 
 */
public class RP_A01_04_01_01Input implements Serializable {

    /**
     * �V���A���o�[�W����UID�B
     */
    private static final long serialVersionUID = -370419235175000734L;

    /**
     * �\��ԍ��B
     */
    private String reserveNo = null;

    /**
     * �ڋq���B
     */
    private TourUVO USER_VALUE_OBJECT = null;

    /**
     * �\��ԍ����擾����B
     * 
     * @return reserveNo
     */
    public String getReserveNo() {

        return this.reserveNo;
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

        return this.USER_VALUE_OBJECT;
    }

    /**
     * �ڋq����ݒ肷��B
     * 
     * @param USER_VALUE_OBJECT
     */
    public void setUSER_VALUE_OBJECT(TourUVO USER_VALUE_OBJECT) {

        this.USER_VALUE_OBJECT = USER_VALUE_OBJECT;
    }

}