<%
Dim user, roomno

user = trim(request("list"))
roomno = trim(request("roomno"))

if user = "##" then 
%>
<script language="javascript">
	alert("����ڸ� ��Ȯ�� �����ϼ���");
	top.location.assign("./chatting_pop_05.asp?roomno=<%=roomno%>");
</script>

<%else%>

<script language="javascript">
	opener.parent.chatapplet.inomchat.sendM("444<%=user%>");
	alert("���� ó�� �Ǿ����ϴ�.");
	window.close();
</script>
<%end if%>




