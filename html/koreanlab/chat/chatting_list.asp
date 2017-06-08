<!--#include file="./CommData.asp"-->
<%
Dim	mMyUserid	:	mMyUserid	= Request.Cookies("_USERID_")
Dim	mMyID		:	mMyID		= Request.Cookies("_ID_")

index = trim(request("index"))

response.buffer=true

id = request.cookies("_USERID_") 

name = request.cookies("_NAME_") 

%>

<SCRIPT LANGUAGE="JavaScript">
<!--
function OpenChatWindow(pUrl) {
	newswin = window.open(pUrl, "ChatWindow" , "scrollbars=no,resizable=no,copyhistory=no,width=700,height=525");
}

function goMakeRoom()
{
   
    createWindow = window.open("./chatting_room.asp?grpid=0&category=0200", "MakeRoomWindow","fullscreen=no,titlebar=no,toolbar=no,directories=no,status=yes,menubar=no,scrollbars=no,resizable=yes,width=243,height=158")
    
}

function createChat(roomType, roomName, roomPassword, roomNo, maxMember)
{
    var today = new Date();
    createchat = window.open("./dakschat.asp?roomType="+roomType+"&roomPassword="+roomPassword+"&roomName="+roomName+"&roomNo="+roomNo+"&maxMember="+maxMember, "createchat","fullscreen=no,titlebar=no,toolbar=no,directories=no,status=no,menubar=no,scrollbars=no,resizable=yes,width=640,height=480")
}

//-->
</SCRIPT>
        <!--메인내용(시작)--> 
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr align="center"> 
				<td> 
		<br><br><br>			
	<!--chatting list 시작-->
		
		
		
	     <table width="540" border="0" cellspacing="0" cellpadding="0">
              <tr align="left" valign="top"> 
                <td> 
 
                  <table width="100%" border="0" cellspacing="0" cellpadding="0">
  
                    <tr> 
                      <td><img src="image/categoly_chatting.gif" width="277" height="24"></td>
                    </tr>
                  </table>
                </td>
              </tr>
              <tr bgcolor="7D7D7D"> 
                <td> 
                  <table width="100%" border="0" cellspacing="1" cellpadding="0">
                    <tr bgcolor="E7E7E7"> 
                      <td> 
                        <table width="100%" border="0" cellspacing="0" cellpadding="5">
                          <tr align="center"> 
                            <td> 
                              <table width="484" border="0" cellspacing="0" cellpadding="0">
                                <tr> 
<%


dim r_c
Set Db = Server.CreateObject("ADODB.Connection")
    db.Open strConnect
	sql = "select count(*) as total_room from roomlist"
	set result = db.execute(sql)
%>    

                                  <%

sql = "select count(*) as low from roomlist where roomtype = 'low'"
	set result = db.execute(sql)
	r_c = cint(result("low"))
%>


                                  <td width="120"><%if r_c > 0 then %><a href="./chatting_list.asp?index=low"><%end if%>초보방 (<%=result("low")%>)<%if r_c > 0 then %></a><%end if%><br>
<%	

sql = "select count(*) as high from roomlist where roomtype = 'high'"
	set result = db.execute(sql)
	r_c = cint(result("high"))
%>

                                    <%if r_c > 0 then %><a href="./chatting_list.asp?index=high"><%end if%>고수방 (<%=result("high")%>)<%if r_c > 0 then %></a><%end if%><br>
<%	

sql = "select count(*) as TV from roomlist where roomtype = 'TV'"
	set result = db.execute(sql)
	r_c = cint(result("TV"))	
%>	
                                    <%if r_c > 0 then %><a href="./chatting_list.asp?index=TV"><%end if%>TV / 연예 (<%=result("TV")%>)<%if r_c > 0 then %></a><%end if%><br>
<%
sql = "select count(*) as culture from roomlist where roomtype = 'culture'"
	set result = db.execute(sql)
	r_c = cint(result("culture"))
%>
                                    <%if r_c > 0 then %><a href="./chatting_list.asp?index=culture"><%end if%>문학 (<%=result("culture")%>)<%if r_c > 0 then %></a><%end if%><br>
<%	

sql = "select count(*) as movie from roomlist where roomtype = 'movie'"
	set result = db.execute(sql)
	r_c = cint(result("movie"))
%>
                                    <%if r_c > 0 then %><a href="./chatting_list.asp?index=movie"><%end if%>영화 (<%=result("movie")%>)<%if r_c > 0 then %></a><%end if%></td>
                                  <td width="7"> 
                                    <div align="center"><img src="image/line.gif" width="5" height="106"></div>
                                  </td>
                                  <td width="7">&nbsp;</td>
<%
sql = "select count(*) as cartoon from roomlist where roomtype = 'cartoon'"
	set result = db.execute(sql)
	r_c = cint(result("cartoon"))
%>
                                  <td width="126"><%if r_c > 0 then %><a href="./chatting_list.asp?index=cartoon"><%end if%>만화 (<%=result("cartoon")%>) <%if r_c > 0 then %></a><%end if%><br>
<%
sql = "select count(*) as English from roomlist where roomtype = 'English'"
	set result = db.execute(sql)
	r_c = cint(result("English"))
%>                                    
                                    <%if r_c > 0 then %><a href="./chatting_list.asp?index=English"><%end if%>English (<%=result("English")%>) <%if r_c > 0 then %></a><%end if%><br>
<%
sql = "select count(*) as humor from roomlist where roomtype = 'humor'"
	set result = db.execute(sql)
	r_c = cint(result("humor"))
%>
                                    <%if r_c > 0 then %><a href="./chatting_list.asp?index=humor"><%end if%>유머 / 잡담 (<%=result("humor")%>) <%if r_c > 0 then %></a><%end if%><br>
<%
sql = "select count(*) as internet from roomlist where roomtype = 'internet'"
	set result = db.execute(sql)
	r_c = cint(result("internet"))
%>                                    
                                    <%if r_c > 0 then %><a href="./chatting_list.asp?index=internet"><%end if%>인터넷 (<%=result("internet")%>) <%if r_c > 0 then %></a><%end if%><br>
<%	
sql = "select count(*) as sports from roomlist where roomtype = 'sports'"
	set result = db.execute(sql)
	r_c = cint(result("sports"))							
%>                                    
                                    <%if r_c > 0 then %><a href="./chatting_list.asp?index=sports"><%end if%>스포츠 (<%=result("sports")%>)<%if r_c > 0 then %></a><%end if%><br>



<%
sql = "select count(*) as 비밀방 from roomlist where roomtype = '1:1채팅'"
	set result = db.execute(sql)
	r_c = cint(result("비밀방"))	
%>
                                    <%if r_c > 0 then %><%end if%>1:1채팅방 (<%=result("비밀방")%>)<%if r_c > 0 then %><%end if%> </td>



                                  <td width="5"><img src="image/line.gif" width="5" height="106"></td>
                                  <td width="7">&nbsp; </td>
<%
sql = "select count(*) as game from roomlist where roomtype = 'game'"
	set result = db.execute(sql)
	r_c = cint(result("game"))	
%>

                                  <td width="196"><%if r_c > 0 then %><a href="./chatting_list.asp?index=game"><%end if%>게임 (<%=result("game")%>) <%if r_c > 0 then %></a><%end if%><br>
<%	
sql = "select count(*) as hobby from roomlist where roomtype = 'hobby'"
	set result = db.execute(sql)
	r_c = cint(result("hobby"))	
%>
                                    <%if r_c > 0 then %><a href="./chatting_list.asp?index=hobby"><%end if%>취미 / 여행 (<%=result("hobby")%>) <%if r_c > 0 then %></a><%end if%><br>
<%
sql = "select count(*) as economy from roomlist where roomtype = 'economy'"
	set result = db.execute(sql)
	r_c = cint(result("economy"))	
%>
                                    <%if r_c > 0 then %><a href="./chatting_list.asp?index=economy"><%end if%>시사 / 경제 (<%=result("economy")%>)<%if r_c > 0 then %></a><%end if%> <br>



<%
sql = "select count(*) as music from roomlist where roomtype = 'music'"
	set result = db.execute(sql)
	r_c = cint(result("music"))	
%>
                                    <%if r_c > 0 then %><a href="./chatting_list.asp?index=music"><%end if%>음악 (<%=result("music")%>)<%if r_c > 0 then %></a><%end if%> <br>





<%
sql = "select count(*) as etc from roomlist where roomtype = 'etc'"
	set result = db.execute(sql)
	r_c = cint(result("etc"))		
%>                                      
                                    <%if r_c > 0 then %><a href="./chatting_list.asp?index=etc"><%end if%>기타 (<%=result("etc")%>)<%if r_c > 0 then %></a><%end if%><br>


<%
sql = "select count(*) as 동호회 from roomlist where roomtype = '동호회'"
	set result = db.execute(sql)
	r_c = cint(result("동호회"))	
%>
                                    <%if r_c > 0 then %><%end if%>동호회채팅 (<%=result("동호회")%>)<%if r_c > 0 then %><%end if%> </td>
                                </tr>
                              </table>
                            </td>
                          </tr>
                        </table>
                    </tr>
                  </table>
                </td>
              </tr>
              <tr> 
                <td>&nbsp;</td>
              </tr>
 <%
   Set Db = Server.CreateObject("ADODB.Connection")
   Set DbRec = Server.CreateObject("ADODB.Recordset")
   db.Open strConnect
  
  %>


              <tr> 
                <td> 
                  <table width="540" border="0" cellspacing="0" cellpadding="0">
                    <tr> 
                      <td align="left" valign="top" width="50%"><br>
                      </td>
                      <td align="right" valign="bottom">&nbsp;</td>
                    </tr>
                    <tr align="left" valign="top"> 
                      <td colspan="2">
                        <table width="539" border="0" cellspacing="0" cellpadding="0">
                          <tr> 
                            <td colspan="3"><img src="image/new_chattinglist.gif" width="579" height="38"></td>
                          </tr>
                          <tr> 
                            <td width="11" background="image/left_chattinglist.gif">&nbsp;</td>
                            <td width="565" valign="top"> <br>
                              <table width="516" border="0" cellspacing="0" cellpadding="0" align="center">
                                <tr>
                                  <td>
                                    <table width="490" border="0" cellspacing="0" cellpadding="0" align="center">
                                      <tr>
                                        <td width="13"><img src="image/left_rou.gif" width="13" height="22"></td>
                                        <td background="image/back.gif" width="510"> 
<%





Set Db = Server.CreateObject("ADODB.Connection")

    db.Open strConnect
 
    
    Set DbRec = Server.CreateObject("ADODB.Recordset")
    Set DbRec2 = Server.CreateObject("ADODB.Recordset")


Sql = "SELECT roomtype, roomname, roompass, roomno, maxmember FROM roomlist where roomtype='"&index&"'"
   DbRec.Open SQL,db,1



%>                                                         
                                          <table width="511" border="0" cellspacing="0" cellpadding="0">
                                            <tr> 
                                              <td width="35">
                                                <div align="center">번호</div>
                                              </td>
                                              <td width="33">
                                                <div align="center">구분</div>
                                              </td>
                                              <td width="129"> 
                                                <div align="center">방제목</div>
                                              </td>
                                              <td width="245"> 
                                                <div align="center">참여자</div>
                                              </td>
                                              <td colspan="2" width="57"> 
                                                <div align="center">인원</div>
                                              </td>
                                            </tr>
                                          </table>
                                        </td>
                                        <td width="10"><img src="image/right_rou.gif" width="13" height="22"></td>
                                      </tr>
<%



	For i = 1 to 30
		if DbRec.EOF then
			exit for
			DbRec.close
		end if
	

roomtype = DbRec("roomtype")
roomname = DbRec("roomname")
roompass = trim(DbRec("roompass"))
roomno = trim(DbRec("roomno"))
if Not DbRec("maxmember") = "" then 
	maxmember = Clng(DbRec("maxmember"))
end if


sql2 = "select count(id) as num from roomuser where roomno='"&roomno&"'"
DbRec2.Open sql2,db,1
num_count = Clng(DbRec2("num"))
DbRec2.close

chat_join = "Y"
if maxmember <= num_count then chat_join="N" 



%>

<script language="javascript">
<!--

function joinChat(roomNo)
{
	
    var today = new Date();
   
    createWindow = window.open("./chatting_pop_06.asp?roomNo="+roomNo,"iNOM_CHAT_PASS","fullscreen=no,titlebar=no,toolbar=no,directories=no,menubar=no,scrollbars=no,resizable=yes,width=260,height=168")
     
    
}


function joinChat_NONE(roomNo)
{
	
    var today = new Date();
      
    var createW = window.open("./inom_chat_join_direc.asp?roomNo="+roomNo,"iNOM_CHAT_PASS","fullscreen=no,titlebar=no,toolbar=no,directories=no,status=yes,menubar=no,scrollbars=no,resizable=yes,width=265,height=252")
       
    
}




//-->
</script>                                   
                                      
                                      <tr>
                                      <td colspan="3">
                                      <center>
                                      <table width="512" border="0" cellspacing="0" cellpadding="0">
                                      <tr bgcolor="F0F0F0"> 
                                        <td width="35"> <div align="center"><%=i%></div></td>
                                        <td width="33" bgcolor="F0F0F0">  <div align="center">
                                        <%if Not roompass = "NONE" then %>
                       			<img src="./image/lock.gif">
                       			<%else%>
                       			&nbsp;
                       			<%end if%>
                                        </div></td>
                                        <td width="129"><div align="center">
                                        <% if chat_join = "Y" and Not roompass = "NONE" then%>
                        		<a href =javascript:joinChat(<%=roomNo%>);><font color=black><%=roomname%></font></a>
                        		<% elseif chat_join = "Y" and roompass = "NONE" then%>
                         		<a href =javascript:joinChat_NONE(<%=roomNo%>);><font color=black><%=roomname%></font></a>
                        		<% elseif chat_join = "N" then %>
                        		<%=roomname%>
                        		<% end if%>
                                        </div></td>
<% 


sql2 = "select id, name from roomuser where roomno='"&roomno&"'"
DbRec2.Open SQL2,db,1
%>                                        
                                        <td width="245">
                                        <% for t=1 to 100 
					if DbRec2.EOF then
					exit for
					DbRec2.close	
 					end if %>                       
<%








sex  = request.cookies("_SEX_")

	if sex = "1" then sex = "남" 
	if sex = "2" then sex = "여"
	
        	   
	

%>


                        		<%=myid%>(<%=name%>/<%=sex%>)&nbsp;
					<%DbRec2.MoveNext
	
					Next
					DbRec2.close	
					set result = Nothing
					
%>	
                                        </div></td>
                                        <td width="57"> <div align="center">
                                        <%=num_count%>/<%if maxmember = "9999999" then response.write "무" else response.write maxmember end if%>
                                        </div></td>
                                      <tr>
                                      --------------------------------------------------------------
                                      </tr>  
                                      </tr>
                                      </table>
                                      </center>
                                      </td>
                                      </tr>
<%
	'n=n-1

	DbRec.MoveNext
	
	Next
	DbRec.close	
%>                                       

                                      </table>
                                  </td>
                                </tr>
                              </table>
                            </td>
                      <td width="9"> 
                        <div align="right"><img src="image/left_chattinglist.gif" width="8" height="171"></div>
                      </td>
                    </tr>
                    <tr> 
                      <td colspan="3"><img src="image/new_chattinglist_1.gif" width="579" height="20"></td>
                    </tr>
                    <tr>
                      <td colspan="3">&nbsp;</td>
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
		</table>
