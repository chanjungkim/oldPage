<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>test02_login_success.jsp</title>
</head>
<body>
<%
	// 로그인 성공 기록을 session에 저장
	session.setAttribute("loginId", request.getParameter("id"));
%>
로그인 완료되었습니다.<br>
<b><%=session.getAttribute("loginId")%></b> 님 환영합니다.<br>
<a href="test02_login_status.jsp">
	<button>로그인 상태보기</button>
</a>

</body>
</html>