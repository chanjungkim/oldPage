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
			<td>책 제목 : </td>
			<td>
				<input type="text" name="title" size="20">
			</td>
		</tr>
		
		<tr>
			<td>출판사 : </td>
			<td>
				<input type="text" name="pub" size="20">
			</td>
		</tr>
		
		<tr>
			<td>가격 : </td>
			<td>
				<input type="text" name="price" size="20">
			</td>
		</tr>
		
		<tr>
			<td>출판연도 : </td>
			<td>
				<input type="text" name="year" size="20">
			</td>
		</tr>
		
		<tr>
			<td colspan="2">
			<input type="submit" value="입력완료">
			</td>
		</tr>
			
	</table>
	</form>
</body>
</html>