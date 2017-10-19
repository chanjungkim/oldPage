<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${param.name=='ljr}">
			<h3>안녕하세요 ljr님</h3>
		</c:when>
		<c:when test="${param.age<20}">
			<h3>20세 미만이넹</h3>
		</c:when>
		<c:otherwise>
			<h3>lrj도 아니고 20미만도 아니고</h3>
		</c:otherwise>
	</c:choose>
</body>
</html>