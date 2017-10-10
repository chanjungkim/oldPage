<%@page import="vo.BookVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	List<BookVO> bookList = (List<BookVO>) request.getAttribute("bookList");

	if(bookList!=null && bookList.size()>0){
	%>
		<table border="1">
			<tr>
				<th>책 번호</th>
				<th>제목</th>
				<th>출판사</th>
				<th>가격</th>
				<th>출판년도</th>
			</tr>
			<%for(BookVO b : bookList){%>
				<tr>
					<td><%=b.getBookId()%></td>
					<td><%=b.getTitle()%></td>
					<td><%=b.getPublisher()%></td>
					<td><%=b.getPrice()%></td>
					<td><%=b.getYear()%></td>
				</tr>
			<%}%>		
		</table>
	<%
	}else{
		out.println("<h2>보여질 책 데이터가 존재하지 않습니다.</h2>");
	}
%>
	<a href="book_form.jsp">책 추가하기</a>
</body>
</html>