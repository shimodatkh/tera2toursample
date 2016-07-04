/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.common.action;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import jp.terasoluna.fw.web.struts.actions.ActionEx;

/**
 * ���[�o�͋N�����ۃN���X<br>
 * PDF�`���̒��[���쐬���o�͂��s�Ȃ��B<br>
 * ���[�����p��Template��JasperReport�𗘗p����B<br>
 * �ȉ��̂S�̃��\�b�h���������邱�ƂŒ��[�̐������o����B<br>
 * <li>getParameterMap(ActionForm, HttpServletRequest)<br>
 * &nbsp;&nbsp;- �e���[�ɏo�͂����ύX�\�ȌŒ蕶������擾����B<br>
 * &nbsp;&nbsp;&nbsp; �Œ蕶���̂��߁A�擾���o���Ȃ��Ă����[�͐��������B</li>
 * <br><br>
 * <li>getReportData(ActionForm, HttpServletRequest)<br>
 * &nbsp;&nbsp;- ���[�ŏo�͂����������擾����B<br>
 * &nbsp;&nbsp;&nbsp; ���[�o�͑Ώۂ̂��߁A�擾���o���Ȃ��ꍇ�͋�̒��[��
 * ���������</li>
 * <br><br>
 * <li>getTemplatePath(ActionForm, HttpServletRequest)<br>
 * &nbsp;&nbsp;- ���[�����p��Template�t�@�C���̃p�X���擾����B</li>
 * <br><br>
 * <li>getFileName(ActionForm, HttpServletRequest)<br>
 * &nbsp;&nbsp;- ��������钠�[�t�@�C���̃t�@�C�������擾����B</li>
 * <br><br>
 * �E���ʏ���CP0005�F���[�o�͏���
 * 
 * @see jp.terasoluna.fw.web.struts.actions.ActionEx
 * 
 * 
 * 
 * @param <T> ���[�o�͏��I�u�W�F�N�g
 */
public abstract class AbstractReportAction<T> extends ActionEx {
    
    /**
     * ���[�o�͂��s�Ȃ��B<br>
     * <br>
     * �o�͂���钠�[�͈ȉ��̌`���ŏo�͂����B<br>
     * �E�t�@�C���`���FPDF�`��<br>
     * �E�t�@�C�����FgetFileName�̌���<br>
     * �����̒��[���o�͂���ꍇ�A���ʃt�@�C���ɕ����̒��[�����������B
     * 
     * @param mapping �A�N�V�����}�b�s���O
     * @param form �A�N�V�����t�H�[��
     * @param request ���N�G�X�g
     * @param response ���X�|���X
     * 
     * @return �J�ڏ������s��Ȃ����߁A�k����Ԃ��B
     * 
     * @exception JRException ���[�쐬�����Ŗ�肪���������ꍇ
     * @exception IOException Stream�̏����Ŗ�肪���������ꍇ
     */
    @Override
    public ActionForward doExecute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
        throws JRException, IOException {
        
        // �p�����[�^�̐���
        Map paramMap = getParameterMap(form, request);
        
        //Template�t�@�C���̃X�g���[�����擾�B
        InputStream inputStream = null;
        JasperReport jasperReport = null;
        
        try {
            inputStream = Thread.currentThread().getContextClassLoader().
                    getResourceAsStream(getTemplatePath(form, request));
        
            //Report(Template)�̐���
            jasperReport = JasperCompileManager.compileReport(inputStream);
            
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        
        //�f�[�^�x�[�X����̎擾�l
        List<T> list = getReportData(form, request);
                
        //JavaBean�p��Connection�𐶐�
        JRBeanCollectionDataSource dataSource =
            new JRBeanCollectionDataSource(list);
        
        //Report�Ƀf�[�^��ݒ�
        JasperPrint jasperPrint =
            JasperFillManager.fillReport(jasperReport, paramMap, dataSource);
        
        //ContentType�̐ݒ�
        response.setContentType("application/pdf");
        
        //PDF�t�@�C������ݒ�
        response.setHeader("Content-Disposition",
                "attachment; filename=\"" + getFileName(form, request) + "\"");
        
        //���X�|���X����ouputStream���擾
        ServletOutputStream outputStream = response.getOutputStream();
        
        //OupurtStream��PDF�t�@�C���̓��e��ݒ�B
        try {
            JasperExportManager.exportReportToPdfStream(jasperPrint,
                    outputStream);
            outputStream.flush();
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }

        //�J�ڏ������s��Ȃ����߁A�k����Ԃ��B
        return null;
    }
    
    /**
     * �p�����[�^�}�b�v��Ԃ��B<br>
     * �p�����[�^�͒��[�o�͎��A�S�Ă̒��[�ɏo�͂������ł���B<br>
     * 
     * @param form �A�N�V�����t�H�[��
     * @param request ���N�G�X�g
     * 
     * @return �p�����[�^�}�b�v
     */
    public abstract Map getParameterMap(ActionForm form,
            HttpServletRequest request);
    
    /**
     * ���[�o�͏�񃊃X�g��Ԃ��B<br>
     * �����̒��[���o�͂���ꍇ�A���̏������X�g�Ƃ��ĕԂ��B
     * 
     * @param form �A�N�V�����t�H�[��
     * @param request ���N�G�X�g
     * 
     * @return ���[�o�͏�񃊃X�g
     */
    public abstract List<T> getReportData(ActionForm form,
            HttpServletRequest request);
    
    /**
     * �e���v���[�g�t�@�C���̑��΃p�X��Ԃ��B<br>
     * ���΃p�X�̓N���X�p�X�̃��[�g����Ƃ��ċL�q����B<br>
     * <br>
     * �� ���ӓ_�F�N���X�p�X��ł͂Ȃ��t�@�C���͑Ή��o���Ȃ��B
     * 
     * @param form �A�N�V�����t�H�[��
     * @param request ���N�G�X�g
     * 
     * @return �e���v���[�g�t�@�C���̑��΃p�X
     */
    public abstract String getTemplatePath(ActionForm form,
            HttpServletRequest request);

    /**
     * ��������钠�[�̃t�@�C������Ԃ��B<br>
     * 
     * @param form �A�N�V�����t�H�[��
     * @param request ���N�G�X�g
     * 
     * @return �t�@�C����
     */
    public abstract String getFileName(ActionForm form,
            HttpServletRequest request);
}
