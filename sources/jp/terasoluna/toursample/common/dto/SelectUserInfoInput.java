package jp.terasoluna.toursample.common.dto;

import java.io.Serializable;

public class SelectUserInfoInput implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4869711719869633746L;

    /**
     * �ڋq�R�[�h�B
     */
    private String customerCode = null;

    /**
     * �ڋq�p�X���[�h�B
     */
    private String customerPass = null;
    
    /**
     * �ڋq�R�[�h��Ԃ��B
     * 
     * @return �ڋq�R�[�h
     */

    public String getCustomerCode() {

        return customerCode;
    }

    /**
     * �ڋq�R�[�h��ݒ肷��B
     * 
     * @param customerCode
     *            �ڋq�R�[�h
     */

    public void setCustomerCode(String customerCode) {

        this.customerCode = customerCode;
    }
    
    /**
     * �ڋq�p�X���[�h��Ԃ��B
     * 
     * @return �ڋq�p�X���[�h
     */

    public String getCustomerPass() {

        return customerPass;
    }

    /**
     * �ڋq�p�X���[�h��ݒ肷��B
     * 
     * @param customerPass
     *            �ڋq�p�X���[�h
     */

    public void setCustomerPass(String customerPass) {

        this.customerPass = customerPass;
    }
}
