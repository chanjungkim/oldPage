<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>이곳은 책 관리 메인 페이지입니다.</h1>
<a href="<%=request.getContextPath()%>/BookServlet?type=bookForm">책 추가하러 가기</a>
<a href="<%=request.getContextPath()%>/BookServlet?type=bookList">책 목록 보기</a>
</body>
</html>