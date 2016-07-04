/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_04.form;

import jp.terasoluna.fw.web.struts.form.ValidatorActionFormEx;
import jp.terasoluna.toursample.common.dto.PriceCalculateOutput;
import jp.terasoluna.toursample.common.dto.ReserveDetailAcquireOutput;

/**
 * UC_A01_04�̃A�N�V�����t�H�[���N���X�B
 * 
 * 
 */
public class UC_A01_04Form extends ValidatorActionFormEx {

    /**
	 * serialVersionUID �B
	 */
	private static final long serialVersionUID = -7306186094608736939L;

	/**
     * �\��ԍ��B
     */
    private String reserveNo = null;

    /**
     * �\����B
     */
    private ReserveDetailAcquireOutput reserveDetail = null;

    /**
     * �J�ڌ����ID�B
     */
    private String returnCode = null;

    /**
     * �������B
     */
    private PriceCalculateOutput price = null;

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
     *            reserveNo
     */
    public void setReserveNo(String reserveNo) {

        this.reserveNo = reserveNo;
    }

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
     *            reserveDetail
     */
    public void setReserveDetail(ReserveDetailAcquireOutput reserveDetail) {

        this.reserveDetail = reserveDetail;
    }

    /**
     * �J�ڌ����ID���擾����B
     * 
     * @return returnCode
     */
    public String getReturnCode() {

        return this.returnCode;
    }

    /**
     * �J�ڌ����ID��ݒ肷��B
     * 
     * @param returnCode
     *            returnCode
     */
    public void setReturnCode(String returnCode) {

        this.returnCode = returnCode;
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
     *            price
     */
    public void setPrice(PriceCalculateOutput price) {

        this.price = price;
    }

}