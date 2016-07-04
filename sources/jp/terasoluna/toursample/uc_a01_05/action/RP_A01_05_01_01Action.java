/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_05.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;

import jp.terasoluna.fw.util.PropertyUtil;
import jp.terasoluna.fw.web.UserValueObject;
import jp.terasoluna.toursample.common.Constants;
import jp.terasoluna.toursample.common.TourUVO;
import jp.terasoluna.toursample.common.action.AbstractReportAction;
import jp.terasoluna.toursample.uc_a01_05.blogic.RP_A01_05_01_01BLogic;
import jp.terasoluna.toursample.uc_a01_05.dto.RP_A01_05_01_01Input;
import jp.terasoluna.toursample.uc_a01_05.dto.RP_A01_05_01_01Output;
import jp.terasoluna.toursample.uc_a01_05.form.UC_A01_05Form;

/**
 * ���[�o�͋N���N���X
 * <p>
 * 
 * </p>
 * 
 * 
 * 
 */
public class RP_A01_05_01_01Action extends
        AbstractReportAction<RP_A01_05_01_01Output> {

    /**
     * ���s����r�W�l�X���W�b�N�N���X�B Spring�ɂ��C���X�^���X��������ݒ肳���B
     */
    private RP_A01_05_01_01BLogic rp_a01_05_01_01BLogic = null;

    /**
     * ���s����r�W�l�X���W�b�N�N���X��Ԃ��B
     * 
     * @return ���s����r�W�l�X���W�b�N�N���X
     */
    public RP_A01_05_01_01BLogic getRp_a01_05_01_01BLogic() {

        return rp_a01_05_01_01BLogic;
    }

    /**
     * ���s����r�W�l�X���W�b�N�N���X��ݒ肷��B
     * 
     * @param rp_a01_05_01_01BLogic
     *            ���s����r�W�l�X���W�b�N�N���X
     */
    public void setRp_a01_05_01_01BLogic(
            RP_A01_05_01_01BLogic rp_a01_05_01_01BLogic) {

        this.rp_a01_05_01_01BLogic = rp_a01_05_01_01BLogic;
    }

    /**
     * �p�����[�^�}�b�v��Ԃ��B<br>
     * �p�����[�^�͒��[�o�͎��A�S�Ă̒��[�ɏo�͂������ł���B<br>
     * 
     * @param form
     *            �A�N�V�����t�H�[��
     * @param request
     *            ���N�G�X�g
     * 
     * @return �p�����[�^�}�b�v
     */
    @Override
    public Map getParameterMap(ActionForm form, HttpServletRequest request) {

        // �v���p�e�B�t�@�C������⍇�����A�U�������擾����B
        String paymentMethod = PropertyUtil
            .getProperty(Constants.PAYMENT_METHOD);
        String paymentCompanyName = PropertyUtil
            .getProperty(Constants.PAYMENT_COMPANY_NAME);
        String paymentAccount = PropertyUtil
            .getProperty(Constants.PAYMENT_ACCOUNT);
        String referenceName = PropertyUtil.getProperty(Constants.COMPANY_NAME);
        String referenceEmail = PropertyUtil
            .getProperty(Constants.COMPANY_MAIL);
        String referenceTel = PropertyUtil.getProperty(Constants.COMPANY_TEL);

        // �擾��������Map�֏������ށB
        Map<String, String> paramMap = new HashMap<String, String>();
        paramMap.put("paymentMethod", paymentMethod);
        paramMap.put("paymentCompanyName", paymentCompanyName);
        paramMap.put("paymentAccount", paymentAccount);
        paramMap.put("referenceName", referenceName);
        paramMap.put("referenceEmail", referenceEmail);
        paramMap.put("referenceTel", referenceTel);

        return paramMap;
    }

    /**
     * ���[�o�͏�񃊃X�g��Ԃ��B<br>
     * �����̒��[���o�͂���ꍇ�A���̏������X�g�Ƃ��ĕԂ��B
     * 
     * @param form
     *            �A�N�V�����t�H�[��
     * @param request
     *            ���N�G�X�g
     * 
     * @return ���[�o�͏�񃊃X�g
     */
    @Override
    public List<RP_A01_05_01_01Output> getReportData(ActionForm form,
            HttpServletRequest request) {

        // �r�W�l�X���W�b�N�̓��͒l�N���X�𐶐�����B
        RP_A01_05_01_01Input param = new RP_A01_05_01_01Input();

        // �t�H�[���̈������L���X�g����B
        UC_A01_05Form uc_a01_05Form = (UC_A01_05Form) form;

        // �t�H�[���̒l���r�W�l�X���W�b�N�̓��͒l�N���X�ɃZ�b�g����B
        param.setReserveNo(uc_a01_05Form.getReserveNo());

        // �Z�b�V��������UVO���擾���A���͒l�N���X�ɃZ�b�g����B
        param.setTourUVO((TourUVO) request.getSession()
            .getAttribute(UserValueObject.USER_VALUE_OBJECT_KEY));

        // ���X�g�����ꂽ�\������擾����B
        List<RP_A01_05_01_01Output> list = rp_a01_05_01_01BLogic
            .selectReportData(param);

        return list;
    }

    /**
     * �e���v���[�g�t�@�C���̑��΃p�X��Ԃ��B<br>
     * ���΃p�X�̓N���X�p�X�̃��[�g����Ƃ��ċL�q����B<br>
     * <br>
     * <p> �� ���ӓ_�F�N���X�p�X��ł͂Ȃ��t�@�C���͑Ή��o���Ȃ��B<br>
     * �܂��Apath�l���u/�v�Ŏn�܂�ꍇ��ClassLoader�ɂ���ă��\�[�X���擾
     * �ł��Ȃ��ꍇ�����݂���B(Tomcat�ł͖��Ȃ��BJunit�ł͖�肠��)�B<br>
     * ���̂��߁A�p�X�̐擪��/�Ŏn�܂�Ȃ����ƁB
     * <p>
     * 
     * @param form
     *            �A�N�V�����t�H�[��
     * @param request
     *            ���N�G�X�g
     * 
     * @return �e���v���[�g�t�@�C���̑��΃p�X
     */
    @Override
    public String getTemplatePath(ActionForm form, HttpServletRequest request) {

        // �e���v���[�g�t�@�C���̃p�X��ԋp����B
        String path = "jp/terasoluna/toursample/uc_a01_05/report"
                + "/terasolunaPdfFormat.jrxml";

        return path;
    }

    /**
     * ��������钠�[�̃t�@�C������Ԃ��B<br>
     * 
     * @param form
     *            �A�N�V�����t�H�[��
     * @param request
     *            ���N�G�X�g
     * 
     * @return �t�@�C����
     */
    @Override
    public String getFileName(ActionForm form, HttpServletRequest request) {

        // �t�H�[���̈������L���X�g����B
        UC_A01_05Form uc_a01_05Form = (UC_A01_05Form) form;

        // �t�@�C������ݒ肷��B
        String fileName = "ReserveDetails(" + uc_a01_05Form.getReserveNo()
                + ").pdf";

        return fileName;
    }
}