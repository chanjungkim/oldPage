<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>회원가입 화면</title>
<style type="text/css">
	div, form{
		width: 60%;
		height: 100px;
		margin: auto;
		text-align: center;
	}
</style>
</head>
<body>
<div>
	<h2>회원가입 입력화면</h2>
	<form action="join.do" method="post">
	<table>
		<tr>
			<td>아이디 : </td>
			<td>
				<input type="text" name="id" size="10" required>
				<button>중복확인</button>
			</td>
		</tr>	
		<tr>
			<td>패스워드 : </td>
			<td>
				<input type="password" name="password" size="10" required>
			</td>
		</tr>	
		<tr>
			<td>휴대폰 : </td>
			<td>
				<input type="tel" name="phone" 
					placeholder="'-'없이 입력하세요.">
			</td>
		</tr>	
		<tr>
			<td>E-MAIL : </td>
			<td>
				<input type="email" name="email" size="10">
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="작성완료">
			</td>
		</tr>		
	</table>
	</form>
</div>
</body>
</html>