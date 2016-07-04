/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_03.blogic;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import jp.terasoluna.fw.dao.QueryDAO;
import jp.terasoluna.fw.dao.UpdateDAO;
import jp.terasoluna.fw.service.thin.BLogic;
import jp.terasoluna.fw.service.thin.BLogicResult;
import jp.terasoluna.toursample.common.exception.RecordNotFoundException;
import jp.terasoluna.toursample.common.util.DateUtil;
import jp.terasoluna.toursample.uc_a01_03.dto.RP_A01_03_02_01Input;
import jp.terasoluna.toursample.uc_a01_03.exception.CannotEditException;
import jp.terasoluna.toursample.uc_a01_03.exception.TourMemberOverException;

/**
 * �c�A�[�\��ύX�m���BLogic�N���X�B <br>
 * �EUC_A01_03�F�c�A�[�\��ύX
 * 
 * 
 * 
 */
public class RP_A01_03_02_01BLogicImpl implements BLogic<RP_A01_03_02_01Input> {

    /**
     * ���ʏ������s��Null���ԋp���ꂽ�ꍇ�̃G���[���b�Z�[�W�B
     */
    public static final String ERROR_NOT_RESERVED = "error.common.00008";

    /**
     * DAO�N���X�B<br>
     * Spring�ɂ��C���X�^���X��������ݒ肳���B
     */
    private QueryDAO queryDAO = null;

    /**
     * DAO�N���X�B<br>
     * Spring�ɂ��C���X�^���X��������ݒ肳���B
     */
    private UpdateDAO updateDAO = null;

    /**
     * �c�Ȑ�������Ȃ��ꍇ�̃G���[���b�Z�[�W�B
     */
    public static final String ERROR_NOT_ENOUGH_SEAT = "warn.UC_A01_03.00001";

    /**
     * ���O�N���X�B
     */
    private static final Log log = LogFactory
            .getLog(RP_A01_03_02_01BLogicImpl.class);

    /**
     * QueryDAO��ݒ肷��B
     * 
     * @param queryDAO
     *            �ݒ肷��QueryDAO
     */
    public void setQueryDAO(QueryDAO queryDAO) {

        this.queryDAO = queryDAO;
    }

    /**
     * UpdateDAO��ݒ肷��B
     * 
     * @param updateDAO
     *            �ݒ肷��UpdateDAO
     */
    public void setUpdateDAO(UpdateDAO updateDAO) {

        this.updateDAO = updateDAO;
    }

    /**
     * �c�A�[�\��ύX�r�W�l�X���W�b�N�B<br>
     * �c�Ȑ��̊m�F���A�c�A�[�\���ύX����
     * 
     * @param params
     *            �c�A�[�\��ύX���ێ��p�N���X
     * @exception TourMemberOverException
     *                �c�Ȑ����Ȃ��ꍇ�̗�O
     */
    public BLogicResult execute(RP_A01_03_02_01Input params) {

        // �c�A�[�\��̐U���t���O����������B
        Boolean transfer = queryDAO.executeForObject(
                "UC_A01_03.selectTransfer", params, Boolean.class);

        // ���������\���񂪂Ȃ��ꍇ�A��O�������s���B
        // ��O�N���X�FRecordNotFoundException
        if (transfer == null) {

            if (log.isErrorEnabled()) {
                log.error(ERROR_NOT_RESERVED + ":�\���񂪌�����܂���B");
            }

            throw new RecordNotFoundException(ERROR_NOT_RESERVED);
        }

        // ���������U���t���O���U���ς݂̏ꍇ��O�������s���B
        if (transfer) {

            if (log.isWarnEnabled()) {
                log.warn("warn.UC_A01_03.00002:�x�����ς݂̂��ߗ\���ύX�ł��Ȃ��B");
            }

            throw new CannotEditException("warn.UC_A01_03.00002");
        }

        // �U���������擾����B
        Date paymentTimeLimit = DateUtil.getOneWeekBeforeDate(params
                .getReserveDetail().getDepDay());
        // �V�X�e�����t�ƐU���������r��
        // �U���������߂��Ă����ꍇ�A�Ɩ��G���[��ʂ֑J�ڂ�����B
        Date today = DateUtil.getTodayDate();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);

        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.clear(Calendar.MINUTE);
        calendar.clear(Calendar.SECOND);
        calendar.clear(Calendar.MILLISECOND);

        if (calendar.getTime().after(paymentTimeLimit)) {
            if (log.isWarnEnabled()) {
                log.warn("warn.UC_A01_03.00002:�U���������߂��Ă��邽�ߗ\���ύX�ł��Ȃ��B");
            }           
            throw new CannotEditException("warn.UC_A01_03.00002");
        }

        // �Ɩ����̓N���X���f�[�^�̎擾
        String tourCode = params.getReserveDetail().getTourCode();
        String reserveNo = params.getReserveNo();
        Integer adultCount = params.getPrice().getAdultCount();
        Integer childCount = params.getPrice().getChildCount();
        Integer sumPrice = params.getPrice().getSumPrice();
        String remarks = params.getReserveDetail().getRemarks();

        // �ő�Ís�l�����擾�B
        SelectNumberOfPersonInput numberOfPerson = new SelectNumberOfPersonInput();
        numberOfPerson.setTourCode(tourCode);
        Integer avaRecMax = queryDAO.executeForObject(
                "UC_A01_03.selectAvaRecMaxForUpdate", numberOfPerson,
                Integer.class);

        // �ύX�������\��ȊO�̗\��l�����擾
        numberOfPerson.setReserveNo(reserveNo);
        Integer totalReserveCount = queryDAO.executeForObject(
                "UC_A01_03.selectTotalReserveCount", numberOfPerson,
                Integer.class);

        // �ύX�������\��ȊO�̗\��l�����Ȃ��ꍇ(null)0�ŏ���������
        if (totalReserveCount == null) {
            totalReserveCount = Integer.valueOf(0);
        }

        // �c�Ȑ����`�F�b�N
        // �w�c�A�[�ő�Ís�l���x<
        // �w�\��l���x + ���͒l�w�l���i��l�j�x + ���͒l�w�l���i�q�ǂ��j�x
        if (avaRecMax.intValue() < (totalReserveCount.intValue()
                + adultCount.intValue() + childCount.intValue())) {

            if (log.isWarnEnabled()) {
                log.warn(ERROR_NOT_ENOUGH_SEAT + ":�c�Ȑ�������܂���B");
            }

            throw new TourMemberOverException(ERROR_NOT_ENOUGH_SEAT);
        }

        // �\������X�V����
        UpdateReserveInput reserveInput = new UpdateReserveInput();
        reserveInput.setReserveNo(reserveNo);
        reserveInput.setAdultCount(adultCount);
        reserveInput.setChildCount(childCount);
        reserveInput.setRemarks(remarks);
        reserveInput.setSumPrice(sumPrice);

        params.setSumPrice(params.getPrice().getSumPrice());
        updateDAO.execute("UC_A01_03.updateReserve", reserveInput);

        // �o�͒l�𐶐�����B
        BLogicResult bResult = new BLogicResult();
        bResult.setResultString("success");

        return bResult;
    }

}
