/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.common.dto;

import java.io.Serializable;

/**
 * \ñÚ×îñÌõðði[·éNXB
 * <br>
 * E¤ÊCP0006F\ñÚ×æ¾
 * 
 * 
 */
public class ReserveDetailAcquireInput implements Serializable {
    
    /**
     * VAo[WUIDB
     */
    private static final long serialVersionUID = -4602719187723119151L;

    /**
     * \ñÔB
     */
    private String reserveNo = null;

    /**
     * ÚqIDB
     */
    private String customerCode = null;

    /**
     * ÚqIDðÔ·B
     * @return ÚqID
     */
    
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * ÚqIDðÝè·éB
     * @param customerCode ÚqID
     */
    
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    /**
     * \ñÔðÔ·B
     * @return \ñÔ
     */
    
    public String getReserveNo() {
        return reserveNo;
    }

    /**
     * \ñÔðÝè·éB
     * @param reserveNo \ñÔ
     */
    
    public void setReserveNo(String reserveNo) {
        this.reserveNo = reserveNo;
    }
    
    

}
