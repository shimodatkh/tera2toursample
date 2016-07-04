<%--
@(#)SC_A01_02_02.jsp
Copyright (C) 2007, 2010 NTT DATA Corporation. All Rights Reserved.:
Description : �c�A�[�\��ڍ׉�ʂ�\������


--%>

<%@page contentType="text/html; charset=Windows-31J" language="java" pageEncoding="Windows-31J" %>

<%@ taglib uri="/struts-html" prefix="html"%>
<%@ taglib uri="/struts-bean" prefix="bean"%>
<%@ taglib uri="/struts-logic" prefix="logic"%>
<%@ taglib uri="/terasoluna" prefix="t"%>
<%@ taglib uri="/terasoluna-struts" prefix="ts"%>
<%@ taglib uri="/common" prefix="common"%>

<bean:define id="menuButtonFlag" scope="page" value="false"/>
<bean:define id="loginButtonFlag" scope="page" value="true"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html:html locale="true">
<%@ include file="../SC_A99_00_01.jspf" %>

<!-- begin body-->
 <div class="com-root-panel">
 <div class="com-body-title-panel">
 	<div class="com-body-title-text-panel">
      <div class="com-body-screen-name-text">
          <h1><span class="com-body-screen-name-text">�c�A�[�\��ڍ׉��
          </span>(���ID: SC_A01_02_02)</h1>
      </div>
	</div>
 </div>
  <div class="com-body-panel" id="default-body-panel">
    <div id="navi-text-panel">
      <font id="navi-text">�\��ꗗ���m�F</font>&nbsp;��&nbsp;
      <font id="navi-present-text">�\��̏ڍׂ��m�F</font>
    </div>
  <br/>
<div class="com-message-panel">
	���\�񂢂��������c�A�[�̏ڍ׏������m�F���������B<br/>
</div>
<logic:equal name="_uc_a01_02Form" property="reserveDetail.transfer" value="false">
<br/>
	�x�������܂łɁA�U�������������͑����܂ŗ��������x�����������B<br/>
	�Ȃ��A�x�������܂łɗ��������x�������������Ȃ��ꍇ�́A<br/>
	�\����L�����Z�������Ă����������Ƃ��������܂��̂ŁA<br/>
	���炩���߂��������������B<br/>
</logic:equal>
<logic:equal name="_uc_a01_02Form" property="reserveDetail.transfer" value="true">
<br/>
  ���̂��\��͂��łɗ��������x�������������Ă���܂��B<br/>
  ��ϐ\���󂠂�܂��񂪁A�E�F�u����̕ύX�A�L�����Z���͏����Ă���܂���B<br/>
  ���萔�ł����ύX�A�L�����Z���̂��葱���͓d�b(01-2345-6789)�A�܂��͑����ɂĂ��⍇�����������B<br/>
</logic:equal>
<br/>
	���̏��͂o�c�e�Ń_�E�����[�h�ł��܂��B
<br/>
			<div id="return-button-panel">
				<ts:form method="POST" action="/SC_A01_02_02DSP.do">
					<ts:submit property="forward_downloadPDF" 
						   	   styleClass="com-long-button" 
						   	   value="PDF���_�E�����[�h����" 
						   	   tabindex="1"/>
					<html:hidden name="_uc_a01_02Form" property="reserveNo"/>
				</ts:form>
			</div>

<logic:equal name="_uc_a01_02Form" property="reserveDetail.transfer" value="false">
	<table class="com-visible-table" id="payment-table" summary="�����ڍ�">
		<caption>�x�����</caption>
		<tr>
			<th>�x�����@</th>
			<td id="payment-method-td" colspan="3">
			<bean:write name="_uc_a01_02Form" property="paymentMethod"/>
			</td>
		</tr>
		<tr>
			<th>�U������</th>
			<td id="payment-account-td" colspan="3">
			<bean:write name="_uc_a01_02Form" property="paymentCompanyName"/>
			<br/>
			<bean:write name="_uc_a01_02Form" property="paymentAccount"/>
			</td>
		</tr>
		<tr>
			<th>�x������</th>
			<td id="payment-date-td" colspan="3">
					<t:date name="_uc_a01_02Form" property="reserveDetail.paymentTimeLimit"
							pattern="yyyy�NMM��dd��"/>
			</td>
		</tr>
		<tr>
			<th>���⍇��</th>
			<td id="payment-inquiry-td" colspan="3">
				<bean:write name="_uc_a01_02Form" property="referenceName"/>
				<br/>
				<bean:write name="_uc_a01_02Form" property="referenceEmail"/>
				<br/>
				<bean:write name="_uc_a01_02Form" property="referenceTel"/>
			</td>
		</tr>
	</table>
	<br/>
	
	<hr/>
</logic:equal>
	<table class="com-visible-table" id="tour-table" summary="�z�e�����">
		<caption>�c�A�[�\��ڍ׏��</caption>
		<tr>
			<th>�\��ԍ�</th>
			<td id="tour-name-td">
			<bean:write name="_uc_a01_02Form" property="reserveNo"/>
			</td>
			<th>�\�����ݓ�</th>
			<td id="tour-starting-date-td">
			<t:date name="_uc_a01_02Form" property="reserveDetail.reservedDay"
					pattern="yyyy�NMM��dd��"/>
			</td>
		</tr>
		
		<tr>
			<th>�c�A�[��</th>
			<td id="tour-name-td" colspan="3">
				<bean:write name="_uc_a01_02Form" property="reserveDetail.tourName"/>
			</td>
		</tr>
		<tr>
			<th>�o����</th>
			<td id="tour-starting-date-td">
			<t:date name="_uc_a01_02Form" property="reserveDetail.depDay"
					pattern="yyyy�NMM��dd��"/>
			</td>
			<th>����</th>
			<td id="tour-days-td">
				<bean:write name="_uc_a01_02Form" property="reserveDetail.tourDays"/>
			</td>
		</tr>
		<tr>
			<th>�o���n</th>
			<td id="tour-starting-point-td">
				<bean:write name="_uc_a01_02Form" property="reserveDetail.depName"/>
			</td>
			<th>�ړI�n</th>
			<td id="tour-destination-td">
				<bean:write name="_uc_a01_02Form" property="reserveDetail.arrName"/>
			</td>
		</tr>
		<tr>
			<th>�Y���</th>
			<td id="tour-conductor-td" colspan="3">
			<logic:equal name="_uc_a01_02Form" property="reserveDetail.conductor" value="true">
				�L
			</logic:equal>
			<logic:equal name="_uc_a01_02Form" property="reserveDetail.conductor" value="false">
				��
			</logic:equal>		
			</td>
		</tr>
		<tr>
			<th>�h���{��</th>
			<td id="tour-accommodations-td">
				<bean:write name="_uc_a01_02Form" property="reserveDetail.accomName"/>
			</td>
			<th>�A����</th>
			<td id="tour-accommodations-tel-td">
				<bean:write name="_uc_a01_02Form" property="reserveDetail.accomTel"/>
			</td>
		</tr>
		<tr>
			<th>�T�v</th>
			<td id="tour-summary-td" colspan="3">
			<t:write name="_uc_a01_02Form" property="reserveDetail.tourAbs"/>
			</td>
		</tr>
	</table>
	<br/>

<!-- representative -->
	<hr/>
	<table class="com-visible-table" id="customer-table" summary="��\�ҏ��">
		<caption>��\��</caption>
		<tr>
			<th colspan="2">���ID</th>
			<td id="customer-id-td" colspan="3">
				<bean:write name="USER_VALUE_OBJECT" property="customerCode" scope="session"/>
			</td>
		</tr>
		<tr>
			<th colspan="2">�t���K�i</th>
			<td id="customer-hurigana-td" colspan="3">
			<bean:write name="USER_VALUE_OBJECT" property="customerKana" scope="session"/>
			</td>
		</tr>
		<tr>
			<th colspan="2">����</th>
			<td id="customer-name-td" colspan="3">
			<bean:write name="USER_VALUE_OBJECT" property="customerName" scope="session"/>
			</td>
		</tr>
		<tr>
			<th colspan="2">���N����</th>
			<td id="customer-birth-td" colspan="3">
			<t:date name="USER_VALUE_OBJECT" property="customerBirth" scope="session"
					pattern="yyyy�NMM��dd��"/>
			</td>
		</tr>
		<tr>
			<th colspan="2">�E��</th>
			<td id="customer-job-td" colspan="3">
			<bean:write name="USER_VALUE_OBJECT" property="customerJob" scope="session"/>
			</td>
		</tr>
		<tr>
			<th colspan="2">E���[��</th>
			<td id="customer-email-td" colspan="3">
			<bean:write name="USER_VALUE_OBJECT" property="customerMail" scope="session"/>
			</td>
		</tr>
		<tr>
			<th rowspan="3">�A����</th>
			<th >�d�b�ԍ�</th>
			<td id="customer-tel-td">
			<bean:write name="USER_VALUE_OBJECT" property="customerTel" scope="session"/>
			</td>
		</tr>
		<tr>
			<th>�X�֔ԍ�</th>
			<td id="customer-postcode-td">
			��<bean:write name="USER_VALUE_OBJECT" property="customerPost" scope="session"/>
			</td>
		</tr>
		<tr>
			<th>�Z��</th>
			<td id="customer-address-td">
			<bean:write name="USER_VALUE_OBJECT" property="customerAdd" scope="session"/>
			</td>
		</tr>
	</table>

<%-- representative end --%>
			
	<%-- total amount start --%>


	<br/>
	<hr/>
	<table class="com-visible-table" id="charge-table" summary="�h�����׏��">
		<caption>��������</caption>
		<tr><th>�N�ߋ敪</th><th>�P��</th><th>�l��</th><th>����</th></tr>
		<tr>
			<td id="charge-age-td">��l</td>
			<td id="charge-price-td">
			<bean:write name="_uc_a01_02Form" property="price.adultUnitPrice" format="###,###�~"/>
			</td>
			<td id="charge-number-td">
			<bean:write name="_uc_a01_02Form" property="price.adultCount" format="###�l"/>
			</td>
			<td id="charge-charge-td">
			<bean:write name="_uc_a01_02Form" property="price.adultPrice" format="###,###�~"/>
			</td>
		</tr>
		<tr>
			<td id="charge-age-td">���ǂ�</td>
			<td id="charge-price-td">
			<bean:write name="_uc_a01_02Form" property="price.childUnitPrice" format="###,###�~"/>
			</td>
			<td id="charge-number-td">
			<bean:write name="_uc_a01_02Form" property="price.childCount" format="###�l"/>
			</td>
			<td id="charge-charge-td">
			<bean:write name="_uc_a01_02Form" property="price.childPrice" format="###,###�~"/>
			</td>
		</tr>
		<tr>
			<th colspan="3" >���v����</th>
			<td id="charge-total-charge-td">
			<bean:write name="_uc_a01_02Form" property="price.sumPrice" format="###,###�~"/>
			</td>
		</tr>
	</table>
	
		<br/>
	<hr/>
	<table class="com-visible-table" id="tour-table" summary="���ӌ����v�]">
		<caption>���L����</caption>
		<tr>
			<th>���ӌ��E���v�]</th>
			<td id="special-affairs-note-td">
				<bean:write name="_uc_a01_02Form" property="reserveDetail.remarks"/>
			</td>
		</tr>
	</table>
<!-- comment end -->

	
	
<br/>
<br/>
		
	<div id="return-button-panel">

	<ts:form action="/SC_A01_02_02DSP.do" method="POST">
		<ts:submit property="forward_reservationList" styleClass="com-long-button" value="�c�A�[�\��Ɖ��ʂɖ߂�" tabindex="2"/>
		<logic:equal name="_uc_a01_02Form" property="limitExcessFlag" value="false">
		<logic:equal name="_uc_a01_02Form" property="reserveDetail.transfer" value="false">
			<ts:submit property="forward_change" styleClass="com-long-button" value="�\���ύX����" tabindex="3"/>
			<ts:submit property="forward_cancel" styleClass="com-long-button" value="�\����L�����Z������" tabindex="4"/>	
		</logic:equal>
		</logic:equal>
	<html:hidden name="_uc_a01_02Form" property="reserveNo"/>
	<html:hidden property="returnCode" value="SC_A01_02_02"/>
	</ts:form>

	</div>
	<br/>
	<br/>
	

</div>
</div>
<!-- end body-->
<%@ include file="../SC_A99_00_02.jspf" %>

</html:html>

