/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a99_01.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.Globals;

import jp.terasoluna.fw.service.thin.BLogicMessage;
import jp.terasoluna.fw.service.thin.BLogicMessages;
import jp.terasoluna.fw.service.thin.BLogicResult;
import jp.terasoluna.fw.web.struts.actions.AbstractBLogicAction;
import jp.terasoluna.toursample.common.TourUVO;
import jp.terasoluna.toursample.uc_a99_01.blogic.RP_A99_01_02_02BLogic;
import jp.terasoluna.toursample.uc_a99_01.dto.RP_A99_01_02_02Input;
import jp.terasoluna.toursample.uc_a99_01.dto.RP_A99_01_02_02Output;

/**
 * ���O�C���������s���A�N�V�����N���X�B<br>
 * <br>
 * �E���[�X�P�[�XUC_A99_01�F�ڋq���O�C��<br>
 * <br>
 * ���͂��ꂽ���(�ڋqID�A�p�X���[�h)�𗘗p�����O�C���������s���B<br>
 * �f�[�^�x�[�X�Ɍڋq��񂪂���ꍇ��UVO�𐶐����Z�b�V�����Ɋi�[����B<br>
 * �Ȃ��ꍇ�̓G���[���b�Z�[�W����ʂɕ\������B
 * 
 * 
 * 
 */
public class RP_A99_01_02_02Action extends 
    AbstractBLogicAction<RP_A99_01_02_02Input> {

    /**
     * ���O�N���X�B
     */
    private static final Log log = 
        LogFactory.getLog(RP_A99_01_02_02Action.class);

    /**
     * ���O�C���Ɏ��s�����ꍇ�̃G���[���b�Z�[�W�R�[�h�B
     */
    private static final String LOGIN_ERROR = "warn.UC_A99_01.00001";

    /**
     * ���O�C���r�W�l�X���W�b�N�B
     */
    private RP_A99_01_02_02BLogic rp_a99_01_02_02BLogic = null;

    /**
     * ���O�C���r�W�l�X���W�b�N��ݒ肷��B
     * 
     * @param logic
     *            ���O�C���r�W�l�X���W�b�N
     */
    public void setRp_a99_01_02_02BLogic(RP_A99_01_02_02BLogic logic) {

        rp_a99_01_02_02BLogic = logic;
    }

    /**
     * ���O�C���������s���B<br>
     * <p>
     * ���O�C���r�W�l�X���W�b�N���s���A���O�C���\�̏ꍇ��UVO(�ڋq���)�� �Z�b�V�����Ɋi�[����B
     * </p>
     * 
     * @param param
     *            BLogic���͏��
     * @return BLogic�o�͏��
     */
    @Override
    public BLogicResult doExecuteBLogic(RP_A99_01_02_02Input param) {

        BLogicResult result = new BLogicResult();

        // ���O�C���������s���B
        TourUVO uvo = rp_a99_01_02_02BLogic.executeLogin(param
            .getCustomerCode(), param.getCustomerPass());

        // �ڋq���擾�ۂ��m�F����B
        if (uvo == null) {
            // �ڋq��񂪎擾�ł��Ȃ������ꍇ�i�F�؎��s���j
            // �G���[���b�Z�[�W���i�[���ABLogicResult�ɐݒ肷��
            BLogicMessages errors = new BLogicMessages();
            errors.add(Globals.ERROR_KEY, new BLogicMessage(LOGIN_ERROR));
            result.setErrors(errors);

            result.setResultString("failure");

            // ���O���o�͂���B
            if (log.isWarnEnabled()) {
                log.warn("Login failure�F " + param.getCustomerCode());
            }
        } else {
            // �ڋq��񂪎擾�ł����ꍇ�i�F�ؐ������j
            // �o�̓I�u�W�F�N�g�𐶐����ABLogicResult�ɐݒ肷��
            RP_A99_01_02_02Output output = new RP_A99_01_02_02Output();
            output.setUvo(uvo);
            result.setResultObject(output);

            // ���O���o�͂���B
            if (log.isInfoEnabled()) {
                log.info("Login success�F " + param.getCustomerCode());
            }

            String returnCode = param.getReturnCode();

            // �J�ڌ����ID���m�F����B
            if (returnCode == null || "".equals(returnCode)) {
                // �J�ڌ����ID���Ȃ��ꍇ
                result.setResultString("success");
            } else if ("SC_A01_01_02".equals(returnCode)) {
                // �J�ڌ����ID��SC_A01_01_02(�c�A�[�ڍ׉��)�̏ꍇ
                result.setResultString("returnSC_A01_01_02");
            } else {
                // �z��O�̑J�ڌ����ID�̏ꍇ
                result.setResultString("default");
            }

        }
        return result;
    }

}
