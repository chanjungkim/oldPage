<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<html>
<head>
<title>�Խ��� ���</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>�۹�ȣ</td>
			<td>����</td>
			<td>�ۼ���</td>
			<td>�ۼ���</td>
			<td>��ȸ��</td>
		</tr>
		<c:if test="${empty boardPage.boardList}">
			<tr>
				<td colspan="5">
				 �ۼ��� �Խñ��� �������� �ʽ��ϴ�.
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
		<button>�۾���</button>
	</a>
</body>
</html>