<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// DBDBDBDBDBDBDBDB �۾��̶����
	// ��Ʈ��ũ �۾��̶����
	// ���� ������ �۾��� ������.
	
	String result = "a�� ȹ����? �۾���? ���������";

	// setAttribute(�̸�,��ü);
	request.setAttribute("result1", result);
	request.setAttribute("result2", new Date());
%>

<jsp:forward page="test06_b.jsp"/>