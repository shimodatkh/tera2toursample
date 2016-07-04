/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.common.dto;

import java.io.Serializable;

/**
 * �P�������Z�o�̌��ʏ����i�[����N���X�B <br>
 * �E���ʏ���CP0009�F�P�������Z�o����
 * 
 * 
 */
public class PriceCalculateOutput implements Serializable {

    /**
     * �V���A���o�[�W����UID�B
     */
    private static final long serialVersionUID = 6982754828396123236L;

    /**
     * �P��(��l)�B
     */
    private Integer adultUnitPrice = null;

    /**
     * �P��(�q�ǂ�)�B
     */
    private Integer childUnitPrice = null;

    /**
     * �l��(��l)�B
     */
    private Integer adultCount = null;

    /**
     * �l��(�q�ǂ�)�B
     */
    private Integer childCount = null;

    /**
     * ����(��l)�B
     */
    private Integer adultPrice = null;

    /**
     * ����(�q�ǂ�)�B
     */
    private Integer childPrice = null;

    /**
     * ���v�����B
     */
    private Integer sumPrice = null;

    /**
     * �l��(��l)��Ԃ��B
     * 
     * @return �l��(��l)
     */
    public Integer getAdultCount() {

        return adultCount;
    }

    /**
     * �l��(��l)��ݒ肷��B
     * 
     * @param adultCount
     *            �l��(��l)
     */
    public void setAdultCount(Integer adultCount) {

        this.adultCount = adultCount;
    }

    /**
     * ����(��l)��Ԃ��B
     * 
     * @return ����(��l)
     */
    public Integer getAdultPrice() {

        return adultPrice;
    }

    /**
     * ����(��l)��ݒ肷��B
     * 
     * @param adultPrice
     *            ����(��l)
     */
    public void setAdultPrice(Integer adultPrice) {

        this.adultPrice = adultPrice;
    }

    /**
     * �P��(��l)��Ԃ��B
     * 
     * @return �P��(��l)
     */
    public Integer getAdultUnitPrice() {

        return adultUnitPrice;
    }

    /**
     * �P��(��l)��ݒ肷��B
     * 
     * @param adultUnitPrice
     *            �P��(��l)
     */
    public void setAdultUnitPrice(Integer adultUnitPrice) {

        this.adultUnitPrice = adultUnitPrice;
    }

    /**
     * �l��(�q�ǂ�)��Ԃ��B
     * 
     * @return �l��(�q�ǂ�)
     */
    public Integer getChildCount() {

        return childCount;
    }

    /**
     * �l��(�q�ǂ�)��ݒ肷��B
     * 
     * @param childCount
     *            �l��(�q�ǂ�)
     */
    public void setChildCount(Integer childCount) {

        this.childCount = childCount;
    }

    /**
     * ����(�q�ǂ�)��Ԃ��B
     * 
     * @return ����(�q�ǂ�)
     */
    public Integer getChildPrice() {

        return childPrice;
    }

    /**
     * ����(�q�ǂ�)��ݒ肷��B
     * 
     * @param childPrice
     *            ����(�q�ǂ�)
     */
    public void setChildPrice(Integer childPrice) {

        this.childPrice = childPrice;
    }

    /**
     * �P��(�q�ǂ�)��Ԃ��B
     * 
     * @return �P��(�q�ǂ�)
     */
    public Integer getChildUnitPrice() {

        return childUnitPrice;
    }

    /**
     * �P��(�q�ǂ�)��ݒ肷��B
     * 
     * @param childUnitPrice
     *            �P��(�q�ǂ�)
     */
    public void setChildUnitPrice(Integer childUnitPrice) {

        this.childUnitPrice = childUnitPrice;
    }

    /**
     * ���v������Ԃ��B
     * 
     * @return ���v����
     */
    public Integer getSumPrice() {

        return sumPrice;
    }

    /**
     * ���v������ݒ肷��B
     * 
     * @param sumPrice
     *            ���v����
     */
    public void setSumPrice(Integer sumPrice) {

        this.sumPrice = sumPrice;
    }

}
