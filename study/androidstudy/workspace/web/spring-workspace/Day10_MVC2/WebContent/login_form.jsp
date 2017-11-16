<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<html>
<head>
<title>로그인화면</title>
</head>
<body>
	<form action="login.do" method="post">
		<table border="1">
			<tr>
				<td>아이디 :</td>
				<td><input type="text" name="userId"></td>
			</tr>
			<tr>
				<td>패스워드 :</td>
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