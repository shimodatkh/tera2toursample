/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_03.dto;

import java.io.Serializable;

import jp.terasoluna.toursample.common.dto.ReserveDetailAcquireOutput;

/**
 * �c�A�[�\��ύX���擾�r�W�l�X���W�b�N�̏o�̓N���X�B<br>
 * 
 * �EUC_A01_03�F�c�A�[�\��ύX
 * 
 * 
 */
public class RP_A01_03_01_01Output implements Serializable{

    /**
     * �V���A���o�[�W����UID�B
     */
    private static final long serialVersionUID = 1521148184784284702L;

    /**
     * �c�A�[�ڍ׏��B
     */    
    private ReserveDetailAcquireOutput reserveDetail = null;
    
    /**
     * �c�A�[�ڍ׏����擾
     * 
     * @return reserveDetail
     */
    public ReserveDetailAcquireOutput getReserveDetail() {
        return reserveDetail;
    }

    /**
     * �c�A�[�ڍ׏���ݒ�
     * 
     * @param reserveDetail
     */
    public void setReserveDetail(ReserveDetailAcquireOutput reserveDetail) {
        this.reserveDetail = reserveDetail;
    }
}

