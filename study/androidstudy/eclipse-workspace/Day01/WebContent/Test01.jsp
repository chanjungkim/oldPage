<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>이클립스에서 작성한 첫 번 째 jsp 파일입니다.</h2>
	<%
		Date d = new Date();
	%>
	현재 페이지가 요청을 받은 시각: <b><%=d%></b><br>
</body>
</html>