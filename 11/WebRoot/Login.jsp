<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'Login.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>
<body bgcolor=#EEDDEE>
	<s:form action="CheckLoginByObj" method="post">
		<s:textfield key="id" />
		<br>
		<s:password key="password" />
		<br>
		<s:submit key="login" style="position: relative ;right:200px;top:30px;"/>
		<s:reset key="reset" style="position: relative ;right:100px;"/>
		<s:submit key="regist" style="position: relative ;bottom:30px;" onclick="window.location.href='RegisterPrepareAction.action';return false" />
	</s:form>

</body>
</html>
