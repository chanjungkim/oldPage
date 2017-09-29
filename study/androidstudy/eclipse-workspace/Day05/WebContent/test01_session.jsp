<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%-- <%@ page session="true" %>     --%>
<html>
<head>
<title>test01_session.jsp</title>
</head>
<body>
저희 서비스에 첫요청 보내셨나요 ? <br>
그렇다면 지금 세션객체를 만들었습니다.<br>
아니면 이전 요청에 생성된 세션 객체가 준비되어 있습니다.<br>
<hr>

<%
	SimpleDateFormat formatter = 
		new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date time = new Date();
%>

세션 ID : <b><%=session.getId()%></b> <br>

<% time.setTime(session.getCreationTime()); %>
세션 생성 시간 : <%=formatter.format(time) %> <br>

<% time.setTime(session.getLastAccessedTime()); %>
지금 이전의 마지막 요청 받은 시간 :<%=formatter.format(time)%><br>
</body>
</html>



