<%--
@(#)SC_A99_03_02.jsp
Copyright (C) 2007, 2010 NTT DATA Corporation. All Rights Reserved.:
Description : �ڋq�o�^�m�F��ʂ�\������


--%>

<%@page contentType="text/html; charset=Windows-31J" language="java" pageEncoding="Windows-31J"%>

<%@ taglib uri="/struts-html" prefix="html"%>
<%@ taglib uri="/struts-bean" prefix="bean"%>
<%@ taglib uri="/struts-logic" prefix="logic"%>
<%@ taglib uri="/terasoluna" prefix="t"%>
<%@ taglib uri="/terasoluna-struts" prefix="ts"%>
<%@ taglib uri="/common" prefix="common"%>

<bean:define id="cssFileName" scope="page" value="UC_A99_03/SC_A99_03_02.css"/>
<bean:define id="menuButtonFlag" scope="page" value="false"/>
<bean:define id="loginButtonFlag" scope="page" value="false"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">

<html:html locale="true">

<!-- begin header-->
<%@ include file="../SC_A99_00_01.jspf" %>
<!-- end header-->

<!-- begin body-->
<div class="com-root-panel">

  <div class="com-body-title-panel">
    <div class="com-body-title-text-panel">
      <h1><span class="com-body-screen-name-text">�ڋq�o�^�m�F���</span>(���ID:SC_A99_03_02)</h1>
    </div>
  </div>
  
  <div class="com-body-panel">

    <div ID="navi-text-panel">
      <font ID="navi-text">���������</font>&nbsp;��&nbsp;
      <font ID="navi-present-text">���͓��e�m�F</font>&nbsp;��&nbsp;
      <font ID="navi-text">����</font>
    </div>
    <br/>
  
    <div class="com-message-panel">
	  �����͂������������͈ȉ��̂Ƃ���ł��B<br/>
	  ���͓��e����������΁u�o�^���m�肷��v�{�^���������Ă��������B<br/>
	</div>

    <br/>

    <ts:form action="SC_A99_03_02DSP">

      <table class="com-visible-table" summary="������">
        <caption>������</caption>
        <tr>
          <th>�t���K�i</th>
          <td id="customer-hurigana-td">
            <bean:write name="_uc_a99_03Form" property="customerKana" ignore="true" />
          </td>
        </tr>
        <tr>
          <th>����</th>
          <td id="customer-name-td">
            <bean:write name="_uc_a99_03Form" property="customerName" ignore="true" />
          </td>
        </tr>
        <tr>
          <th>���N����</th>
          <td id="customer-birth-td">
            <bean:write name="_uc_a99_03Form" property="customerBirthYear" ignore="true" />�N
            <bean:write name="_uc_a99_03Form" property="customerBirthMonth" ignore="true" />��
            <bean:write name="_uc_a99_03Form" property="customerBirthDay" ignore="true" />��
          </td>
        </tr>
        <tr>
          <th>�E��</th>
          <td id="customer-job-td">
            <bean:write name="_uc_a99_03Form" property="customerJob" ignore="true" />
          </td>
        </tr>
        <tr>
          <th>E���[��</th>
          <td id="customer-email-td">
            <bean:write name="_uc_a99_03Form" property="customerMail" ignore="true" />
          </td>
        </tr>
        <tr>
          <th>�d�b�ԍ�</th>
          <td id="customer-tel-td">
            <bean:write name="_uc_a99_03Form" property="customerTel" ignore="true" />
          </td>
        </tr>
        <tr>
          <th>�X�֔ԍ�</th>
          <td id="customer-postcode-td">
          ��<bean:write name="_uc_a99_03Form" property="customerPost" ignore="true" />
          </td>
        </tr>
        <tr>
          <th>�Z��</th>
          <td id="customerAdd-text">
            <bean:write name="_uc_a99_03Form" property="customerAdd" ignore="true" />
          </td>
        </tr>
        <tr>
          <th>�p�X���[�h</th>
          <td id="password-text">����������������</td>
        </tr>
        
      </table>
      
      <br/>
  
      <div class="button">
        <html:submit property="forward_returnInput" value="�o�^��ʂɖ߂�" styleClass="com-normal-button"  /> &nbsp; 
        <html:submit property="forward_registerUser" value="�o�^���m�肷��" styleClass="com-normal-button"  />
      </div>

    </ts:form>

  </div>

</div>
<!-- end body-->

<!-- begin footer-->
<%@ include file="../SC_A99_00_02.jspf" %>
<!-- end footer -->

</html:html>