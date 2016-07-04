/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.common.blogic;

import jp.terasoluna.fw.dao.QueryDAO;
import jp.terasoluna.toursample.common.dto.ReserveDetailAcquireInput;
import jp.terasoluna.toursample.common.dto.ReserveDetailAcquireOutput;
import jp.terasoluna.toursample.common.util.DateUtil;

/**
 * �\��ڍ׎擾�r�W�l�X���W�b�N�N���X�B<br>
 * �\��ԍ��𗘗p���A�f�[�^�x�[�X����\��ڍ׏����擾����B<br>
 * �f�[�^�x�[�X����擾�ł��Ȃ���U��������͏o�����̈�T�ԑO�̓��t��ݒ肷��B <br>
 * �f�[�^�x�[�X�ɐ����œo�^����Ă��颃c�A�[������͔����`���ɕϊ����Đݒ肷��B <br>
 * <br>
 * �E���ʏ���CP0006�F�\��ڍ׎擾
 * 
 * 
 */
public class ReserveDetailAcquireBLogicImpl implements
        ReserveDetailAcquireBLogic {

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
     * �\��ڍׂ̎擾���s�Ȃ��B<br>
     * �\��ڍׂ̎擾���o���Ȃ������ꍇ��null��Ԃ��B
     * 
     * @param input
     *            ��������(�\��ԍ��A�ڋqID)
     * 
     * @return �\��ڍ�
     */
    public ReserveDetailAcquireOutput execute(ReserveDetailAcquireInput input) {

        // �f�[�^�x�[�X����\��ڍ׏����擾����B
        ReserveDetailAcquireOutput result = 
            queryDAO.executeForObject("common.selectReserveDetail", input,
                              ReserveDetailAcquireOutput.class);

        // �擾���ʂ��Ȃ��ꍇ�Anull��Ԃ��B
        if (result == null) {
            return null;
        }

        // �U���������Z�o���A�\��ڍ׏��ɐݒ肷��B
        result.setPaymentTimeLimit(DateUtil.getOneWeekBeforeDate(result
            .getDepDay()));

        // ���l�`���̃c�A�[�����𔑓��`���ɕϊ�����B
        String tourDays = DateUtil.convertNightDays(result.getIntTourDays());
        result.setTourDays(tourDays);

        return result;

    }

}
