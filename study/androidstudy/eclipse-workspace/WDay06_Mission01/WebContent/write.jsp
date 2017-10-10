<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/MessageServlet" method="post">
	<div>
		<label>제목</label><textarea name="title" rows="1" cols="80"></textarea>
	</div>
	<div>
		<label>내용</label><textarea name="message" rows="30" cols="80"></textarea>
	</div>
	<Button onclick="javascript:history.go(-1)">뒤로가기</Button>
	<input type="hidden" name="type" value="addMessage">
	<input type="hidden" name="userId" value="<%=request.getAttribute("userId") %>>">
	<input type="submit" value="완료">
</form>
</body>
</html>