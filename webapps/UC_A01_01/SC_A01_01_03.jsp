<%--
@(#)SC_A01_01_03.jsp
Copyright (C) 2007, 2010 NTT DATA Corporation. All Rights Reserved.:
Description : �c�A�[�\��o�^�m�F��ʂ�\������


--%>
<%@page contentType="text/html; charset=Windows-31J" language="java" pageEncoding="Windows-31J" %>

<%@ taglib uri="/struts-html" prefix="html"%>
<%@ taglib uri="/struts-bean" prefix="bean"%>
<%@ taglib uri="/struts-logic" prefix="logic"%>
<%@ taglib uri="/terasoluna" prefix="t"%>
<%@ taglib uri="/terasoluna-struts" prefix="ts"%>
<%@ taglib uri="/common" prefix="common"%>

<bean:define id="menuButtonFlag" scope="page" value="false"/>
<bean:define id="loginButtonFlag" scope="page" value="false"/>
<bean:define id="tourDetail" name="_uc_a01_01Form" property="tourDetail"/>
<bean:define id="priceOutput" name="_uc_a01_01Form" property="priceOutput"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html:html locale="true">

<!-- begin header-->
<%@ include file="../SC_A99_00_01.jspf" %>
<!-- end header-->

<!-- begin�m�F���body�� -->
<div class="com-body-title-panel">
  <div class="com-body-title-text-panel">
    <h1><span class="com-body-screen-name-text">�c�A�[�\��o�^�m�F���</span>(���ID: SC_A01_01_03)</h1>
  </div>
</div>

<div class="com-body-panel" id="default-body-panel">
  <div id="navi-text-panel">
    <font id="navi-text">�c�A�[����</font>&nbsp;��&nbsp;
    <font id="navi-text">�c�A�[���m�F</font>&nbsp;��&nbsp;
    <font id="navi-present-text">�\����e�m�F</font>&nbsp;��&nbsp;
    <font id="navi-text">����</font>
  </div>
  <br/>

  <div class="com-message-panel" id="default-message-panel">
    �\����e���m�F������A��ʉ����́u�\����m�肷��v�{�^���������ĉ������B<br/><br/>
	�����͂������������͈ȉ��̂Ƃ���ł��B
  </div>
  <br/>

<!-- �c�A�[�\��ڍ׏��e�[�u�� -->
  <table class="com-visible-table" id="tour-table" summary="�c�A�[�\��ڍ׏��">
    <caption>�c�A�[�\��ڍ׏��</caption>
    <tr>
      <th>�c�A�[��</th>
      <td id="tour-name-td" colspan="3">
        <bean:write name="tourDetail" property="tourName" ignore="true" />
      </td>
    </tr>
    <tr>
      <th>�o����</th>
      <td id="tour-starting-date-td">
        <t:date name="tourDetail" property="depDay" ignore="true" pattern="yyyy�NMM��dd��" />
      </td>
      <th>����</th>
      <td id="tour-days-td">
        <bean:write name="tourDetail" property="tourDays" ignore="true" />
      </td>
    </tr>
    <tr>
      <th>�o���n</th>
      <td id="tour-starting-point-td">
        <bean:write name="tourDetail" property="depName" ignore="true" />
      </td>
      <th>�ړI�n</th>
      <td id="tour-destination-td">
        <bean:write name="tourDetail" property="arrName" ignore="true" />
      </td>
    </tr>
�@�@<tr>
      <th>�Y���</th>
      <td id="tour-conductor-td" colspan="3">
        <logic:equal name="tourDetail" property="conductor" value="true">
          �L
        </logic:equal>
        <logic:equal name="tourDetail" property="conductor" value="false">
          ��
        </logic:equal>
      </td>
    </tr>                    
    <tr>
      <th>�h���{��</th>
      <td id="tour-accommodations-td">
        <bean:write name="tourDetail" property="accomName" ignore="true" />
      </td>
      <th>�A����</th>
      <td id="tour-accommodations-tel-td">
        <bean:write name="tourDetail" property="accomTel" ignore="true" />
      </td>
    </tr>
    <tr>
      <th>�T�v</th>
      <td id="tour-summary-td" colspan="3">
        <t:write name="tourDetail" property="tourAbs" ignore="true" />
      </td>
    </tr>
  </table>
<!-- �c�A�[�\��ڍ׏��e�[�u�� �I�� -->

  <br/>
  <hr class="com-float-clear"/>
                
<!-- ��\�҃e�[�u�� -->
  <table class="com-visible-table" id="customer-table" summary="��\�ҏ��">
    <caption>��\��</caption>
    <tr>
      <th colspan="2">���ID</th>
      <td id="customer-id-td" colspan="3">
        <bean:write name="USER_VALUE_OBJECT" property="customerCode" ignore="true" scope="session"/>
      </td>
    </tr>
    <tr>
      <th colspan="2">�t���K�i</th>
      <td id="customer-hurigana-td" colspan="3">
        <bean:write name="USER_VALUE_OBJECT" property="customerKana" ignore="true" scope="session"/>
      </td>
    </tr>
    <tr>
      <th colspan="2">����</th>
      <td id="customer-name-td" colspan="3">
        <bean:write name="USER_VALUE_OBJECT" property="customerName" ignore="true" scope="session"/>
      </td>
    </tr>
    <tr>
      <th colspan="2">���N����</th>
      <td id="customer-birth-td" colspan="3">
        <bean:write name="USER_VALUE_OBJECT" property="customerBirth" format="yyyy�NMM��dd��" ignore="true" scope="session"/>
      </td>
    </tr>
    <tr>
      <th colspan="2">�E��</th>
      <td id="customer-job-td" colspan="3">
        <bean:write name="USER_VALUE_OBJECT" property="customerJob" ignore="true" scope="session"/>
      </td>
    </tr>
    <tr>
      <th colspan="2">E���[��</th>
      <td colspan="3" id="customer-email-td">
        <bean:write name="USER_VALUE_OBJECT" property="customerMail" ignore="true" scope="session"/>
      </td>
    </tr>
    <tr>
      <th rowspan="3">�A����</th>
      <th>�d�b�ԍ�</th>
      <td id="customer-tel-td">
        <bean:write name="USER_VALUE_OBJECT" property="customerTel" ignore="true" scope="session"/>
      </td>
    </tr>
    <tr>
      <th>�X�֔ԍ�</th>
      <td id="customer-postcode-td">
        ��<bean:write name="USER_VALUE_OBJECT" property="customerPost" ignore="true" scope="session"/>
      </td>
    </tr>
    <tr>
      <th>�Z��</th>
      <td id="customer-address-td">
        <bean:write name="USER_VALUE_OBJECT" property="customerAdd" ignore="true" scope="session"/>
      </td>
    </tr>
  </table>
<!-- ��\�҃e�[�u�� �I�� -->
                
  <br/>
  <hr class="com-float-clear"/>
                
<!-- �������׃e�[�u�� -->
  <table class="com-visible-table" id="charge-table" summary="�������׏��">
    <caption>��������</caption>
    <tr><th>�N�ߋ敪</th><th>�P��</th><th>�l��</th><th>����</th></tr>
    <tr>
      <td id="charge-age-td">��l</td>
      <td id="charge-price-td">
        <bean:write name="priceOutput" property="adultUnitPrice" ignore="true" format="###,###�~" />
      </td>
      <td id="charge-number-td">
        <bean:write name="priceOutput" property="adultCount" ignore="true" format="#�l" />
      </td>
      <td id="charge-charge-td">
        <bean:write name="priceOutput" property="adultPrice" ignore="true" format="###,###�~" />
      </td>
    </tr>
    <tr>
      <td id="charge-age-td">�q�ǂ�</td>
      <td id="charge-price-td">
        <bean:write name="priceOutput" property="childUnitPrice" ignore="true" format="###,###�~" />
      </td>
      <td id="charge-number-td">
        <bean:write name="priceOutput" property="childCount" ignore="true" format="#�l" />
      </td>
      <td id="charge-charge-td">
        <bean:write name="priceOutput" property="childPrice" ignore="true" format="###,###�~" />
      </td>
    </tr>
    <tr>
      <th colspan="3">���v����</th>
      <td id="charge-total-charge-td">
        <bean:write name="priceOutput" property="sumPrice" ignore="true" format="###,###�~" />
      </td>
    </tr>
  </table>
<!-- �������׃e�[�u�� �I�� -->
                
  <br/>
  <hr class="com-float-clear"/>

<!-- ���L���� -->
  <table class="com-visible-table" id="special-affairs-table" summary="���ӌ����v�]">
    <caption>���L����</caption>
    <tr>
      <th>���ӌ��E���v�]</th>
      <td id="special-affairs-note-td">
        <bean:write name="_uc_a01_01Form" property="remarks" ignore="true" />
      </td>
    </tr>
  </table>
<!-- total amount end -->     
  <br/>

  <div id="confirm-button-panel">
    <ts:form method="post" action="/SC_A01_01_03DSP.do" >
      <ts:submit property="forward_returnSC_A01_01_02" value="�c�A�[�ڍ׉�ʂɖ߂�" styleClass="com-long-button" tabindex="1"/>
      <ts:submit property="forward_decided" value="�\����m�肷��" styleClass="com-long-button" tabindex="2"/>
    </ts:form>                
  </div>
  <br/>
  <br/>
</div>
<!-- end body-->
<!-- end�m�F���body�� -->

<!-- begin footer-->
<%@ include file="../SC_A99_00_02.jspf" %>
<!-- end footer -->

</html:html>