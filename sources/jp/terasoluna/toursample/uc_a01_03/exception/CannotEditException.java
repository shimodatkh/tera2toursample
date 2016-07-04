/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_03.exception;

import jp.terasoluna.toursample.common.exception.ApplicationException;

/**
 * �\���ύX�ł��Ȃ��ꍇ�̗�O�N���X�B
 * 
 * 
 * 
 */
public class CannotEditException extends ApplicationException {

    /**
     * �V���A���o�[�W����UID�B
     */
    private static final long serialVersionUID = -403281476564897606L;

    /**
     * �R���X�g���N�^�B
     * 
     * @param errorCode
     *            �G���[�R�[�h
     */
    public CannotEditException(String errorCode) {

        super(errorCode);
    }
}
