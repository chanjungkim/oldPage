<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>내장 객체의 속성값 목록</h1>
	page attr: <%=pageContext.getAttribute("attr1")%><br>
	request attr: <%=request.getAttribute("attr2")%><br>
	session attr: <%=session.getAttribute("attr3")%><br>
	application attr: <%=application.getAttribute("attr4")%><br>
</body>
</html>