<html>
<!--#include file="./CommData.asp"-->
<%
mMyUserid	= Request.Cookies("_USERID_")
mMyID		= Request.Cookies("_ID_")
%>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr align="center"> 
				<td> 
				<table width="540" border="0" cellspacing="0" cellpadding="0">
                                <tr> 
                                <td>&nbsp;</td>
                                </tr>

<table width="580" border="0" cellspacing="0" cellpadding="0">

<tr>
<td>
<!-- 닥스  채팅방 리스트 시작 -->
<table width="568" border="0" cellspacing="0" cellpadding="0" align="center">
<tr>
<td class="pt9">
<%

dim db, sql, result
Set Db = Server.CreateObject("ADODB.Connection")
    db.Open strConnect
	sql = "select count(*) as total_room from roomlist"
	set result = db.execute(sql)
%>    

<!-- 현재 진행중인 채팅방-->
<font color="#666666">현재 진행중인 (비밀방 포함)</font> 채팅방 <%=result("total_room")%> 개 
<%
sql = "select count(*) as total_user from roomuser"
	set result = db.execute(sql)
%>    

채팅인원 <%=result("total_user")%> 명 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
<div align=right><a href="javascript:location.reload()" title="새로 고침"><img src="image/reroad.gif" width="13" height="16" align="absmiddle" border="0">
<font color="336633">새로고침</font></a> <br></div>
<!-- 테두리 테이블-->
<table width="568" border="1" cellspacing="0" cellpadding="0" align="center" bordercolorlight="B4BEAB" bordercolordark="#FFFFFF">
<tr> 
<td>
<!-- 채팅방 주제별 리스트-->
<table width="540" border="0" cellspacing="0" cellpadding="3" align="center">
<tr> 
<%

sql = "select count(*) as low from roomlist where roomtype = 'low'"
	set result = db.execute(sql)
	r_c = cint(result("low"))
%>


<td  class="pt9" width="180" valign="top"> <img src="image/chat_list.gif" width="4" height="4" align="absmiddle" vspace="7"><%if r_c > 0 then %><a href="./chatting_list.asp?index=low"><%end if%> 초보방 (<%=result("low")%>)<%if r_c > 0 then %></a><%end if%><br>

<%	

sql = "select count(*) as high from roomlist where roomtype = 'high'"
	set result = db.execute(sql)
	r_c = cint(result("high"))
%>

<img src="image/chat_list.gif" width="4" height="4" align="absmiddle" vspace="7"><%if r_c > 0 then %><a href="./chatting_list.asp?index=high"><%end if%> 고수방 (<%=result("high")%>)<%if r_c > 0 then %></a><%end if%><br>


<%	

sql = "select count(*) as TV from roomlist where roomtype = 'TV'"
	set result = db.execute(sql)
	r_c = cint(result("TV"))	
%>

<img src="image/chat_list.gif" width="4" height="4" align="absmiddle" vspace="7"> <%if r_c > 0 then %><a href="./chatting_list.asp?index=TV"><%end if%> TV / 연예 (<%=result("TV")%>)<%if r_c > 0 then %></a><%end if%><br>

<%
sql = "select count(*) as culture from roomlist where roomtype = 'culture'"
	set result = db.execute(sql)
	r_c = cint(result("culture"))
%>

<img src="image/chat_list.gif" width="4" height="4" align="absmiddle" vspace="7"><%if r_c > 0 then %><a href="./chatting_list.asp?index=culture"><%end if%> 문학 (<%=result("culture")%>)<%if r_c > 0 then %></a><%end if%><br>
<%	

sql = "select count(*) as movie from roomlist where roomtype = 'movie'"
	set result = db.execute(sql)
	r_c = cint(result("movie"))
%>


<img src="image/chat_list.gif" width="4" height="4" align="absmiddle" vspace="7"><%if r_c > 0 then %><a href="./chatting_list.asp?index=movie"><%end if%> 영화 (<%=result("movie")%>)<%if r_c > 0 then %></a><%end if%></td>

<td  class="pt9" width="180" valign="top">


<%
sql = "select count(*) as cartoon from roomlist where roomtype = 'cartoon'"
	set result = db.execute(sql)
	r_c = cint(result("cartoon"))
%>

<img src="image/chat_list.gif" width="4" height="4" align="absmiddle" vspace="7"><%if r_c > 0 then %><a href="./chatting_list.asp?index=cartoon"><%end if%> 만화 (<%=result("cartoon")%>) <%if r_c > 0 then %></a><%end if%><br>
<%
sql = "select count(*) as English from roomlist where roomtype = 'English'"
	set result = db.execute(sql)
	r_c = cint(result("English"))
%>   
<img src="image/chat_list.gif" width="4" height="4" align="absmiddle" vspace="7"><%if r_c > 0 then %><a href="./chatting_list.asp?index=English"><%end if%> English (<%=result("English")%>) <%if r_c > 0 then %></a><%end if%><br>
<%
sql = "select count(*) as humor from roomlist where roomtype = 'humor'"
	set result = db.execute(sql)
	r_c = cint(result("humor"))
%>
<img src="image/chat_list.gif" width="4" height="4" align="absmiddle" vspace="7"><%if r_c > 0 then %><a href="./chatting_list.asp?index=humor"><%end if%> 유머 / 잡담 (<%=result("humor")%>) <%if r_c > 0 then %></a><%end if%><br>
<%
sql = "select count(*) as internet from roomlist where roomtype = 'internet'"
	set result = db.execute(sql)
	r_c = cint(result("internet"))
%>  
<img src="image/chat_list.gif" width="4" height="4" align="absmiddle" vspace="7"><%if r_c > 0 then %><a href="./chatting_list.asp?index=internet"><%end if%> 인터넷 (<%=result("internet")%>) <%if r_c > 0 then %></a><%end if%><br>
<%	
sql = "select count(*) as sports from roomlist where roomtype = 'sports'"
	set result = db.execute(sql)
	r_c = cint(result("sports"))							
%>   
<img src="image/chat_list.gif" width="4" height="4" align="absmiddle" vspace="7"><%if r_c > 0 then %><a href="./chatting_list.asp?index=sports"><%end if%> 스포츠 (<%=result("sports")%>)<%if r_c > 0 then %></a><%end if%><br>
<%
sql = "select count(*) as 비밀방 from roomlist where roomtype = '1:1채팅'"
	set result = db.execute(sql)
	r_c = cint(result("비밀방"))	
%>
<img src="image/chat_list.gif" width="4" height="4" align="absmiddle" vspace="7"><%if r_c > 0 then %><%end if%> 1:1채팅방 (<%=result("비밀방")%>)<%if r_c > 0 then %><%end if%> </td>

<td  class="pt9" width="180" valign="top">
<%
sql = "select count(*) as game from roomlist where roomtype = 'game'"
	set result = db.execute(sql)
	r_c = cint(result("game"))	
%>
<img src="image/chat_list.gif" width="4" height="4" align="absmiddle" vspace="7"><%if r_c > 0 then %><a href="./chatting_list.asp?index=game"><%end if%> 게임 (<%=result("game")%>) <%if r_c > 0 then %></a><%end if%><br>
<%	
sql = "select count(*) as hobby from roomlist where roomtype = 'hobby'"
	set result = db.execute(sql)
	r_c = cint(result("hobby"))	
%>
<img src="image/chat_list.gif" width="4" height="4" align="absmiddle" vspace="7"><%if r_c > 0 then %><a href="./chatting_list.asp?index=hobby"><%end if%> 취미 / 여행 (<%=result("hobby")%>) <%if r_c > 0 then %></a><%end if%><br>
<%
sql = "select count(*) as economy from roomlist where roomtype = 'economy'"
	set result = db.execute(sql)
	r_c = cint(result("economy"))	
%>
<img src="image/chat_list.gif" width="4" height="4" align="absmiddle" vspace="7"><%if r_c > 0 then %><a href="./chatting_list.asp?index=economy"><%end if%> 시사 / 경제 (<%=result("economy")%>)<%if r_c > 0 then %></a><%end if%><br>
<%
sql = "select count(*) as music from roomlist where roomtype = 'music'"
	set result = db.execute(sql)
	r_c = cint(result("music"))	
%>
<img src="image/chat_list.gif" width="4" height="4" align="absmiddle" vspace="7"><%if r_c > 0 then %><a href="./chatting_list.asp?index=music"><%end if%> 음악 (<%=result("music")%>)<%if r_c > 0 then %></a><%end if%> <br>
<%
sql = "select count(*) as etc from roomlist where roomtype = 'etc'"
	set result = db.execute(sql)
	r_c = cint(result("etc"))		
%>  
<img src="image/chat_list.gif" width="4" height="4" align="absmiddle" vspace="7"><%if r_c > 0 then %><a href="./chatting_list.asp?index=etc"><%end if%> 기타 (<%=result("etc")%>)<%if r_c > 0 then %></a><%end if%><br>
<%
sql = "select count(*) as 동호회 from roomlist where roomtype = '동호회'"
	set result = db.execute(sql)
	r_c = cint(result("동호회"))	
%>
<img src="image/chat_list.gif" width="4" height="4" align="absmiddle" vspace="7"><%if r_c > 0 then %><%end if%> 동호회채팅 (<%=result("동호회")%>)<%if r_c > 0 then %><%end if%> </td>

</tr>
</table>
</td>
</tr>
</table>
<!-- 테두리 테이블 끝-->
</td>
</tr>
</table>
<br>
</td>
</tr>
<tr>
<td>
<!-- 두번째 열-->
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
<td width="50%" valign="top"> 
<!-- 채팅방만들기 -->






<%randomize timer*rnd(1)
	no = 5*rnd+1
	roomNo = replace(no,".","")%>




<tr>
<td>
<!-- 두번째 열-->
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
<td width="50%" valign="top"> 
<!-- 채팅방만들기 -->





<table width="275" border="0" cellspacing="0" cellpadding="0" align="center" height="170">
<tr> 
<td class="pt9" background="image/01.gif">
<img src="image/01.gif" width="5" height="26" align="absmiddle"><img src="image/new_chat.gif" width="33" height="16" align="absmiddle"> 
채팅방 만들기 </td>
</tr>
<tr bgcolor="F0F3ED"> 
<td> 
<!-- 폼 시작-->

<script language="javascript">
<!--
function init()
{
    
    document.makeRoomForm.roomName.focus();
}

function createChat(roomType, roomName, roomPassword, roomNo, maxMember)
{
    var today = new Date();
    createchat = window.open("./dakschat.asp?roomType="+roomType+"&roomPassword="+roomPassword+"&roomName="+roomName+"&roomNo="+roomNo+"&maxMember="+maxMember, "createchat","fullscreen=no,titlebar=no,toolbar=no,directories=no,status=no,menubar=no,scrollbars=no,resizable=yes,width=650,height=480")
}


function makeRoom()
{
    
    var roomType = 0;
    var maxMember = 10;
    var roomPassword = document.makeRoomForm.roomPassword.value;
    if(roomPassword.length > 1)
        roomType = 1;
    
    var roomName = document.makeRoomForm.roomName.value;
    var roomType = document.makeRoomForm.roomType.value;
    var maxMember = document.makeRoomForm.maxMember.value;
    
    if(roomName.length < 2)
    {
        alert("방 이름은 최소한 2자 이상 입력 하셔야 합니다.");
        document.makeRoomForm.roomName.focus;
        return;
    }
    
    if(roomPassword.length > 8)
    {
        alert("암호는 8자 이하입니다.");
        document.makeRoomForm.roomPassword.focus;
        return;
    }
   

   
    
    if(roomName.length >= 30)
    {
        roomName = roomName.substring(0, 30);
        return;
    }
    roomName = roomName.split("<").join("&lt;").split(">").join("&gt;");

    createChat(roomType, roomName, roomPassword, <%=roomNo%>, maxMember);
   
    
    

}
function help() {
	window.open('/FeelingPub/lovechat/send_memo/messenger/help.asp','help','width=300,height=300,resizable=no');

}

//-->
</script>





<table width="270" border="0" cellspacing="0" cellpadding="1" align="center">
<form id="makeRoomForm" name="makeRoomForm" onSubmit="return makeRoom()">	
<tr> 
<td class="pt9" width="90" align="right">채팅방주제 </td>
<td>&nbsp; 
<select id="roomType" name="roomType">
	<option  value=low>초보방
	<option  value=high>고수방
	<option  value=music>음악
	<option  value=TV>TV/연예
	<option  value=culture>문학
	<option  value=movie>영화
	<option  value=cartoon>만화
	<option  value=English>English
	<option  value=humor>유머/잡담
	<option  value=internet>인터넷
	<option  value=sports>스포츠
	<option  value=game>게임
	<option  value=hobby>취미/여행
	<option  value=economy>시사/경제
	<option  value=etc>기타
</select>
</td>
</tr>
<tr> 
<td class="pt9" align="right">방제목 </td>
<td>&nbsp;  
<input type="text" id="roomName" name="roomName" size="15">
</td>
</tr>
<tr> 
<td class="pt9" align="right">암호 </td>
<td>&nbsp; 
<input type="text" id="roomPassword" name="roomPassword" size="15" maxlength="10">
</td>
</tr>
<tr> 
<td class="pt9" align="right">최대인원 </td>
<td>&nbsp;  
<select id="maxMember" name="maxMember">
	<option value=2>2명
	<option value=3>3명
	<option value=4>4명
	<option value=5>5명
	<option value=6>6명
	<option value=8>8명
	<option value=10 selected>10명
	<option value=14>14명
	<option value=20>20명
	<option value=30>30명
	<option value=9999999>무제한
</select>
</td>
</tr>
<tr align="center"> 
<td colspan="2">
<a href="javascript:makeRoom()"><img src="image/bn_make.gif" width="64" height="23" border="0"></a>
<a href="javascript:location.reload()"><img src="image/bn_cancle.gif" width="64" height="23" border="0"></a>
</td>
</tr>
</form>
</table>
<!-- 폼 끝-->
</td>
</tr>
<tr> 
<td background="image/02.gif"><img src="image/02.gif" width="5" height="2"></td>
</tr>
</table>
<!-- 채팅방 만들기 테이블 끝-->
</td>

</html>