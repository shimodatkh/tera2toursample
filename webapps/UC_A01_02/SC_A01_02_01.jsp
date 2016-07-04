<%--
@(#)SC_A01_02_01.jsp
Copyright (C) 2007, 2010 NTT DATA Corporation. All Rights Reserved.:
Description : �c�A�[�\��Ɖ��ʂ�\������


--%>

<%@page contentType="text/html; charset=Windows-31J" language="java" pageEncoding="Windows-31J" %>

<%@ taglib uri="/struts-html" prefix="html"%>
<%@ taglib uri="/struts-bean" prefix="bean"%>
<%@ taglib uri="/struts-logic" prefix="logic"%>
<%@ taglib uri="/terasoluna" prefix="t"%>
<%@ taglib uri="/terasoluna-struts" prefix="ts"%>
<%@ taglib uri="/common" prefix="common"%>

<bean:define id="cssFileName" scope="page" value="UC_A01_02/SC_A01_02_01.css"/>
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
        <h1><span class="com-body-screen-name-text">�c�A�[�\��Ɖ���
            </span>(���ID: SC_A01_02_01)</h1>
      </div>
	</div>
  </div>
  <div class="com-body-panel" id="default-body-panel">
    <div id="navi-text-panel">
      <font id="navi-present-text">�\��ꗗ���m�F</font>&nbsp;��&nbsp;
      <font id="navi-text">�\��̏ڍׂ��m�F</font>
    </div>
  <br/>
  <logic:notEqual name="_uc_a01_02Form" property="reservationsCount" value="0">  
  <div class="com-message-panel">
    ���݁A���\�񂢂������Ă���c�A�[�̏ڍ׉{���A�ύX�A�L�����Z����<br/>
   �u�\��ڍׂ�����v�u�\���ύX����v�u�\����L�����Z������v<br/>
    �����ꂼ�ꉟ�����Ă��������B<br/>
    <br/>
  </div>
    �c�A�[�����x���ς݁A�܂��͎x�������̉߂����c�A�[�̏ꍇ�́A<br/>
    �E�F�u����c�A�[�̕ύX�A�L�����Z���͂ł��܂���B<br/>
	�d�b(01-2345-6789)�A�܂��͑����ɂĂ��⍇�����������B
	<br/><br/>
  </logic:notEqual>
  <%-- �\�񌏐� --%>
  <div class="com-message-panel" id="default-message-panel">
    <html:messages id="message" message="true">
      <p><bean:write name="message" ignore="true"/></p>
    </html:messages>
  </div>
  
  <%-- �\��ꗗ�\�� --%>  
  <logic:notEqual name="_uc_a01_02Form" property="reservationsCount" value="0">
	<table class="com-visible-table" summary="�\��ꗗ" id="search-result-table">
		<caption id="result-caption">�\��ꗗ&nbsp;&nbsp;
		<font id="sortrule-text">�@���o�����̑������A�\��ԍ��̏�������</font>
		</caption>
		<tr>
			<th id="result-tour-4words">�\��ԍ�</th>
			<th>�c�A�[��</th>
			<th id="result-tour-date">�o����</th>
			<th id="result-tour-4words">����</th>
			<th id="result-tour-3words">�o���n</th>
			<th id="result-tour-3words">�ړI�n</th>
			<th id="result-tour-5words">�l��</th>
			<th id="result-tour-4words">�x����</th>
			<th id="result-tour-4words">���v����</th>
			<th id="result-button"></th>
		</tr>
		
    	<%-- reservationInfo --%>
		<logic:iterate id="reservationInfo" name="_uc_a01_02Form"
		               property="reservationInfo" indexId="index">
			<%
				index++ ;
				String indexTdCss = null;
				String sumPriceCss = null;
            	if(index %2 ==0){   
                	indexTdCss = "index-td-odd";
                	sumPriceCss = "sum-price-odd";
                } else{  
                	indexTdCss = "index-td-even";
                	sumPriceCss = "sum-price-even";
                }
			%> 
		<tr>
			<td id="<%=indexTdCss %>">
				<bean:write name="reservationInfo" property="reserveNo" />
			</td>
			<td id="<%=indexTdCss %>">
				<bean:write name="reservationInfo" property="tourName" />
			</td>
			<td id="<%=indexTdCss %>">
				<t:date name="reservationInfo" property="depDay" pattern="yyyy�NMM��dd��"/>
			</td>
			<td id="<%=indexTdCss %>">
				<bean:write name="reservationInfo" property="tourDays" />
			</td>
			<td id="<%=indexTdCss %>">
				<bean:write name="reservationInfo" property="depName" />
			</td>
			<td id="<%=indexTdCss %>">
				<bean:write name="reservationInfo" property="arrName" />
			</td>
			<td id="<%=indexTdCss %>">
				��l <bean:write name="reservationInfo" property="adultCount" format="###�l"/>
				<br/>
				�q�ǂ� <bean:write name="reservationInfo" property="childCount" format="###�l"/>
			</td>
			<td id="<%=indexTdCss %>">
				<logic:equal name="reservationInfo" property="transfer" value="true">
					�x����
				</logic:equal>
				<logic:equal name="reservationInfo" property="transfer" value="false">
					������
				</logic:equal>
			</td>
			<td id="<%=sumPriceCss %>">
				<bean:write name="reservationInfo" property="sumPrice" format="###,###�~"/>
			</td>
			<td id="<%=indexTdCss %>">
				<table class="com-button-table" summary="�{�^���e�[�u��">
					<ts:form action="/SC_A01_02_01DSP.do" method="POST">
						<html:hidden property="returnCode" value="SC_A01_02_01"/>
						<html:hidden name="reservationInfo" property="reserveNo"/>
						<html:hidden name="reservationInfo" property="limitExcessFlag"/>
							<tr><td id="<%=indexTdCss %>">
								<ts:submit property="forward_details" styleClass="com-long-button" value="�\��ڍׂ�����" tabindex="1"/>
							</td></tr>
						<logic:equal name="reservationInfo" property="limitExcessFlag" value="false">
						<logic:equal name="reservationInfo" property="transfer" value="false">
							<tr><td id="<%=indexTdCss %>">
								<ts:submit property="forward_change" styleClass="com-long-button" value="�\���ύX����" tabindex="2"/>
							</td></tr>
							<tr><td id="<%=indexTdCss %>">
								<ts:submit property="forward_cancel" styleClass="com-long-button" value="�\����L�����Z������" tabindex="3"/>
							</td></tr>
						</logic:equal>
						</logic:equal>
					</ts:form>
				</table>
			</td>
		</tr>
		</logic:iterate>
	</table>
	
	<br/>
	

  </logic:notEqual>
  </div>
  </div>

<!-- end body-->
<%@ include file="../SC_A99_00_02.jspf" %>
</html:html>
