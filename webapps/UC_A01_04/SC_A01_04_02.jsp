<%--
@(#)SC_A01_04_02.jsp
Copyright (C) 2007, 2010 NTT DATA Corporation. All Rights Reserved.:
Description : �c�A�[�\��L�����Z����ʂ�\������


--%>

<%@page contentType="text/html; charset=Windows-31J" language="java" pageEncoding="Windows-31J" %>

<%@ taglib uri="/struts-html" prefix="html"%>
<%@ taglib uri="/struts-bean" prefix="bean"%>
<%@ taglib uri="/struts-logic" prefix="logic"%>
<%@ taglib uri="/terasoluna" prefix="t"%>
<%@ taglib uri="/terasoluna-struts" prefix="ts"%>
<%@ taglib uri="/common" prefix="common"%>

<bean:define id="menuButtonFlag" scope="page" value="true"/>
<bean:define id="loginButtonFlag" scope="page" value="false"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html:html locale="true">
<%@ include file="../SC_A99_00_01.jspf" %>

<!-- begin body-->
<div class="com-body-title-panel">
  <div class="com-body-title-text-panel">
    <div class="com-body-screen-name-text">
      <h1><span class="com-body-screen-name-text">�c�A�[�\��L�����Z���������</span>(���ID: SC_A01_04_01)</h1>
    </div>
  </div>
</div>
<%-- begin body--%>
<div class="com-body-panel">
    <div id="navi-text-panel">
		<font id="navi-text">�L�����Z�����e�m�F</font>
		&nbsp;��&nbsp;<font id="navi-present-text">����</font>
   </div>
  <br/><br/><br/><br/>
  <div class="com-message-panel" id="customer-error-message-panel">
		�c�A�[�\��i�\��ԍ��F<bean:write name="_uc_a01_04Form" property="reserveNo"/>�j�̃L�����Z�����������܂����B
  </div>
  <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
  <div align="right">
    <ts:form method="post" action="SC_A01_04_02DSP">
      <table id="button-table">
        <tr>
          <td>
            <ts:submit property="forward_reference" value="�c�A�[�\��Ɖ��ʂɖ߂�" styleClass="com-long-button" tabindex="1"/>
          </td>
          <td>
            <ts:submit property="forward_menu" value="���j���[��ʂɖ߂�" styleClass="com-long-button" tabindex="2"/>
          </td>
        </tr>
      </table>
    </ts:form>
  </div>
  <p><br/></p>
  <p><br/></p>
</div>
<!-- end body-->
<%@ include file="../SC_A99_00_02.jspf" %>

</html:html>
