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
	
	if(id.equals("nakim02") && pw.equals("1234")){
		request.setAttribute("id", "nakim02");
		request.setAttribute("pw", "1234");
		RequestDispatcher dispatcher = (RequestDispatcher)
				request.getRequestDispatcher("loginSuccess.jsp");
		dispatcher.forward(request, response);
	}else{
		RequestDispatcher dispatcher = (RequestDispatcher)
				request.getRequestDispatcher("loginFail.jsp");
		dispatcher.forward(request, response);
	}
	
	RequestDispatcher dispatcher = (RequestDispatcher)
			request.getRequestDispatcher("loginStatus.jsp");
	dispatcher.forward(request, response);
%>
</body>
</html>