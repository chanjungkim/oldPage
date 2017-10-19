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
	<h3>1부터 10까지의 홀수</h3>
	<c:forEach var="i" begin="1" end="10" step="2">
		${i}
	</c:forEach>
	<hr>
	<% int[] numbers = {10, 20, 30, 40, 50}; %>
	<c:set var="nums" value="<%=numbers %>"/>
	<c:forEach var="n" items="${nums}">
		<b>${n}</b>
	</c:forEach>
	<hr>
	<c:forEach var="n" items="${nums}" begin="2" end="4">
		<b>${n}</b>
	</c:forEach>
	<hr>
	<c:forEach var="n" items="${nums}" begin="2" end="4" varStatus="s">
		인덱스: ${s.index}, 카운트:${s.count}, 값:${n}<br>
	</c:forEach>
</body>
</html>