/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_05.blogic;

import java.util.List;

import jp.terasoluna.toursample.uc_a01_05.dto.RP_A01_05_01_01Input;
import jp.terasoluna.toursample.uc_a01_05.dto.RP_A01_05_01_01Output;

/**
 * ���[�o�͏��擾�r�W�l�X���W�b�N�̃C���^�[�t�F�C�X�N���X�B
 * 
 * 
 * 
 */
public interface RP_A01_05_01_01BLogic {

    /**
     * ���[�o�͏������X�g�Ŏ擾����B <BR>
     * ���[�o�͏��擾�����ƈ�v����c�A�[�\��ڍ׏���ԋp����B
     * 
     * @param param
     *            ���[�o�͏��擾����
     * @return ���[�o�͏�񃊃X�g
     */
    List<RP_A01_05_01_01Output> selectReportData(RP_A01_05_01_01Input param);

}