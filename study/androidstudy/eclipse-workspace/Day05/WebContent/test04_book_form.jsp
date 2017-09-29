<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<form method="post" action="BookServlet">
			<table border="1">
				<tr>
					<td>책 제목</td>
					<td>
						<input type="text" name="title" size="20">
					</td>
				</tr>
				<tr>
					<td>출판사</td>
					<td>
						<input type="text" name="pub" size="20">
					</td>
				</tr>
				<tr>
					<td>가격</td>
					<td>
						<input type="text" name="price" size="20">
					</td>
				</tr>
				<tr>
					<td>출판연도</td>
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
	</fieldset>
</body>
</html>