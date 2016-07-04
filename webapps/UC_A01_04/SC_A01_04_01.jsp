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
          <h1><span class="com-body-screen-name-text">�c�A�[�\��L�����Z���m�F���
          </span>(���ID: SC_A01_04_01)</h1>
      </div>
	</div>
 </div>

			<div class="com-body-panel" id="default-body-panel">
			<div id="navi-text-panel">
				<font id="navi-present-text">�L�����Z�����e�m�F</font>
				&nbsp;��&nbsp;<font id="navi-text">����</font>
			</div>
			<br/>
			 <div class="com-message-panel">
         		 ���L�̃c�A�[���L�����Z������ꍇ�́A��ʉ��́u�\����L�����Z������v�{�^���������Ă��������B
        	</div>	
				<br/>

				<table class="com-visible-table" id="tour-table" summary="�c�A�[�ڍ׏��">
					<caption>�c�A�[�\��ڍ׏��</caption>
					<tr>
						<th>�\��ԍ�</th>
						<td id="tour-reserve-code-td">
						<bean:write name="_uc_a01_04Form" property="reserveNo"/>
						</td>
						<th>�\�����ݓ�</th>
						<td id="tour-offer-day-td">
						<t:date name="_uc_a01_04Form" property="reserveDetail.reservedDay"
								pattern="yyyy�NMM��dd��"/>
						</td>
					</tr>
					
					
					<tr>
						<th>�c�A�[��</th>
						<td id="tour-name-td" colspan="3">
							<bean:write name="_uc_a01_04Form" property="reserveDetail.tourName"/>
						</td>
					</tr>
					<tr>
						<th>�o����</th>
						<td id="tour-starting-date-td">
						<t:date name="_uc_a01_04Form" property="reserveDetail.depDay"
								pattern="yyyy�NMM��dd��"/>
						</td>
						<th>����</th>
						<td id="tour-days-td">
							<bean:write name="_uc_a01_04Form" property="reserveDetail.tourDays"/>
						</td>
					</tr>
					<tr>
						<th>�o���n</th>
						<td id="tour-starting-point-td">
							<bean:write name="_uc_a01_04Form" property="reserveDetail.depName"/>
						</td>
						<th>�ړI�n</th>
						<td id="tour-destination-td">
							<bean:write name="_uc_a01_04Form" property="reserveDetail.arrName"/>
						</td>
					</tr>
					<tr>
						<th>�Y���</th>
						<td id="tour-conductor-td" colspan="3">
						<logic:equal name="_uc_a01_04Form" property="reserveDetail.conductor" value="true">
							�L
						</logic:equal>
						<logic:equal name="_uc_a01_04Form" property="reserveDetail.conductor" value="false">
							��
						</logic:equal>		
						</td>
					</tr>
					<tr>
						<th>�h���{��</th>
						<td id="tour-accommodations-td">
							<bean:write name="_uc_a01_04Form" property="reserveDetail.accomName"/>
						</td>
						<th>�A����</th>
						<td id="tour-accommodations-tel-td">
							<bean:write name="_uc_a01_04Form" property="reserveDetail.accomTel"/>
						</td>
					</tr>
					<tr>
						<th>�T�v</th>
						<td id="tour-summary-td" colspan="3">
						<t:write name="_uc_a01_04Form" property="reserveDetail.tourAbs" />
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
						<th id="customer-tel-th">�d�b�ԍ�</th>
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
						<t:write name="USER_VALUE_OBJECT" property="customerAdd" scope="session" />
						</td>
					</tr>
				</table>

<%-- representative end --%>
			
			<%-- total amount start --%>
		

			<br/>
			<hr/>
			<table class="com-visible-table" id="charge-table" summary="��������">
				<caption>��������</caption>
				<tr><th>�N�ߋ敪</th><th>�P��</th><th>�l��</th><th>����</th></tr>
				<tr>
					<td id="charge-age-td">��l</td>
					<td id="charge-price-td">
					<bean:write name="_uc_a01_04Form" property="price.adultUnitPrice" format="###,###�~"/>
					</td>
					<td id="charge-number-td">
					<bean:write name="_uc_a01_04Form" property="price.adultCount" format="##�l"/>
					</td>
					<td id="charge-charge-td">
					<bean:write name="_uc_a01_04Form" property="price.adultPrice" format="###,###�~"/>
					</td>
				</tr>
				<tr>
					<td id="charge-age-td">�q�ǂ�</td>
					<td id="charge-price-td">
					<bean:write name="_uc_a01_04Form" property="price.childUnitPrice" format="###,###�~"/>
					</td>
					<td id="charge-number-td">
					<bean:write name="_uc_a01_04Form" property="price.childCount" format="##�l"/>
					</td>
					<td id="charge-charge-td">
					<bean:write name="_uc_a01_04Form" property="price.childPrice" format="###,###�~"/>
					</td>
				</tr>
				<tr>
					<th colspan="3" >���v����</th>
					<td id="charge-total-charge-td">
					<bean:write name="_uc_a01_04Form" property="price.sumPrice"
					 			format="###,###�~"/>
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
					<t:write name="_uc_a01_04Form" property="reserveDetail.remarks"/>
					</td>
				</tr>
			</table>
	<div id="return-button-panel">

	<ts:form method="POST" action="/SC_A01_04_01DSP.do">
	<logic:equal name="_uc_a01_04Form" property="returnCode" value="SC_A01_02_01">
		<ts:submit property="forward_backpage1" styleClass="com-long-button" value="�O�̃y�[�W�ɖ߂�" tabindex="1"/>
	</logic:equal>
	<logic:equal name="_uc_a01_04Form" property="returnCode" value="SC_A01_02_02">		
		<ts:submit property="forward_backpage2" styleClass="com-long-button" value="�O�̃y�[�W�ɖ߂�" tabindex="1"/>
		</logic:equal>
	<ts:submit property="forward_cancel" styleClass="com-long-button" value="�\����L�����Z������" tabindex="2"/>	
	<html:hidden name="_uc_a01_04Form" property="reserveNo" />
		</ts:form>
	</div>
	<br/>
	<br/>
			
	</div>
	
<!-- end body-->
<%@ include file="../SC_A99_00_02.jspf" %>
</div>
</html:html>



