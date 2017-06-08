<html>
<head>
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

function setRoomUserList(masterID, userList)
{
    var headHTML  = "<table border=0 width=127 cellspacing=1 cellpadding=1>";
    var user1HTML = "<tr>"+"<td height=5 colspan=2>"+"</td>"+"</tr>"+"<tr>"+"<td width=18 align=center>";
        
    var user2HTML =   "</td>"+
                      "<td>";

    var user3HTML =   "</td>"+
                    "</tr>";
    var tailHTML  = "</table>";
    
    var userHTML = headHTML;



    
    for(i=1 ; i<userList.length ; i+=4) {
  
    userHTML += user2HTML;
    
    
    user_id=userList[i];
    user_name= "("+userList[i+1]+")";
    user_master = userList[i+2];
    user_sex = userList[i+3];
     
    if (user_sex == "1") user_sex = "./image/ico_m.gif";
    else user_sex = "./image/ico_w.gif";
     
    if (user_master == "N") userHTML += "<font color=#283e0c><img src="+user_sex+"> "+user_id+"/"+user_name+"</font></a>";
    else if (user_master =="Y") userHTML += "<font color=blue><img src="+user_sex+"> "+user_id+"/"+user_name+"</font></a>";
        
    userHTML += user3HTML;
    }
    userHTML += tailHTML;
      
    userListData.innerHTML = userHTML;
      
}

function refreshUserList()
{
    parent.chatapplet.reqMemberList();
}
</script>


<base target="_blank">
<body bgcolor=#E6E6E6 leftmargin="0" marginwidth="0" marginheight="0" leftmargin="0" topmargin="0">

<table border=0 width=132 cellspacing="0" cellpadding="0">
  <tr>
    <td height=30 bgcolor=#E6E6E6 colspan=2>
     &nbsp;&nbsp;&nbsp;
      <center><a target='_self' href="javascript:refreshUserList()" title="사용자 정보 새로고침">
      <img src="image/peo_info.gif" width="128" height="24">&nbsp;
       </a>
    </td>
  </tr>
  <tr>
    <td width=5>
    </td>
    <td>
    
    <div id="userListData" name="userListData"></div>

    </td>
  </tr>
</table>
</body>
</html>