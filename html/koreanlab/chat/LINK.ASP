<html>
<head>
<title>Untitled Document</title>
<html>
<title>링크 보내기</title>

<script language="JavaScript">

function setLink()
{
    var name = inputForm.nameInput.value;
    var value = inputForm.urlInput.value;
    
    if(name.length<1)
    {
        alert("이름을 입력하세요.");
        inputForm.nameInput.focus();
        return;
    }
    if(value.length < 8)
    {
        alert("주소(URL)이 너무 짧습니다.");
        inputForm.urlInput.focus();
        return;
    }
    
    window.opener.setLink(name, value);
    window.close();
}

function Init()
{
	
	inputForm.nameInput.focus()

}


</script>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<style type="text/css">
<!--
.unnamed1 {  font-size: 9pt; text-decoration: none}
-->
</style>
</head>

<body bgcolor="#FFFFFF" topmargin="0" leftmargin="0" marginwidth="0" marginheight="0" onload="Init();">
<table width="271" border="0" cellspacing="0" cellpadding="0">
  <tr bgcolor="D7EBCC"> 
    <td> 
<form id="inputForm" name="inputForm">    
      <table width="270" border="0" cellspacing="1" cellpadding="0" align="center">
        <tr> 
          <td> <img src="image/pop/link.gif" width="69" height="25"> </td>
        </tr>
        <tr> 
          <td> 
            <table width="248" border="0" cellspacing="0" cellpadding="0" align="center">
              <tr> 
                <td colspan="5"> 
                  <table width="253" border="3" cellspacing="0" cellpadding="2" bordercolor="D2D1D1">
                    <tr bgcolor="#FFFFFF"> 
                      <td> 
                        <table width="239" border="0" cellspacing="1" cellpadding="0" align="center">
                          <tr> 
                            <td colspan="3"> 
                              <table width="233" border="0" cellspacing="0" cellpadding="0">
                                <tr> 
                                  <td width="124"><img src="image/pop/sq_1.gif" width="124" height="9"></td>
                                  <td width="109" class="unnamed1"> 
                                    <div align="center">제목을 입력하세요.</div>
                                  </td>
                                </tr>
                              </table>
                            </td>
                          </tr>
                          <tr> 
                            <td colspan="3"> 
                                 <input id="nameInput" name="nameInput" type="text">
                            </td>
                          </tr>
                          <tr> 
                            <td colspan="3"> 
                              <table width="233" border="0" cellspacing="0" cellpadding="0">
                                <tr> 
                                  <td width="124"><img src="image/pop/sq_2.gif" width="131" height="8"></td>
                                  <td width="109" class="unnamed1"> 
                                    <div align="center">URL 입력하세요.</div>
                                  </td>
                                </tr>
                              </table>
                            </td>
                          </tr>
                          <tr> 
                            <td colspan="3"> 
                               <input id="urlInput" name="urlInput" type="text" value="http://">
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
            <table width="111" border="0" cellspacing="0" cellpadding="2" align="right">
              <tr>
                <td width="48"><a href="javascript:setLink()"><img src="image/pop/ok.gif" width="48" height="21" border=0></a></td>
                <td width="49"><a href="javascript:window.close()"><img src="image/pop/close_1.gif" width="46" height="21" border=0></a></td>
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
