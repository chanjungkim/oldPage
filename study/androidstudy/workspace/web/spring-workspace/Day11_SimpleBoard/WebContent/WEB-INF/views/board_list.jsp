<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<html>
<head>
<title>게시판 목록</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>글번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성일</td>
			<td>조회수</td>
		</tr>
		<c:if test="${empty boardPage.boardList}">
			<tr>
				<td colspan="5">
				 작성된 게시글이 존재하지 않습니다.
				</td>
			</tr>
		</c:if>
		<c:if test="${not empty boardPage.boardList}">
			<c:forEach items="${boardPage.boardList}" 
											var="boardVO">
			<tr>
				<td>${boardVO.boardNum}</td>
				<td>${boardVO.title}</td>
				<td>${boardVO.writer}</td>
				<td>${boardVO.writeDate}</td>
				<td>${boardVO.readCount}</td>
			</tr>
			</c:forEach>
		</c:if>
	</table>
	<div>
		<c:forEach begin="${boardPage.startPage}"
			end="${boardPage.endPage}" var="p" step="1">
		<a href="board.do?page=${p}">${p} </a>
		</c:forEach>
	</div>
	<a href="writeForm.do">
		<button>글쓰기</button>
	</a>
</body>
</html>