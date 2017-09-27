<%@page import java.util.Date; %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String result = "a가 획득한? 작업한? 결과데이터";

	request.setAttribute("result1", result);
	request.setAttribute("result2", new Date());
%>