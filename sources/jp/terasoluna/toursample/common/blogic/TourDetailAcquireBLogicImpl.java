/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.common.blogic;

import jp.terasoluna.fw.dao.QueryDAO;
import jp.terasoluna.toursample.common.dto.TourDetailAcquireOutput;
import jp.terasoluna.toursample.common.util.DateUtil;

/**
 * �c�A�[�ڍ׎擾�r�W�l�X���W�b�N�N���X�B<br>
 * �c�A�[�R�[�h�𗘗p���A�f�[�^�x�[�X����c�A�[�ڍ׏����擾����B<br>
 * �f�[�^�x�[�X�ɐ����œo�^����Ă��颓�����͔����`���ɕϊ����Đݒ肷��B <br>
 * <br>
 * �E���ʏ���CP0007�F�c�A�[�ڍ׎擾
 * 
 * 
 */
public class TourDetailAcquireBLogicImpl implements TourDetailAcquireBLogic {

    /**
     * DAO�N���X�B<br>
     * Spring�ɂ��C���X�^���X��������ݒ肳���B
     */
    protected QueryDAO queryDAO = null;

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
     * �c�A�[�ڍׂ̎擾���s�Ȃ��B<br>
     * �\��ڍׂ̎擾���o���Ȃ������ꍇ��null��Ԃ��B
     * 
     * @param tourCode
     *            �c�A�[�R�[�h
     * 
     * @return �c�A�[�ڍ�
     */
    public TourDetailAcquireOutput execute(String tourCode) {

        // �f�[�^�x�[�X����\��ڍ׏����擾����B
        TourDetailAcquireOutput result = 
            queryDAO.executeForObject("common.selectTourDetail", tourCode,
                              TourDetailAcquireOutput.class);

        // �擾���ʂ��Ȃ��ꍇ�Anull��Ԃ��B
        if (result == null) {
            return null;
        }

        // ���l�`���̃c�A�[�����𔑓��`���ɕϊ�����B
        String tourDays = DateUtil.convertNightDays(result.getIntTourDays());
        result.setTourDays(tourDays);

        return result;

    }

}
