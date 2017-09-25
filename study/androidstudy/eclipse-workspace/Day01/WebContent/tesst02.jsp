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
	String n1_str = request.getParameter("n1");	
	String n2_str = request.getParameter("n2");
	
	int n1 = 0;
	int n2 = 0;
	
	if(n1_str!=null && n1_str.length()>0){
		n1 = Integer.parseInt(n1_str);
	}
	
	if(n2_str!=null && n2_str.length()>0){
		n2 = Integer.parseInt(n2_str);
	}
%>
<h2>두 파라미터의 합계를 구하는 JSP 페이지</h2>
두 수의 합:<%=n1+n2 %><br>
</body>
</html>