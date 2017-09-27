<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String resultOfA = (String)request.getAttribute("result1");
	Date requestTime = (Date)request.getAttribute("result2");
%>
	<h1>B가 만드는 화면</h1>
	나는 html 화면 만드는 작업을 담당하는 b.jsp 페이지임.<br>
	요청은 a에게 보냈으므로 url은 여전히 a.jsp로 되어있음.<br>
	
	a가 전달한 Attribute 1: <%=resultOfA %><br>
	a가 전달한 Attribute 2: <%=requestTime %><br>
</body>
</html>