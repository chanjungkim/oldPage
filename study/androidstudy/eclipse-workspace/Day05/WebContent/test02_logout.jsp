<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>test02_logout.jsp</title>
</head>
<body>
<%
	// session�� Ư�� �Ӽ� �� �����ϱ�
	// �� ��쿡�� �ٸ� �Ӽ����� ���ǿ� ���� ���� ����.
// 	session.removeAttribute("loginId");
///////////////////////////////////////////////////
	// ������ �α׾ƿ��� �ϸ� ���� ����ڿ� ���� ��� ������
	// ����� ���ο� ����ڰ� ������ ��ó�� ��ó��.
	session.invalidate(); // ���� ���ǰ�ü ������
%>
<h3>�α׾ƿ� �Ǿ����ϴ�.</h3>
<a href="test02_login_status.jsp">�α��� ���º���</a>
</body>
</html>