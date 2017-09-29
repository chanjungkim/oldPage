<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- test02_login_check.jsp  -->
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String forwardPath = "";
	
	if(id.equals(pw)){
		// 로그인 성공
		forwardPath = "test02_login_success.jsp";		
	}else{
		// 로그인 실패
		forwardPath = "test02_login_fail.jsp";
	}
%>
<jsp:forward page="<%=forwardPath%>"/>