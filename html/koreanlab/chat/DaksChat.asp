<!--#include file="./CommData.asp"-->
<%

Set Db = Server.CreateObject("ADODB.Connection")
    db.Open strConnect
    Set Grs = Server.CreateObject("ADODB.Recordset")
    
    sql = "select roomno from roomuser where id='"&id&"'"
    Grs.Open SQL,db,1
    if Not Grs.Eof then%>
  <script language="javascript">
  <!--
  alert("이미 채팅중입니다.");
  self.close();
  //-->
  </script>  
<%
else 
%>
<%
roomType = request("roomType")
roomName = request("roomName")
roomPassword = request("roomPassword")

if roomPassword = "" then roomPassword = "NONE"

roomNo = request("roomNo")
id = lcase(request.cookies("_USERID_"))
name = request.cookies("name")
session("roomno") = roomno
maxMember = request("maxMember")


%>
<html>

<head>
<title>iNOM_CHAT</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<style type="text/css">
A:link {color:#ffffff;text-decoration:none}
A:hover {color:#ff0000;text-decoration:none}
A:visited {color:#ffffff;text-decoration:none}
TH {font-size:9pt}
IMG {border-width:0}
TD {font-size:9pt}
</style>

</head>

<script language="JavaScript">

var baseScreen = "<html>"+
		 "<base target='_blank'>"+
		 "<body>"+
		 "<table border=0 width=100%><tr><td width=100%><font color=#00aa00 style='font-size:12px'>화면을 깨끗이 지웠습니다.</font></td></tr></table>"+
		 "</body>"+
		 "</html>";

var chatBuffer = baseScreen;



var userid     = "<%=lcase(request.cookies("_USERID_"))%>";
var username   = "<%=request.cookies("_NAME_")%>";
var nickname   = "<%=lcase(request.cookies("_USERID_"))%>";

function init(){
	window.opener.location.reload();
}


function addMessage(msg)
{
    
    chatscreen.document.body.insertAdjacentHTML("beforeEnd", msg)
    

    chatscreen.scroll(0, 9999999);
    
}
function clearMessage()
{
    chatBuffer = baseScreen;
    chatscreen.document.open();
    chatscreen.document.writeln(chatBuffer);
    chatapplet.getMessage();
    chatscreen.document.close();
}
function repaint()
{
    
}
function init()
{
    chatapplet.reqMakeRoom("IP-ADDRESS", "25006", "<%=roomType%>", "<%=roomName%>", "<%=roomPassword%>", "<%=roomNo%>","<%=maxMember%>");
	// IP-ADDRESS 는 서버의 주소를 적어준다.
}
function initRoomInfo(sid, rid)
{
    serverID = sid;
    roomID = rid;
}
function setRoomUserList(masterID, userList)
{
    chatuser.setRoomUserList(masterID, userList);
}




</script>




<frameset rows="0, *" cols="*" BORDER=0 FRAMESPACING=0 frameborder="NO">
  <frame id="chatapplet" name="chatapplet" SCROLLING="NO" src="Daksapplet.asp">
   <frameset rows="40, *" cols="*" BORDER=0 FRAMESPACING=0 frameborder="NO">
    <frame id="chatad" name="chatad" SCROLLING="NO" src="DaksChatAd.asp">
    <frameset rows="32, *" cols="*" BORDER=0 FRAMESPACING=0 frameborder="NO">
      <frame id="chatmenu" name="chatmenu" SCROLLING="NO" src="DaksChatMenu.asp">
      <frameset rows="*, 67" cols="*" BORDER=0 FRAMESPACING=0 frameborder="NO">
          <frameset rows="*" cols="*, 132" BORDER=0 FRAMESPACING=0>
          <frame id="chatscreen" name="chatscreen" src="DaksChatS.asp">
          <frame id="chatuser" name="chatuser" src="DaksUser.asp">
        </frameset>
        <frame id="chatinput" name="chatinput" SCROLLING="NO" src="DaksInput.asp">
      </frameset>
    </frameset>
  </frameset>
</frameset><noframes></noframes>

</html>                             
<%end if%>