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
	<h1>B�� ����� ȭ��</h1>
	���� html ȭ�� ����� �۾��� ����ϴ� b.jsp ��������.<br>
	��û�� a���� �������Ƿ� url�� ������ a.jsp�� �Ǿ�����.<br>
	
	a�� ������ Attribute 1: <%=resultOfA %><br>
	a�� ������ Attribute 2: <%=requestTime %><br>
</body>
</html>