/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.common.blogic;

import jp.terasoluna.toursample.common.dto.TourDetailAcquireOutput;

/**
 * �c�A�[�ڍ׎擾�r�W�l�X���W�b�N�C���^�t�F�[�X�B<br>
 * <br>
 * �E���ʏ���CP0007�F�c�A�[�ڍ׎擾
 * 
 * 
 */
public interface TourDetailAcquireBLogic {

    /**
     * �c�A�[�ڍׂ̎擾���s�Ȃ��B
     * 
     * @param tourCode
     *            �c�A�[�R�[�h
     * 
     * @return �c�A�[�ڍ�
     */
    public TourDetailAcquireOutput execute(String tourCode);

}
