<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");

	String userName = request.getParameter("userName");
	String userId = request.getParameter("userId");
	String userPw = request.getParameter("userPw");
	
	String loginInfo = null;
	if(userId.equals("admin")&&userPw.equals("1234")){
		loginInfo = userName+"[관리자]";
	}else{
		loginInfo = userName+"[일반사용자]";
	}
%>
로그인 정보: <b> <%=loginInfo%></b>님 반갑습니다.
</body>
</html>