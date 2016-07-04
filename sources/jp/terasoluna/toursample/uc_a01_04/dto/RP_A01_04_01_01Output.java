/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_04.dto;

import java.io.Serializable;

import jp.terasoluna.toursample.common.dto.PriceCalculateOutput;
import jp.terasoluna.toursample.common.dto.ReserveDetailAcquireOutput;

/**
 * ���������\������i�[����o�̓N���X�B
 * 
 * 
 */
public class RP_A01_04_01_01Output implements Serializable {

    /**
     * �V���A���o�[�W����UID�B
     */
    private static final long serialVersionUID = -4823038142885388304L;

    /**
     * �\����B
     */
    private ReserveDetailAcquireOutput reserveDetail = null;

    /**
     * �������B
     */
    private PriceCalculateOutput price = null;

    /**
     * �\������擾����B
     * 
     * @return reserveDetail
     */
    public ReserveDetailAcquireOutput getReserveDetail() {

        return this.reserveDetail;
    }

    /**
     * �\�����ݒ肷��B
     * 
     * @param reserveDetail
     */
    public void setReserveDetail(ReserveDetailAcquireOutput reserveDetail) {

        this.reserveDetail = reserveDetail;
    }

    /**
     * ���������擾����B
     * 
     * @return price
     */
    public PriceCalculateOutput getPrice() {

        return this.price;
    }

    /**
     * ��������ݒ肷��B
     * 
     * @param price
     */
    public void setPrice(PriceCalculateOutput price) {

        this.price = price;
    }

}