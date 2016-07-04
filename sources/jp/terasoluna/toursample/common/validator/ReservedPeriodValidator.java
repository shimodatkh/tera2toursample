/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.common.validator;

import java.util.Calendar;
import java.util.GregorianCalendar;

import jp.terasoluna.fw.web.struts.form.MultiFieldValidator;

/**
 * �\��\���Ԃ����肷��J�X�^���o���f�[�^�B<br>
 * <br>
 * �E���ʏ���CP0008�F�\��\���t����
 * 
 * 
 * 
 */
public class ReservedPeriodValidator implements MultiFieldValidator {

    /**
     * �^����ꂽ�N�A���A�����\��\���Ԃł��邩���؂���B<br>
     * ���ݔN�����{7�� <= �^����ꂽ�N���� �ł����true�A�����łȂ����false��Ԃ��B
     * @param value
     *            �N�Byyyy�`���ł���
     * @param fields
     *            <br>
     *            [0]: ���BM�`���A�܂���MM�`���ł���<br>
     *            [1]: ���Bd�`���A�܂���dd�`���ł���<br>
     * @return �\��\���Ԃł���: true<br>
     *         �\��\���Ԃł͂Ȃ�: false<br>
     */
    public boolean validate(String value, String[] fields) {

        // ���͂��ꂽ�N�A���A������t�^�ɕϊ�����B
        Calendar input = new GregorianCalendar(Integer.parseInt(value), Integer
            .parseInt(fields[0]) - 1, Integer.parseInt(fields[1]));

        // �{���̓��t���擾����B
        Calendar calendar = Calendar.getInstance();

        // �\��s�\���Ԃ̋��E�l���擾����B
        calendar.add(Calendar.DAY_OF_YEAR, 6);

        // ���͂��ꂽ���t���\��\���Ԃ��`�F�b�N����B
        return input.after(calendar);
    }

}
