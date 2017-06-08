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
  <%end if
  Grs.close
  %>
  
<%roomNo = request("roomNo")%>
<html>
<head>
<script language="JavaScript">

var serverID = "208";
var roomID   = "755544";
var grpID    = "0";
var catCd    = "0200";

function goChat()
{
    var passwd = document.passwdInputForm.passwdInput.value;
    
    if(passwd.length < 1)
    {
        alert("암호를 입력하십시오.");
        return;
    }
    
    createchat = window.open("dakschat_join.asp?roomno="+<%=roomNo%>+"&pass="+passwd,"createchat","fullscreen=no,titlebar=no,toolbar=no,directories=no,status=no,menubar=no,scrollbars=no,resizable=yes,width=640,height=480")  
    
    window.close();
    return false;
}

function init()
{
    document.passwdInputForm.passwdInput.focus();
}

</script>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<style type="text/css">
<!--
.qq {  font-size: 9pt; text-decoration: none}
-->
</style>
</head>

<body bgcolor="#FFFFFF" maginwidth="0" marginheight="0" topmargin="0" leftmargin="0" onload="init();">
<table width="261" border="0" cellspacing="0" cellpadding="0" height="160">
  <tr bgcolor="#d7ebcc"> 
    <td> 
      <table width="136" border="0" cellspacing="0" cellpadding="0" height="37">
        <tr>
          <td width="37">&nbsp;</td>
          <td width="72"><img src="./chatting_pop_06/title.gif" width="108" height="19"></td>
        </tr>
      </table>
    </td>
  </tr>
  <tr bgcolor="#d7ebcc"> 
    <td height="75"> 
      <table width="30" border="5" cellspacing="0" cellpadding="0" bordercolor="#999999" align="center">
      <form id="passwdInputForm" name="passwdInputForm" onSubmit="return goChat()">
        <tr>
          <td>
            <table width="233" cellspacing="0" cellpadding="0" bgcolor="#FFFFFF" align="center" bordercolor="#b2b2b2">
              <tr> 
                <td colspan="3">&nbsp;</td>
              </tr>
              <tr> 
                <td width="1">&nbsp;</td>
                <td width="223"> 
                  <table width="215" border="0" cellspacing="0" cellpadding="0">
                    <tr> 
                      <td class="qq" height="23"><img src="./chatting_pop_02/icon_01.gif" width="71" height="8">암호를 
                        입력하세요 .</td>
                    </tr>
                    <tr> 
                      <td> 
                        <table width="0" border="0" cellspacing="0" cellpadding="0">
                          <tr> 
                            <td width="26">&nbsp;</td>
                            <td width="183"> 
                              <input type="text" id="passwdInput" name="passwdInput" size=25>
                            </td>
                          </tr>
                        </table>
                      </td>
                    </tr>
                  </table>
                </td>
                <td width="7">&nbsp;</td>
              </tr>
              <tr> 
                <td colspan="3" height="3">&nbsp;</td>
              </tr>
            </table>
          </td>
        </tr>
      </table>
    </td>
  </tr>
  <tr bgcolor="#d7ebcc"> 
    <td height="37"> 
      <div align="right"> 
        <table width="120" border="0" cellspacing="2" cellpadding="0">
          <tr> 
            <td width="49" height="23">
              <div align="center"><a href="javascript:goChat()" title="입장"><img src="./chatting_pop_06/button_01.gif" border=0></a></div>
            </td>
            <td width="51" height="23">
              <div align="center"><a href="javascript:window.close()" title="취소"><img src="./chatting_pop_06/button_02.gif" width="42" height="20" border=0></a></div>
            </td>
            <td width="12" height="23">&nbsp;</td>
          </tr>
        </table>
        
      </div>
    </td>
  </tr>
</table>
</body>
</html>
