/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.common.exception;

/**
 * �Ɩ����W�b�N���甭������V�X�e����O�N���X�B<br>
 *
 * <p>
 * �Ɩ����W�b�N��A�V�X�e����O�Ƃ��ė�O�𔭐��������ꍇ�ɐ�������V�X�e����O
 * �N���X�ł���B<br>
 * �{�N���X�ɂ̓��b�Z�[�W�L�[�ƃ��b�Z�[�W�u���������ݒ肷�邱�Ƃ��ł���B
 * �A���A���b�Z�[�W�擾�A�y�уv���[�X�z���_�̒u���͕ʂ̃N���X�Ŏ��s���A
 * �ēx {@link #setMessage(String)} �����s���ă��b�Z�[�W��ݒ肷��K�v������B
 * ���b�Z�[�W���ݒ肳��Ă��Ȃ���ԂŁA{@link #getMessage()}
 * ���\�b�h��p���ă��b�Z�[�W���擾����ƃ��b�Z�[�W�L�[���ԋp�����B
 * �]���āA���b�Z�[�W�u�����s���Ȃ��悤�ȏ󋵂Ŗ{�N���X���g�p����ꍇ�́A
 * �R���X�g���N�^��errorCode�ɁA���b�Z�[�W�L�[�ł͂Ȃ��G���[�R�[�h��
 * �G���[���b�Z�[�W�𒼐ڐݒ肷�邱�ƁB
 * </p>
 * @see ApplicationException
 * @see ApplicationExceptionHandler
 * 
 * 
 */
public class TourSystemException extends ApplicationException {

    /**
     * �V���A���o�[�W����ID�B
     */
    private static final long serialVersionUID = -7911561953281923358L;

    /**
     * �R���X�g���N�^�B
     */
    public TourSystemException() {
        super();
    }

    /**
     * �R���X�g���N�^�B
     *
     * @param errorCode �G���[�R�[�h
     */
    public TourSystemException(String errorCode) {
        super(errorCode);
    }

    /**
     * �R���X�g���N�^�B
     *
     * @param errorCode �G���[�R�[�h
     * @param optionStrings ���b�Z�[�W����{n}��u�����镶����̔z��
     */
    public TourSystemException(String errorCode,
                                 String[] optionStrings) {
        super(errorCode, optionStrings);
    }

    /**
     * �R���X�g���N�^�B
     *
     * @param errorCode �G���[�R�[�h
     * @param s0 �G���[���b�Z�[�W����{0}��u�����镶����
     */
    public TourSystemException(String errorCode,
                                 String s0) {
        super(errorCode, s0);
    }

    /**
     * �R���X�g���N�^�B
     *
     * @param errorCode �G���[�R�[�h
     * @param s0 �G���[���b�Z�[�W����{0}��u�����镶����
     * @param s1 �G���[���b�Z�[�W����{1}��u�����镶����
     */
    public TourSystemException(String errorCode,
                                 String s0,
                                 String s1) {
        super(errorCode, s0, s1);
    }

    /**
     * �R���X�g���N�^�B
     *
     * @param errorCode �G���[�R�[�h
     * @param s0 �G���[���b�Z�[�W����{0}��u�����镶����
     * @param s1 �G���[���b�Z�[�W����{1}��u�����镶����
     * @param s2 �G���[���b�Z�[�W����{2}��u�����镶����
     */
    public TourSystemException(String errorCode,
                                 String s0,
                                 String s1,
                                 String s2) {
        super(errorCode, s0, s1, s2);
    }

    /**
     * �R���X�g���N�^�B
     *
     * @param errorCode �G���[�R�[�h
     * @param s0 �G���[���b�Z�[�W����{0}��u�����镶����
     * @param s1 �G���[���b�Z�[�W����{1}��u�����镶����
     * @param s2 �G���[���b�Z�[�W����{2}��u�����镶����
     * @param s3 �G���[���b�Z�[�W����{3}��u�����镶����
     */
    public TourSystemException(String errorCode,
                                 String s0,
                                 String s1,
                                 String s2,
                                 String s3) {
        super(errorCode, s0, s1, s2, s3);
    }

    /**
     * �R���X�g���N�^�B
     *
     * @param cause �����ƂȂ�����O
     */
    public TourSystemException(Throwable cause) {
        super(cause);
    }

    /**
     * �R���X�g���N�^�B
     *
     * @param cause �����ƂȂ�����O
     * @param errorCode �G���[�R�[�h
     */
    public TourSystemException(Throwable cause,
                            String errorCode) {
        super(cause, errorCode);
    }

    /**
     * �R���X�g���N�^�B
     *
     * @param cause �����ƂȂ�����O
     * @param errorCode �G���[�R�[�h
     * @param optionStrings ���b�Z�[�W����{n}��u�����镶����̔z��
     */
    public TourSystemException(Throwable cause,
                                 String errorCode,
                                 String[] optionStrings) {
        super(cause, errorCode, optionStrings);
    }

    /**
     * �R���X�g���N�^�B
     *
     * @param cause �����ƂȂ�����O
     * @param errorCode �G���[�R�[�h
     * @param s0 �G���[���b�Z�[�W����{0}��u�����镶����
     */
    public TourSystemException(Throwable cause,
                                 String errorCode,
                                 String s0) {
        super(cause, errorCode, s0);
    }

    /**
     * �R���X�g���N�^�B
     *
     * @param cause �����ƂȂ�����O
     * @param errorCode �G���[�R�[�h
     * @param s0 �G���[���b�Z�[�W����{0}��u�����镶����
     * @param s1 �G���[���b�Z�[�W����{1}��u�����镶����
     */
    public TourSystemException(Throwable cause,
                                 String errorCode,
                                 String s0,
                                 String s1) {
        super(cause, errorCode, s0, s1);
    }

    /**
     * �R���X�g���N�^�B
     *
     * @param cause �����ƂȂ�����O
     * @param errorCode �G���[�R�[�h
     * @param s0 �G���[���b�Z�[�W����{0}��u�����镶����
     * @param s1 �G���[���b�Z�[�W����{1}��u�����镶����
     * @param s2 �G���[���b�Z�[�W����{2}��u�����镶����
     */
    public TourSystemException(Throwable cause,
                                 String errorCode,
                                 String s0,
                                 String s1,
                                 String s2) {
        super(cause, errorCode, s0, s1, s2);
    }

    /**
     * �R���X�g���N�^�B
     *
     * @param cause �����ƂȂ�����O
     * @param errorCode �G���[�R�[�h
     * @param s0 �G���[���b�Z�[�W����{0}��u�����镶����
     * @param s1 �G���[���b�Z�[�W����{1}��u�����镶����
     * @param s2 �G���[���b�Z�[�W����{2}��u�����镶����
     * @param s3 �G���[���b�Z�[�W����{3}��u�����镶����
     */
    public TourSystemException(Throwable cause,
                                 String errorCode,
                                 String s0,
                                 String s1,
                                 String s2,
                                 String s3) {
        super(cause, errorCode, s0, s1, s2, s3);
    }

}
