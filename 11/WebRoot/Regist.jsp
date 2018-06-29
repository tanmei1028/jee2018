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
	<s:form action="RegistAction" method="post">
		<s:textfield key="id" />
		<br>
		<s:textfield key="name" />
		<br>
		
		<s:doubleselect key="institute"  list="institutes"
        listKey="ins_id" listValue="ins_name" doubleName="professions" 
        doubleList="professionMap.get(top.ins_id)"
        doubleListKey="pro_id" doubleListValue="pro_name" 
        headerValue="----请选择----" emptyOption="true" />

		<br>
		<s:textfield key="class_" />
		<br>
		<s:textfield key="tel" />
		<br>
		<s:textfield key="dormnum" />
		<br>
		<s:textfield key="birth" />
		<br>
		<s:password key="password" />
		<br>
		<s:submit key="submit" style="position: relative ;right:200px;top:30px;" />
		<s:reset key="reset" style="position: relative ;right:100px;" />
	</s:form>

</body>
</html>
