<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
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
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date time = new Date();

	time.setTime(session.getCreationTime());
	time.setTime(session.getLastAccessedTime());
%>
<fieldset>
	<legend>세션 정보</legend>
	<h4>SessionID:<%=session.getId() %></h4>
세션 생성 시간 : <%=formatter.format(time) %> <br>

지금 이전의 마지막 요청 받은 시간 :<%=formatter.format(time)%><br>
</fieldset>
</body>
</html>