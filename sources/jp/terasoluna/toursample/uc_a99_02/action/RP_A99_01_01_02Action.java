/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a99_02.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.Globals;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import jp.terasoluna.fw.web.struts.actions.LogoffAction;

/**
 * ���O�A�E�g�������s���A�N�V�����N���X�B<br>
 * <br>
 * �E���[�X�P�[�XUC_A99_02�F�ڋq���O�A�E�g<br>
 * <br>
 * Terasoluna��{@link jp.terasoluna.fw.web.struts.actions.LogoffAction LogoffAction}
 * �̋@�\���g�p���A�Z�b�V���������N���A����B<br>
 * �Z�b�V���������N���A������ɂ̓��O�A�E�g���ʂƂ��ĕ\������郁�b�Z�[�W�� �������Ԃ��B
 * 
 * 
 * 
 */
public class RP_A99_01_01_02Action extends LogoffAction {

    /**
     * ���O�A�E�g���b�Z�[�W�R�[�h�B
     */
    private static final String LOGOUT_MESSAGE = "info.UC_A99_02.00001";

    /**
     * ���O�A�E�g�������s���B<br>
     * �S�ẴZ�b�V���������N���A���A���O�A�E�g�������b�Z�[�W��ݒ肷��B
     * 
     * @param mapping
     *            �A�N�V�����}�b�s���O
     * @param form
     *            �t�H�[��
     * @param request
     *            ���N�G�X�g
     * @param response
     *            ���X�|���X
     * @return �J�ڐ�A�N�V�����t�H���[�h
     * 
     */
    @Override
    public ActionForward doExecute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) {

        // �Z�b�V�����N���A�������s���B
        ActionForward forward = super.doExecute(mapping, form, request,
                                                response);

        // forward��null�̏ꍇ��null��Ԃ��B(FW�̎d�l)
        if (forward == null) {
            return null;
        }

        // ���_�C���N�g�ݒ���s�Ȃ��B
        forward.setRedirect(true);

        // �Z�b�V�������擾����B
        HttpSession session = request.getSession();

        // ���b�Z�[�W�𐶐�����B
        ActionMessages messages = new ActionMessages();
        messages.add(Globals.MESSAGE_KEY, new ActionMessage(LOGOUT_MESSAGE));

        // ���b�Z�[�W��ݒ肷��B
        addMessages(session, messages);

        return forward;
    }

}
