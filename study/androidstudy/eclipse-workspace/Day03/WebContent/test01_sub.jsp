<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	int sum=0;
	for(int i=1; i<=10; i++){
		sum+=i;
	}
%>
	<b>�� �κ��� sub �� �ۼ��� html ���� �κ��Դϴ�.</b><br>
	1~10������ �� : <b><%=sum%></b><br>
	
