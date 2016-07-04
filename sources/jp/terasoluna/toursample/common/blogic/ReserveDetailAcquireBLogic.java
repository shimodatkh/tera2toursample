/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.common.blogic;

import jp.terasoluna.toursample.common.dto.ReserveDetailAcquireInput;
import jp.terasoluna.toursample.common.dto.ReserveDetailAcquireOutput;

/**
 * �\��ڍ׎擾�r�W�l�X���W�b�N�C���^�t�F�[�X�B<br>
 * <br>
 * �E���ʏ���CP0006�F�\��ڍ׎擾
 * 
 * 
 */
public interface ReserveDetailAcquireBLogic {

    /**
     * �\��ڍׂ̎擾���s�Ȃ��B
     * 
     * @param input
     *            ��������(�\��ԍ��A�ڋqID)
     * 
     * @return �\��ڍ�
     */
    public ReserveDetailAcquireOutput execute(ReserveDetailAcquireInput input);

}
