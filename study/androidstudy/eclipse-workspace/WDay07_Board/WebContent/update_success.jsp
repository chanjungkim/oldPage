<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int articleNum = 
			(Integer) request.getAttribute("articleNum");
	%>
	<h2>글 수정이 완료되었습니다.</h2>
	<a href = "javascript:history.go(-2)">[게시판 목록으로]</a>
	<a href = "<%=request.getContextPath()%>/board?type=read&articleNum=<%=articleNum%>">[수정한 글 보기]</a>
</body>
</html>