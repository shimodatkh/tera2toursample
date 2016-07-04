/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_01.dto;

import java.io.Serializable;
import java.util.Date;

import jp.terasoluna.toursample.common.dto.PriceCalculateOutput;
import jp.terasoluna.toursample.common.dto.TourDetailAcquireOutput;

/**
 * 
 * �\��o�^����Ƃ��̏o�͒l�N���X�B
 * 
 * 
 * 
 */
public class RP_A01_01_03_01Output implements Serializable {

    /**
     * �V���A���o�[�W����UID�B
     */
    private static final long serialVersionUID = 6752822955881180226L;

    /**
     * �\��ԍ��B
     */
    private String reserveNo = null;

    /**
     * �\�����ݓ��B
     */
    private Date reservedDay = null;

    /**
     * �x�������@�B
     */
    private String paymentMethod = null;

    /**
     * �U�������B
     */
    private String paymentAccount = null;

    /**
     * �U����B
     */
    private String paymentCompanyName = null;

    /**
     * �⍇���於�B
     */
    private String referenceName = null;

    /**
     * �⍇����d�b�ԍ��B
     */
    private String referenceTel = null;

    /**
     * �⍇���惁�[���A�h���X�B
     */
    private String referenceEmail = null;

    /**
     * �x�������B
     */
    private Date paymentTimeLimit = null;

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
     * �x���������擾����B
     * 
     * @return paymentTimeLimit
     */
    public Date getPaymentTimeLimit() {
        return paymentTimeLimit;
    }

    /**
     * �x��������ݒ肷��B
     * 
     * @param paymentTimeLimit
     */
    public void setPaymentTimeLimit(Date paymentTimeLimit) {
        this.paymentTimeLimit = paymentTimeLimit;
    }

    /**
     * �x�������@���擾����B
     * 
     * @return paymentMethod
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * �x�������@��ݒ肷��B
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * �⍇���惁�[���A�h���X���擾����B
     * 
     * @return referenceEmail
     */
    public String getReferenceEmail() {
        return referenceEmail;
    }

    /**
     * �⍇���惁�[���A�h���X��ݒ肷��B
     * 
     * @param referenceEmail
     */
    public void setReferenceEmail(String referenceEmail) {
        this.referenceEmail = referenceEmail;
    }

    /**
     * �⍇���於���擾����B
     * 
     * @return referenceName
     */
    public String getReferenceName() {
        return referenceName;
    }

    /**
     * �⍇���於��ݒ肷��B
     * 
     * @param referenceName
     */
    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName;
    }

    /**
     * �⍇����d�b�ԍ����擾����B
     * 
     * @return referenceTel
     */
    public String getReferenceTel() {
        return referenceTel;
    }

    /**
     * �⍇����d�b�ԍ���ݒ肷��B
     * 
     * @param referenceTel
     */
    public void setReferenceTel(String referenceTel) {
        this.referenceTel = referenceTel;
    }

    /**
     * �\�����ݓ����擾����B
     * 
     * @return reservedDay
     */
    public Date getReservedDay() {
        return reservedDay;
    }

    /**
     * �\�����ݓ���ݒ肷��B
     * 
     * @param reservedDay
     */
    public void setReservedDay(Date reservedDay) {
        this.reservedDay = reservedDay;
    }

    /**
     * �\��ԍ����擾����B
     * 
     * @return reserveNo
     */
    public String getReserveNo() {
        return reserveNo;
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
     * �U���������擾����B
     * 
     * @return paymentAccount
     */
    public String getPaymentAccount() {
        return paymentAccount;
    }

    /**
     * �U��������ݒ肷��B
     * 
     * @param paymentAccount
     */
    public void setPaymentAccount(String paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    /**
     * �U������擾����B
     * 
     * @return paymentCompanyName
     */
    public String getPaymentCompanyName() {
        return paymentCompanyName;
    }

    /**
     * �U�����ݒ肷��B
     * 
     * @param paymentCompanyName
     */
    public void setPaymentCompanyName(String paymentCompanyName) {
        this.paymentCompanyName = paymentCompanyName;
    }
}
