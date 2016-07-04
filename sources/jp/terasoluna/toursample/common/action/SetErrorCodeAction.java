/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.common.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.Globals;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import jp.terasoluna.fw.web.struts.actions.ForwardAction;

/**
 * <p>
 * �G���[�����������ꍇ�A�G���[���b�Z�[�W�L�[��ݒ肵�ĉ�ʑJ�ڂ��s�Ȃ�<br>
 * �A�N�V�����N���X�B
 * </p>
 * 
 * @see ForwardAction
 * 
 * 
 * 
 */
public class SetErrorCodeAction extends ForwardAction {

    /**
     * �G���[���b�Z�[�W�R�[�h�B
     */
    private String messageKey = null;

    /**
     * �G���[���b�Z�[�W�R�[�h��ԋp����B
     * 
     * @return �ێ�����G���[���b�Z�[�W�R�[�h
     */
    public String getMessageKey() {

        return messageKey;
    }

    /**
     * �G���[���b�Z�[�W�R�[�h��ݒ肷��B
     * 
     * @param messageKey
     *            �ݒ肷��G���[���b�Z�[�W�R�[�h
     */
    public void setMessageKey(String messageKey) {

        this.messageKey = messageKey;
    }

    /**
     * <p>
     * �G���[�ɔ����������āA�G���[���b�Z�[�W�R�[�h��ݒ肷��B<br>
     * �G���[���b�Z�[�W��ݒ��A��ʑJ�ڂ��s�Ȃ��B
     * </p>
     * 
     * @param mapping
     *            �A�N�V�����}�b�s���O
     * @param form
     *            �A�N�V�����t�H�[��
     * @param request
     *            HTTP���N�G�X�g
     * @param response
     *            HTTP���X�|���X
     * @return �J�ڐ�̃A�N�V�����t�H���[�h
     */
    @Override
    public ActionForward doExecute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) {

        // �Z�b�V�������擾����B
        HttpSession session = request.getSession();

        // ���b�Z�[�W�𐶐�����B
        ActionMessages errors = new ActionMessages();
        errors.add(Globals.ERROR_KEY, new ActionMessage(messageKey));

        // ���b�Z�[�W��ݒ肷��B
        addErrors(session, errors);

        // �t�H���[�h�������s���B
        return super.doExecute(mapping, form, request, response);
    }
}
