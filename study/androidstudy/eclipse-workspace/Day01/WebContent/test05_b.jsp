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
		String name = request.getParameter("userName");
// 		String hobby = request.getParameter("hobby");
		String[] hobbies = request.getParameterValues("hobby");
	%>
	<b><%=name %></b> 님 반갑습니다.<br>
	당신의 취미:
<%-- 	<% 
 		for(String hobby: hobbies){
		%> 
 			<%=hobby%>, 
	 	<% 
 		}
		%> --%>
	<%
		for(String hobby: hobbies){
			out.println(hobby+", ");
		}
	%>
</body>
</html>