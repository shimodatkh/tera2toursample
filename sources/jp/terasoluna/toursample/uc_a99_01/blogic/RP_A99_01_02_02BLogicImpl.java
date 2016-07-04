/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a99_01.blogic;

import jp.terasoluna.fw.dao.QueryDAO;
import jp.terasoluna.toursample.common.TourUVO;
import jp.terasoluna.toursample.common.dto.SelectUserInfoInput;

/**
 * ���O�C���������s���r�W�l�X���W�b�N�N���X�B<br>
 * <br>
 * �E���[�X�P�[�XUC_A99_01�F�ڋq���O�C��<br>
 * <br>
 * ���͂��ꂽ�ڋqID�ƃp�X���[�h�𗘗p�����O�C���������s���B<br>
 * ���O�C���\�̏ꍇ��UVO(�ڋq���)�𐶐����Ԃ��B<br>
 * ���O�C���s�\�̏ꍇ��null��Ԃ��B
 * 
 * @see jp.terasoluna.toursample.common.TourUVO
 * 
 */
public class RP_A99_01_02_02BLogicImpl implements RP_A99_01_02_02BLogic {

    /**
     * DAO�N���X�B Spring�ɂ��C���X�^���X��������ݒ肳���B
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
     * ���O�C���������s���B<br>
     * ���O�C�������̌��ʂƂ���UVO�C���X�^���X��Ԃ��B
     * 
     * @param customerCode
     *            ���͂��ꂽ�ڋqID
     * @param customerPass
     *            ���͂��ꂽ�p�X���[�h
     * 
     * @return �ڋq���
     */
    public TourUVO executeLogin(String customerCode, String customerPass) {

        // �ڋqID�ƃp�X���[�h�𗘗p���A�f�[�^�x�[�X����ڋq�����擾����B
    	SelectUserInfoInput userInfo = new SelectUserInfoInput();
    	userInfo.setCustomerCode(customerCode);
    	userInfo.setCustomerPass(customerPass);
        TourUVO output = queryDAO
            .executeForObject("common.selectUserInfo", userInfo,
                              TourUVO.class);

        // �ڋq���(UVO)��Ԃ��B
        // �ڋqID�ɑΉ�����ڋq��񂪑��݂��Ȃ��ꍇ�Anull��Ԃ��B
        return output;
    }
}
