<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<script language="JavaScript">
function changeNickname()
{
    var nickname = document.inputT.nicknameInput.value;
    
    if(nickname.length < 1)
    {
        alert("새 이름을 입력하십시오.");
        return;
    }
    if(nickname.length >= 9)
    {
        nickname = nickname.substring(0, 8);
        return;
    }
        
    
    
    window.opener.nicknameCh(nickname);
    self.close();
    
}

function init()
{
    document.inputT.nicknameInput.focus();
    document.inputT.nicknameInput.select();
}

</script>

<style type="text/css">
<!--
.unnamed1 {  font-size: 9pt; text-decoration: none}
-->
</style>
</head>

<body bgcolor="#FFFFFF" topmargin="0" leftmargin="0" marginwidth="0" marginheight="0">
<table width="254" border="0" cellspacing="0" cellpadding="0">
  <tr bgcolor="D7EBCC"> 
    <td> 
      <table width="251" border="0" cellspacing="1" cellpadding="0" align="center">
        <tr> 
          <td> <img src="image/pop/name_c.gif" width="127" height="25"> </td>
        </tr>
        <tr> 
          <td> 
            <table width="215" border="0" cellspacing="0" cellpadding="0" align="center">
              <tr> 
                <td colspan="5"> 
                  <table width="224" border="3" cellspacing="0" cellpadding="2" bordercolor="D2D1D1">
                    <tr bgcolor="#FFFFFF"> 
                      <td height="51"> 
                        <table width="234" border="0" cellspacing="1" cellpadding="1" align="left">
                          <tr> 
                            <td colspan="3">
                              <table width="224" border="0" cellspacing="0" cellpadding="0">
                                <tr>
                                  <td width="70"><img src="image/pop/sq.gif" width="68" height="10"></td>
                                  <td width="148" class="unnamed1">
                                    <form name=inputT>
                                    <div align="center">새로운 대화명을 넣으세요.</div>
                                  </td>
                                </tr>
                              </table>
                            </td>
                          </tr>
                          <tr> 
                            <td colspan="3"> 
                              <center><input type="text" name="nicknameInput" size=25></center>
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
        <tr>
          <td>
            <table width="103" border="0" cellspacing="1" cellpadding="0" align="right">
              <tr>
                <td width="49"><a href="javascript:changeNickname()" title="대화명 변경"><img src="image/pop/re_1.gif" width="49" height="21" border=0></a></td>
                <td width="48"><a href="javascript:window.close()" title="취소"><img src="image/pop/can.gif" width="47" height="21" border=0></a></td>
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
