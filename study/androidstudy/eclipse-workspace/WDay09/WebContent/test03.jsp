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
	<c:if test="true">
		<h3>이 문장은 무조건 html문서에 포함됨</h3>
	</c:if>
	
	<c:if test="${param.name=='ljr'}">
		<h3>안녕하세요 ljr님</h3>
	</c:if>
</body>
</html>