<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
</head>


<script language="JavaScript">
var sleep_time = 500;
var ping_time = 1000*30;

var userid   = "<%=request.cookies("_USERID_")%>";
var username = parent.username;
var nickname = parent.nickname;
var age      = parent.age;
var sex      = parent.sex;

var isMake = false;
var tmpGrpid, tmpCatCd, tmpRoomType, tmpRoomPassword, tmpMaxMember, tmpRoomName, tmpRoomNumber, tmproomNo;

var isInitialized = false;
var reload_time = 1000;

var masterID = "";
var userList = "";

function init()
{
    parent.init();
  
}

function goReload()
{
    initNetwork(host, port, userid, username, nickname, age, sex);
}

function checkUnload()
{
    if(isInitialized == true)
        
        
   
        document.inomchat.sendM("000");
        document.inomchat.stop();
}

function getMessage()
{
    var msg = document.inomchat.getMessage();
 

    if(msg == "!EXIT!")
    {
        isInitialized = false;
        if( confirm("��Ʈ���� ���������ϴ�. �ٽ� ���� �Ͻðڽ��ϱ�?") == true)
            setTimeout("goReload()", reload_time);
        else
            top.window.close();
        return;
    }

    if(msg=="" && msg=="ping" && msg=="null")
    {
        
        
        setTimeout("getMessage()", sleep_time);
        
    }
    else
    {
        
        
        distributeMessage(msg);
       
        setTimeout("getMessage()", sleep_time);
    }
    
}

function distributeMessage(msg)
{

var msgList = msg.split("");
    
    
    switch(msgList[0])
    {
  
        case "004" :
        alert("������ ������ �߻��Ͽ����ϴ�. �ٽ� �����Ͻñ� �ٶ��ϴ�.");
    		top.parent.window.close();
        break; 
         
        case "005" :
        parent.chatuser.location.reload();
        break;
        
        case "006" :
        alert("������ ������ �߻��Ͽ����ϴ�. �ٽ� �����Ͻñ� �ٶ��ϴ�.");
    		top.parent.window.close();
        break;
       
        case "007" :
        alert("���� ������ų� ������ ������ �߻��Ͽ����ϴ�. �ٽ� �����Ͻñ� �ٶ��ϴ�.");
    		top.parent.window.close();
        break;
              
        case "000" :
        var imsi = msgList[1];
        printMessage(imsi);
        break;
       
        case "999" :
        
        parent.setRoomUserList(masterID, msgList);
        break;
        
        case "666" :
        document.inomchat.stop();
        alert("���� ���̵���� �������� �� ������ �����ϰ� â�� �ݽ��ϴ�. �ٽ� �����Ͻñ� �ٶ��ϴ�.");
        top.parent.window.close();
        break;
       
        case "444" :
        document.inomchat.stop();
        alert("�������� ���� �������� �޾ҽ��ϴ�. ������ �����ϰ� â�� �ݽ��ϴ�.");
       
        top.parent.window.close();
        break;
               
   }
}





var init_count = 0;
function initNetwork(host, port, userid, username, nickname, age, sex)
{    
    if((typeof document.inomchat == "undefined") || (typeof document.inomchat == "unknown"))
    {
        isInitialized = false;
        init_count++;
        if(init_count > 10)
        {
            if( confirm("ä�� ���α׷��� �ʱ�ȭ ���� ���Ͽ����ϴ�. �ٽ� ���� �Ͻðڽ��ϱ�?") == true)
                setTimeout("goReload()", reload_time);
            else
                top.window.close();
            return;
        }
        setTimeout("initNetwork(\""+host+"\", "+port+", \""+userid+"\", \""+username+"\", \""+nickname+"\", "+age+", "+sex+")", 1000*3);
        return;
    }
    
    init_count = 0;
    
    setTimeout("initRealNetwork(\""+host+"\", "+port+")", 1000*3);
}

function initRealNetwork(host, port)
{
    if(document.inomchat.initNetwork(host, port) == false)
    {
        isInitialized = false;
        init_count++;
        if(init_count > 10)
        {
            if( confirm("ä�����α׷��� �ʱ�ȭ �Ͽ�����, ������ ������ �� �����ϴ�. �ٽ� �����Ͻðڽ��ϱ�?") == true)
                setTimeout("goReload()", reload_time);
            else
                top.window.close();
            return;
        }
        setTimeout("initRealNetwork(\""+host+"\", "+port+")", 1000*3);
        return;
    }
     
    isInitialized = true;
    getMessage();
   if (tmpRoomPassword == "") tmpRoomPassword = "NONE";
   
   if (tmpGrpid=="001") {
   		
   		reqChatMsg("001"+tmpRoomName+"|"+tmpRoomType+"|"+tmpRoomPassword+"|"+tmproomNo+"|"+"<%=request.cookies("_USERID_")%>"+"|"+"<%=request.cookies("_NAME_")%>"+"|"+tmpMaxMember+"|"+"<%=request.cookies("_SEX_")%>");    
   		
   }
   if (tmpGrpid=="002") {
   		
   		
   		reqChatMsg("002"+tmproomNo+"|"+tmpRoomPassword+"|"+"<%=request.cookies("_USERID_")%>"+"|"+"<%=request.cookies("_NAME_")%>"+"|"+"<%=request.cookies("_SEX_")%>");
   		
     }
   
     
   
   
   printMessage("<br><font color=blue style='font-size:12px'>ä���� ���۵Ǿ����ϴ�.</font>");
   
  
}

function reqMakeRoom(h, p, roomType, roomName, roomPassword, roomNo, maxMember)
{
    
    host     = h;
    port     = p;
 

    tmpGrpid            = "001";
 
    tmpRoomType         = roomType;
    tmpRoomPassword     = roomPassword;
    tmpMaxMember        = maxMember;
    tmpRoomName         = roomName;
    tmproomNo 		= roomNo;
    isMake = true;

 
    
    initNetwork(host, port, userid, username, nickname, age, sex);
}

function reqJoinRoom(h, p, roomType, roomPassword, roomNo, tmp)
{
    
    host     = h;
    port     = p;
   
    tmpGrpid          = "002";	
    tmpRoomType       = roomType;
    tmpRoomPassword   = roomPassword;
    tmproomNo    = roomNo;
 
    initNetwork(host, port, userid, username, nickname, age, sex);
}


function reqChatMsg(msg)

{   
	if(isInitialized == false){
		alert("���� ä�ü����� ������ ������� �ʾҽ��ϴ�.");
        return;
        }
	
	else document.inomchat.sendM(msg);//Ŭ���̾�Ʈ �Լ��� ȣ���Ͽ� ������ �޼����� �����Ѵ�.

}

function reqUserExit(userid)
{
    if(isInitialized == false)
        return;

    document.inomchat.reqUserExit(userid);
}

function reqMemberList()
{
    document.inomchat.sendM("888");
}

function reqChangeUserInfo(userid, username, status)
{
    if(isInitialized == false)
    {
        alert("���� ä�ü����� ������ ������� �ʾҽ��ϴ�.");
        return;
    }
    document.inomchat.reqChangeUserInfo(userid, username, status);
}

function changeNickname(nickname)
{
    if(isInitialized == false)
    {
        alert("���� ä�ü����� ������ ������� �ʾҽ��ϴ�.");
        return;
    }
    reqChangeUserInfo(userid, nickname, 0);
}




function printMessage(msg)
{
    parent.addMessage("<table border=0 width=100% cellspacing=0 cellpadding=0><tr><td width=100%>"+msg+"</td></tr></table>");
	
}
</script>

<body onLoad="init()" onUnload="checkUnload()">

<applet id="inomchat" name="inomchat" code="Net_socket_ChatClient.class" codebase="http://210.206.49.149/web_chat/chat_class/" width=10 height=10>
</applet>
</body>
</html>