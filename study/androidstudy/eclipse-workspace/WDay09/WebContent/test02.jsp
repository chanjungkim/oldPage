<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int n1 = 100, n2=200;
%>
<c:set var="n1" value="<%=n1%>"/>
<c:set var="n2" value="<%=n2%>"/>

n1 : ${n1} <br>
n2 : ${n2} <br>
n1 + n2 : ${n1+n2}<br>
n1 > n2 : ${n1>n2}<br>
n1 == n2 : ${n1 == n2}<br>
n1>0 && n2>0 : ${n1>0 && n2>0}<br>
n1>0 and n2>0 : ${n1>0 and n2>0}<br>
------------------------------------<hr>
<%List<String> words = new ArrayList<>();%>
<c:set var="words" value="<%=words%>"/>

is word empty? >> ${empty words}<br>
<% words.add("apple"); %>
words 리스트에 단어 추가함 >> ${words.get(0)}<br>
</body>
</html>