<%@page import="vo.Article"%>
<%@page import="vo.ArticlePageVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>   

<html>
<head>
<title>게시판 목록</title>

<meta http-equiv="Content-type" content="text/html; charset=utf-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<%
// 요청을 받은 자바 서블릿이 set한 페이지 데이터를 get으로 꺼내기
	ArticlePageVO articlePage = 
		(ArticlePageVO) request.getAttribute("articlePage");
%>
<body>
<c:set var="myContextPath" value="${pageContext.request.contextPath}">
	<h2>이곳은 심플 게시판 화면 입니다.</h2>
	<table border="1" style="width:50%">
		<tr>
			<th width="8%">글번호</th>
			<th width="40%">제목</th>
			<th width="15%">작성자</th>
			<th width="38%">작성일</th>
			<th width="14%">조회수</th>
		</tr>
	<c:choose>
		<c:when test="${empty articlePage.articleList}">
		<tr>
			<td colspan="5">
				작성된 게시글이 존재하지 않습니다.
			</td>
		</tr>
		</c:when>
		<c:otherwise>
			<c:forEach var="article" items="${articlePage.articleList}">
		<tr>
			<td>${article.articleNum}</td>
			<td><a href="${myContextPath}/board?type=read&articleNum=${article.articleNum}">${article.title}</a></td>
			<td>${article.writer}</td>
			<td><fmt:formatDate value="${article.writeDate}" type="both"
				dateStyle="short" timeStyle="short"/></td>
			<td>${article.readCount}</td>
		</tr>
			</c:forEach>
		</c:otherwise>	
	</c:choose>
	</table>
<!-- 하단 페이지 링크 걸기 -->
	<div>
		<c:forEach var="i" begin="${articlePage.startPage}" end="articlePage.endPage">
			<a href="${myContextPath}/board?p=${i}">${i}</a>
		</c:forEach>
	</div>
	<div>
		<a href=
		"${MYContextPath}/board?type=writeForm">
			<button>글쓰기</button>
		</a>
	</div>
</c:set>
</body>
</html>