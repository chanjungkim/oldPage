<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>upload_result.jsp</title>
</head>
<body>
	<h2>파일 업로드가 완료되었습니다.</h2>
	업로드 결과 : ${uploadResult}<br>
	<a href="file.do?task=fileList">[파일 목록으로]</a>
	<a href="file.do?task=uploadForm">[업로드 또하기]</a>
</body>
</html>