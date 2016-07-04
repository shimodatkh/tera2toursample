/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_01.form;

import java.util.Date;

import jp.terasoluna.fw.web.struts.form.ValidatorActionFormEx;
import jp.terasoluna.toursample.common.dto.PriceCalculateOutput;
import jp.terasoluna.toursample.common.dto.TourDetailAcquireOutput;
import jp.terasoluna.toursample.uc_a01_01.dto.TourInfo;

/**
 * �c�A�[�\��̃t�H�[���N���X�B
 * 
 * 
 * 
 */
public class UC_A01_01Form extends ValidatorActionFormEx {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1488467514819027464L;

    /**
     * �c�A�[�R�[�h
     */
    private String tourCode = null;
    
    /**
     * ���ӌ����v�]
     */
    private String remarks = null;

    /**
     * �\��ԍ�
     */
    private String reserveNo = null;

    /**
     * �\�����ݓ�
     */
    private Date reservedDay = null;

    /**
     * �x�����@
     */
    private String paymentMethod = null;

    /**
     * �U������
     */
    private String paymentAccount = null;

    /**
     * �U����s
     */
    private String paymentCompanyName = null;

    /**
     * �⍇���於
     */
    private String referenceName = null;

    /**
     * �⍇����d�b�ԍ�
     */
    private String referenceTel = null;

    /**
     * �⍇���惁�[���A�h���X
     */
    private String referenceEmail = null;

    /**
     * �x������
     */
    private Date paymentTimeLimit = null;

    /**
     * �ړI�n�����B
     */
    private String arrCodeCondition = null;

    /**
     * �o���n�����B
     */
    private String depCodeCondition = null;

    /**
     * �o�����i�N�j�����B
     */
    private String depDayYearCondition = null;

    /**
     * �o����(���j�����B
     */
    private String depDayMonthCondition = null;

    /**
     * �o����(���j�����B
     */
    private String depDayDayCondition = null;

    /**
     * ���������B
     */
    private String tourDaysCondition = null;

    /**
     * �l��(��l)�����B
     */
    private String adultCountCondition = null;

    /**
     * �l��(�q�ǂ�)�����B
     */
    private String childCountCondition = null;

    /**
     * ��{���������B
     */
    private String basePriceCondition = null;

    /**
     * �J�n�C���f�b�N�X�B
     */
    private Integer startIndex = 0;

    /**
     * �\���s���B
     */
    private Integer row = 10;

    /**
     * �c�A�[���ꗗ�B
     */
    private TourInfo[] tourInfoList = null;

    /**
     * �ꗗ���S�s���B
     */
    private Integer allListInfoLineCount = 0;

    /**
     * ���݃y�[�W�\���C���f�b�N�X�B
     */
    private String currentPageIndex = "1";
    
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
     * �l��(��l)�������擾����B
     * 
     * @return adultCountCondition
     */
    public String getAdultCountCondition() {

        return adultCountCondition;
    }

    /**
     * �l��(��l)������ݒ肷��B
     * 
     * @param adultCountCondition
     */
    public void setAdultCountCondition(String adultCountCondition) {

        this.adultCountCondition = adultCountCondition;
    }

    /**
     * �ړI�n�������擾����B
     * 
     * @return arrCodeCondition
     */
    public String getArrCodeCondition() {

        return arrCodeCondition;
    }

    /**
     * �ړI�n������ݒ肷��B
     * 
     * @param arrCodeCondition
     */
    public void setArrCodeCondition(String arrCodeCondition) {

        this.arrCodeCondition = arrCodeCondition;
    }

    /**
     * ��{�����������擾����B
     * 
     * @return basePriceCondition
     */
    public String getBasePriceCondition() {

        return basePriceCondition;
    }

    /**
     * ��{����������ݒ肷��B
     * 
     * @param basePriceCondition
     */
    public void setBasePriceCondition(String basePriceCondition) {

        this.basePriceCondition = basePriceCondition;
    }

    /**
     * �l��(�q�ǂ�)�������擾����B
     * 
     * @return childCountCondition
     */
    public String getChildCountCondition() {

        return childCountCondition;
    }

    /**
     * �l��(�q�ǂ�)������ݒ肷��B
     * 
     * @param childCountCondition
     */
    public void setChildCountCondition(String childCountCondition) {

        this.childCountCondition = childCountCondition;
    }

    /**
     * �����������擾����B
     * 
     * @return tourDaysCondition
     */
    public String getTourDaysCondition() {

        return tourDaysCondition;
    }

    /**
     * ����������ݒ肷��B
     * 
     * @param tourDaysCondition
     */
    public void setTourDaysCondition(String tourDaysCondition) {

        this.tourDaysCondition = tourDaysCondition;
    }

    /**
     * �o���n�������擾����B
     * 
     * @return depCodeCondition
     */
    public String getDepCodeCondition() {

        return depCodeCondition;
    }

    /**
     * �o���n������ݒ肷��B
     * 
     * @param depCodeCondition
     */
    public void setDepCodeCondition(String depCodeCondition) {

        this.depCodeCondition = depCodeCondition;
    }

    /**
     * �o����(���j�������擾����B
     * 
     * @return depDayDayCondition
     */
    public String getDepDayDayCondition() {

        return depDayDayCondition;
    }

    /**
     * �o����(���j������ݒ肷��B
     * 
     * @param depDayDayCondition
     */
    public void setDepDayDayCondition(String depDayDayCondition) {

        this.depDayDayCondition = depDayDayCondition;
    }

    /**
     * �o����(���j�������擾����B
     * 
     * @return depDayMonthCondition
     */
    public String getDepDayMonthCondition() {

        return depDayMonthCondition;
    }

    /**
     * �o����(���j������ݒ肷��B
     * 
     * @param depDayMonthCondition
     */
    public void setDepDayMonthCondition(String depDayMonthCondition) {

        this.depDayMonthCondition = depDayMonthCondition;
    }

    /**
     * �o�����i�N�j�������擾����B
     * 
     * @return depDayYearCondition
     */
    public String getDepDayYearCondition() {

        return depDayYearCondition;
    }

    /**
     * �o�����i�N�j������ݒ肷��B
     * 
     * @param depDayYearCondition
     */
    public void setDepDayYearCondition(String depDayYearCondition) {

        this.depDayYearCondition = depDayYearCondition;
    }

    /**
     * �\���s�����擾����B
     * 
     * @return row
     */
    public Integer getRow() {

        return row;
    }

    /**
     * �\���s����ݒ肷��B
     * 
     * @param row
     */
    public void setRow(Integer row) {

        this.row = row;
    }

    /**
     * �J�n�C���f�b�N�X���擾����B
     * 
     * @return startIndex
     */
    public Integer getStartIndex() {

        return startIndex;
    }

    /**
     * �J�n�C���f�b�N�X��ݒ肷��B
     * 
     * @param startIndex
     */
    public void setStartIndex(Integer startIndex) {

        this.startIndex = startIndex;
    }

    /**
     * �ꗗ���S�s�����擾����B
     * 
     * @return allListInfoLineCount
     */
    public Integer getAllListInfoLineCount() {

        return allListInfoLineCount;
    }

    /**
     * �ꗗ���S�s����ݒ肷��B
     * 
     * @param allListInfoLineCount
     */
    public void setAllListInfoLineCount(Integer allListInfoLineCount) {

        this.allListInfoLineCount = allListInfoLineCount;
    }

    /**
     * �c�A�[���ꗗ���擾����B
     * 
     * @return tourInfoList
     */
    public TourInfo[] getTourInfoList() {

        return tourInfoList;
    }

    /**
     * �c�A�[���ꗗ��ݒ肷��B
     * 
     * @param tourInfoList
     */
    public void setTourInfoList(TourInfo[] tourInfoList) {

        this.tourInfoList = tourInfoList;
    }

    /**
     * �x�����@���擾����B
     * 
     * @return paymentMethod
     */
    public String getPaymentMethod() {

        return paymentMethod;
    }

    /**
     * �x�����@��ݒ肷��B
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(String paymentMethod) {

        this.paymentMethod = paymentMethod;
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
     * �U����s���擾����B
     * 
     * @return paymentCompanyName
     */
    public String getPaymentCompanyName() {

        return paymentCompanyName;
    }

    /**
     * �U���⍆��ݒ肷��B
     * 
     * @param paymentCompanyName
     */
    public void setPaymentCompanyName(String paymentCompanyName) {

        this.paymentCompanyName = paymentCompanyName;
    }

    /**
     * ���݃y�[�W�\���C���f�b�N�X���擾����B
     * 
     * @return currentPageIndex
     */
    public String getCurrentPageIndex() {

        return currentPageIndex;
    }

    /**
     * ���݃y�[�W�\���C���f�b�N�X��ݒ肷��B
     * 
     * @param currentPageIndex
     */
    public void setCurrentPageIndex(String currentPageIndex) {

        this.currentPageIndex = currentPageIndex;
    }

}
