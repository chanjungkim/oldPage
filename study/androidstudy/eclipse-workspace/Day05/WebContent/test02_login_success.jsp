<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>test02_login_success.jsp</title>
</head>
<body>
<%
	// �α��� ���� ����� session�� ����
	session.setAttribute("loginId", request.getParameter("id"));
%>
�α��� �Ϸ�Ǿ����ϴ�.<br>
<b><%=session.getAttribute("loginId")%></b> �� ȯ���մϴ�.<br>
<a href="test02_login_status.jsp">
	<button>�α��� ���º���</button>
</a>

</body>
</html>