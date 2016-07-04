package jp.terasoluna.toursample.uc_a01_03.blogic;

import java.io.Serializable;

public class UpdateReserveInput implements Serializable {

	 /**
	 * 
	 */
	private static final long serialVersionUID = -6113309330672265182L;

	/**
     * �\��ԍ��B
     */
    private String reserveNo = null;
       
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

