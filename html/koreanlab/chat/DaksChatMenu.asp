<html>
<head>

</head>

<script language="JavaScript">

var nicknameWindow = null;

function nicknameCh(nick)
{
var tmpUserName = parent.nickname;
var ChMsg = "<br><font color=red style='font-size:12px'>\""+tmpUserName+"\" ���� \""+nick+"\" ������ �ٲټ̽��ϴ�.</font>";
parent.chatapplet.printMessage(ChMsg);
parent.chatapplet.inomchat.sendM(ChMsg);
parent.nickname = nick;
parent.chatinput.init();
parent.chatinput.userName = nick;

}

function goNicknameWindow()
{
    if (nicknameWindow != null && !nicknameWindow.closed)
        nicknameWindow.close()
    nicknameWindow = window.open("./name.asp?userid="+parent.userid+"&username="+escape(parent.username), "ChangeNicknameWindow","fullscreen=no,titlebar=no,toolbar=no,directories=no,status=no,menubar=no,scrollbars=no,resizable=yes,width=252,height=114")
}

function changeNickname(nickname)
{
    parent.chatinput.changeNickname(nickname);
    parent.chatapplet.changeNickname(nickname);
    parent.nickname = nickname;
}

function goChangeRoomInfoWindow()
{
    window.open("./chatting_pop_04.asp","iNOM_MESSENGER","width=270,height=205,resizable=yes");
}



function clearMessage() {
parent.clearMessage();
parent.chatinput.init();
}

</script>


<body  leftmargin="0" marginwidth="0" marginheight="0" topmargin="0">
<table width="104%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td> 
      <table width="100%" border="0" cellspacing="0" cellpadding="0" background="image/menu_7.gif">
        <tr>
          <td>
            <table width="206" border="0" cellspacing="0" cellpadding="0">
              <tr> 
                <td width="113"><img src="image/menu_6.gif" width="113" height="32"></td>
                <td width="91"><a href="javascript:clearMessage()" title="ȭ���� ����ϴ�."><img src="image/menu_8.gif" width="91" height="32" border=0></a></td>
                <td width="95"><a href="javascript:goNicknameWindow()" title="��ȭ���� �ٲߴϴ�."><img src="image/menu_1.gif" width="95" height="32" border=0></a></td>
                <td width="83"><a href="javascript:goChangeRoomInfoWindow()" title="�������� �����մϴ�."><img src="image/menu_2.gif" width="83" height="32" border=0></a></td>
                <td width="78"><a href="javascript:top.window.close()" title="��ȭ�� �����ϰ� â�� �ݽ��ϴ�."><img src="image/menu_3.gif" width="78" height="32" border=0></a></td>
                <td width="69"><a href="#" title="������ �����ݴϴ�."><img src="image/menu_4.gif" width="69" height="32" border=0></a></td>
                <td width="8"><img src="image/menu_7.gif" width="121" height="32"></td>
              </tr>
            </table>
          </td>
        </tr>
      </table>
    </td>
  </tr>
</table>
</body>
</html>