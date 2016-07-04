<%--
@(#)SC_A01_03_01.jsp
Copyright (C) 2007, 2010 NTT DATA Corporation. All Rights Reserved.:
Description : �c�A�[�\��ύX��ʂ�\������


--%>

<%@page contentType="text/html; charset=Windows-31J" language="java" pageEncoding="Windows-31J"%>

<%@ taglib uri="/struts-html" prefix="html"%>
<%@ taglib uri="/struts-bean" prefix="bean"%>
<%@ taglib uri="/struts-logic" prefix="logic"%>
<%@ taglib uri="/terasoluna" prefix="t"%>
<%@ taglib uri="/terasoluna-struts" prefix="ts"%>
<%@ taglib uri="/common" prefix="common"%>

<bean:define id="cssFileName" scope="page" value="UC_A01_03/SC_A01_03_01.css" />
<bean:define id="menuButtonFlag" scope="page" value="false" />
<bean:define id="loginButtonFlag" scope="page" value="true" />
<bean:define id="reserveDetail" name="_uc_a01_03Form" property="reserveDetail"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html:html locale="true">

<!-- begin header-->
<%@ include file="../SC_A99_00_01.jspf"%>
<!-- end header-->
  
<!-- begin body-->
<div class="com-root-panel">
  <!-- begin title -->
  <div class="com-body-title-panel">
    <div class="com-body-title-text-panel">
      <div class="com-body-screen-name-text">
        <h1><span class="com-body-screen-name-text">�c�A�[�\��ύX���</span>(���ID:SC_A01_03_01)</h1>
      </div>
    </div>
  </div>
  <!-- end title -->

  <!-- begin main -->
  <div class="com-body-panel">
	<div id="navi-text-panel"><font id="navi-present-text">�ύX���e����</font>
	&nbsp;��&nbsp;<font id="navi-text">���͓��e�m�F</font>
	&nbsp;��&nbsp;<font id="navi-text">����</font>
	</div>
	<br/>
    <!-- begin message -->
    <div class="com-message-panel">
      �\����e��ύX��A��ʉ��́u�\���ύX����v�{�^���������Ă��������B
      <div class="com-error-message-panel">
        <html:messages id="msg" message="false">
          <p><bean:write name="msg" ignore="true"/></p>
        </html:messages>
      </div>&nbsp;
    </div>
    <!-- end message -->
  
    <ts:form action="/SC_A01_03_01DSP.do" method="POST">
      <table class="com-visible-table" id="tour-table" summary="�c�A�[�\����">
        <caption>�c�A�[�\����</caption>
        <tr>
          <th>�\��ԍ�</th>
          <td id="tour-reserve-code-td">
            <bean:write name="_uc_a01_03Form" property="reserveNo" ignore="ture"/>
          </td>
          <th>�\�����ݓ�</th>
          <td id="tour-offer-day-td">
            <t:date name="reserveDetail" property="reservedDay" pattern="yyyy�NMM��dd��" ignore="true"/>
          </td>
        </tr>
        <tr>
          <th>�c�A�[��</th>
          <td id="tour-name-td" colspan="3">
            <bean:write name="reserveDetail" property="tourName" ignore="true"/>
          </td>
        </tr>
        <tr>
          <th>�o����</th>
          <td id="tour-starting-date-td">
            <t:date name="reserveDetail" property="depDay" pattern="yyyy�NMM��dd��" ignore="true"/>
          </td>
          <th>����</th>
          <td id="tour-days-td">
            <bean:write name="reserveDetail" property="tourDays" ignore="true"/>
          </td>
        </tr>
        <tr>
          <th>�o���n</th>
          <td id="tour-starting-point-td">
            <bean:write name="reserveDetail" property="depName" ignore="true"/>
          </td>
          <th>�ړI�n</th>
          <td id="tour-destination-td">
            <bean:write name="reserveDetail" property="arrName" ignore="true"/>
          </td>
        </tr>
        <tr>
          <th>�l��</th>
          <td id="tour-starting-point-td" colspan="3">
            ��l 
                <t:defineCodeList id="CODE_006" />        
                <html:select name="_uc_a01_03Form" property="reserveDetail.adultCount">
                  <html:options collection="CODE_006"
                                labelProperty="name"
                                property="id"/>
                </html:select> �l&nbsp;&nbsp;
            �q�ǂ�
                <t:defineCodeList id="CODE_007" />
                <html:select name="_uc_a01_03Form" property="reserveDetail.childCount">
                  <html:options collection="CODE_007"
                                labelProperty="name"
                                property="id"/>
                </html:select> �l
          </td>
        </tr>
      </table>
 
      <!-- tour-info end --> 
      <br/>
      <hr/>
      <br/>

      <!-- note start -->
      <table class="com-visible-table" id="special-affairs-table" summary="���ӌ����v�]">
        <caption>���L����</caption>
        <tr>
          <th>���ӌ��E���v�]</th>
          <td id="special-affairs-note-td" colspan="3">
            <html:text name="_uc_a01_03Form" property="reserveDetail.remarks" size="120"/>
            <font id="comment-text">(80�����ȉ�)</font>
            <br/>
            ���c�A�[�Ɋւ��邲�ӌ��E���v�]�Ȃǂ���܂�����A�����R�ɂ��������������B
          </td>
        </tr>
        
        <!-- �\��ԍ� -->
        <html:hidden name="_uc_a01_03Form" property="reserveNo"/>
      </table>
      <br/>
      <!-- note end -->
  
      <!-- begin buttons -->
      <div class="button">
        <!-- �c�A�[�\��Ɖ��ʂɑJ�� -->
        <logic:match name="_uc_a01_03Form" property="returnCode" value="SC_A01_02_01"> 
          <html:submit property="forward_backpage1" value="�O�̃y�[�W�ɖ߂�" styleClass="com-long-button"/>
        </logic:match>
        <!-- �c�A�[�\��ڍ׉�ʂɑJ�� -->
        <logic:match name="_uc_a01_03Form" property="returnCode" value="SC_A01_02_02" >
          <html:submit property="forward_backpage2" value="�O�̃y�[�W�ɖ߂�" styleClass="com-long-button"/>
        </logic:match>
        &nbsp;
        <!-- �c�A�[�\��ύX�m�F��ʂɑJ�� -->
        <html:submit property="forward_change" value="�\���ύX����" styleClass="com-long-button"/>
      </div>
      <!-- end buttons -->

    </ts:form>
    
  </div>

</div>

<!-- end body-->

<!-- begin footer-->
<%@ include file="../SC_A99_00_02.jspf" %>
<!-- end footer -->

</html:html>