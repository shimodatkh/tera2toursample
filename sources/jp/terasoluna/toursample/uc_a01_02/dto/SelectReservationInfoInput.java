package jp.terasoluna.toursample.uc_a01_02.dto;

import java.io.Serializable;
import java.util.Date;

public class SelectReservationInfoInput implements Serializable {

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = -6557299851626576485L;

    /**
     * �\��ԍ��B
     */
    private String customerCode = null;

    /**
     * �V�X�e�����t�B
     */
    private Date today = null;

    /**
     * �\��ԍ���Ԃ��B
     * 
     * @return �\��ԍ�
     */
    public String getCustomerCode() {

        return customerCode;
    }

    /**
     * �\��ԍ���ݒ肷��B
     * 
     * @param customerCode
     *            �\��ԍ�
     */
    public void setCustomerCode(String customerCode) {

        this.customerCode = customerCode;
    }

    /**
     * �V�X�e�����t��Ԃ��B
     * 
     * @return �V�X�e�����t
     */
    public Date getToday() {

        return today;
    }

    /**
     * �V�X�e�����t��ݒ肷��B
     * 
     * @param today
     *            �V�X�e�����t
     */
    public void setToday(Date today) {

        this.today = today;
    }

}
