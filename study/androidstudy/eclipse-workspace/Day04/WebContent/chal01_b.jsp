
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
<%
	String site = request.getParameter("site");

	switch(site){
	case "1":
		response.sendRedirect("http://www.naver.com");
		break;
	case "2":
		response.sendRedirect("http://www.daum.net");		
		break;
	case "3":
		response.sendRedirect("http://www.nate.com");	
		break;
	case "4":
		response.sendRedirect("http://www.google.com");
		break;
	default:
		break;
	}
%>
</body>
</html>