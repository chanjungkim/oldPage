<%@page import="vo.Article"%>
<%@page import="vo.ArticlePageVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>�Խ��� ���</title>
</head>
<%
// ��û�� ���� �ڹ� ������ set�� ������ �����͸� get���� ������
	ArticlePageVO articlePage = 
		(ArticlePageVO) request.getAttribute("articlePage");
%>
<body>
	<h2>�̰��� ���� �Խ��� ȭ�� �Դϴ�.</h2>
	<table border="1">
		<tr>
			<th>�۹�ȣ</th>
			<th>����</th>
			<th>�ۼ���</th>
			<th>�ۼ���</th>
			<th>��ȸ��</th>
		</tr>
	<%if(articlePage.getArticleList().size()==0){ %>
		<tr>
			<td colspan="5">
				�ۼ��� �Խñ��� �������� �ʽ��ϴ�.
			</td>
		</tr>
	<%}else{%>
		<%for(Article article: articlePage.getArticleList()){ %>
			<tr>
				<td><%=article.getAritlcleNum()%></td>
				<td><a href="<%=request.getContextPath()%>
				/board?type=read&articleNum=<%=article.getAritlcleNum()%>"><%=article.getTitle()%></a></td>
				<td><%=article.getWriter()%></td>
				<td><%=article.getWriteDate()%></td>
				<td><%=article.getReadCount()%></td>
			</tr>
		<%}%>
	<%} %>		
	</table>
<!-- �ϴ� ������ ��ũ �ɱ� -->
	<div>
		<%
			int startPage = articlePage.getStartPage();
			int endPage = articlePage.getEndPage();
			for(int i=startPage; i<=endPage; i++){
		%>
			<a href="board?p=<%=i%>"> <%=i%> </a>
		<%	} %>
	</div>
	<div>
		<a href=
		"<%=request.getContextPath()%>/board?type=writeForm">
			<button>�۾���</button>
		</a>
	</div>
</body>
</html>




