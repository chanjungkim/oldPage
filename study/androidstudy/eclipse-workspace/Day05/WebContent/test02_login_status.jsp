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
			out.println("<h3>�α��� ���� ����</h3>");
			out.println("<a href='test02_login_form.jsp'>");
			out.println("[�α��� �Ϸ�����]");
			out.println("</a>");
		} else {
			out.println("<h3>"+loginId+"�� �α��� �� �����Դϴ�.</h3>");
			out.println("<a href='test02_logout.jsp'>");
			out.println("[�α׾ƿ� �Ϸ�����]");
			out.println("</a>");			
		}
	%>
</body>
</html>