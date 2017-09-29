<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>test02_login_status.jsp</title>
</head>
<body>
	<%
		String loginId = 
			(String) session.getAttribute("loginId");
		if(loginId == null){
			out.println("<h3>로그인 정보 없음</h3>");
			out.println("<a href='test02_login_form.jsp'>");
			out.println("[로그인 하러가기]");
			out.println("</a>");
		} else {
			out.println("<h3>"+loginId+"님 로그인 된 상태입니다.</h3>");
			out.println("<a href='test02_logout.jsp'>");
			out.println("[로그아웃 하러가기]");
			out.println("</a>");			
		}
	%>
</body>
</html>