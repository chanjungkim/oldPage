<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- board.jsp -->
<%
	// DBDBDBDBDBDB 작업 열심히 하는중
	// 아래 나열할 데이터를 어딘가에서 가져오자
	int articleNum = 1;
	String title = "게시글 제목 샘플";
	String writer = "양유진";
	Date date = new Date();
	int readCount = 0;
%>
<table>
	<tr>
		<th>글번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>작성일</th>
		<th>조회수</th>
	</tr>
	<tr>
		<td><%=articleNum%></td>
		<td><%=title %></td>
		<td><%=writer %></td>
		<td><%=date %></td>
		<td><%=readCount %></td>
	</tr>
	<tr>
		<td><%=articleNum%></td>
		<td><%=title %></td>
		<td><%=writer %></td>
		<td><%=date %></td>
		<td><%=readCount %></td>
	</tr>
	<tr>
		<td><%=articleNum%></td>
		<td><%=title %></td>
		<td><%=writer %></td>
		<td><%=date %></td>
		<td><%=readCount %></td>
	</tr>
	<tr>
		<td><%=articleNum%></td>
		<td><%=title %></td>
		<td><%=writer %></td>
		<td><%=date %></td>
		<td><%=readCount %></td>
	</tr>
	<tr>
		<td><%=articleNum%></td>
		<td><%=title %></td>
		<td><%=writer %></td>
		<td><%=date %></td>
		<td><%=readCount %></td>
	</tr>
</table>




