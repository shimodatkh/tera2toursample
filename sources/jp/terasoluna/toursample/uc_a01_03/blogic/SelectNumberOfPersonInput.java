package jp.terasoluna.toursample.uc_a01_03.blogic;

import java.io.Serializable;

public class SelectNumberOfPersonInput implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -8067389430846559432L;

	/**
     * �c�A�[�R�[�h
     */
    private String tourCode = null;
    
    /**
     * �\��ԍ�
     */
    
    private String reserveNo = null;
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
}
