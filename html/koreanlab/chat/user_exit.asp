<%
Dim user, roomno

user = trim(request("list"))
roomno = trim(request("roomno"))

if user = "##" then 
%>
<script language="javascript">
	alert("사용자를 정확히 선택하세요");
	top.location.assign("./chatting_pop_05.asp?roomno=<%=roomno%>");
</script>

<%else%>

<script language="javascript">
	opener.parent.chatapplet.inomchat.sendM("444<%=user%>");
	alert("정상 처리 되었습니다.");
	window.close();
</script>
<%end if%>




