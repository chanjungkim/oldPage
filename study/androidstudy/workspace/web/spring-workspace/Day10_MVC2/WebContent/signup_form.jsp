<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>회원가입</legend>
		<form action="signup.do" method="post">
			<table>
				<tr>
					<label>아이디</label><br>
					<input type="text" /><br>
				</tr>
				<tr>
					<label>비밀번호</label><br>
					<input type="password" /><br>
				</tr>
				<tr>
					<label>이메일</label><br>
					<input type="text" /><br>
				</tr>
				<tr>
					<label>휴대폰번호</label><br>
					<input type="text" /><br>
				</tr>
				<tr>
					<input type="submit" value="Finish"/>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>