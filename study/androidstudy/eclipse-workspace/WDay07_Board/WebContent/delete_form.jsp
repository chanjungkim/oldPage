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
	int articleNum = (Integer) request.getAttribute("articleNum");
%>
	<form action="<%=request.getContextPath()%>/board" method="post">
		글 비밀번호:
		<input type="password" name="password"><br>
		<input type="submit" value="삭제확인">
		<input type="hidden" name="type" value="delete">
		<input type="hidden" name ="acticleNum" value="<%=articleNum%>">
	</form>
</body>
</html>