<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>upload_form.jsp</title>
</head>
<body>
<h2>파일 업로드 화면 입니다.</h2>
<form action="file.do" method="post" enctype="multipart/form-data">
	파일 설명 : <input type="text" name="description" size="20">
	<br>
	파일 선택 : <input type="file" name="myFile">
	<br>
	<input type="submit" value="전송">
</form>
</body>
</html>