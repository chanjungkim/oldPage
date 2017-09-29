<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="javascript">
	function forward(){
	}
</script>
</head>
<body>
<%
	String id = request.getParameter("id");
	session.setAttribute("LoginId", id);
%>
<h4><%=session.getAttribute("LoginId")+"님 로그인 환영합니다."%></h4>
<a href="mission01_status.jsp"><button>상태 보기</button></a>
	<a href='javascript:history.go(-1)'><button>로그 아웃</button></a>
</body>
</html>