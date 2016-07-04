/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.common.util;

import java.util.Calendar;
import java.util.Date;

/**
 * �c�A�[�\��V�X�e�� ���t���[�e�B���e�B�N���X
 * 
 * 
 */
public class DateUtil {

    /**
     * ���l�̓����𔑓��`���̓����ɕϊ�����B<br>
     * ������1�̏ꍇ�́A����A�裂ɕϊ�����B <br>
     * �E���ʏ���CP0010�F�����ϊ�����
     * 
     * @param days
     *            ���l�̓���
     *         
     * @return �����`���̓���
     */
    public static String convertNightDays(Integer days) {

        // ������1�̏ꍇ�́u���A��v��Ԃ��B
        if (days == 1) {
            return "���A��";
        }

        // �`���ϊ����s�Ȃ��B
        StringBuilder builder = new StringBuilder();

        builder.append(days.intValue() - 1);
        builder.append("��");
        builder.append(days.intValue());
        builder.append("��");

        return builder.toString();
    }

    /**
     * �����̓��t��Ԃ��B<br>
     * �����̃V�X�e�����t���擾���Ԃ��B
     * 
     * @return �����̓��t
     */
    public static Date getTodayDate() {

        return new Date();
    }

    /**
     * �N���������݂��邩�ǂ������؂���B
     * 
     * @param year
     *            �N
     * @param month
     *            ��
     * @param day
     *            ��
     * @return true ���݂���<br>
     *         false ���݂��Ȃ�<br>
     */
    public static boolean isExists(String year, String month, String day) {

        Calendar calendar = Calendar.getInstance();

        int inputYear = Integer.parseInt(year);
        int inputMonth = Integer.parseInt(month);
        int inputDay = Integer.parseInt(day);

        // �J�����_�[�ɓ��t��ݒ�
        calendar.clear();
        calendar.set(Calendar.YEAR, inputYear);
        calendar.set(Calendar.MONTH, inputMonth - 1);
        calendar.set(Calendar.DAY_OF_MONTH, inputDay);

        // ���t���قȂ��Ă����瑶�݂��Ȃ����t
        if (inputYear == calendar.get(Calendar.YEAR)
                && (inputMonth - 1) == calendar.get(Calendar.MONTH)
                && inputDay == calendar.get(Calendar.DAY_OF_MONTH)) {
            return true;
        }
        return false;
    }

    /**
     * ���͂������t�̈�T�ԑO�̓��t��Ԃ��B<br>
     * 
     * @param date
     *            ���͂������t
     */
    public static Date getOneWeekBeforeDate(Date date) {

        return getChangedByDaysDate(date, -7);
    }

    /**
     * ���͂������t����������ύX���ꂽ���t��Ԃ��B<br>
     * 
     * @param date
     *            ���͂������t
     * @param days
     *            ����
     */
    public static Date getChangedByDaysDate(Date date, int days) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // ���͂������t������������t��ύX����B�B
        calendar.add(Calendar.DAY_OF_YEAR, days);

        return calendar.getTime();
    }

}
