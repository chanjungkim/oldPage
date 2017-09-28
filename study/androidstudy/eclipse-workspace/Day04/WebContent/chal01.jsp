<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>웹 사이트 이동하기</h1>
<form method="post" action="chal01_b.jsp">
	<select name = "site">
		<option value="0">선택</option>
		<option value="1">네이버</option>
		<option value="2">다음</option>
		<option value="3">네이트</option>
		<option value="4">구글</option>
	</select>
	<input type="submit" value="확인">
</form>
</body>
</html>