<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>test04_book_form.jsp</title>
</head>
<body>
<form action="bookServlet" method="post">
	<table border="1">
		<tr>
			<td>å ���� : </td>
			<td>
				<input type="text" name="title" size="20">
			</td>
		</tr>
		
		<tr>
			<td>���ǻ� : </td>
			<td>
				<input type="text" name="pub" size="20">
			</td>
		</tr>
		
		<tr>
			<td>���� : </td>
			<td>
				<input type="text" name="price" size="20">
			</td>
		</tr>
		
		<tr>
			<td>���ǿ��� : </td>
			<td>
				<input type="text" name="year" size="20">
			</td>
		</tr>
		
		<tr>
			<td colspan="2">
			<input type="submit" value="�Է¿Ϸ�">
			</td>
		</tr>
			
	</table>
	</form>
</body>
</html>