<%--
@(#)SC_A99_01_01.jsp
Copyright (C) 2007, 2010 NTT DATA Corporation. All Rights Reserved.:
Description : ���j���[��ʂ�\������


--%>

<%@page contentType="text/html; charset=Windows-31J" language="java" pageEncoding="Windows-31J" %>

<%@ taglib uri="/struts-html" prefix="html"%>
<%@ taglib uri="/struts-bean" prefix="bean"%>
<%@ taglib uri="/struts-logic" prefix="logic"%>
<%@ taglib uri="/terasoluna" prefix="t"%>
<%@ taglib uri="/terasoluna-struts" prefix="ts"%>
<%@ taglib uri="/common" prefix="common"%>

<bean:define id="cssFileName" scope="page" value="SC_A99_01_01.css"/>
<bean:define id="menuButtonFlag" scope="page" value="true"/>
<bean:define id="loginButtonFlag" scope="page" value="true"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html:html locale="true">
<%@ include file="SC_A99_00_01.jspf" %>

<!-- begin body-->
      <div class="com-body-title-panel">
        <div class="com-body-title-text-panel">
          <h1><span class="com-body-screen-name-text">���j���[���</span>(���ID: SC_A99_01_01)</h1>
        </div>
      </div>
      <div class="com-body-panel" id="menu-body-panel">
        <div class="com-error-message-panel" id="default-error-message-panel">
          <html:messages id="message" message="true">
            <p><bean:write name="message" ignore="true"/></p>
          </html:messages>
        </div>
		<ts:form method="post" action="/SC_A99_01_01DSP.do">
          <table class="menu-visible-table">
            <tr>
              <th>
		        <div class="menu-button-panel">
		          <p>
		            <ts:submit property="forward_search" value="�c�A�[����������" styleClass="com-long-button"/>
		          </p>
		        </div>
		      </th>
		      <td>
		        <div class="menu-message-panel">
					�������w�肵�ăc�A�[�������ł��܂��B<br/>
					���������c�A�[�̗\����ł��܂��B�\��ɂ̓��O�C�����K�v�ł��B
		        </div>
		      </td>
		    </tr>
		  </table>
		  <logic:empty name="USER_VALUE_OBJECT" scope="session">
		  <br/>
		  <table class="menu-visible-table">
		    <tr>
		      <th>
		        <div class="menu-button-panel">
		          <p>
		            <ts:submit property="forward_login" value="���O�C������" styleClass="com-long-button"/>
		          </p>
		        </div>
		      </th>
		      <td>
		        <div class="menu-message-panel">
					���O�C������ƃc�A�[�̗\��A�Ɖ�A�ύX�A�L�����Z����<br/>
					�ł���悤�ɂȂ�܂��B<br/>
					���O�C�����邽�߂ɂ͎��O�ɉ���o�^���K�v�ł��B
		        </div>
		      </td>
		    </tr>
		  </table>
		  <br/>
		  <table class="menu-visible-table">
		    <tr>
		      <th>
		        <div class="menu-button-panel">
		          <p>
		            <ts:submit property="forward_registerUser" value="����o�^������" styleClass="com-long-button"/>
		          </p>
		        </div>
		      </th>
		      <td>
		        <div class="menu-message-panel">
					���q�l�̏�����͂��A����o�^���܂��B<br/>
		        </div>
		      </td>
		    </tr>
		  </table>
		  </logic:empty>
		  <logic:notEmpty name="USER_VALUE_OBJECT" scope="session">
		  <br/>
		  <table class="menu-visible-table">
		    <tr>
		      <th>
		        <div class="menu-button-panel">
		          <p>
		            <ts:submit property="forward_reference" value="�\����Ɖ��" styleClass="com-long-button"/>
		          </p>
		        </div>
		      </th>
		      <td>
		        <div class="menu-message-panel">
					���O�C�����Ă���ꍇ�̂ݕ\������܂��B�\�񂵂��c�A�[����<br/>
					�Ɖ�܂��B�\��̕ύX�A�L�����Z������������s���܂��B
		        </div>
		      </td>
		    </tr>
		  </table>
		  </logic:notEmpty>
		  <br/>
		</ts:form>
        <br/>
      </div>
      

<!-- end body-->

<%@ include file="SC_A99_00_02.jspf" %>
</html:html>