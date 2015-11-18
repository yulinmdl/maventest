<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ page session="false" %>
<html>
<head>
	<title>forms | mvc-showcase</title>
	<meta charset="utf-8" >
	<link href="<c:url value="/resources/form.css" />" rel="stylesheet"  type="text/css" />		
	<script type="text/javascript" src="<c:url value="/resources/jquery/1.6/jquery.js" />"></script>
	<style type="text/css">
		table{background-color: silver;border: 1px;}
		table td{background-color: white;text-align: center;height: 28px;}
		table th{background-color: white;width: 100px;height: 35px;}
	</style>
	
</head>
<body>
	<h3>spring+springMVC 框架搭建</h3>
	<table cellspacing="1">
		<tr>
			<th>ID</th>
			<th>姓名</th>
			<th>编号</th>
		</tr>
		<tr>
			<td>${userInfo.uid }</td>
			<td>${userInfo.uname }</td>
			<td>${userInfo.unumber }</td>
		</tr>
	</table>
</body>
</html>
