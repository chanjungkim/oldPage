<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>����������</title>
</head>
<body>
<h2>ȸ�� ����</h2>
<table>
	<tr>
		<td>ȸ����ȣ : </td>
		<td>${memberInfo.memberNum}</td>
	</tr>
	<tr>
		<td>���̵� : </td>
		<td>${memberInfo.id}</td>
	</tr>
	<tr>
		<td>�޴��� ��ȣ : </td>
		<td>${memberInfo.phone}</td>
	</tr>
	<tr>
		<td>�̸��� : </td>
		<td>${memberInfo.email}</td>
	</tr>
</table>
<hr>
<a href="logout.do">[�α׾ƿ�]</a>
<a href="board.do">[�Խ���]</a>
</body>
</html>