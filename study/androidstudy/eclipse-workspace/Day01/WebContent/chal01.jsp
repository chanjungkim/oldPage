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
		String userName = request.getParameter("userName");
	%>
	<form action="chal01.jsp">
		<input type="text" name="userName">
		<div>제 이름은 <%=userName%>입니다.</div>
		<input type="submit" value="제출">
	</form>
</body>
</html>