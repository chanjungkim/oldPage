<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<html>
<head>
<title>�α���ȭ��</title>
</head>
<body>
	<form action="login.do" method="post">
		<table border="1">
			<tr>
				<td>���̵� :</td>
				<td><input type="text" name="userId"></td>
			</tr>
			<tr>
				<td>�н����� :</td>
				<td><input type="password" name="userPw"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="LOGIN"> <input
					type="button" value="Sign up" /></td>
			</tr>
		</table>
	</form>
</body>
</html>