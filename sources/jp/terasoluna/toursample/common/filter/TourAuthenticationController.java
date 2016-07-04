/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.common.filter;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jp.terasoluna.fw.web.RequestUtil;
import jp.terasoluna.fw.web.UserValueObject;
import jp.terasoluna.fw.web.thin.AuthenticationController;
import jp.terasoluna.toursample.common.TourUVO;

/**
 * AuthenticationController�������������O�I���F�؍ς݃`�F�b�N���s���N���X�B<br>
 * <br>
 * �E���ʏ���CP0002�F���O�C���ς݌���
 * 
 * <h5>�T�v</h5>
 * <p>
 * AuthenticationController�ɂ��ẮA �e�v���W�F�N�g���ƂɎ��������N���X���쐬����B <br>
 * ���̎��A���O�I���F�؍ς݃`�F�b�N���@���̓v���W�F�N�g���ƂɈقȂ�ׁA �C�ӂ̎������s�����ƁB
 * </p>
 * <p>
 * �T���v���A�v���P�[�V�����ł́ABean��`�ɂ�� �p�X�����擾�����䂷��悤�������Ă���B <br>
 * </p>
 * <p>
 * ���O�I���F�؍ς݃`�F�b�N�̏����ΏۂƂ��Ȃ��p�X�ɂ��ẮA
 * ���炩����Bean��`�t�@�C���ɂ��authenticatedNoCheckPaths�ɐ��K�\���Őݒ肵�Ă����A
 * ���N�G�X�g�̃p�X��authenticatedNoCheckPaths�̐��K�\���Ɉ�v���Ȃ������ꍇ�ɁA �Z�b�V������
 * {@link jp.terasoluna.toursample.common.TourUVO} ���i�[����Ă��邩�ǂ����ŁA�`�F�b�N���s���B
 * </p>
 * 
 * @see jp.terasoluna.fw.web.thin.AuthenticationController
 * @see jp.terasoluna.fw.web.thin.AuthenticationControlFilter
 * @see jp.terasoluna.fw.web.UserValueObject
 * @see jp.terasoluna.toursample.common.TourUVO
 * 
 * 
 * 
 */
public class TourAuthenticationController implements AuthenticationController {

    /**
     * �F�؃`�F�b�N���s��Ȃ��p�X��񃊃X�g�B
     */
    private List<String> authenticatedNoCheckPaths = null;

    /**
     * �F�؃`�F�b�N���s��Ȃ��p�X��񃊃X�g��ݒ肷��B
     * 
     * @param authenticatedNoCheckPaths
     *            �p�X��񃊃X�g
     */
    public void setAuthenticatedNoCheckPaths(
            List<String> authenticatedNoCheckPaths) {

        this.authenticatedNoCheckPaths = authenticatedNoCheckPaths;
    }

    /**
     * ���N�G�X�g�̃p�X���ɑ΂��āA���O�I���F�؍ς݂��ǂ����𔻒肷��B
     * <p>
     * �F�؍ς݂��ǂ����̓Z�b�V������ {@link jp.terasoluna.toursample.common.TourUVO}
     * ���i�[����Ă��邩�ǂ����Ŕ��肷��B
     * </p>
     * 
     * @param pathInfo
     *            �p�X���
     * @param req
     *            ���N�G�X�g
     * @return �F�؍ς݂ł����true�B
     */
    public boolean isAuthenticated(String pathInfo, ServletRequest req) {

        HttpSession session = ((HttpServletRequest) req).getSession();

        // �Z�b�V��������I�u�W�F�N�g���擾
        Object getObject = session
            .getAttribute(UserValueObject.USER_VALUE_OBJECT_KEY);

        // �`�F�b�N
        if (getObject == null) {
            return false;
        }

        // �`�F�b�N
        if (getObject instanceof TourUVO) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * ���N�G�X�g�̃p�X���ɑ΂��A �F�؃`�F�b�N���s���ׂ��p�X���ǂ����𔻒肷��B
     * <p>
     * �A�N�Z�X���悤�Ƃ��Ă���p�X���F�؃`�F�b�N���s�Ȃ�Ȃ��p�X�̐��K�\�� ���X�g�ɓ�����Ȃ��ꍇtrue��Ԃ��B
     * </p>
     * 
     * @param req
     *            ����ΏۂƂȂ�ServletRequest�N���X�C���X�^���X
     * @return �F�؃`�F�b�N��v����ꍇ��true�B
     */
    public boolean isCheckRequired(ServletRequest req) {

        // pathInfo�̎擾
        String pathInfo = RequestUtil.getPathInfo(req);

        // �F�؃`�F�b�N���s��Ȃ��p�X�̃��X�g�ɂȂ���΁A�`�F�b�N����
        for (int i = 0; i < authenticatedNoCheckPaths.size(); i++) {
            String path = authenticatedNoCheckPaths.get(i);

            // �`�F�b�N
            if (pathInfo.matches(path)) {
                return false;
            }
        }
        return true;
    }

}
