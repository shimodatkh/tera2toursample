/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */

package jp.terasoluna.toursample.uc_a01_01.exception;

import jp.terasoluna.toursample.common.exception.ApplicationException;


/**
 * �\��̒��ߐ؂���߂����ꍇ�̗�O�N���X
 * 
 * 
 * 
 */
public class ReservationDeadlinePassedException extends ApplicationException{
	
    /**
     * �V���A���o�[�W����UID�B
     */

	private static final long serialVersionUID = -8690598843622842626L;

	/**
     * �R���X�g���N�^�B
     * 
     * @param errorCode
     *            �G���[�R�[�h
     */
    public ReservationDeadlinePassedException(String errorCode) {

        super(errorCode);
    }

}
