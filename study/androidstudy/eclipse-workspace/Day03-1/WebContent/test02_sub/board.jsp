<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- board.jsp -->
<%
	// DBDBDBDBDBDB �۾� ������ �ϴ���
	// �Ʒ� ������ �����͸� ��򰡿��� ��������
	int articleNum = 1;
	String title = "�Խñ� ���� ����";
	String writer = "������";
	Date date = new Date();
	int readCount = 0;
%>
<table>
	<tr>
		<th>�۹�ȣ</th>
		<th>����</th>
		<th>�ۼ���</th>
		<th>�ۼ���</th>
		<th>��ȸ��</th>
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




