<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>test02_logout.jsp</title>
</head>
<body>
<%
	// session의 특정 속성 값 삭제하기
	// 이 경우에는 다른 속성들은 세션에 남아 있을 것임.
// 	session.removeAttribute("loginId");
///////////////////////////////////////////////////
	// 보통은 로그아웃을 하면 현재 사용자에 대한 모든 정보를
	// 지우고 새로운 사용자가 입장한 것처럼 대처함.
	session.invalidate(); // 현재 세션객체 버리기
%>
<h3>로그아웃 되었습니다.</h3>
<a href="test02_login_status.jsp">로그인 상태보기</a>
</body>
</html>