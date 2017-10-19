<%@page import="java.util.ArrayList"%>
<%@page import="vo.MessageVO"%>
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
<table border="1" width="50%">
	<tr>
		<th width="5%">번호</th>
		<th width="29%">제목</th>
		<th width="8%">ID</th>
		<th width="8%">일자</th>
	</tr>
	<%
	List<MessageVO> messageList = (List<MessageVO>) request.getAttribute("bookList");
	System.out.println(messageList.size());
	if(messageList != null && messageList.size() > 0){
		for(MessageVO message: messageList){%>
	<tr>
		<td><%=message.getMessageNum()%></td>
		<td><a href="<%=request.getContextPath()%>/MessageServlet?
		id=<%=message.getMessageNum()%>&
		userId=<%=message.getUserId()%>"><%=message.getTitle()%></a></td>
		<td><%=message.getUserId()%></td>
		<td><%=message.getWriteDate()%></td>
	</tr>
	<%
		}
	}else{%>
		<h4>게시글이 없습니다.</h4>
	<%
	}%>
</table>
<a href="<%=request.getContextPath()%>/MessageServlet?type=write_form"><Button>글쓰기</Button></a>
</body>
</html>