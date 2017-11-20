<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="write.do" method="post">
		<table>
			<tr>
				<td>제목: </td>
				<td><input type="text" name="title" size="20"></td>
			</tr>
			<tr>
				<td>내용: </td>
				<td><textarea name="content" rows="20" cols="30"></textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="작성완료"></td>
			</tr>
		</table>
	</form>
</body>
</html>