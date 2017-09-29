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
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	RequestDispatcher dispatcher = null;
	if(id.equals("admin") && pw.equals("1234")){
		dispatcher = (RequestDispatcher) request.getRequestDispatcher("mission01_loginSuccess.jsp");
		
		if( request.getParameter("chk") == "true" ){
			// 현재 서블릿은 요청을 받으면 쿠키 객체를 하나 생성함
			Cookie cookie = new Cookie("savedId", (String)session.getAttribute("LoginId"));

// cookie.setMaxAge(60);
			// 생성한 쿠키 객체를 response 객체에 추가시키면
			// 클라이언트에게 전달됨
			response.addCookie(cookie);
			out.println("쿠키를 만들어서 응답하였습니다.");			
		}
	}else{
		dispatcher = (RequestDispatcher) request.getRequestDispatcher("mission01_loginFail.jsp");
	}
	dispatcher.forward(request, response);
%>
</body>
</html>