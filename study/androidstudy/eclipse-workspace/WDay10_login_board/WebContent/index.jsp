<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>index������</title>
</head>
<body>
<c:set var="myContextPath" 
			value="${pageContext.request.contextPath}"/>
	<h2>�츮 Ȩ�������� ���Ű��� ȯ���մϴ�.</h2>
	<a href="${myContextPath}/member?task=joinForm">ȸ������</a>
	<a href="${myContextPath}/member?task=loginForm">�α���</a>
</body>
</html>