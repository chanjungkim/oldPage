<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>upload_form.jsp</title>
</head>
<body>
<form action="upload.do" method="post" 
						enctype="multipart/form-data">
	ID : <input type="text" name="id"><br>
	PW : <input type="password" name="pw"><br>
	���ϼ���: <input type="file" name="memImg"><br>
	<input type="submit" value="����">
</form>
</body>
</html>