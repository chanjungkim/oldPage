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
	String param = request.getParameter("p");
%>
리퀘스트에 들어이쓴 파라미터 p 값: <%=param %><br>
컨텍스트 경로: <%=request.getContextPath() %><br>
클라이언트의 요청 종류(GET/POST): <%=request.getMethod()%><br>
클라인터가 요청한 URL: <%=request.getRequestURI() %><br>
클라이언트의 아이피 주소: <%=request.getRemoteAddr() %><br>
<%
	String addr = request.getRemoteAddr();
	System.out.println("요청들어옴: "+param);
%>
</body>
</html>