/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_03.exception;

import jp.terasoluna.toursample.common.exception.ApplicationException;

/**
 * �c�Ȑ�������Ȃ��ꍇ�̗�O�N���X<br>
 * 
 * �EUC_A01_03�F�c�A�[�\���
 * 
 * 
 */
public class TourMemberOverException extends ApplicationException {

    /**
     * �V���A���o�[�W����UID�B
     */
    private static final long serialVersionUID = -2001295056875560430L;

    /**
     * �R���X�g���N�^�B
     * 
     * @param errorCode �G���[�R�[�h
     */
    public TourMemberOverException(String errorCode) {
        super(errorCode);
    }

}