<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- test01_a.jsp-->
<%
	pageContext.setAttribute("attr1", "�Ӽ�1 page Scope");
	request.setAttribute("attr2", "�Ӽ�2 request Scope");
	session.setAttribute("attr3", "�Ӽ�3 session Scope");
	application.setAttribute("attr4", "�Ӽ�4 application Scope");
%>

<jsp:forward page="test01_b.jsp"/>