<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>당신ㅇ ㅣ들고온 쿠키 목록은 아래와 같습니다.</h2>
	<%
		Cookie[] cookies = request.getCookies();
	
		for(Cookie c : cookies){
			out.println("쿠키이름: "+ c.getName() +"<br>");
			out.println("쿠키값: "+c.getValue()+"<br>");
			out.println("<hr>");
		}
	%>
</body>
</html>