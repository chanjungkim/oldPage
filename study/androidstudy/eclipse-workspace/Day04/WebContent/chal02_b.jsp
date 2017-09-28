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
	String number = request.getParameter("number");
	int n = Integer.parseInt(number);
	PrintWriter print = response.getWriter();
	int sum = 1;
	print.println("<h2>1부터 "+n+"까지 자연수 합 구하기</h2>");
	print.println(1);

	for(int i = 2 ; i <= n ; i++){
		print.println("+"+i);
		sum+=i;
	}
	print.println(" = "+sum);
%>
</body>
</html>