/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_03.dto;

import java.io.Serializable;

import jp.terasoluna.toursample.common.TourUVO;

/**
 * �c�A�[�\��ύX���擾�r�W�l�X���W�b�N�̓��̓N���X�B<br>
 * 
 * �EUC_A01_03�F�c�A�[�\��ύX
 * 
 * 
 */
public class RP_A01_03_01_01Input implements Serializable{

    /**
     * �V���A���o�[�W����UID�B
     */
    private static final long serialVersionUID = -6461812030190066129L;

    /**
     *�\��ԍ��B
     */
    private String reserveNo = null;
    
    /**
     * �ڋq���B
     */
    private TourUVO USER_VALUE_OBJECT = null;    
    
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
    public TourUVO getUSER_VALUE_OBJECT() {
        return USER_VALUE_OBJECT;
    }

    /**
     * �ڋq����ݒ肷��B
     * @param user_value_object �ڋq���
     */
    public void setUSER_VALUE_OBJECT(TourUVO user_value_object) {
        USER_VALUE_OBJECT = user_value_object;
    }
    
}
