<!--#include file="./CommData.asp"-->
<html>
<%
id = Ucase(request.cookies("_USERID_"))

Set Db = Server.CreateObject("ADODB.Connection")
    db.Open strConnect
     Set Grs = Server.CreateObject("ADODB.Recordset")
     sql = "select master, roomno from roomuser where id = '"&id&"'"
	Grs.Open SQL,db,1

master = trim(Grs("master"))
roomno = trim(Grs("roomno"))

Grs.close


if Not master = "Y" then
%>     
<script language="javascript">
<!--
	alert("<%=id%> 님은 방장이 아니므로 변경 할 수 없습니다.");
	self.close();
//-->
</script>
<%end if%>

<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<style type="text/css">
<!--
.qq {  font-size: 9pt; text-decoration: none}
-->
</style>
<%
sql = "select maxmember, roomname , roompass from roomlist where roomno = '"&roomno&"'"
Grs.Open SQL,db,1

maxmember = trim(Grs("maxmember"))
roomname = trim(Grs("roomname"))
roompass = trim(Grs("roompass"))

	if roompass = "NONE" then roompass = "" 
Grs.close
	%>


<script language="JavaScript">
var roomType   = "0";
var maxMember  = "<%=maxmember%>";
var roomName   = "";
var masterID   = "ilydi";
var userList   = "ilydi착한넘김동일251".split("");

function init()
{
    
    
    
    var maxNumIndex = 0;
    switch(maxMember*1)
    {
	case 2  : maxNumIndex = 0; break;
	case 3  : maxNumIndex = 1; break;
	case 4  : maxNumIndex = 2; break;
	case 5  : maxNumIndex = 3; break;
	case 6  : maxNumIndex = 4; break;
	case 8  : maxNumIndex = 5; break;
	case 10 : maxNumIndex = 6; break;
	case 14 : maxNumIndex = 7; break;
	case 20 : maxNumIndex = 8; break;
	case 30 : maxNumIndex = 9; break;
	default : maxNumIndex = 10;
    }
    //document.changeRoomInfoForm.maxMember.selectedIndex = maxNumIndex;
    
    //changeRoomInfoForm.roomName.value = roomName;
}

function changeRoomInfo()
{
    var roomType = 0;
    var roomPassword = document.changeRoomInfoForm.roomPassword.value;
    if(roomPassword.length > 1)
        roomType = 1;
    if(roomPassword.length > 10)
    {
        alert("암호는 10자 이하입니다.");
        return;
    }
   
    
    var maxMember = document.changeRoomInfoForm.maxMember.value;
    var roomName = document.changeRoomInfoForm.roomName.value;
    if(roomName.length < 2)
    {
        alert("방 이름은 최소한 2자 이상 입력 하셔야 합니다.");
        document.changeRoomInfoForm.roomName.focus();
        return;
    }
    if(roomName.length >= 90)
    {
        roomName = roomName.substring(0, 90);
        return;
    }
    roomName = roomName.split("<").join("&lt;").split(">").join("&gt;");
    
    changeRoomInfoForm.submit();         
    return ;
    
     
}

</script>

</head>

<body bgcolor="#FFFFFF" marginwidth="0" marginheight="0" topmargin="0" leftmargin="0">
<table width="272" border="0" cellspacing="0" cellpadding="0" height="200" >
<form id="changeRoomInfoForm" name="changeRoomInfoForm" Method="Post" Action="roominfo_ok.asp?roomno=<%=roomno%>" onSubmit="return changeRoomInfo()">  
  <tr bgcolor="#d7ebcc"> 
    <td> 
      <table width="90" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="24">&nbsp;</td>
          <td width="96"><img src="./chatting_pop_04/title.gif" width="119" height="39"></td>
        </tr>
      </table>
    </td>
  </tr>
  <tr bgcolor="#d7ebcc"> 
    <td> 
      <table width="247" border="5" cellspacing="0" cellpadding="0" bordercolor="#b2b2b2" bgcolor="#FFFFFF" align="center" height="132">
        <tr> 
          <td colspan="3" height="105"> 
            <table width="228" border="0" cellspacing="0" cellpadding="0" height="66">
              <tr> 
                <td class="qq" height="7">
                  <table width="222" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                      <td width="118"><img src="./chatting_pop_04/icon_01.gif" width="64" height="4"><span class="qq">방제목</span> 
                      </td>
                      <td width="98"> 
                        <input size=12 type="text" id="roomName" name="roomName" value="<%=roomname%>">
                      </td>
                    </tr>
                  </table>
                </td>
                <td class="qq" height="7">&nbsp;</td>
              </tr>
              <tr> 
                <td class="qq" height="2" colspan="2">
                  <table width="222" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                      <td width="118"><img src="./chatting_pop_04/icon_02.gif" width="84" height="4"><span class="qq">암호 
                        </span> </td>
                      <td width="98"> 
                        <input size=12 type="text" id="roomPassword" name="roomPassword" value="<%=roompass%>">
                      </td>
                    </tr>
                  </table>
                </td>
              </tr>
              <tr> 
                <td class="qq" colspan="2">
                  <table width="222" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                      <td width="115"><img src="./chatting_pop_04/icon_03.gif" width="58" height="4"><span class="qq">최대인원</span></td>
                      <td width="95">
                        <select id="maxMember" name="maxMember">
		  <option value=2>2명
		  <option value=3>3명
		  <option value=4>4명
		  <option value=5>5명
		  <option value=6>6명
		  <option value=8>8명
		  <option value=10>10명
		  <option value=14>14명
		  <option value=20>20명
		  <option value=30>30명
		  <option value=9999999>무제한
                </select>
                      </td>
                    </tr>
                  </table>
                </td>
              </tr>
              <tr> 
                <td class="qq" height="21" colspan="2">
                  <table width="222" border="0" cellspacing="0" cellpadding="0">
                    <tr> 
                      <td width="115"><img src="./chatting_pop_04/icon_04.gif" width="58" height="4"><span class="qq">방장변경</span></td>
                      <td width="95"> 
<%
sql = "select id, name from roomuser where roomno = '"&roomno&"'"
Grs.Open SQL,db,1 
%>                      <select id="List" name="List">
                        <option value="##" selected>사용자
<%For i = 1 to 100
		if Grs.EOF then
			exit for
			Grs.close
		
		end if
		
		if Not id = Ucase(trim(Grs("id"))) then %>
                
                <option  value="<%=trim(Grs("id"))%>"><%=Grs("id")%>
                
                <%
                end if
                
                Grs.MoveNext
                next%>                        
                        </select>
                      </td>
                    </tr>
                  </table>
                </td>
              </tr>
            </table>
          </td>
        </tr>
      </table>
    </td>
  </tr>
  <tr bgcolor="#d7ebcc"> 
    <td height="2"> 
      <div align="right">
        <table width="0" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="163"><a href="javascript:top.location.assign('./chatting_pop_05.asp?roomno=<%=roomno%>')"><img src="./chatting_pop_04/button_01.gif" width="45" height="36" border=0></a> 
            		    <a href="javascript:changeRoomInfo()"><img src="./chatting_pop_04/button_02.gif" width="45" height="36" border=0></a>
            		    <a href="javascript:window.close()"><img src="./chatting_pop_04/button_03.gif" width="50" height="36" border=0></a>
            </td>
            <td width="8">&nbsp;</td>
          </tr>
        </table>
        
      </div>
    </td>
  </tr>
</table>
</body>
</html>
