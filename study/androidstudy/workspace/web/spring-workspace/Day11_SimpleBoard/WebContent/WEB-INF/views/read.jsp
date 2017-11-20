<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>제목: </td>
			<td>${board.title}</td>
		</tr>
		<tr>
			<td>작성자: </td>
			<td>${board.writer}</td>
		</tr>
		<tr>
			<td>조회수: </td>
			<td>${board.readCount}</td>
		</tr>
		<tr>
			<td>작성일시: </td>
			<td>${board.writeDate}</td>
		</tr>
		<tr>
			<td>내용: </td>
			<td>${board.content}</td>
		</tr>
	</table>
	
	<a href="board.do">[목록]</a>
	
	<c:if test="${sessionScope.loginId == board.writer}">
		<a href="updateForm.do">[수정]</a>
		<a href="updateForm.do">[삭제]</a>
	</c:if>
	</body>
</html>