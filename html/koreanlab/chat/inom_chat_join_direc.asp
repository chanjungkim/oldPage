<!--#include file="./CommData.asp"-->
<%

roomNo = request("roomNo")
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
  <%else
  Grs.close
%>
<script language="javascript">
<!--
var createW = window.open("./DaksChat_join.asp?roomNo="+<%=roomNo%>,"createW","fullscreen=no,titlebar=no,toolbar=no,directories=no,status=no,menubar=no,scrollbars=no,resizable=yes,width=640,height=480")
self.close();
//-->
</script>
<%end if%>
