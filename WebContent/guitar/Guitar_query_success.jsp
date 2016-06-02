<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="content-type" content="text/html;charset=UTF-8">
<title>查询结果</title>
</head>
<body>
 <div>
                 <table class="table" width="100%"  border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#819BBC" bordercolorlight="#FFFFFF">
                  <tr>
                    <td height="28"><div align="center">吉他序号</div></td>
                    <td><div align="center">单价</div></td>
                    <td><div align="center">制造商</div></td>
                    <td><div align="center">型号</div></td>
                    <td><div align="center">类型</div></td>
                    <td><div align="center">前木料</div></td>
                    <td><div align="center">后木料</div></td>
                  </tr>  
                  <tr>
                    <td height="28"><div align="center"><s:property value="#session.query_guitar.serialNumber"/></div></td>
                    <td><div align="center"><s:property value="#session.query_guitar.price"/></div></td>
                    <td><div align="center"><s:property value="#session.query_guitar.builder"/></div></td>
                    <td><div align="center"><s:property value="#session.query_guitar.model"/></div></td>
                    <td><div align="center"><s:property value="#session.query_guitar.type"/></div></td>
                    <td><div align="center"><s:property value="#session.query_guitar.backwood"/></div></td>
                    <td><div align="center"><s:property value="#session.query_guitar.topkwood"/></div></td>
                  </tr>  
                  
                </table>
				</div>
</body>
</html>