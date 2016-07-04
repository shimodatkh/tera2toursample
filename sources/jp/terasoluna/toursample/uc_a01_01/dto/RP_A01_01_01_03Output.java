/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_01.dto;

import java.io.Serializable;

import jp.terasoluna.toursample.common.dto.PriceCalculateOutput;
import jp.terasoluna.toursample.common.dto.TourDetailAcquireOutput;

/**
 * RP_A01_01_01_03BLogic�̏o�͒l�N���X�B
 * 
 * 
 * 
 */
public class RP_A01_01_01_03Output implements Serializable {


    /**
     * �V���A���o�[�W����UID
     */
    private static final long serialVersionUID = 3270608081338149204L;

    /**
     * ���ӌ��E���v�]�������t�B�[���h
     */
    private String remarks = null;

    /**
     * �c�A�[�ڍ׏��
     */   
    private TourDetailAcquireOutput tourDetail = null;

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
     * �c�A�[�ڍ׏����擾����
     * 
     * @return tourDetail
     */
 
    public TourDetailAcquireOutput getTourDetail() {
		return tourDetail;
	}

	/**
	 * �c�A�[�ڍ׏���ݒ肷��
	 * 
     * @param tourDetail
     */

	public void setTourDetail(TourDetailAcquireOutput tourDetail) {
		this.tourDetail = tourDetail;
	}


	/**
     * @return remarks
     */
    public String getRemarks() {
    
        return remarks;
    }

    
    /**
     * @param remarks �ݒ肷��
     */
    public void setRemarks(String remarks) {
    
        this.remarks = remarks;
    }
}
