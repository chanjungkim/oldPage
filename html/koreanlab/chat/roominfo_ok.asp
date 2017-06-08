<!--#include file="./CommData.asp"-->
<%
Dim roomno, roomName, roomPass, db, sql, list, id

roomno = request("roomno")
roomName = request("roomName")
roomPass = request("roomPassword")

if roomPass = "" then roomPass = "NONE"

maxMember = request("maxMember")
list = request("list")
id = request.cookies("_USERID_")

Set Db = Server.CreateObject("ADODB.Connection")
    db.Open strConnect

sql = "update roomlist set roomname = '"&roomname&"', roompass = '"&roompass&"', maxMember = '"&maxmember&"' where roomno = '"&roomno&"'"

db.execute(sql)

if Not list = "##" then 

sql = "update roomuser set master = 'N' where id = '"&id&"'"

db.execute(sql)

sql = "update roomuser set master = 'Y' where id = '"&list&"'"

db.execute(sql)

end if 

db.close

if Not list = "##" then

%>

<script language="javascript">
<!--	
	
	
	opener.parent.chatapplet.inomchat.sendM("777<%=trim(ucase(list))%>");
	alert("<%=list%> 님에게 방장의 권한을 넘겼습니다.");
	window.close();
	
//-->
</script>

<%else%>
<script language="javascript">
<!--
	
	alert("정상 처리하였습니다.");
	window.close();
	
//-->
</script>
<%end if%>