/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a99_01.blogic;

import jp.terasoluna.toursample.common.TourUVO;

/**
 * ���O�C���������s���r�W�l�X���W�b�N�C���^�t�F�[�X�B<br>
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
public interface RP_A99_01_02_02BLogic {

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
    public TourUVO executeLogin(String customerCode, String customerPass);
}
