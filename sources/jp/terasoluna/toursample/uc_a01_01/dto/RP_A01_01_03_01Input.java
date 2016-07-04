/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_01.dto;

import java.io.Serializable;

import jp.terasoluna.toursample.common.TourUVO;
import jp.terasoluna.toursample.common.dto.PriceCalculateOutput;

/**
 * 
 * �\���o�^���邽�߂̓��͒l�N���X�B
 * 
 * 
 * 
 */
public class RP_A01_01_03_01Input implements Serializable {

    /**
     * �V���A���o�[�W����UID�B
     */
    private static final long serialVersionUID = -4929041083540875979L;

    /**
     * �c�A�[�R�[�h�B
     */
    private String tourCode = null;

    /**
     * �ڋq���B
     */
    private TourUVO USER_VALUE_OBJECT = null;

    /**
     * ���ӌ����v�]�B
     */
    private String remarks = null;

    /**
     * �c�A�[��{�����A�l�����P���A�����Ȃ�
     */     
    private PriceCalculateOutput priceOutput = null;
        
    /**
     * �c�A�[��{�����A�l�����P���A�����Ȃǂ��擾����
     * 
     * @return priceOutput
     */
    public PriceCalculateOutput getPriceOutput() {
		return priceOutput;
	}    
    
	/**
	 * �c�A�[��{�����A�l�����P���A�����Ȃǂ�ݒ肷��
	 * 
	 * @param priceOutput
	 */
	public void setPriceOutput(PriceCalculateOutput priceOutput) {
		this.priceOutput = priceOutput;
	}

    /**
     * ���ӌ����v�]���擾����B
     * 
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * ���ӌ����v�]��ݒ肷��B
     * 
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * �c�A�[�R�[�h���擾����B
     * 
     * @return tourCode
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * �c�A�[�R�[�h��ݒ肷��B
     * 
     * @param tourCode
     */
    public void setTourCode(String tourCode) {
        this.tourCode = tourCode;
    }

    /**
     * �ڋq�����擾����B
     * 
     * @return USER_VALUE_OBJECT
     */
    public TourUVO getUSER_VALUE_OBJECT() {
        return USER_VALUE_OBJECT;
    }

    /**
     * �ڋq����ݒ肷��B
     * 
     * @param user_value_object
     */
    public void setUSER_VALUE_OBJECT(TourUVO user_value_object) {
        USER_VALUE_OBJECT = user_value_object;
    }

}
