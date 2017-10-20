<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<html>
<head>
<title>���ϸ�� ������</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>���Ϲ�ȣ</th>
			<th>�����̸�</th>
			<th>���ϼ���</th>
			<th>������ ����� ���</th>
		</tr>
		<c:choose>
			<c:when test="${empty fileVOList}">
				<td colspan="4">
					����� ������ �����ϴ�.
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
	<a href="file.do?task=uploadForm">[���ε�]</a>
</body>
</html>





