<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>upload_form.jsp</title>
</head>
<body>
<h2>���� ���ε� ȭ�� �Դϴ�.</h2>
<form action="file.do" method="post" enctype="multipart/form-data">
	���� ���� : <input type="text" name="description" size="20">
	<br>
	���� ���� : <input type="file" name="myFile">
	<br>
	<input type="submit" value="����">
</form>
</body>
</html>