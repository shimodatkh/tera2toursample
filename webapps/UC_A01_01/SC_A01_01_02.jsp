<%--
@(#)SC_A01_02_01.jsp
Copyright (C) 2007, 2010 NTT DATA Corporation. All Rights Reserved.:
Description : �c�A�[�ڍ׉�ʂ�\������


--%>

<%@ page contentType="text/html; charset=Windows-31J" language="java" pageEncoding="Windows-31J" %>

<%@ taglib uri="/struts-html" prefix="html"%>
<%@ taglib uri="/struts-bean" prefix="bean"%>
<%@ taglib uri="/struts-logic" prefix="logic"%>
<%@ taglib uri="/terasoluna" prefix="t"%>
<%@ taglib uri="/terasoluna-struts" prefix="ts"%>
<%@ taglib uri="/common" prefix="common"%>

<bean:define id="cssFileName" scope="page" value="UC_A01_01/SC_A01_01_02.css" />
<bean:define id="menuButtonFlag" scope="page" value="false"/>
<bean:define id="loginButtonFlag" scope="page" value="true"/>
<bean:define id="tourDetail" name="_uc_a01_01Form" property="tourDetail"/>
<bean:define id="priceOutput" name="_uc_a01_01Form" property="priceOutput"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html:html locale="true">

<!-- begin-header -->
<%@ include file="../SC_A99_00_01.jspf" %>
<!-- end-header -->

<!-- begin body-->
  <div class="com-root-panel">
  <div class="com-body-title-panel">
    <div class="com-body-title-text-panel">
      <div class="com-body-screen-name-text">
        <h1><span class="com-body-screen-name-text">�c�A�[�ڍ׉��</span>(���ID: SC_A01_01_02)</h1>
      </div>
    </div>
  </div>

  <div class="com-body-panel" id="default-body-panel">
  
    <div id="navi-text-panel">
      <font id="navi-text">�c�A�[����</font>&nbsp;��&nbsp;
      <font id="navi-present-text">�c�A�[���m�F</font>&nbsp;��&nbsp;
      <font id="navi-text">�\����e�m�F</font>&nbsp;��&nbsp;
      <font id="navi-text">����</font>
    </div>
    <br/>
    
    <logic:empty name="USER_VALUE_OBJECT" scope="session">
      <div class="com-message-panel" id="default-message-panel">
	    �\�񂷂�ꍇ�́A��ʉ����́u���O�C������v�{�^���������ĉ������B
      </div>
    </logic:empty>
    
    <logic:notEmpty name="USER_VALUE_OBJECT" scope="session">
      <div class="com-message-panel" id="default-message-panel">
        �c�A�[�̏ڍׂ��m�F������A��ʉ����́u�\�񂷂�v�{�^���������ĉ������B<br/>
		���̎��A���ӌ��E���v�]������΋L�����Ă��������B
      </div>
    </logic:notEmpty>
    
    <br/>
    <div class="com-error-message-panel" id="default-error-message-panel">
      <html:errors/>
    </div>
    <br/>
    
    <table class="com-visible-table" id="tour-table" summary="�c�A�[���">
      <caption>�c�A�[�ڍ׏��</caption>
      <tr>
        <th>�c�A�[��</th>
        <td id="tour-name-td" colspan="3"><bean:write name="tourDetail" property="tourName" /></td>
      </tr>
      <tr>
        <th>�o����</th>
        <td id="tour-starting-date-td"><t:date name="tourDetail" property="depDay" pattern="yyyy�NMM��dd��"/></td>
        <th>����</th>
        <td id="tour-days-td"><bean:write name="tourDetail" property="tourDays" /></td>
      </tr>
      <tr>
        <th>�o���n</th>
        <td id="tour-starting-point-td"><bean:write name="tourDetail" property="depName" /></td>
        <th>�ړI�n</th>
        <td id="tour-destination-td"><bean:write name="tourDetail" property="arrName" /></td>
      </tr>
      <tr>
        <th>�Y���</th>
        <td id="tour-conductor-td" colspan="3">
          <logic:equal name="tourDetail" property="conductor" value="true">�L</logic:equal>
          <logic:equal name="tourDetail" property="conductor" value="false">��</logic:equal>
        </td>
      </tr>
      <tr>
        <th>�h���{��</th>
        <td id="tour-accommodations-td"><bean:write name="tourDetail" property="accomName" /></td>
        <th>�A����</th>
        <td id="tour-accommodations-tel-td"><bean:write name="tourDetail" property="accomTel" /></td>
      </tr>
      <tr>
        <th>�T�v</th>
        <td id="tour-summary-td" colspan="3"><t:write name="tourDetail" property="tourAbs" ignore="true" /></td>
      </tr>
    </table>
    <br/>
<%-- representative --%>
    <logic:notEmpty name="USER_VALUE_OBJECT" scope="session">
      <hr/>
      <table class="com-visible-table" id="customer-table" summary="��\�ҏ��">
        <caption>��\��</caption>
        <tr>
          <th colspan="2">���ID</th>
          <td id="customer-id-td" colspan="3"><bean:write name="USER_VALUE_OBJECT" property="customerCode" scope="session"/></td>
        </tr>
        <tr>
          <th colspan="2">�t���K�i</th>
          <td id="customer-hurigana-td" colspan="3"><bean:write name="USER_VALUE_OBJECT" property="customerKana" scope="session"/></td>
        </tr>
        <tr>
          <th colspan="2">����</th>
          <td id="customer-name-td" colspan="3"><bean:write name="USER_VALUE_OBJECT" property="customerName" scope="session"/></td>
        </tr>
        <tr>
          <th colspan="2">���N����</th>
          <td id="customer-birth-td" colspan="3"><bean:write name="USER_VALUE_OBJECT" property="customerBirth" format="yyyy�NMM��dd��" scope="session"/></td>
        </tr>
        <tr>
          <th colspan="2">�E��</th>
          <td id="customer-job-td" colspan="3"><bean:write name="USER_VALUE_OBJECT" property="customerJob" scope="session"/></td>
        </tr>
        <tr>
          <th colspan="2">E���[��</th>
          <td id="customer-email-td" colspan="3"><bean:write name="USER_VALUE_OBJECT" property="customerMail" scope="session"/></td>
        </tr>
        <tr>
          <th rowspan="3">�A����</th>
          <th >�d�b�ԍ�</th>
          <td id="customer-tel-td" colspan="3"><bean:write name="USER_VALUE_OBJECT" property="customerTel" scope="session"/></td>
        </tr>
        <tr>
          <th>�X�֔ԍ�</th>
          <td id="customer-postcode-td" colspan="3">��<bean:write name="USER_VALUE_OBJECT" property="customerPost" scope="session"/></td>
        </tr>
        <tr>
          <th>�Z��</th>
          <td id="customer-address-td" colspan="3"><bean:write name="USER_VALUE_OBJECT" property="customerAdd" scope="session"/></td>
        </tr>
      </table>
    </logic:notEmpty>
<%-- representative end --%>

<%-- total amount start --%>
    <br/>
    <hr/>
    <table class="com-visible-table" id="charge-table" summary="�h�����׏��">
      <caption>��������</caption>
      <tr><th>�N�ߋ敪</th><th>�P��</th><th>�l��</th><th>����</th></tr>
      <tr>
        <td id="charge-age-td">��l</td>
        <td id="charge-price-td"><bean:write name="priceOutput" property="adultUnitPrice" format="###,###�~"/></td>
        <td id="charge-number-td"><bean:write name="priceOutput" property="adultCount" format="#�l"/></td>
        <td id="charge-charge-td"><bean:write name="priceOutput" property="adultPrice" format="###,###�~"/></td>
      </tr>
      <tr>
        <td id="charge-age-td">�q�ǂ�</td>
        <td id="charge-price-td"><bean:write name="priceOutput" property="childUnitPrice" format="###,###�~"/></td>
        <td id="charge-number-td"><bean:write name="priceOutput" property="childCount" format="#�l"/></td>
        <td id="charge-charge-td"><bean:write name="priceOutput" property="childPrice" format="###,###�~"/></td>
      </tr>
      <tr>
        <th colspan="3" >���v����</th>
        <td id="charge-total-charge-td"><bean:write name="priceOutput" property="sumPrice" format="###,###�~"/></td>
      </tr>
    </table>
    <br/>
<%-- ���L���� --%>
    <logic:notEmpty name="USER_VALUE_OBJECT" scope="session">
    <ts:form method="POST" action="SC_A01_01_03SCR.do" >
      <hr/>
      <table class="com-visible-table" id="special-affairs-table" summary="���ӌ����v�]">
        <caption>���L����</caption>
        <tr>
          <th>���ӌ��E���v�]</th>
          <td id="special-affairs-note-td"><html:text name="_uc_a01_01Form" property="remarks" size="120" tabindex="1"/><font id="comment-text">(80�����ȉ�)</font>
          <br/>���c�A�[�Ɋւ��邲�ӌ��E���v�]�Ȃǂ���܂�����A�����R�ɂ�������������</td>
        </tr>
      </table>
      <br/>
<%-- total amount end --%>
<%-- ���b�Z�[�W2 --%>
    <div class="com-message-panel" id="default-message-panel">
      <html:messages id="message" message="true">
        <p><bean:write name="message" ignore="true"/></p>
      </html:messages>
    </div>
<%-- �{�^�� --%>
    <br/>
      <table class="button-table" summary="�{�^���e�[�u��">
        <tr><td> </td><td><ts:submit value="�\�񂷂�" styleClass="long-button" tabindex="2"/>
        </td></tr></table>
    </ts:form>
    
    <table class="button-table" summary="�{�^���e�[�u��">
    <tr><td><ts:form method="POST" action="SC_A01_01_02DSP.do" >
      <ts:submit property="forward_returnSC_A01_01_01"
                 value="�c�A�[������ʂ֖߂�" styleClass="long-button" tabindex="3"/>
    </ts:form>
    </td></tr></table>
    </logic:notEmpty>
    
    <logic:empty name="USER_VALUE_OBJECT" scope="session">
<%-- ���b�Z�[�W2 --%>
    <div class="com-message-panel" id="default-message-panel">
      <html:messages id="message" message="true">
        <p><bean:write name="message" ignore="true"/></p>
      </html:messages>
    </div>
<%-- �{�^�� --%>
    <br/>
      <ts:form method="POST" action="SC_A01_01_02DSP.do" >
      <table class="button-table" summary="�{�^���e�[�u��">
        <tr><td> </td><td><ts:submit property="forward_login" 
                   value="���O�C������" styleClass="long-button" tabindex="1"/>
        </td></tr></table>
      <table class="button-table" summary="�{�^���e�[�u��">
        <tr><td><ts:submit property="forward_returnSC_A01_01_01" 
                   value="�c�A�[������ʂ֖߂�" styleClass="long-button" tabindex="2"/>
        </td></tr></table>
        <html:hidden property="returnCode" value="SC_A01_01_02"/>
      </ts:form>
    </logic:empty>

  </div>
</div>
<!-- end body-->

<!-- begin-footer -->
<%@ include file="../SC_A99_00_02.jspf" %>
<!-- end-footer -->

</html:html>