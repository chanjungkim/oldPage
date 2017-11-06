<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%	
	String currentId = "master";
	String title = "반갑습니다~";
	String contents = "첫 가입했습니다 ㅎㅎ";
	String writer = "test04";
%>
<% if(currentId.equals(writer)){ %>
<h1>같을 때</h1>
<table border="1">
	<tr>
		<th>제목</th>
		<th>글 내용</th>
		<th>글쓴이</th>
	</tr>
	<tr>
		<td><%=title %></td>
		<td><%=contents %></td>
		<td><%=currentId %></td>
	</tr>
	<tr>
		<td colspan="3"><button>수정</button><button>삭제</button>
		</td>
	</tr>
</table>
<%}else{%>
<h1>다를 때</h1>
<table border="1">
	<tr>
		<th>제목</th>
		<th>글 내용</th>
		<th>글쓴이</th>
	</tr>
	<tr>
		<td><%=title %></td>
		<td><%=contents %></td>
		<td><%=writer %></td>
	</tr>
	<tr>
		<td colspan="3"><button>댓글달기</button>
		</td>
	</tr>
</table>
<%}%>
</body>
</html>