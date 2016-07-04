/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_01.dto;

import java.io.Serializable;

import jp.terasoluna.toursample.common.TourUVO;


/**
 * RP_A01_01_01_03BLogic�̓��͒l�N���X�B
 * 
 * 
 *
 */
public class RP_A01_01_01_03Input implements Serializable {

    /**
     * �V���A���o�[�W����UID
     */
    private static final long serialVersionUID = -989091065626595412L;

    /**
     * �c�A�[�R�[�h
     */
    private String tourCode = null;
    
    /**
     * UVO
     */
    private TourUVO USER_VALUE_OBJECT = null;
    
    /**
     * �l������(��l)
     */
    private String adultCountCondition = null;
    
    /**
     * �l������(�q�ǂ�)
     */
    private String childCountCondition = null;

    /**
     * �c�A�[�R�[�h���擾����
     * @return �c�A�[�R�[�h
     */
    public String getTourCode(){
        return tourCode;
    }
    
    /**
     * �c�A�[�R�[�h��ݒ肷��
     * @param tourCode
     */
    public void setTourCode (String tourCode) {
        this.tourCode = tourCode;
    }

    /**
     * �ڋq�����擾����
     * @return �ڋq���
     */
    public TourUVO getUSER_VALUE_OBJECT (){
        return USER_VALUE_OBJECT;
    }

    /**
     * �ڋq����ݒ肷��
     * @param USER_VALUE_OBJECT
     */
    public void setUSER_VALUE_OBJECT (TourUVO USER_VALUE_OBJECT) {
        this.USER_VALUE_OBJECT = USER_VALUE_OBJECT;
    }

    /**
     * ��l�����̌����������擾����
     * @return ��l�����̌�������
     */
    public String getAdultCountCondition(){
        return adultCountCondition;
    }
    
    /**
     * ��l�����̌���������ݒ肷��
     * @param adultCountCondition
     */
    public void setAdultCountCondition(String adultCountCondition){
        this.adultCountCondition = adultCountCondition;
    }

    /**
     * �q�ǂ������̏������擾����
     * @return �q�ǂ������̌�������
     */
    public String getChildCountCondition(){
        return childCountCondition;
    }
    
    /**
     * �q�ǂ������̌���������ݒ肷��
     * @param childCountCondition
     */
    public void setChildCountCondition(String childCountCondition){
        this.childCountCondition = childCountCondition;
    }
}
