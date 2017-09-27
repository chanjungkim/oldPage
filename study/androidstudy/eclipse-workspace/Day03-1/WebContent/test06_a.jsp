<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// DBDBDBDBDBDBDBDB 작업이라던지
	// 네트워크 작업이라던지
	// 뭔가 복잡한 작업을 수행함.
	
	String result = "a가 획득한? 작업한? 결과데이터";

	// setAttribute(이름,객체);
	request.setAttribute("result1", result);
	request.setAttribute("result2", new Date());
%>

<jsp:forward page="test06_b.jsp"/>