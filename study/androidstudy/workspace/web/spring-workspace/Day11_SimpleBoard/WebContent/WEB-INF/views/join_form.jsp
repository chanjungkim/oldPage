<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>ȸ������ ȭ��</title>
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
	<h2>ȸ������ �Է�ȭ��</h2>
	<form action="join.do" method="post">
	<table>
		<tr>
			<td>���̵� : </td>
			<td>
				<input type="text" name="id" size="10" required>
				<button>�ߺ�Ȯ��</button>
			</td>
		</tr>	
		<tr>
			<td>�н����� : </td>
			<td>
				<input type="password" name="password" size="10" required>
			</td>
		</tr>	
		<tr>
			<td>�޴��� : </td>
			<td>
				<input type="tel" name="phone" 
					placeholder="'-'���� �Է��ϼ���.">
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
				<input type="submit" value="�ۼ��Ϸ�">
			</td>
		</tr>		
	</table>
	</form>
</div>
</body>
</html>