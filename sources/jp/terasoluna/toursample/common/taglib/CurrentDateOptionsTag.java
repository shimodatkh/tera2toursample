/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.common.taglib;

import java.util.Calendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.struts.taglib.html.Constants;
import org.apache.struts.taglib.html.SelectTag;

/**
 * �N,��,����Option�^�O���o�͂���^�O�N���X�B<br>
 * <br>
 * �E���ʏ���CP0004�F���t���X�g�{�b�N�Xoption�^�O��������
 * <br>
 * <br><code>selected="true"</code>�Ƃ����ꍇ�A���ݔN�����{plusDay�̔N������
 * selected���w�肷��Option�^�O���o�͂���B
 * <br>�N�̏o�͔͈͂͌��ݔN����+plusDay�̔N����n�߂�2�N�Ƃ���B
 * <br><code>selected="false"</code>�Ƃ����ꍇ�AForm�̔N������selected�w�肷��B
 * Form�ɏ�񂪂Ȃ��ꍇ��selected�w��͂����A���ݔN�A1���A1�����\������邱��
 * �ɂȂ�B<br>
 * �N,��,���̂ǂ���o�͂��邩�́A<code>var ="day"</code>�̂悤�Ɏw�肷��B
 * �i�K�{�j<br>
 * ���ӁF�Z���N�g�^�O�̒l���Q�Ƃ��邽�߁A��html:select���̓����Ŏg�p���邱�ƁB
 * <br>
 * ���ӁF30���܂ł̌��A���邤�N�v�Z�͍s�킸�A���I�ɓ����ς��悤�ȓ����
 * ���Ȃ��B<br>
 * �g�p��F
 * <pre>
 * <code>
 * &lt;html:select property=&quot;checkinYear&quot;&gt;
 *   &lt;thz:currentDateOptions var =&quot;year&quot; selected=&quot;true&quot; plusDay=&quot;1&quot;/&gt;
 * &lt;/html:select&gt;�N
 *
 * &lt;html:select property=&quot;checkinMonth&quot;&gt;
 *   &lt;thz:currentDateOptions var =&quot;month&quot; selected=&quot;true&quot; plusDay=&quot;1&quot;/&gt;
 * &lt;/html:select&gt;��
 * &lt;html:select property=&quot;checkinDay&quot; &gt;
 *   &lt;thz:currentDateOptions var =&quot;day&quot; selected=&quot;true&quot; plusDay=&quot;1&quot;/&gt;
 * &lt;/html:select&gt;��
 *</code>
 *</pre>
 *�����̔N������selected�w�肳���Z���N�g�{�b�N�X���o�͂����B
 *
 * 
 * 
 */
public class CurrentDateOptionsTag extends TagSupport {

    /**
     * �V���A���o�[�W����UID�B
     */
    private static final long serialVersionUID = -4412220224778697609L;

    /**
     * �N������ʁB
     * �ǂ̃t�B�[���h���o�͂��邩�����肷��B
     * year, month, day ���w�肷��B�f�t�H���g��month�B
     */
    private String var = null;

    /**
     * �������ݒ肷�邩�̓����B
     */
    private String plusDay = null;

    /**
     * selected��ǉ����邩�ǂ����B
     */
    private boolean selected = true;

    /**
     * �N������ʂ�ݒ肷��B
     * month,day ���w�肷��B�f�t�H���g��month�B
     * 
     * @param var �N������ʁByear��month��day���Ƃ�
     */
    public void setVar(String var) {
        this.var = var;
    }

    /**
     * �����ォ��ݒ肷��B
     * 
     * @param plusDay �����ォ
     */
    public void setPlusDay(String plusDay) {
        this.plusDay = plusDay;
    }

    /**
     * �Z���N�g��Ԃ�ݒ肷��B
     * 
     * @param selected �Z���N�g����Ă���ΐ^
     */
    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    /**
     * �^�O�]���J�n���ɌĂ΂�郁�\�b�h�B
     *
     * @return ��������w���B��� <code>SKIP_BODY</code>
     * @exception JspException JSP��O
     */
    public int doStartTag() throws JspException {

        //�o�͂��镶����
        StringBuilder result = new StringBuilder("");

        //selected�w�肷����t�܂Ői�߂����
        int plus = 0;

        if (!"".equals(plusDay) && (plusDay != null)) {
            plus = Integer.parseInt(plusDay);
        }

        Calendar calendar = Calendar.getInstance();
        //�i�߂���̓��t���擾
        calendar.add(Calendar.DATE, plus);
        
        if (var != null && !"".equals(var)) {
            
            //�N�����̂ǂ���o�͂��邩
            //���w��̏ꍇ
            if ("month".equals(var)) {

                for (int i = 1; i < 13; i++) {
                    //Option�^�O(value����)�̏o��
                    result.append("\n<option value= \"" + String.valueOf(i)
                            + "\"");
                    //selected�w�肳��Ă���ꍇ�A���ݔN����+plusDay�̌���selected��t�^����
                    //�w�肳��Ă��Ȃ��ꍇ�A�t�H�[�����Ɠ�������selected��
                    //�t�^����
                    if ((selected && i == calendar.get(Calendar.MONTH) + 1)
                            || (!selected && this.selectTag().isMatched(
                                    String.valueOf(i)))) {
                        //selected�����̏o��
                        result.append(" selected=\"selected\"");
                    }
                    //Option�^�O(�{�f�B��)�̏o�́B
                    //HTML���o�͂��邽�߁A���^�O�͂Ȃ��B
                    result.append(">");
                    result.append(String.valueOf(i));
                    //Option�^�O�����B
                    result.append("</option>");
                }
                //���w��̏ꍇ
            } else if ("day".equals(var)) {
                //�����w�萔���A�i�߂�
                for (int i = 1; i < 32; i++) {
                    result.append("\n<option value= \"" + String.valueOf(i)
                            + "\"");
                    //selected�w�肳��Ă���ꍇ�A���ݔN����+plusDay�̓���selected��t�^����
                    //�w�肳��Ă��Ȃ��ꍇ�A�t�H�[�����Ɠ�������selected��
                    //�t�^����
                    if ((selected && i == calendar.get(Calendar.DATE))
                            || (!selected && this.selectTag().isMatched(
                                    String.valueOf(i)))) {
                        //selected�����̏o��
                        result.append(" selected=\"selected\"");
                    }
                    //Option�^�O(�{�f�B��)�̏o�́B
                    //HTML���o�͂��邽�߁A���^�O�͂Ȃ��B
                    result.append(">");
                    result.append(String.valueOf(i));
                    //Option�^�O�����B
                    result.append("</option>");
                }
                //�N�w��̏ꍇ                
            } else if ("year".equals(var)){
                //�N���w�萔���A�i�߂�
                for (int i = 0; i < 2; i++) {
                    result.append("\n<option value= \"" +
                            String.valueOf(i + calendar.get(Calendar.YEAR))
                            + "\"");
                    //selected�w�肳��Ă���ꍇ�A���ݔN����+plusDay�̔N��selected��t�^����
                    //�w�肳��Ă��Ȃ��ꍇ�A�t�H�[�����Ɠ����N��selected��
                    //�t�^����
                    if ((selected && i == 0)||
                       (!selected && this.selectTag().isMatched(
                                    String.valueOf(i + calendar.
                                            get(Calendar.YEAR))))) {
                        //selected�����̏o��
                        result.append(" selected=\"selected\"");
                    }
                    //Option�^�O(�{�f�B��)�̏o�́B
                    result.append(">");
                    result.append(
                            String.valueOf(i + calendar.get(Calendar.YEAR)));
                    //Option�^�O�����B
                    result.append("</option>");
                }
            }
            
        }

        try {
            //���������^�O�̏o��
            pageContext.getOut().print(result.toString());
        } catch (Exception ex) {
            throw new JspException(ex);
        }
        //�X�L�b�v�{�f�B��ԋp
        return SKIP_BODY;
    }

    /**
     * �y�[�W�R���e�L�X�g�̃Z���N�g�^�O�̎Q�Ƃ��擾����B
     */
    private SelectTag selectTag() throws JspException {
        SelectTag selectTag = (SelectTag) pageContext
                .getAttribute(Constants.SELECT_KEY);

        if (selectTag == null) {
            throw new JspException();
        }

        return selectTag;
    }
}