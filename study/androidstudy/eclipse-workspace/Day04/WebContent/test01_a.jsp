<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	pageContext.setAttribute("attr1", "속성1 page Scope");
	request.setAttribute("attr2", "속성2 page Scope");
	session.setAttribute("attr3", "속성3 page Scope");
	application.setAttribute("attr4", "속성4 page Scope");
%>
</body>
</html>