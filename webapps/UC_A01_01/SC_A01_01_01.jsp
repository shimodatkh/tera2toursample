<%--
@(#)SC_A01_01_01.jsp
Copyright (C) 2007, 2010 NTT DATA Corporation. All Rights Reserved.:
Description : �c�A�[������ʂƃc�A�[�������ʂ�\������


--%>

<%@page contentType="text/html; charset=Windows-31J" language="java" pageEncoding="Windows-31J" %>

<%@ taglib uri="/struts-html" prefix="html"%>
<%@ taglib uri="/struts-bean" prefix="bean"%>
<%@ taglib uri="/struts-logic" prefix="logic"%>
<%@ taglib uri="/terasoluna" prefix="t"%>
<%@ taglib uri="/terasoluna-struts" prefix="ts"%>
<%@ taglib uri="/common" prefix="thz"%>

<bean:define id="cssFileName" scope="page" value="UC_A01_01/SC_A01_01_01.css" />
<bean:define id="menuButtonFlag" scope="page" value="false"/>
<bean:define id="loginButtonFlag" scope="page" value="false"/>

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
        <h1><span class="com-body-screen-name-text">�c�A�[�������</span>(���ID: SC_A01_01_01)</h1>
      </div>
    </div>
  </div>

  <div class="com-body-panel" id="default-body-panel">
    <div id="navi-text-panel">
      <font id="navi-present-text">�c�A�[����</font>&nbsp;��&nbsp;
      <font id="navi-text">�c�A�[���m�F</font>&nbsp;��&nbsp;
      <font id="navi-text">�\����e�m�F</font>&nbsp;��&nbsp;
      <font id="navi-text">����</font>
    </div>
    <br/>
    
	<div class="entry-message-panel" id="entry-message-panel">
		���o�^�܂ł̎菇
		<ol>
			<li>�c�A�[������ʂŏ�������͂��A�c�A�[���������Ă��������B</li>
			<li>�������ʈꗗ���c�A�[����I�����Ă��������B</li>
			<li>�c�A�[�ڍ׉�ʂŃc�A�[�̓��e���m�F���A��肪������Ύ��̉�ʂ֐i��ł��������B�i�܂��\��͂���܂���B�j</li>
			<li>�\����e���m�F���A��肪������Η\����s�Ȃ��Ă��������B</li>
			<li>�c�A�[�\��o�^������ʂŃc�A�[�ڍ׏��A������A�������ׁA�x�������m�F���Ă��������B</li>
		</ol>
	</div>
	<br/><br/>
		
	<div class="com-message-panel" id="default-message-panel">
		�������w�肵�ăc�A�[���������A�������ʂ��c�A�[��I�����Ă��������B<br/>
		�c�A�[�̓c�A�[���̃����N���������ƂőI���ł��܂��B
	</div>
    <br/>
    
    <div class="com-error-message-panel" id="default-error-message-panel">
      <html:messages id="msg" message="false">
        <p><bean:write name="msg" ignore="true" /></p>
      </html:messages>
    </div>

    <ts:form action="/RP_A01_01_01_02BL.do">

      <%-- �c�A�[�����J�n --%>
      <table class="com-visible-table" summary="�c�A�[��������" id="search-condition-table">
        <caption id="result-caption">�c�A�[��������</caption>
          <tr>
            <%-- �o�����F�����\��--%>
            <th><label for="">�o����</label></th>
            <td id="tour-starting-date-td">
              <logic:empty name="_uc_a01_01Form" property="depDayYearCondition">
                <html:select property="depDayYearCondition" size="1">
                  <thz:currentDateOptions var="year" selected="true" plusDay="7" />
                </html:select>�N 
              </logic:empty>
              <logic:empty name="_uc_a01_01Form" property="depDayMonthCondition">
                <html:select property="depDayMonthCondition" size="1">
                  <thz:currentDateOptions var="month" selected="true" plusDay="7" />
                </html:select>�� 
              </logic:empty>   
              <logic:empty name="_uc_a01_01Form" property="depDayDayCondition">
                <html:select property="depDayDayCondition" size="1">
                  <thz:currentDateOptions var="day" selected="true" plusDay="7" />
                </html:select>��
              </logic:empty>
              <%-- �o�����F�������ʕ\�� ���͂��ꂽ�����������g�p����ꍇ --%>
              <logic:notEmpty name="_uc_a01_01Form" property="depDayYearCondition">
                <html:select property="depDayYearCondition" size="1">
                  <thz:currentDateOptions var="year" selected="false" plusDay="7" />
                </html:select>�N 
              </logic:notEmpty>  
              <logic:notEmpty name="_uc_a01_01Form" property="depDayMonthCondition">
                <html:select property="depDayMonthCondition" size="1">
                  <thz:currentDateOptions var="month" selected="false" plusDay="7" />
                </html:select>�� 
              </logic:notEmpty>       
              <logic:notEmpty name="_uc_a01_01Form" property="depDayDayCondition">
                <html:select property="depDayDayCondition" size="1">
                  <thz:currentDateOptions var="day" selected="false" plusDay="7" />
                </html:select>��
              </logic:notEmpty>
              <font id="comment-text">
              	(�{������1�T�Ԍ�ȍ~�̓��t����͂��Ă�������)
              </font>
            </td>
            <th><label for="tourDaysCondition">����</label></th>
            <td id="tour-days-td">
              <t:defineCodeList id="CODE_004" />
              <html:select property="tourDaysCondition">
                <html:options collection="CODE_004" labelProperty="name" property="id" />
              </html:select>
            </td>
          </tr>
          <tr>
            <th><label for="depCodeCondition">�o���n</label></th>
            <td id="tour-starting-point-td">
              <t:defineCodeList id="CODE_009" />          
              <html:select name="_uc_a01_01Form" property="depCodeCondition">
                <html:option value="">������I������</html:option>
                <html:options collection="CODE_009" labelProperty="name" property="id" />
              </html:select>
            </td>

            <th><label for="arrCodeCondition">�ړI�n</label></th>
            <td id="tour-destination-td">
              <t:defineCodeList id="CODE_010" />
              <html:select name="_uc_a01_01Form" property="arrCodeCondition">
                <html:option value="">������I������</html:option>
                <html:options collection="CODE_010" labelProperty="name" property="id" />
              </html:select>
            </td>
          </tr>
          <tr>
            <th><label>�l��</label></th>
            <td id="search-condition-number">
            ��l
              <t:defineCodeList id="CODE_006" />
              <html:select name="_uc_a01_01Form" property="adultCountCondition">
                <html:options collection="CODE_006" labelProperty="name" property="id" />
              </html:select>�l&nbsp;&nbsp;
            �q�ǂ�
              <t:defineCodeList id="CODE_007" />
              <html:select property="childCountCondition">
                <html:options collection="CODE_007" labelProperty="name" property="id" />
              </html:select>�l
              <br/>����l�F�P�Q�Έȏ� �q�ǂ��F�P�Q�Ζ���
            </td> 
            <th><label for="basePriceCondition">��{����</label></th>
            <td id="search-condition-charge">
              <t:defineCodeList id="CODE_005" />
              <html:select property="basePriceCondition">
                <html:options collection="CODE_005" labelProperty="name" property="id" />
              </html:select>
            </td>
          </tr>          
        </table>

        <%-- begin buttons --%>
        <br/>
        <div align="right">  
          <html:hidden property="startIndex" value="0" />
          <ts:submit property="search" value="��������" styleClass="com-normal-button" />
        </div>
        
    </ts:form> 
    <hr/>
                          
    <%-- �c�A�[�������ʌ��� --%>
    <div class="com-message-panel" id="default-message-panel">
      <html:messages id="message" message="true">
        <p><bean:write name="message" ignore="true"/></p>
      </html:messages>
    </div>
        
    <%--result start --%>
    <%-- tourInfoList�ꗗ�\�� --%>    
    <logic:notEqual name="allListInfoLineCount" value="0">
      <logic:notEmpty name="_uc_a01_01Form" property="tourInfoList">
        <%-- �y�[�W�����N�@�\ --%>     
        <ts:pageLinks id="linkValue" action="/RP_A01_01_01_04BL.do" name="_uc_a01_01Form" rowProperty="row"
            totalProperty="allListInfoLineCount" indexProperty="startIndex" totalPageCount="totalPageCount"/>                    

        <div align="right">
          <bean:write name="currentPageIndex" />/<bean:write name="totalPageCount" />�y�[�W    
          <bean:write name="linkValue" filter="false"/>
        </div>
        
        <br/>                 
        <table class="com-visible-table" summary="�c�A�[��������" id="search-result-table">
          <caption id="result-caption">�c�A�[��������&nbsp;&nbsp;
          	<font id="sort-base-text">�������̑������A��{�����̍�����</font>
          </caption>
          <tr>
            <th>�ʔ�</th>
            <th>�c�A�[��</th>
            <th>�o����</th>
            <th>����</th>
            <th>�o���n</th>
            <th>�ړI�n</th>
            <th>��{����</th>
          </tr>
          <logic:iterate id="TourInfo"
              name="_uc_a01_01Form"
              property="tourInfoList" indexId="index">
            <bean:define name="_uc_a01_01Form" property="startIndex" id="startIndex"/>                       
     <%
          int cnt = (Integer)startIndex;
          String tourNameCss = null;
          String noCss = null;
          String basePriceCss = null;
             if(index %2 ==0){   
                 tourNameCss = "tour-name-td-even";
                 noCss = "no-position-td-even";
                 basePriceCss = "basePrice-position-td-even";
             } else{  
                 tourNameCss = "tour-name-td-odd";
                 noCss = "no-position-td-odd";
                 basePriceCss ="basePrice-position-td-odd";
        }
      %>  
     
            <tr>
              <td id="<%=noCss %>" >
                <%= index + cnt + 1 %>
              </td>
              <td id="<%=tourNameCss %>">     
                <ts:link action="/RP_A01_01_01_03BL.do" 
                         paramName="TourInfo"
                         paramProperty="tourCode"
                         paramId="tourCode">
                  <bean:write name="TourInfo" property="tourName" />
                </ts:link>
              </td>
              <td id="<%=tourNameCss %>">
                <bean:write name="TourInfo" property="depDay" format="yyyy�NMM��dd��"/>
              </td>
              <td id="<%=tourNameCss %>">
                <bean:write name="TourInfo" property="tourDays" />
              </td>
              <td id="<%=tourNameCss %>">
                <bean:write name="TourInfo" property="depName" />
              </td>
              <td id="<%=tourNameCss %>">
                <bean:write name="TourInfo" property="arrName" />
              </td>
              <td id="<%=basePriceCss %>">
                <bean:write name="TourInfo" property="basePrice" format="###,###�~"/>
              </td>
            </tr>
          </logic:iterate>
        </table>
        <br/>
        <div align="right">
          <bean:write name="currentPageIndex" />/<bean:write name="totalPageCount" />�y�[�W    
          <bean:write name="linkValue" filter="false"/>
        </div>      
      </logic:notEmpty>
    </logic:notEqual>
 
  </div>
</div>
<%-- end body--%>

<!-- begin-footer -->
<%@ include file="../SC_A99_00_02.jspf" %>
<!-- end-footer -->

</html:html>