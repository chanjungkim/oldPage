<%@page import="vo.Article"%>
<%@page import="vo.ArticlePageVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>게시판 목록</title>

<meta http-equiv="Content-type" content="text/html; charset=utf-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<%
// 요청을 받은 자바 서블릿이 set한 페이지 데이터를 get으로 꺼내기
	ArticlePageVO articlePage = 
		(ArticlePageVO) request.getAttribute("articlePage");
%>
<body>
	<h2>이곳은 심플 게시판 화면 입니다.</h2>
	<table border="1" style="width:50%">
		<tr>
			<th width="8%">글번호</th>
			<th width="40%">제목</th>
			<th width="15%">작성자</th>
			<th width="38%">작성일</th>
			<th width="14%">조회수</th>
		</tr>
	<%if(articlePage.getArticleList().size()==0){ %>
		<tr>
			<td colspan="5">
				작성된 게시글이 존재하지 않습니다.
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
<!-- 하단 페이지 링크 걸기 -->
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
			<button>글쓰기</button>
		</a>
	</div>
</body>
</html>




