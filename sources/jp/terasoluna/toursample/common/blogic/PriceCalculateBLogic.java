/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.common.blogic;

import jp.terasoluna.toursample.common.dto.PriceCalculateOutput;

/**
 * �P�������Z�o�r�W�l�X���W�b�N�C���^�t�F�[�X�B<br>
 * <br>
 * �E���ʏ���CP0009�F�P�������Z�o����
 * 
 * 
 */
public interface PriceCalculateBLogic {

    /**
     * �P���A�����̎Z�o���s�Ȃ��B
     * 
     * @param basePrice
     *            ��{����
     * @param adultCount
     *            �l��(��l)
     * @param childCount
     *            �l��(�q�ǂ�)
     * @return �P�������Z�o����
     */
    public PriceCalculateOutput execute(Integer basePrice, Integer adultCount,
            Integer childCount);
}
