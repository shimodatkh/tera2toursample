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
 * �c�A�[�\��ύX�m�F�̃r�W�l�X���W�b�N�̏o�̓N���X�B<br>
 * 
 * �EUC_A01_03�F�c�A�[�\��ύX
 * 
 * 
 */
public class RP_A01_03_01_02Output implements Serializable{

    /**
     * �V���A���o�[�W����UID�B
     */
    private static final long serialVersionUID = 8012582821613798288L;
   
    /**
     * �x�����@�B
     */
    private String paymentMethod = null;
    
    /**
     * �x����s���B
     */
    private String paymentCompanyName = null;
    
    /**
     * �x�������B
     */
    private String paymentAccount = null;
    
    /**
     * �⍇���於�B
     */
    private String referenceName = null;
    
    /**
     * �⍇���惁�[���B
     */
    private String referenceEmail = null;
    
    /**
     * �⍇����d�b�B
     */
    private String referenceTel = null;

    /**
     * �����B
     */
    private PriceCalculateOutput price = null;

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
     * �x��������Ԃ��B
     * @return �x������
     */
    public String getPaymentAccount() {
        return paymentAccount;
    }

    /**
     * �x��������ݒ肷��B
     * @param paymentAccount �x������
     */
    public void setPaymentAccount(String paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    /**
     * �x����s����Ԃ��B
     * @return �x����s��
     */
    public String getPaymentCompanyName() {
        return paymentCompanyName;
    }

    /**
     * �x����s����ݒ肷��B
     * @param paymentCompanyName �x����s��
     */
    public void setPaymentCompanyName(String paymentCompanyName) {
        this.paymentCompanyName = paymentCompanyName;
    }

    /**
     * �x�����@��Ԃ��B
     * @return �x�����@
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * �x�����@��ݒ肷��B
     * @param paymentMethod �x�����@
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * �⍇���惁�[����Ԃ��B
     * @return �⍇���惁�[��
     */
    public String getReferenceEmail() {
        return referenceEmail;
    }

    /**
     * �⍇���惁�[����ݒ肷��B
     * @param referenceEmail �⍇���惁�[��
     */
    public void setReferenceEmail(String referenceEmail) {
        this.referenceEmail = referenceEmail;
    }

    /**
     * �⍇���於��Ԃ��B
     * @return �⍇���於
     */
    public String getReferenceName() {
        return referenceName;
    }

    /**
     * �⍇���於��ݒ肷��B
     * @param referenceName �⍇���於
     */
    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName;
    }

    /**
     * �⍇����d�b��Ԃ��B
     * @return �⍇����d�b
     */
    public String getReferenceTel() {
        return referenceTel;
    }

    /**
     * �⍇����d�b��ݒ肷��B
     * @param referenceTel �⍇����d�b
     */
    public void setReferenceTel(String referenceTel) {
        this.referenceTel = referenceTel;
    }
    
}

