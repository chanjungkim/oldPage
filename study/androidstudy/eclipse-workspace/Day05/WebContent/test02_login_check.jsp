<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- test02_login_check.jsp  -->
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String forwardPath = "";
	
	if(id.equals(pw)){
		// �α��� ����
		forwardPath = "test02_login_success.jsp";		
	}else{
		// �α��� ����
		forwardPath = "test02_login_fail.jsp";
	}
%>
<jsp:forward page="<%=forwardPath%>"/>