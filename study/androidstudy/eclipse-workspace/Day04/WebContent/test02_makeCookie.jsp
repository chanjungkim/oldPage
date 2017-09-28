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
// 현재 서블릿은 요청을 받으면 쿠키 객체를 하나 생성함
	Cookie cookie = new Cookie("cookie1", "secondcookie");

	cookie.setMaxAge(60);
// 생성한 쿠키 객체를 response 객체에 추가시키면
// 클라이언트에게 전달됨
response.addCookie(cookie);
%>
<h2>쿠키를 만들어서 응답하였습니다.</h2>
</body>
</html>