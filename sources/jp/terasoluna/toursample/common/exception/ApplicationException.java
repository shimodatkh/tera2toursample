/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.common.exception;

/**
 * �Ɩ����W�b�N���甭������ėp��O�N���X�B
 *
 * <p>
 * �Ɩ����W�b�N��A�ڋq�̑Ή����s�\�ȏꍇ���������O�N���X�B<br>
 * �{�N���X�ɂ̓��b�Z�[�W�L�[�ƃ��b�Z�[�W�u���������ݒ肷�邱�Ƃ��ł���B
 * �A���A���b�Z�[�W�擾�A�y�уv���[�X�z���_�̒u���͕ʂ̃N���X�Ŏ��s���A
 * �ēx {@link #setMessage(String)} �����s���ă��b�Z�[�W��ݒ肷��K�v������B
 * ���b�Z�[�W���ݒ肳��Ă��Ȃ���ԂŁA{@link #getMessage()}
 * ���\�b�h��p���ă��b�Z�[�W���擾����ƃ��b�Z�[�W�L�[���ԋp�����B
 * �]���āA���b�Z�[�W�u�����s���Ȃ��悤�ȏ󋵂Ŗ{�N���X���g�p����ꍇ�́A
 * �R���X�g���N�^��errorCode�ɁA���b�Z�[�W�L�[�ł͂Ȃ��G���[�R�[�h��
 * �G���[���b�Z�[�W�𒼐ڐݒ肷�邱�ƁB
 * </p>
 *
 * 
 * 
 * 
 */
public class ApplicationException extends RuntimeException {

    /**
     * �V���A���o�[�W����ID�B
     */
    private static final long serialVersionUID = -7911561953281923358L;

    /**
     * �G���[�R�[�h�B
     */
    private String errorCode = null;

    /**
     * �G���[���b�Z�[�W�̒u��������B
     */
    private String[] options = null;

    /**
     * �G���[���b�Z�[�W�B
     */
    private String message = null;

    /**
     * �R���X�g���N�^�B
     */
    public ApplicationException() {
        super();
    }

    /**
     * �R���X�g���N�^�B
     *
     * @param errorCode �G���[�R�[�h
     */
    public ApplicationException(String errorCode) {
        super();
        this.errorCode = errorCode;
    }

    /**
     * �R���X�g���N�^�B
     *
     * @param errorCode �G���[�R�[�h
     * @param optionStrings ���b�Z�[�W����{n}��u�����镶����̔z��
     */
    public ApplicationException(String errorCode,
                                 String[] optionStrings) {
        super();
        this.errorCode = errorCode;
        this.options = optionStrings;
    }

    /**
     * �R���X�g���N�^�B
     *
     * @param errorCode �G���[�R�[�h
     * @param s0 �G���[���b�Z�[�W����{0}��u�����镶����
     */
    public ApplicationException(String errorCode,
                                 String s0) {
        super();
        this.errorCode = errorCode;
        this.options = new String[]{s0};
    }

    /**
     * �R���X�g���N�^�B
     *
     * @param errorCode �G���[�R�[�h
     * @param s0 �G���[���b�Z�[�W����{0}��u�����镶����
     * @param s1 �G���[���b�Z�[�W����{1}��u�����镶����
     */
    public ApplicationException(String errorCode,
                                 String s0,
                                 String s1) {
        super();
        this.errorCode = errorCode;
        this.options = new String[]{s0, s1};
    }

    /**
     * �R���X�g���N�^�B
     *
     * @param errorCode �G���[�R�[�h
     * @param s0 �G���[���b�Z�[�W����{0}��u�����镶����
     * @param s1 �G���[���b�Z�[�W����{1}��u�����镶����
     * @param s2 �G���[���b�Z�[�W����{2}��u�����镶����
     */
    public ApplicationException(String errorCode,
                                 String s0,
                                 String s1,
                                 String s2) {
        super();
        this.errorCode = errorCode;
        this.options = new String[]{s0, s1, s2};
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
    public ApplicationException(String errorCode,
                                 String s0,
                                 String s1,
                                 String s2,
                                 String s3) {
        super();
        this.errorCode = errorCode;
        this.options = new String[]{s0, s1, s2, s3};
    }

    /**
     * �R���X�g���N�^�B
     *
     * @param cause �����ƂȂ�����O
     */
    public ApplicationException(Throwable cause) {
        super(cause);
        this.errorCode = "";
    }

    /**
     * �R���X�g���N�^�B
     *
     * @param cause �����ƂȂ�����O
     * @param errorCode �G���[�R�[�h
     */
    public ApplicationException(Throwable cause,
                            String errorCode) {
        super(cause);
        this.errorCode = errorCode;
    }

    /**
     * �R���X�g���N�^�B
     *
     * @param cause �����ƂȂ�����O
     * @param errorCode �G���[�R�[�h
     * @param optionStrings ���b�Z�[�W����{n}��u�����镶����̔z��
     */
    public ApplicationException(Throwable cause,
                                 String errorCode,
                                 String[] optionStrings) {
        super(cause);
        this.errorCode = errorCode;
        this.options = optionStrings;
    }

    /**
     * �R���X�g���N�^�B
     *
     * @param cause �����ƂȂ�����O
     * @param errorCode �G���[�R�[�h
     * @param s0 �G���[���b�Z�[�W����{0}��u�����镶����
     */
    public ApplicationException(Throwable cause,
                                 String errorCode,
                                 String s0) {
        super(cause);
        this.errorCode = errorCode;
        this.options = new String[]{s0};
    }

    /**
     * �R���X�g���N�^�B
     *
     * @param cause �����ƂȂ�����O
     * @param errorCode �G���[�R�[�h
     * @param s0 �G���[���b�Z�[�W����{0}��u�����镶����
     * @param s1 �G���[���b�Z�[�W����{1}��u�����镶����
     */
    public ApplicationException(Throwable cause,
                                 String errorCode,
                                 String s0,
                                 String s1) {
        super(cause);
        this.errorCode = errorCode;
        this.options = new String[]{s0, s1};
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
    public ApplicationException(Throwable cause,
                                 String errorCode,
                                 String s0,
                                 String s1,
                                 String s2) {
        super(cause);
        this.errorCode = errorCode;
        this.options = new String[]{s0, s1, s2};
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
    public ApplicationException(Throwable cause,
                                 String errorCode,
                                 String s0,
                                 String s1,
                                 String s2,
                                 String s3) {
        super(cause);
        this.errorCode = errorCode;
        this.options = new String[]{s0, s1, s2, s3};
    }

    /**
     * �G���[�R�[�h���擾����B
     *
     * @return �G���[�R�[�h
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * �G���[���b�Z�[�W�̒u����������擾����B
     *
     * @return �G���[���b�Z�[�W�u��������
     */
    public String[] getOptions() {
        return this.options;
    }

    /**
     * �G���[���b�Z�[�W���i�[����B
     *
     * @param message �G���[���b�Z�[�W
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * �G���[���b�Z�[�W��ԋp����B
     * �O������ {@link #setMessage(String)} ��p���ă��b�Z�[�W���ݒ肳��Ă��Ȃ�
     * �ꍇ�́A�R���X�g���N�^��errorCode�Ɏw�肵���������ԋp����B
     *
     * @return
     *     �G���[���b�Z�[�W�A�܂��̓R���X�g���N�^��errorCode�Ɏw�肳�ꂽ������
     */
    @Override
    public String getMessage() {
        if (this.message == null) {
            return this.errorCode;
        }
        return this.message;
    }
}
