<%@page import="vo.Article"%>
<%@page import="vo.ArticlePageVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>   

<html>
<head>
<title>�Խ��� ���</title>

<meta http-equiv="Content-type" content="text/html; charset=utf-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<%
// ��û�� ���� �ڹ� ������ set�� ������ �����͸� get���� ������
	ArticlePageVO articlePage = 
		(ArticlePageVO) request.getAttribute("articlePage");
%>
<body>
<c:set var="myContextPath" value="${pageContext.request.contextPath}">
	<h2>�̰��� ���� �Խ��� ȭ�� �Դϴ�.</h2>
	<table border="1" style="width:50%">
		<tr>
			<th width="8%">�۹�ȣ</th>
			<th width="40%">����</th>
			<th width="15%">�ۼ���</th>
			<th width="38%">�ۼ���</th>
			<th width="14%">��ȸ��</th>
		</tr>
	<c:choose>
		<c:when test="${empty articlePage.articleList}">
		<tr>
			<td colspan="5">
				�ۼ��� �Խñ��� �������� �ʽ��ϴ�.
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
<!-- �ϴ� ������ ��ũ �ɱ� -->
	<div>
		<c:forEach var="i" begin="${articlePage.startPage}" end="articlePage.endPage">
			<a href="${myContextPath}/board?p=${i}">${i}</a>
		</c:forEach>
	</div>
	<div>
		<a href=
		"${MYContextPath}/board?type=writeForm">
			<button>�۾���</button>
		</a>
	</div>
</c:set>
</body>
</html>