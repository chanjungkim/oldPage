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
	String title = "�ݰ����ϴ�~";
	String contents = "ù �����߽��ϴ� ����";
	String writer = "test04";
%>
<% if(currentId.equals(writer)){ %>
<h1>���� ��</h1>
<table border="1">
	<tr>
		<th>����</th>
		<th>�� ����</th>
		<th>�۾���</th>
	</tr>
	<tr>
		<td><%=title %></td>
		<td><%=contents %></td>
		<td><%=currentId %></td>
	</tr>
	<tr>
		<td colspan="3"><button>����</button><button>����</button>
		</td>
	</tr>
</table>
<%}else{%>
<h1>�ٸ� ��</h1>
<table border="1">
	<tr>
		<th>����</th>
		<th>�� ����</th>
		<th>�۾���</th>
	</tr>
	<tr>
		<td><%=title %></td>
		<td><%=contents %></td>
		<td><%=writer %></td>
	</tr>
	<tr>
		<td colspan="3"><button>��۴ޱ�</button>
		</td>
	</tr>
</table>
<%}%>
</body>
</html>