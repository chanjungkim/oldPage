<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<html>
<head>
<title>ȸ������ ȭ��</title>
</head>
<body>
<c:set var="myContextPath" 
			value="${pageContext.request.contextPath}"/>
	<form action="${myContextPath}/member" method="post">
	<input type="hidden" name="task" value="join">
		<table>
			<tr>
				<td>���̵�:</td>
				<td>
					<input type="text" name="id" 
					size="20" placeholder="���̵� �Է��ϼ���.">				
				</td>
			</tr>
			<tr>
				<td>�н�����:</td>
				<td>
					<input type="password" name="pw" 
					size="20" placeholder="�н����带 �Է��ϼ���.">				
				</td>
			</tr>
			<tr>
				<td>�̸�:</td>
				<td>
					<input type="text" name="name" 
					size="20" placeholder="�̸��� �ѱ۷� �Է��ϼ���.">				
				</td>
			</tr>
			<tr>
				<td>�޴���:</td>
				<td>
					<input type="text" name="phone" 
					size="20" placeholder="01012345678">				
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="�ۼ��Ϸ�">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>