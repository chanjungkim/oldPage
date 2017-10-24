<%@page import="vo.Article"%>
<%@page import="vo.ArticlePageVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>�Խ��� ���</title>
<!-- �������� �ּ�ȭ�� �ֽ� CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- �ΰ����� �׸� -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- �������� �ּ�ȭ�� �ֽ� �ڹٽ�ũ��Ʈ -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<%
// ��û�� ���� �ڹ� ������ set�� ������ �����͸� get���� ������
	ArticlePageVO articlePage = 
		(ArticlePageVO) request.getAttribute("articlePage");
%>
<body>
<jsp:include page="../menu.jsp"/>

	<h2>�̰��� ���� �Խ��� ȭ�� �Դϴ�.</h2>
	<table class="table table-striped table-hover">
		<thead>
		<tr>
			<th>�۹�ȣ</th>
			<th>����</th>
			<th>�ۼ���</th>
			<th>�ۼ���</th>
			<th>��ȸ��</th>
		</tr>
		</thead>
		<tbody>
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
	</tbody>	
	</table>
<!-- �ϴ� ������ ��ũ �ɱ� -->
	<div class="text-center">
		<ul class="pagination">
		<%
			int startPage = articlePage.getStartPage();
			int endPage = articlePage.getEndPage();
			for(int i=startPage; i<=endPage; i++){
		%>
			<li><a href="board?type=boardList&p=<%=i%>"> <%=i%> </a></li>
		<%	} %>
		</ul>
	</div>
	<div>
		<a href=
		"<%=request.getContextPath()%>/board?type=writeForm">
			<button>�۾���</button>
		</a>
	</div>
</body>
</html>




