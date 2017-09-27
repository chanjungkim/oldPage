<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>test03_main.jsp</title>
</head>
<body>
<h1>요청을 받는 것도 메인</h1>
<%
	int n=100;
%>

<%@ include file="test03_sub.jsp" %>

<h2>html 응답하는 것도 메인</h2>
</body>
</html>