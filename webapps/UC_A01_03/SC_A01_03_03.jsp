<%--
@(#)SC_A01_03_02.jsp
Copyright (C) 2007, 2010 NTT DATA Corporation. All Rights Reserved.:
Description : �c�A�[�\��ύX������ʂ�\������


--%>

<%@page contentType="text/html; charset=Windows-31J" language="java" pageEncoding="Windows-31J"%>

<%@ taglib uri="/struts-html" prefix="html"%>
<%@ taglib uri="/struts-bean" prefix="bean"%>
<%@ taglib uri="/struts-logic" prefix="logic"%>
<%@ taglib uri="/terasoluna" prefix="t"%>
<%@ taglib uri="/terasoluna-struts" prefix="ts"%>
<%@ taglib uri="/common" prefix="common"%>

<bean:define id="cssFileName" scope="page" value="UC_A01_03/SC_A01_03_03.css" />
<bean:define id="menuButtonFlag" scope="page" value="true" />
<bean:define id="loginButtonFlag" scope="page" value="true" />
<bean:define id="reserveDetail" name="_uc_a01_03Form" property="reserveDetail"/>
<bean:define id="price" name="_uc_a01_03Form" property="price"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html:html locale="true">

<!-- begin header-->
<%@ include file="../SC_A99_00_01.jspf"%>
<!-- end header-->

<div class="com-root-panel">
  <!-- begin title -->
    <div class="com-body-title-panel">
      <div class="com-body-title-text-panel">
        <div class="com-body-screen-name-text">
          <h1><span class="com-body-screen-name-text">�c�A�[�\��ύX�������</span>(���ID:SC_A01_03_03)</h1>
        </div>
      </div>
    </div>
  <!-- end title --> 

  <!-- begin body-->
  <div class="com-body-panel">
  <div id="navi-text-panel"><font id="navi-text">�ύX���e����</font>
  &nbsp;��&nbsp;<font id="navi-text">���͓��e�m</font>
  &nbsp;��&nbsp;<font id="navi-present-text">����</font>
  </div>
  <br/>
    <!-- begin message -->
    <div class="com-message-panel">
    �\��̕ύX���������܂����B<br/>
    �ύX���ꂽ���͉��L�̂悤�ɂȂ��Ă���܂��B���m�F���������B</div>
    <!-- end message -->
    
        <!-- begin postfix -->
    <p>
    �x�������܂łɁA�U�������������͑����܂ŗ��������x�����������B<br/>
    �Ȃ��A�x�������܂łɗ��������x�������������Ȃ��ꍇ�́A<br/>
    �\����L�����Z�������Ă����������Ƃ��������܂��̂ŁA<br/>
    ���炩���߂��������������B<br/>
    </p>
    <p>���̏��͂o�c�e�Ń_�E�����[�h�ł��܂��B</p>
    <!-- end postfix --> 
    
     <div class="button">
    <ts:form method="post" action="/SC_A01_03_03DSP.do">
        <!-- �\��ԍ� -->
        <html:hidden name="_uc_a01_03Form" property="reserveNo"/>
        <!-- PDF���_�E�����[�h -->
        <html:submit property="forward_downloadPDF" value="PDF���_�E�����[�h����" styleClass="com-long-button"/>
    </ts:form>
    </div>
    
    <table class="com-visible-table" id="payment-table" summary="�x�����">
      <caption>�x�����</caption>
      <tr>
        <th id="com-hotel-code-th">�x�����@</th>
        <td id="payment-method-td" colspan="3">
          <bean:write name="_uc_a01_03Form" property="paymentMethod" ignore="true"/>
        </td>
      </tr>
      <tr>
        <th id="com-hotel-code-th">�U������</th>
        <td id="payment-account-td" colspan="3">
          <bean:write name="_uc_a01_03Form" property="paymentCompanyName" ignore="true"/><br/>
          <bean:write name="_uc_a01_03Form" property="paymentAccount" ignore="true"/>
        </td>
      </tr>
      <tr>
        <th id="com-hotel-code-th">�x������</th>
        <td id="payment-date-td" colspan="3">
          <font id="paymentTimeLimit-text"><t:date name="reserveDetail" property="paymentTimeLimit" pattern="yyyy�NMM��dd��" ignore="true"/></font>
        </td>
      </tr>
      <tr>
        <th id="com-hotel-code-th">���⍇��</th>
        <td id="payment-inquiry-td" colspan="3">
          <bean:write name="_uc_a01_03Form" property="referenceName" ignore="true"/><br/>
          <bean:write name="_uc_a01_03Form" property="referenceEmail" ignore="true"/><br/>
          <bean:write name="_uc_a01_03Form" property="referenceTel" ignore="true"/>
        </td>
      </tr>
    </table>
    <br/>
    
    <hr/>
    
    <table class="com-visible-table" id="tour-table" summary="�\�񖾍�" >
      <caption>�c�A�[�\����</caption>
      <tr>
        <th>�\��ԍ�</th>
        <td id="tour-reserve-code-td">
          <bean:write name="_uc_a01_03Form" property="reserveNo" ignore="true"/>
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
        <td id="tour-starting-date-td" colspan="3">
          <t:date name="reserveDetail" property="depDay" pattern="yyyy�NMM��dd��" ignore="true"/>
        </td>
      </tr>
      <tr>
        <th>����</th>
        <td id="tour-days-td" colspan="3">
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
    </table>
    
    <br/>
    <hr/>
    
    <table class="com-visible-table" id="charge-table" summary="�����ڍ�">
      <caption>��������</caption>
      <tr>
        <th id="com-lodging-period-th">�N��敪</th>
        <th id="com-lodging-period-th">�P��</th>
        <th id="com-lodging-period-th">�l��</th>
        <th id="com-lodging-period-th">����</th>
      </tr>
      <tr>
        <td id="charge-age-td">��l</td>
        <td id="charge-price-td">
          <bean:write name="price" property="adultUnitPrice" format="###,###�~" ignore="true"/>
        </td>
        <td id="charge-number-td">
          <bean:write name="price" property="adultCount" format="###�l" ignore="true"/>
        </td>
        <td id="charge-charge-td">
          <bean:write name="price" property="adultPrice" format="###,###�~" ignore="true"/>
        </td>
      </tr>
      <tr>
        <td id="charge-age-td">�q�ǂ�</td>
        <td id="charge-price-td">
          <bean:write name="price" property="childUnitPrice" format="###,###�~" ignore="true"/>
        </td>
        <td id="charge-number-td">
          <bean:write name="price" property="childCount" format="###�l" ignore="true"/>
        </td>
        <td id="charge-charge-td">
          <bean:write name="price" property="childPrice" format="###,###�~" ignore="true"/>
        </td>
      </tr>
      <tr>
        <th colspan="3">���v����</th>
        <td id="charge-total-charge-td">
          <bean:write name="price" property="sumPrice" format="###,###�~" ignore="true"/>
        </td>
      </tr>
    </table>
     
    <br/>
    <hr/>
    
    <table class="com-visible-table" id="special-affairs-table" summary="���ӌ����v�]">
      <caption>���L����</caption>
      <tr>
        <th>���ӌ����v�]</th>
        <td id="special-affairs-note-td">
          <bean:write name="reserveDetail" property="remarks" ignore="true"/>
        </td>
      </tr>
    </table>    
    <br/>
    <br/>
    
    <div class="com-message-panel">��L�̂悤�ɗ\���ύX���܂����B</div>

    <!-- start button -->
    <div class="button">
      <ts:form method="post" action="/SC_A01_03_03DSP.do">
        <!-- �c�A�[�\��Ɖ��ʂɑJ�� -->
        <html:submit property="forward_reservationList" value="�c�A�[�\��Ɖ��ʂɖ߂�" styleClass="com-long-button"/>
        &nbsp;
        <!-- ���j���[��ʂɑJ�� -->
        <html:submit property="forward_menu" value="���j���[��ʂɖ߂�" styleClass="com-long-button"/>
      </ts:form>
    </div>
  <!-- end button -->
  </div>
</div>
<!-- end body-->
<!-- begin footer-->
<%@ include file="../SC_A99_00_02.jspf"%>
<!-- end footer -->
</html:html>