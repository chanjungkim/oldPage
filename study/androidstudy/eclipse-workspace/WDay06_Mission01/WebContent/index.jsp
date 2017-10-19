<%@page import="java.util.ArrayList"%>
<%@page import="vo.MessageVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<label>아이디</label><input type="text" value="master" name="userId"><br>
<label>비밀번호</label><input type="text" value="1234" name="userPw">
<a href="<%=request.getContextPath()%>/MessageServlet?type=home"><Button>로그인</Button></a>
</body>
</html>