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
���� ���񽺿� ù��û �����̳��� ? <br>
�׷��ٸ� ���� ���ǰ�ü�� ��������ϴ�.<br>
�ƴϸ� ���� ��û�� ������ ���� ��ü�� �غ�Ǿ� �ֽ��ϴ�.<br>
<hr>

<%
	SimpleDateFormat formatter = 
		new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date time = new Date();
%>

���� ID : <b><%=session.getId()%></b> <br>

<% time.setTime(session.getCreationTime()); %>
���� ���� �ð� : <%=formatter.format(time) %> <br>

<% time.setTime(session.getLastAccessedTime()); %>
���� ������ ������ ��û ���� �ð� :<%=formatter.format(time)%><br>
</body>
</html>



