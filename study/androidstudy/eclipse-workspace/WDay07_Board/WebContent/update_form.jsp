<%@page import="vo.Article"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>������ ���� �Է� ȭ��</title>
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
	<table border="1">
		<tr>
			<td>����:</td>
			<td>
				<input type="text" name="title" 
					size="10" value="<%=original.getTitle()%>">
			</td>
		</tr>
		<tr>
			<td>�н�����:</td>
			<td>
				<input type="password" name="password" size="10">
			</td>
		</tr>
		<tr>
			<td>����:</td>
			<td>
				<textarea rows="5" cols="10" name="contents"><%=original.getContents()%></textarea>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="�ۼ��Ϸ�">
			</td>
		</tr>
	</table>
	</form>

</body>
</html>