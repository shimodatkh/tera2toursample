/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_02.form;

import jp.terasoluna.fw.web.struts.form.ValidatorActionFormEx;
import jp.terasoluna.toursample.common.dto.PriceCalculateOutput;
import jp.terasoluna.toursample.common.dto.ReserveDetailAcquireOutput;
import jp.terasoluna.toursample.uc_a01_02.dto.SelectReservationInfoOutput;

/**
 * �c�A�[�\��Ɖ�p��ActionForm�B<br>
 * 
 * �EUC_A01_02�F�c�A�[�\��Ɖ�
 * 
 * 
 */
public class UC_A01_02Form  extends ValidatorActionFormEx {


    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -2156362709861308598L;

    /**
     * �c�A�[�\���񃊃X�g�B
     */
    private SelectReservationInfoOutput[] reservationInfo = null;
    
    /**
     * �\�񌏐��B
     */
    private Integer reservationsCount = null;
    
    /**
     * �\��ԍ��B
     */
    private String reserveNo = null;

    /**
     * �\��ڍ׏��B
     */
    private ReserveDetailAcquireOutput reserveDetail = new ReserveDetailAcquireOutput();

    /**
     * �������B
     */
    private PriceCalculateOutput price = null;
    
    /**
     * �x�����@�B
     */
    private String paymentMethod = null;
    
    /**
     * ��s���B
     */
    private String paymentCompanyName = null;
    
    /**
     * ��s�����B
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
     * �U���������߃t���O�B
     */
    private boolean limitExcessFlag = false;

    
    /**
     * �U���������߃t���O��Ԃ��B
     * @return �U���������߃t���O
     */
    public boolean isLimitExcessFlag() {
    
        return limitExcessFlag;
    }

    
    /**
     * �U���������߃t���O��ݒ肷��B
     * @param limitExcessFlag �U���������߃t���O
     */
    public void setLimitExcessFlag(boolean limitExcessFlag) {
    
        this.limitExcessFlag = limitExcessFlag;
    }

    
    /**
     * ��s������Ԃ��B
     * @return ��s����
     */
    public String getPaymentAccount() {
    
        return paymentAccount;
    }

    
    /**
     * ��s������ݒ肷��B
     * @param paymentAccount ��s����
     */
    public void setPaymentAccount(String paymentAccount) {
    
        this.paymentAccount = paymentAccount;
    }

    
    /**
     * ��s����Ԃ��B
     * @return ��s��
     */
    public String getPaymentCompanyName() {
    
        return paymentCompanyName;
    }

    
    /**
     * ��s����ݒ肷��B
     * @param paymentCompanyName ��s��
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
     * ��������Ԃ��B
     * @return �������
     */
    public PriceCalculateOutput getPrice() {
    
        return price;
    }

    
    /**
     * ��������ݒ肷��B
     * @param price �������
     */
    public void setPrice(PriceCalculateOutput price) {
    
        this.price = price;
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

    
    /**
     * �c�A�[�\���񃊃X�g��Ԃ��B
     * @return �c�A�[�\���񃊃X�g
     */
    public SelectReservationInfoOutput[] getReservationInfo() {
    	return reservationInfo;
    }     



    
    /**
     * �c�A�[�\���񃊃X�g��ݒ肷��B
     * @param reservationInfo �c�A�[�\���񃊃X�g
     */
    public void setReservationInfo(SelectReservationInfoOutput[] reservationInfo) {
    
        this.reservationInfo = reservationInfo;
    }

    
    /**
     * �\�񌏐���Ԃ��B
     * @return �\�񌏐�
     */
    public Integer getReservationsCount() {
    
        return reservationsCount;
    }

    
    /**
     * �\�񌏐���ݒ肷��B
     * @param reservationsCount �\�񌏐�
     */
    public void setReservationsCount(Integer reservationsCount) {
    
        this.reservationsCount = reservationsCount;
    }

    
    /**
     * �\��ڍ׏���Ԃ��B
     * @return �\��ڍ׏��
     */
    public ReserveDetailAcquireOutput getReserveDetail() {
        
        return reserveDetail;
    }

    
    /**
     * �\��ڍ׏���ݒ肷��B
     * @param reserveDetail �\��ڍ׏��
     */
    public void setReserveDetail(ReserveDetailAcquireOutput reserveDetail) {
    
        this.reserveDetail = reserveDetail;
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
}
