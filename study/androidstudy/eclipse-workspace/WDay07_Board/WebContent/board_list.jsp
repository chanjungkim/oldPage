<%@page import="vo.Article"%>
<%@page import="vo.ArticlePageVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>�Խ��� ���</title>

<meta http-equiv="Content-type" content="text/html; charset=utf-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<%
// ��û�� ���� �ڹ� ������ set�� ������ �����͸� get���� ������
	ArticlePageVO articlePage = 
		(ArticlePageVO) request.getAttribute("articlePage");
%>
<body>
	<h2>�̰��� ���� �Խ��� ȭ�� �Դϴ�.</h2>
	<table border="1" style="width:50%">
		<tr>
			<th width="8%">�۹�ȣ</th>
			<th width="40%">����</th>
			<th width="15%">�ۼ���</th>
			<th width="38%">�ۼ���</th>
			<th width="14%">��ȸ��</th>
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
				<td>
					<a href="<%=request.getContextPath()%>/board?type=read&articleNum=<%=article.getAritlcleNum()%>">
						<%=article.getTitle()%>
					</a>
				</td>
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




