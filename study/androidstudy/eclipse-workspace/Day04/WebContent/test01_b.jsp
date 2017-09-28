<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>test01_b.jsp</title>
</head>
<body>
<h2>내장 객체의 속성값 목록</h2>
page attr : <%=pageContext.getAttribute("attr1") %> <br>
request attr : <%=request.getAttribute("attr2") %> <br>
session attr : <%=session.getAttribute("attr3") %> <br>
application : <%=application.getAttribute("attr4") %> <br>

</body>
</html>