<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- test01_a.jsp-->
<%
	pageContext.setAttribute("attr1", "加己1 page Scope");
	request.setAttribute("attr2", "加己2 request Scope");
	session.setAttribute("attr3", "加己3 session Scope");
	application.setAttribute("attr4", "加己4 application Scope");
%>

<jsp:forward page="test01_b.jsp"/>