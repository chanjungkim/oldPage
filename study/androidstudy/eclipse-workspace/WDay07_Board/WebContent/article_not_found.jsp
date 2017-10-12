<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>글번호 오류 화면</title>
<meta http-equiv="Content-type" content="text/html; charset=utf-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
	<h2>게시글을 찾을 수 없습니다. 다시 시도해주세요.</h2>
	<a href="<%=request.getContextPath()%>/board?type=boardList">
		홈으로
	</a>

</body>
</html>