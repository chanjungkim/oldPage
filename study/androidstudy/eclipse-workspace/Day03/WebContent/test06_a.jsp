<%@page import java.util.Date; %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String result = "a�� ȹ����? �۾���? ���������";

	request.setAttribute("result1", result);
	request.setAttribute("result2", new Date());
%>