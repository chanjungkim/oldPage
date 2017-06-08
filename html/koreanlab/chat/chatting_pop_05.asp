<!--#include file="./CommData.asp"-->
<%
Dim roomno, id, db, Grs, sql
roomno = request("roomno")
id = request.cookies("_USERID_")

Set Db = Server.CreateObject("ADODB.Connection")
    db.Open strConnect
     Set Grs = Server.CreateObject("ADODB.Recordset")
sql = "select id, name from roomuser where roomno = '"&roomno&"'"
Grs.Open SQL,db,1 

%>
<html>
<head>
<script language="javascript">
resizeTo(270,155);


function changeRoomInfo(){
	changeRoomInfoForm.submit();         
        return ;
}

</script>


<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<style type="text/css">
<!--
.unnamed1 {  font-size: 9pt; text-decoration: none}
-->
</style>
</head>

<body bgcolor="#FFFFFF" marginwidth="0" marginheight="0" topmargin="0" leftmargin="0">
<table width="260" border="0" cellspacing="0" cellpadding="0" height="113">
<form id="changeRoomInfoForm" name="changeRoomInfoForm" Method="Post" Action="user_exit.asp?roomno=<%=roomno%>" onSubmit="return changeRoomInfo()">
  <tr bgcolor="#d7ebcc"> 
    <td> 
      <table width="25" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="22">&nbsp;</td>
          <td width="154"><img src="./chatting_pop_05/title.gif" width="106" height="33" align="right"></td>
        </tr>
      </table>
    </td>
  </tr>
  <tr bgcolor="#d7ebcc"> 
    <td> 
      <table width="237" border="5" cellspacing="0" cellpadding="0" bgcolor="#FFFFFF" bordercolor="#b2b2b2" align="center">
        <tr> 
          <td class="unnamed1" height="43"><img src="./chatting_pop_05/icon_01.gif" width="57" height="4">강퇴대상 
            <center><select id="List" name="List">
                <option value="##" selected>사용자
                <%For i = 1 to 100
		if Grs.EOF then
			exit for
			Grs.close
		
		end if
		
		if Not id = trim(Grs("id")) then %>
                
                <option  value="<%=trim(Grs("id"))%>"><%=Grs("id")%>(<%=Grs("name")%>)
                
                <%
                end if
                
                Grs.MoveNext
                next%>
            </select></center>
          </td>
        </tr>
      </table>
    </td>
  </tr>
  <tr bgcolor="#d7ebcc"> 
    <td height="39"> 
      <div align="right"> 
        <table width="15" border="0" cellspacing="0" cellpadding="0">
          <tr> 
            <td width="36"><a href="javascript:changeRoomInfo()"><img src="./chatting_pop_05/button.gif" width="44" height="37" border=0></a></td>
            <td width="9">&nbsp;</td>
          </tr>
        </table>
      </div>
    </td>
  </tr>
</table>
</body>
</html>
