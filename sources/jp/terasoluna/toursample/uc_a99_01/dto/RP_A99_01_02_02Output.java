/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a99_01.dto;

import java.io.Serializable;

import jp.terasoluna.toursample.common.TourUVO;

/**
 * RP_A99_01_02_02Action�o�͒l�N���X
 * 
 * 
 *
 */
public class RP_A99_01_02_02Output implements Serializable {

    /**
     * �V���A���o�[�W����UID�B
     */
    private static final long serialVersionUID = 8097338159970602909L;

    /**
     * �ڋq���B
     */
    private TourUVO uvo = null;

    /**
     * �ڋq����Ԃ��B
     * 
     * @return �ڋq���
     */
    public TourUVO getUvo() {

        return uvo;
    }

    /**
     * �ڋq����ݒ肷��B
     * 
     * @param uvo
     *            �ڋq���
     */
    public void setUvo(TourUVO uvo) {

        this.uvo = uvo;
    }

}
