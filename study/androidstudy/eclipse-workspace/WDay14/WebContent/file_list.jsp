<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<html>
<head>
<title>파일목록 페이지</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>파일번호</th>
			<th>파일이름</th>
			<th>파일설명</th>
			<th>서버에 저장된 경로</th>
		</tr>
		<c:choose>
			<c:when test="${empty fileVOList}">
				<td colspan="4">
					저장된 파일이 없습니다.
				</td>
			</c:when>
			<c:otherwise>
				<c:forEach items="${fileVOList}" var="f">
					<tr>
					<td>${f.fileNum}</td>
					<td>${f.originalName}</td>
					<td>${f.description}</td>
					<td>${f.filePath}</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>
	<a href="file.do?task=uploadForm">[업로드]</a>
</body>
</html>





