<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>查询结果</title>
</head>
<body>
<table class="default" width="100%">
	<col width="10%">
	<col width="20%">
	<col width="5%">
	<col width="20%">
	<col width="30%">
	<col width="15%">
	<tr class="title">
		<td>序号</td>
		<td>价格</td>
		<td>制造商</td>
		<td>型号</td>
		<td>类型</td>
		<td>前木料</td>
		<td>后木料</td>
	</tr>
	
	<!-- 遍历开始 -->
	
	<tr>
		<td><s:property value="#session.query_guitar.serialNumber"/></td>
		<td><s:property value="#session.query_guitar.price"/></td>
		<td><s:property value="#session.query_guitar.builder"/></td>
		<td><s:property value="#session.query_guitar.model"/></td>
		<td><s:property value="#session.query_guitar.type"/></td>
		<td><s:property value="#session.query_guitar.backwood"/></td>
		<td><s:property value="#session.query_guitar.topkwood"/></td>
	</tr>
	
	<!-- 遍历结束 -->
</table>
</body>
</html>