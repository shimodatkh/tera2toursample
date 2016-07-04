<%--
@(#)SC_A01_04_02.jsp
Copyright (C) 2007, 2010 NTT DATA Corporation. All Rights Reserved.:
Description : �c�A�[�\�񊮗���ʂ�\������


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
<bean:define id="tourDetail" name="_uc_a01_01Form" property="tourDetail"/>
<bean:define id="priceOutput" name="_uc_a01_01Form" property="priceOutput"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html:html locale="true">

<!-- begin header-->
<%@ include file="../SC_A99_00_01.jspf" %>
<!-- end header-->

<!-- begin body-->
	<div class="com-root-panel">
		<div class="com-body-title-panel">
			<div class="com-body-title-text-panel">
				<div class="com-body-screen-name-text">
					<h1>
						<span class="com-body-screen-name-text">
							�c�A�[�\��o�^�������
						</span>
						(���ID: SC_A01_01_04)
					</h1>
				</div>
			</div>
		</div>

		<div class="com-body-panel" id="default-body-panel">
  			<div id="navi-text-panel">
    			<font id="navi-text">�c�A�[����</font>&nbsp;��&nbsp;
    			<font id="navi-text">�c�A�[���m�F</font>&nbsp;��&nbsp;
    			<font id="navi-text">�\����e�m�F</font>&nbsp;��&nbsp;
    			<font id="navi-present-text">����</font>
  			</div>
 			<br/>
    
			<div class="com-message-panel" id="default-message-panel">
				�\����e���m�F���Ă��������B<br/>
     			���̎��A�uPDF���_�E�����[�h����v�{�^���������΁A�\�����PDF�t�@�C���ɂ��ĕۑ��o���܂��B
			</div>
			<br/>
			�x�������܂łɁA�U�������������͑����܂ŗ��������x�����������B<br/>
			�Ȃ��A�x�������܂łɗ��������x�������������Ȃ��ꍇ�́A<br/>
			�\����L�����Z�������Ă����������Ƃ��������܂��̂ŁA<br/>
			���炩���߂��������������B<br/>
			<br/>
			�\�񖾍ו[��PDF�`���Ń_�E�����[�h�ł��܂��B<br/>

			<div id="return-button-panel">
				<ts:form method="POST" action="/SC_A01_01_04DSP.do">
					<ts:submit property="forward_downloadPDF" 
						   	   styleClass="com-long-button" 
						   	   value="PDF���_�E�����[�h����" 
						   	   tabindex="2"/>
					<html:hidden name="_uc_a01_01Form" property="reserveNo" />
				</ts:form>
			</div>
			
			<table class="com-visible-table" id="payment-table" 
				   summary="�x�������">
				<caption>�x�����</caption>
				<tr>
					<th>�x�����@</th>
					<td id="payment-method-td" colspan="3">
						<bean:write name="_uc_a01_01Form" 
									property="paymentMethod"/>
					</td>
				</tr>
				<tr>
					<th>�U������</th>
					<td id="payment-account-td" colspan="3">
						<bean:write name="_uc_a01_01Form" 
									property="paymentCompanyName"/>
						<br/>
						<bean:write name="_uc_a01_01Form" 
									property="paymentAccount"/>
					</td>
				</tr>
				<tr>
					<th>�x������</th>
					<td id="payment-date-td" colspan="3">
						<t:date name="_uc_a01_01Form" property="paymentTimeLimit"
								pattern="yyyy�NMM��dd��"/>
					</td>
				</tr>
				<tr>
					<th>���⍇��</th>
					<td id="payment-inquiry-td" colspan="3">
						<bean:write name="_uc_a01_01Form" property="referenceName"/><br/>
						<bean:write name="_uc_a01_01Form" property="referenceTel"/><br/>
						<bean:write name="_uc_a01_01Form" property="referenceEmail"/>
					</td>
				</tr>
			</table>
			<br/>
			<hr/>
			<table class="com-visible-table" id="tour-table" 
				   summary="�z�e�����">
				<caption>�c�A�[�\��ڍ׏��</caption>
				<tr>
					<th>�\��ԍ�</th>
					<td id="tour-name-td">
						<bean:write name="_uc_a01_01Form" property="reserveNo"/>
					</td>
					<th>�\�����ݓ�</th>
						<td id="tour-starting-date-td">
							<t:date name="_uc_a01_01Form" property="reservedDay"
									pattern="yyyy�NMM��dd��"/>
						</td>
				</tr>
				<tr>
					<th>�c�A�[��</th>
					<td id="tour-name-td" colspan="3">
						<bean:write name="tourDetail" property="tourName"/>
					</td>
				</tr>
				<tr>
					<th>�o����</th>
					<td id="tour-starting-date-td">
						<t:date name="tourDetail" property="depDay"
								pattern="yyyy�NMM��dd��"/>
					</td>
					<th>����</th>
						<td id="tour-days-td">
							<bean:write name="tourDetail" 
										property="tourDays"/>
					</td>
				</tr>
				<tr>
					<th>�o���n</th>
					<td id="tour-starting-point-td">
						<bean:write name="tourDetail" property="depName"/>
					</td>
					<th>�ړI�n</th>
					<td id="tour-destination-td">
						<bean:write name="tourDetail" property="arrName"/>
					</td>
				</tr>
				<tr>
					<th>�Y���</th>
					<td id="tour-conductor-td" colspan="3">
						<logic:equal name="tourDetail" property="conductor" 
								 	 value="true">
							�L
						</logic:equal>
						<logic:equal name="tourDetail" property="conductor" 
									 value="false">
							��
						</logic:equal>		
					</td>
				</tr>
				<tr>
					<th>�h���{��</th>
					<td id="tour-accommodations-td">
						<bean:write name="tourDetail" property="accomName"/>
					</td>
					<th>�A����</th>
					<td id="tour-accommodations-tel-td">
						<bean:write name="tourDetail" property="accomTel"/>
					</td>
				</tr>
				<tr>
					<th>�T�v</th>
					<td id="tour-summary-td" colspan="3">
						<t:write name="tourDetail" property="tourAbs"/>
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
						<bean:write name="USER_VALUE_OBJECT" 
									property="customerCode" scope="session"/>
					</td>
				</tr>
				<tr>
					<th colspan="2">�t���K�i</th>
					<td id="customer-hurigana-td" colspan="3">
						<bean:write name="USER_VALUE_OBJECT" 
									property="customerKana" scope="session"/>
					</td>
				</tr>
				<tr>
					<th colspan="2">����</th>
					<td id="customer-name-td" colspan="3">
						<bean:write name="USER_VALUE_OBJECT" 
									property="customerName" scope="session"/>
					</td>
				</tr>
				<tr>
					<th colspan="2">���N����</th>
					<td id="customer-birth-td" colspan="3">
						<t:date name="USER_VALUE_OBJECT" 
								property="customerBirth" scope="session"
								pattern="yyyy�NMM��dd��"/>
					</td>
				</tr>
				<tr>
					<th colspan="2">�E��</th>
					<td id="customer-job-td" colspan="3">
						<bean:write name="USER_VALUE_OBJECT" 
									property="customerJob" scope="session"/>
					</td>
				</tr>
				<tr>
					<th colspan="2">E���[��</th>
					<td id="customer-email-td" colspan="3">
						<bean:write name="USER_VALUE_OBJECT" 
									property="customerMail" scope="session"/>
					</td>
				</tr>
				<tr>
					<th rowspan="3">�A����</th>
					<th>�d�b�ԍ�</th>
					<td id="customer-tel-td">
						<bean:write name="USER_VALUE_OBJECT" 
									property="customerTel" scope="session"/>
					</td>
				</tr>
				<tr>
					<th>�X�֔ԍ�</th>
					<td id="customer-postcode-td">
						��<bean:write name="USER_VALUE_OBJECT" 
									  property="customerPost" scope="session"/>
					</td>
				</tr>
				<tr>
					<th>�Z��</th>
					<td id="customer-address-td">
						<bean:write name="USER_VALUE_OBJECT" 
									property="customerAdd" scope="session"/>
					</td>
				</tr>
			</table>

<%-- representative end --%>
			
			<%-- total amount start --%>
			<br/>
			<hr/>
			<table class="com-visible-table" id="charge-table" summary="�������׏��">
				<caption>��������</caption>
				<tr><th>�N�ߋ敪</th><th>�P��</th><th>�l��</th><th>����</th></tr>
				<tr>
					<td id="charge-age-td">��l</td>
					<td id="charge-price-td">
					<bean:write name="priceOutput" property="adultUnitPrice" format="###,###�~"/>
					</td>
					<td id="charge-number-td">
					<bean:write name="priceOutput" property="adultCount" format="##�l"/>
					</td>
					<td id="charge-charge-td">
					<bean:write name="priceOutput" property="adultPrice" format="###,###�~"/>
					</td>
				</tr>
				<tr>
					<td id="charge-age-td">�q�ǂ�</td>
					<td id="charge-price-td">
					<bean:write name="priceOutput" property="childUnitPrice" format="###,###�~"/>
					</td>
					<td id="charge-number-td">
					<bean:write name="priceOutput" property="childCount" format="##�l"/>
					</td>
					<td id="charge-charge-td">
					<bean:write name="priceOutput" property="childPrice" format="###,###�~"/>
					</td>
				</tr>
				<tr>
					<th colspan="3" >���v����</th>
					<td id="charge-total-charge-td">
					<bean:write name="priceOutput" property="sumPrice" format="###,###�~"/>
					</td>
				</tr>
			</table>
			
			<br/>
			<hr/>
	    	<table class="com-visible-table" id="tour-table" 
	    		   summary="���ӌ����v�]">
				<caption>���L����</caption>
				<tr>
					<th>���ӌ��E���v�]</th>
					<td id="special-affairs-note-td">
						<t:write name="_uc_a01_01Form" property="remarks" />
					</td>
				</tr>
			</table>
		<br/>
	<div id="return-button-panel">
		<ts:form method="POST" action="/SC_A01_01_04DSP.do">
			<ts:submit property="forward_returnSC_A01_01_01" 
					   styleClass="com-long-button" value="�c�A�[������ʂɖ߂�" 
					   tabindex="1"/>
			<ts:submit property="forward_returnMenu" 
					   styleClass="com-long-button" value="���j���[��ʂɖ߂�" 
					   tabindex="3"/>
			<html:hidden name="_uc_a01_01Form" property="reserveNo" />
		</ts:form>
	</div>
  </div>
</div>
<!-- end body-->

<!-- begin footer-->
<%@ include file="../SC_A99_00_02.jspf" %>
<!-- end footer -->

</html:html>

