<%@page import="java.util.Date"%>
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
	String name = request.getParameter("name");
	Date now = (Date) request.getParameter("now");
%>
당신이 보낸 파라미터: <%=name%><br>
현재 시각: <%=now %><br>
---------------------------------------
당신이 보낸 파라미터: ${param.name}<br>
현재 시각: ${requestScope.now}<br>
</body>
</html>