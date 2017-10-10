<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>test04_add_book_result</title>
</head>
<body>
	<h2>책 추가 작업이 완료되었습니다.</h2>
	결과: <%=request.getAttribute("addResult") %><br>
	<hr>
	<a href="<%=request.getContextPath()%>/BookServlet?type=bookList">[책 목록보기]</a>
	<a href="<%=request.getContextPath()%>BookServlet?type=bookForm">[책 더 추가하기]</a>
</body>
</html>