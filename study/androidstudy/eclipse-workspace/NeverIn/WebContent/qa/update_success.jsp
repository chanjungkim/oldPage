<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>�����ϱ� �Ϸ�</title>
</head>
<body>
<jsp:include page="../menu.jsp"/>

	<%
		int articleNum = 
			(Integer) request.getAttribute("articleNum");
	%>
	<h2>�����ϱⰡ �Ϸ�Ǿ����ϴ�.</h2>
	<a href=
		"<%=request.getContextPath()%>/board?type=boardList">
		[�Խ��� �������]
	</a>
	<a href=
		"<%=request.getContextPath()%>/board?type=read&articleNum=<%=articleNum%>">
		[������ �� ����]
	</a>
</body>
</html>




