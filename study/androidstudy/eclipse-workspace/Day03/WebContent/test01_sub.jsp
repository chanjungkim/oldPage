<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	int sum=0;
	for(int i=1; i<=10; i++){
		sum+=i;
	}
%>
	<b>이 부분은 sub 가 작성한 html 문서 부분입니다.</b><br>
	1~10까지의 합 : <b><%=sum%></b><br>
	
