<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String param  = request.getParameter("p");
	
	String resultPage = "test07_"+param+".jsp";
	
	//예를들어 param 값이 a이면 로그인 성공, a가 아니면 실패라고
	//가정하면 아래와 같이 작업할 수도 있음.
	if(param.equals("a")){
		request.setAttribute("loginId", "sunyujin");
		request.setAttribute("loginTime", new Date());
	}else{
		request.setAttribute("loginFailTime", new Date());
	}
%>

<jsp:forward page="<%=resultPage%>"/>