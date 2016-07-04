/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a99_01.dto;

import java.io.Serializable;

/**
 * RP_A99_01_02_02Action���͒l�N���X
 * 
 * 
 *
 */
public class RP_A99_01_02_02Input implements Serializable {

    /**
     * �V���A���o�[�W����UID�B
     */
    private static final long serialVersionUID = 2746626748190204007L;

    /**
     * �ڋqID�B
     */
    private String customerCode = null;

    /**
     * �p�X���[�h�B
     */
    private String customerPass = null;

    /**
     * �J�ڌ����ID�B
     */
    private String returnCode = null;

    /**
     * �c�A�[�R�[�h�B
     */
    private String tourCode = null;

    /**
     * �ڋqID��Ԃ��B
     * 
     * @return �ڋqID
     */

    public String getCustomerCode() {

        return customerCode;
    }

    /**
     * �ڋqID��ݒ肷��B
     * 
     * @param customerCode
     *            �ڋqID
     */

    public void setCustomerCode(String customerCode) {

        this.customerCode = customerCode;
    }

    /**
     * �p�X���[�h��Ԃ��B
     * 
     * @return �p�X���[�h
     */

    public String getCustomerPass() {

        return customerPass;
    }

    /**
     * �p�X���[�h��ݒ肷��B
     * 
     * @param customerPass
     *            �p�X���[�h
     */

    public void setCustomerPass(String customerPass) {

        this.customerPass = customerPass;
    }

    /**
     * �J�ڌ����ID��Ԃ��B
     * 
     * @return �J�ڌ����ID
     */

    public String getReturnCode() {

        return returnCode;
    }

    /**
     * �J�ڌ����ID��ݒ肷��B
     * 
     * @param returnCode
     *            �J�ڌ����ID
     */

    public void setReturnCode(String returnCode) {

        this.returnCode = returnCode;
    }

    /**
     * �c�A�[�R�[�h��Ԃ��B
     * 
     * @return �c�A�[�R�[�h
     */

    public String getTourCode() {

        return tourCode;
    }

    /**
     * �c�A�[�R�[�h��ݒ肷��B
     * 
     * @param tourCode
     *            �c�A�[�R�[�h
     */

    public void setTourCode(String tourCode) {

        this.tourCode = tourCode;
    }
}
