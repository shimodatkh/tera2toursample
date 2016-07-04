/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_04.blogic;

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
import jp.terasoluna.toursample.uc_a01_04.dto.RP_A01_04_01_02Input;
import jp.terasoluna.toursample.uc_a01_04.exception.CannotCancelException;

/**
 * �\��L�����Z�������N���X�B
 * 
 * 
 */
public class RP_A01_04_01_02BLogicImpl implements BLogic<RP_A01_04_01_02Input> {

    /**
     * ���ʏ������s��Null���ԋp���ꂽ�ꍇ�̃G���[���b�Z�[�W�B
     */
    public static final String ERROR_NOT_RESERVED = "error.common.00008";

    /**
     * DAO�N���X�B<br>
     * Spring�ɂ��C���X�^���X��������ݒ肳���B queryDAO �B
     */
    private QueryDAO queryDAO = null;

    /**
     * DAO�N���X�B<br>
     * Spring�ɂ��C���X�^���X��������ݒ肳���B updateDAO �B
     */
    private UpdateDAO updateDAO = null;

    /**
     * queryDAO ���擾����B
     * 
     * @return queryDAO
     */
    public QueryDAO getQueryDAO() {

        return this.queryDAO;
    }

    /**
     * queryDAO ��ݒ肷��B
     * 
     * @param queryDAO
     *            queryDAO
     */
    public void setQueryDAO(QueryDAO queryDAO) {

        this.queryDAO = queryDAO;
    }

    /**
     * updateDAO ���擾����B
     * 
     * @return updateDAO
     */
    public UpdateDAO getUpdateDAO() {

        return this.updateDAO;
    }

    /**
     * updateDAO ��ݒ肷��B
     * 
     * @param updateDAO
     *            updateDAO
     */
    public void setUpdateDAO(UpdateDAO updateDAO) {

        this.updateDAO = updateDAO;
    }

    /**
     * ���O�N���X�B
     */
    private static final Log log = LogFactory
            .getLog(RP_A01_04_01_02BLogicImpl.class);

    /**
     * �U���ς݂̃`�F�b�N�����ė\��̃L�����Z�����s���B<br>
     * 
     * @exception NotTransferException
     *                �����������ʂ��Ȃ��ꍇ�B
     * @exception CannotCancelException
     *                �x�����ς݂̏ꍇ�B
     * @param rp_a01_04_01_02Input
     * @return �r�W�l�X���W�b�N�̎��s���ʁABLogicResult�C���X�^���X�B
     */
    public BLogicResult execute(RP_A01_04_01_02Input rp_a01_04_01_02Input) {

        // ���ʂ��i�[����B
        BLogicResult result = new BLogicResult();

        // �c�A�[�\��̐U���t���O����������B
        Boolean transfer = queryDAO
                .executeForObject("UC_A01_04.selectTransfer",
                        rp_a01_04_01_02Input, Boolean.class);

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
                log.warn("warn.UC_A01_04.00001:�x�����ς݂̂��ߗ\����L�����Z���ł��Ȃ��B");
            }

            throw new CannotCancelException("warn.UC_A01_04.00001");
        }

        // �U���������擾����B
        Date paymentTimeLimit = DateUtil.getOneWeekBeforeDate(rp_a01_04_01_02Input.
                getReserveDetail().getDepDay());

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
                log.warn("warn.UC_A01_04.00001:�U���������߂��Ă��邽�ߗ\����L�����Z���ł��Ȃ��B");
            }
            throw new CannotCancelException("warn.UC_A01_04.00001");
        }

        // �\����L�����Z������B
        updateDAO.execute("UC_A01_04.deleteReserve", rp_a01_04_01_02Input);

        // ���ʂ��Z�b�g����B
        result.setResultString("success");
        return result;
    }

}