<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>마이페이지</title>
</head>
<body>
<h2>회원 정보</h2>
<table>
	<tr>
		<td>회원번호 : </td>
		<td>${memberInfo.memberNum}</td>
	</tr>
	<tr>
		<td>아이디 : </td>
		<td>${memberInfo.id}</td>
	</tr>
	<tr>
		<td>휴대폰 번호 : </td>
		<td>${memberInfo.phone}</td>
	</tr>
	<tr>
		<td>이메일 : </td>
		<td>${memberInfo.email}</td>
	</tr>
</table>
<hr>
<a href="logout.do">[로그아웃]</a>
<a href="board.do">[게시판]</a>
</body>
</html>