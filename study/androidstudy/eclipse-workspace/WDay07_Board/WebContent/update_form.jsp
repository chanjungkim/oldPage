<%@page import="vo.Article"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>수정할 내용 입력 화면</title>
<meta http-equiv="Content-type" content="text/html; charset=utf-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<%
	Article original = 
		(Article) request.getAttribute("original");
%>
<body>
	<form action="<%=request.getContextPath()%>/board" 
												method="post">
	<input type="hidden" name="type" value="update">
	<input type="hidden" name="articleNum" 
					value="<%=original.getAritlcleNum()%>">												
	<table border="1" width="50%">
		<tr>
			<td width="8%">제목:</td>
			<td width="45%">
				<input type="text" name="title" 
					width="45%" value="<%=original.getTitle()%>">
			</td>
		</tr>
		<tr>
			<td>패스워드:</td>
			<td>
				<input style="width:45%" type="password" name="password">
			</td>
		</tr>
		<tr>
			<td>내용:</td>
			<td>
				<textarea rows="5" cols="10" name="contents"><%=original.getContents()%></textarea>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="작성완료">
			</td>
		</tr>
	</table>
	</form>

</body>
</html>