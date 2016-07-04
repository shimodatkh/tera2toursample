/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_02.blogic;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import jp.terasoluna.fw.dao.QueryDAO;
import jp.terasoluna.fw.service.thin.BLogic;
import jp.terasoluna.fw.service.thin.BLogicMessage;
import jp.terasoluna.fw.service.thin.BLogicMessages;
import jp.terasoluna.fw.service.thin.BLogicResult;
import jp.terasoluna.toursample.common.TourUVO;
import jp.terasoluna.toursample.common.util.DateUtil;
import jp.terasoluna.toursample.uc_a01_02.dto.RP_A01_02_01_01Input;
import jp.terasoluna.toursample.uc_a01_02.dto.RP_A01_02_01_01Output;
import jp.terasoluna.toursample.uc_a01_02.dto.SelectReservationInfoInput;
import jp.terasoluna.toursample.uc_a01_02.dto.SelectReservationInfoOutput;

/**
 * �c�A�[�\���񃊃X�g�擾�r�W�l�X���W�b�N�B
 * <p>
 * �E�f�[�^�x�[�X����ڋq�̗\������ȉ��̏����Ŏ擾����B<br>
 * �@�����F�c�A�[�̏o�������V�X�e�����t�ȍ~�̗\��<br>
 * �E�e�\����ŃV�X�e�����t���U���������O���ǂ������肷��B<br>
 * �܂��A���l�`���̃c�A�[�����𔑓��`���ɕϊ�����B<br>
 * �E�\����̗\�񌏐����擾����B<br>
 * �E�\�񌏐���胁�b�Z�[�W��ݒ肷��B
 * </p>
 * 
 * 
 * 
 */
public class RP_A01_02_01_01BLogicImpl implements BLogic<RP_A01_02_01_01Input> {

    /**
     * �\�񐔂�0���̏ꍇ�̃��b�Z�[�W�B
     */
    public static final String INFO_NOT_RESERVED = "info.UC_A01_02.00001";

    /**
     * ���O�N���X�B
     */
    private static final Log log = LogFactory
        .getLog(RP_A01_02_01_01BLogicImpl.class);

    /**
     * �\�񐔂�1���ȏ�̏ꍇ�̃��b�Z�[�W�B
     */
    public static final String INFO_RESERVED = "info.common.00001";

    /**
     * DAO�N���X�B<br>
     * Spring�ɂ��C���X�^���X��������ݒ肳���B
     */
    protected QueryDAO queryDAO = null;

    /**
     * QueryDAO��ݒ肷��B
     * 
     * @param queryDAO
     *            QueryDAO
     */
    public void setQueryDAO(QueryDAO queryDAO) {

        this.queryDAO = queryDAO;
    }

    /**
     * �\���񃊃X�g���擾����B <BR>
     * ���O�C�����Ă���ڋq���ƈ�v����\�����<BR>
     * �\���񃊃X�g�Ƃ��ĕԋp����B
     * 
     * @param param
     *            �ڋq���
     * @return �\���񃊃X�g
     */
    public BLogicResult execute(RP_A01_02_01_01Input param) {

        // �ڋq�ԍ���\��ꗗ���擾�����̈����ɐݒ肷��B
        SelectReservationInfoInput reservationInfoInput = 
            new SelectReservationInfoInput();
        TourUVO tourUVO = param.getUSER_VALUE_OBJECT();
        reservationInfoInput.setCustomerCode(tourUVO.getCustomerCode());

        // �V�X�e�����t��\��ꗗ���擾�����̈����ɐݒ肷��B
        reservationInfoInput.setToday(DateUtil.getTodayDate());

        // �f�[�^�x�[�X����ڋq�̗\�����S�Ď擾����B
        SelectReservationInfoOutput[] reservationInfo = 
            queryDAO.executeForObjectArray("UC_A01_02.selectReservationInfo", 
                                           reservationInfoInput, 
                                           SelectReservationInfoOutput.class);

        // �z��̐U�������Ɣ�������ʂɕ\���p�ɕϊ�����B
        for (int i = 0; i < reservationInfo.length; i++) {

            // �U���������擾����B
            Date paymentTimeLimit = DateUtil.getOneWeekBeforeDate(reservationInfo[i].getDepDay());
            // �V�X�e�����t�ƐU���������r����
            // �V�X�e�����t���U���������O��false�A���true
            // �U�������ƃV�X�e�����t���C�R�[���̏ꍇ�́Afalse
            Date today = DateUtil.getTodayDate();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(today);
            
            calendar.set(Calendar.HOUR_OF_DAY, 0); 
            calendar.clear(Calendar.MINUTE);
            calendar.clear(Calendar.SECOND);
            calendar.clear(Calendar.MILLISECOND);
            
            reservationInfo[i].setLimitExcessFlag(calendar.getTime().after(paymentTimeLimit));

            // ���l�`���̃c�A�[�����𔑓��`���ɕϊ�����B
            reservationInfo[i].setTourDays(DateUtil
                .convertNightDays(reservationInfo[i].getIntTourDays()));
        }

        // �\����̔z�񒷂���\�񌏐����擾����B
        Integer reservationsCount = reservationInfo.length;

        // ���b�Z�[�W��ݒ肷��B
        BLogicMessages messages = new BLogicMessages();

        // �\�񌏐� 0�� info.UC_A01_02.00001
        if (reservationsCount == 0) {
            messages.add(this.getClass().getName(),
                         new BLogicMessage(INFO_NOT_RESERVED));

            if (log.isDebugEnabled()) {
                log.debug("�\�񌏐� 0��");
            }

            // �\�񌏐� 1���ȏ� info.common.00001 [0]= reservationsCount
        } else {
            messages.add(this.getClass().getName(),
                         new BLogicMessage(INFO_RESERVED, reservationsCount));

            if (log.isDebugEnabled()) {
                log.debug("�\�񌏐� " + reservationsCount + "��");
            }
        }

        // �c�A�[�\��ڍ׏����o�͒l�ɃZ�b�g����B
        RP_A01_02_01_01Output rp_a01_02_01_01BLogicOutput = 
            new RP_A01_02_01_01Output();
        rp_a01_02_01_01BLogicOutput.setReservationInfo(reservationInfo);
        rp_a01_02_01_01BLogicOutput.setReservationsCount(reservationsCount);

        // ���ʂ��Z�b�g����B
        BLogicResult result = new BLogicResult();
        result.setResultObject(rp_a01_02_01_01BLogicOutput);
        result.setResultString("success");
        result.setMessages(messages);

        return result;
    }
}