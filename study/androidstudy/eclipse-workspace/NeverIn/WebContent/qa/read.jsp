<%@page import="vo.Article"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>�� �б� ȭ��</title>
</head>
<body>
<jsp:include page="../menu.jsp"/>

<%
	Article article = 
				(Article) request.getAttribute("article");
%>
	<table border="1">
		<tr>
			<td>�۹�ȣ:</td>
			<td><%=article.getAritlcleNum()%></td>
		</tr>
		<tr>
			<td>����:</td>
			<td><%=article.getTitle()%></td>
		</tr>
		<tr>
			<td>�ۼ���:</td>
			<td><%=article.getWriter()%></td>
		</tr>
		<tr>
			<td>�ۼ���:</td>
			<td><%=article.getWriteDate()%></td>
		</tr>
		<tr>
			<td>��ȸ��:</td>
			<td><%=article.getReadCount()%></td>
		</tr>
		<tr>
			<td>����:</td>
			<td><%=article.getContents()%></td>
		</tr>
	</table>
	<a href=
	"<%=request.getContextPath()%>/board?type=updateForm&articleNum=<%=article.getAritlcleNum()%>">
		[�����ϱ�]
	</a>
	<a href=
	"<%=request.getContextPath()%>/board?type=deleteForm&articleNum=<%=article.getAritlcleNum()%>">
		[�����ϱ�]
	</a>
	<a href=
	"<%=request.getContextPath()%>/board?type=boardList">
		[�Խ��� �������]
	</a>
</body>
</html>





