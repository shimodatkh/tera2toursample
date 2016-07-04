/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_03.dto;

import java.io.Serializable;

import jp.terasoluna.toursample.common.dto.PriceCalculateOutput;
import jp.terasoluna.toursample.common.dto.ReserveDetailAcquireOutput;

/**
 * �c�A�[�\��ύX�m��̃r�W�l�X���W�b�N�̓��̓N���X�B<br>
 * 
 * �EUC_A01_03�F�c�A�[�\��ύX
 * 
 * 
 */
public class RP_A01_03_02_01Input implements Serializable {

    /**
     * �V���A���o�[�W����UID�B
     */
    private static final long serialVersionUID = -1002140563277124463L;

    /**
     * �\��ԍ��B
     */
    private String reserveNo = null;
    
    /**
     *�c�A�[�R�[�h�B
     */    
    private String tourCode = null;
    
    /**
     * �l���i��l�j�B
     */
    private Integer adultCount = null; 
    
    /**
     * �l���i�q�ǂ��j�B
     */
    private Integer childCount = null;
    
    /**
     *���v�����B
     */
    private Integer sumPrice = null;
    
    /**
     * ���ӌ����v�]�B
     */
    private String remarks = null;

    /**
     * �c�A�[�ڍ׏��B
     */    
    private ReserveDetailAcquireOutput reserveDetail = null;

    /**
     * �����B
     */
    private PriceCalculateOutput price = null;
    
    /**
     * �������擾����B
     * 
     * @return price
     */
    public PriceCalculateOutput getPrice() {
        return price;
    }

    /**
     * ������ݒ肷��B
     * 
     * @param price
     */
    public void setPrice(PriceCalculateOutput price) {
        this.price = price;
    }
    
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
    
    /**
     * �l���i��l�j��Ԃ��B
     * @return �l���i��l�j
     */
    public Integer getAdultCount() {
        return adultCount;
    }
    
    /**
     * �l���i��l�j��ݒ肷��B
     * @param adultCount �l���i��l�j
     */
    public void setAdultCount(Integer adultCount) {
        this.adultCount = adultCount;
    }
    
    /**
     * �l���i�q�ǂ��j��Ԃ��B
     * @return �l���i�q�ǂ��j
     */
    public Integer getChildCount() {
        return childCount;
    }
    
    /**
     * �l���i�q�ǂ��j��ݒ肷��B
     * @param childCount �l���i�q�ǂ��j
     */
    public void setChildCount(Integer childCount) {
        this.childCount = childCount;
    }
    
    /**
     * ���ӌ����v�]��Ԃ��B
     * @return ���ӌ����v�]
     */
    public String getRemarks() {
        return remarks;
    }
    
    /**
     * ���ӌ����v�]��ݒ肷��B
     * @param remarks ���ӌ����v�]
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
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
     * �c�A�[�R�[�h��Ԃ��B
     * @return �c�A�[�R�[�h
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * �c�A�[�R�[�h��ݒ肷��B
     * @param tourCode �c�A�[�R�[�h
     */
    public void setTourCode(String tourCode) {
        this.tourCode = tourCode;
    }

    /**
     * ���v������Ԃ��B
     * @return ���v����
     */
    public Integer getSumPrice() {
        return sumPrice;
    }

    /**
     * ���v������ݒ肷��B
     * @param sumPrice ���v����
     */
    public void setSumPrice(Integer sumPrice) {
        this.sumPrice = sumPrice;
    }
    
}
