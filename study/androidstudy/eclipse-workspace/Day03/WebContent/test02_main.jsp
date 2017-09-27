<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>test02_main.jsp</title>
</head>
<body>
	<table border="1">
		<tr>
			<td colspan="2">
				<jsp:include page="test02_sub/top.jsp"/>
			</td>
		</tr>
		<tr>
			<td>
				<jsp:include page="test02_sub/left.jsp"/>
			</td>
			<td>
				<jsp:include page="test02_sub/board.jsp"/>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<jsp:include page="test02_sub/bottom.jsp"/>
			</td>
		</tr>
	</table>
</body>
</html>





