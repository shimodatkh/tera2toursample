/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_01.exception;

import jp.terasoluna.toursample.common.exception.ApplicationException;

/**
 * �c�Ȑ�������Ȃ��ꍇ�̗�O�N���X
 * 
 * 
 * 
 */
public class TourMemberOverException extends ApplicationException {

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
    public TourMemberOverException(String errorCode) {

        super(errorCode);
    }
}
