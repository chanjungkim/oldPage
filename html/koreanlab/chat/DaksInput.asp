<html>
<head>
<style type="text/css">
A:link {text-decoration:none}
A:hover {text-decoration:none}
A:visited {text-decoration:none}
TH {font-size:9pt}
IMG {border-width:0}
TD {font-size:9pt}
</style>

</head>

<script>

var userName = parent.nickname;

var fgColor = "#000000";
var bgColor = "#ffffff";
var colorSelType = "fg";
var fontSize = "12"
var isBold = false;
var isItalic = false;
var isUnderline = false;
var fontName = "";

function init()
{
    requestFocusInputText();
   
}


function chat()
{
    var msg = document.inputForm.inputText.value;
    var crack = msg.toLowerCase();
    if((crack.indexOf("file:") != -1) || (crack.indexOf("javascript:") != -1) || (crack.indexOf("script") != -1) || (crack.indexOf("채팅서버에") != -1))
    {
        alert("입력하신 문장에 사용불가능한 단어가 있습니다.");
        return ;
    }

    if(msg.length < 1) //전송할 문자열 길이를 체크한다.
        return ;
    
    
        userNameMsg1 = "<b><font color='#aa0000' style='font-size:12px;'>"+userName+":</font></b>";
        userNameMsg2 = "<b><font color='#0000aa' style='font-size:12px;'>"+userName+":</font></b>";
        
   

    msg = "<font color="+fgColor+" style='background-color:"+bgColor+"; font-size:"+fontSize+"px; font-family:"+fontName+"'>"+msg+"</font>";
    
    if(isBold == true)
        msg = "<b>"+msg+"</b>";
    if(isItalic == true)
        msg = "<i>"+msg+"</i>";
    if(isUnderline == true)
        msg = "<u>"+msg+"</u>";

  
    parent.addMessage("<table border=0 width=100% cellspacing=0 cellpadding=0><tr><td width=100%>"+userNameMsg1+" "+msg+"</td></tr></table>");
    
    
    parent.chatapplet.reqChatMsg(userNameMsg2+" "+msg);
    
   
    
    
    document.inputForm.inputText.value = ""; // 입력창의 메세지를 클리어한다.
    requestFocusInputText2(); //입력창으로 포커스를 옮긴다.

    return false;
}

function getBuffer()
{
    if(document.all)
    {
        alert(parent.chatscreen.document.body.innerHTML);
    }
    else
    {
        alert(parent.chatBuffer);
    }
}



function selectFgColor()
{
    colorSelType = "fg";
    toggleColorTable();
}
function selectBgColor()
{
    colorSelType = "bg";
    toggleColorTable();
}
function setColor(color)
{
    if(colorSelType=="fg")
    {
        fgColor = color;
        colorTab.style.color = color;
    }
    else
    {
        bgColor = color;
        colorTab.style.backgroundColor = color;
    }
    hideColorTable();
}

function toggleColorTable()
{
    if(colorTable.style.display == "none")
    {
        colorTable.style.display = "block";
        inputForm.fontNameSelect.style.visibility = "hidden";
        inputForm.fontSizeSelect.style.visibility = "hidden";
    }
    else
    {
        colorTable.style.display = "none";
        inputForm.fontNameSelect.style.visibility = "visible";
        inputForm.fontSizeSelect.style.visibility = "visible";
    }

    requestFocusInputText()
}
function hideColorTable()
{
    colorTable.style.display = "none";
    inputForm.fontNameSelect.style.visibility = "visible";
    inputForm.fontSizeSelect.style.visibility = "visible";

    requestFocusInputText()
}

function selFontSize()
{
    fontSize = inputForm.fontSizeSelect.options[inputForm.fontSizeSelect.selectedIndex].text;

    requestFocusInputText()
}

function selFontStyle(type)
{
    switch(type)
    {
        case 1 :
            if(isBold == false)
            {
                isBold = true;
                selFontStyle1.color = "#ff0000";
            }
            else
            {
                isBold = false;
                selFontStyle1.color = "#000000";
            }
            break;
        case 2 :
            if(isItalic == false)
            {
                isItalic = true;
                selFontStyle2.color = "#ff0000";
            }
            else
            {
                isItalic = false;
                selFontStyle2.color = "#000000";
            }
            break;
        case 3 :
            if(isUnderline == false)
            {
                isUnderline = true;
                selFontStyle3.color = "#ff0000";
            }
            else
            {
                isUnderline = false;
                selFontStyle3.color = "#000000";
            }
            break;
    }

    requestFocusInputText()
}

function selFontName()
{
    fontName = inputForm.fontNameSelect.options[inputForm.fontNameSelect.selectedIndex].value;

    requestFocusInputText()
}

var sendLinkWindow = null;
function addLink()
{
    if(sendLinkWindow != null && !sendLinkWindow.closed)
        sendLinkWindow.close()
    sendLinkWindow = window.open("./Link.asp", "sendLink","fullscreen=no,titlebar=no,toolbar=no,directories=no,status=no,menubar=no,scrollbars=no,resizable=no,width=270,height=150");
}

function setLink(name, value)
{
    inputForm.inputText.value = inputForm.inputText.value+"<a href="+value+" target='_blank'>"+name+"</a>";
    requestFocusInputText()
    chat();
}

var sendImageWindow = null;
function addImage()
{
    if(sendImageWindow != null && !sendImageWindow.closed)
        sendImageWindow.close()
    sendImageWindow = window.open("sendImage.asp","sendImage","fullscreen=no,titlebar=no,toolbar=no,directories=no,status=no,menubar=no,scrollbars=no,resizable=no,width=250,height=380");
}


function setImage(name, value)
{
    inputForm.inputText.value = inputForm.inputText.value+"<img align='absmiddle' src='"+value+"'>";
    requestFocusInputText()
}



function requestFocusInputText()
{
    
    setTimeout("requestFocusInputText2()", 200);
}

function requestFocusInputText2()
{
   inputForm.inputText.focus();
}

function changeNickname(nickname)
{
    userName = nickname;
}

</script>

<body bgcolor=999999 leftmargin="0" marginwidth="0" marginheight="0" leftmargin="0" topmargin="0" onLoad="init()">
<table id="colorTable" name="colorTable" width=480 height=30 style="position:absolute; display:none; top:33px; left:5px; background-color:#ffffff;" border="0" CELLPADDING="1" CELLSPACING="1" marginwidth="0" marginheight="0">
  <tr>
    <td onClick="setColor('#FFFFFF')" style="cursor:hand; background-color:FFFFFF; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#FFFFF0')" style="cursor:hand; background-color:FFFFF0; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#FFFFE0')" style="cursor:hand; background-color:FFFFE0; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#FFFF00')" style="cursor:hand; background-color:FFFF00; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#FFFAFA')" style="cursor:hand; background-color:FFFAFA; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#FFFAF0')" style="cursor:hand; background-color:FFFAF0; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#FFFACD')" style="cursor:hand; background-color:FFFACD; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#FFF8DC')" style="cursor:hand; background-color:FFF8DC; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#FFF5EE')" style="cursor:hand; background-color:FFF5EE; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#FFF0F5')" style="cursor:hand; background-color:FFF0F5; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#FFEFD5')" style="cursor:hand; background-color:FFEFD5; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#FFEBCD')" style="cursor:hand; background-color:FFEBCD; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#FFE4E1')" style="cursor:hand; background-color:FFE4E1; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#FFE4C4')" style="cursor:hand; background-color:FFE4C4; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#FFE4B5')" style="cursor:hand; background-color:FFE4B5; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#FFDEAD')" style="cursor:hand; background-color:FFDEAD; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#FFDAB9')" style="cursor:hand; background-color:FFDAB9; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#FFD700')" style="cursor:hand; background-color:FFD700; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#FFC0CB')" style="cursor:hand; background-color:FFC0CB; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#FFB6C1')" style="cursor:hand; background-color:FFB6C1; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#FFA500')" style="cursor:hand; background-color:FFA500; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#FFA07A')" style="cursor:hand; background-color:FFA07A; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#FF8C00')" style="cursor:hand; background-color:FF8C00; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#FF7F50')" style="cursor:hand; background-color:FF7F50; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#FF69B4')" style="cursor:hand; background-color:FF69B4; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#FF6347')" style="cursor:hand; background-color:FF6347; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#FF4500')" style="cursor:hand; background-color:FF4500; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#FF1493')" style="cursor:hand; background-color:FF1493; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#FF00FF')" style="cursor:hand; background-color:FF00FF; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#FF00FF')" style="cursor:hand; background-color:FF00FF; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#FF0000')" style="cursor:hand; background-color:FF0000; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#FDF5E6')" style="cursor:hand; background-color:FDF5E6; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#FAFAD2')" style="cursor:hand; background-color:FAFAD2; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#FAF0E6')" style="cursor:hand; background-color:FAF0E6; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#FAEBD7')" style="cursor:hand; background-color:FAEBD7; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#FA8072')" style="cursor:hand; background-color:FA8072; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#F8F8FF')" style="cursor:hand; background-color:F8F8FF; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#F5FFFA')" style="cursor:hand; background-color:F5FFFA; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#F5F5F5')" style="cursor:hand; background-color:F5F5F5; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#F5F5DC')" style="cursor:hand; background-color:F5F5DC; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#F5DEB3')" style="cursor:hand; background-color:F5DEB3; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#F4A460')" style="cursor:hand; background-color:F4A460; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#F0FFFF')" style="cursor:hand; background-color:F0FFFF; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#F0FFF0')" style="cursor:hand; background-color:F0FFF0; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#F0F8FF')" style="cursor:hand; background-color:F0F8FF; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#F0E68C')" style="cursor:hand; background-color:F0E68C; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#F08080')" style="cursor:hand; background-color:F08080; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#EEE8AA')" style="cursor:hand; background-color:EEE8AA; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#EE82EE')" style="cursor:hand; background-color:EE82EE; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#E9967A')" style="cursor:hand; background-color:E9967A; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#E6E6FA')" style="cursor:hand; background-color:E6E6FA; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#E0FFFF')" style="cursor:hand; background-color:E0FFFF; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#DEB887')" style="cursor:hand; background-color:DEB887; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#DDA0DD')" style="cursor:hand; background-color:DDA0DD; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#DCDCDC')" style="cursor:hand; background-color:DCDCDC; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#DC143C')" style="cursor:hand; background-color:DC143C; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#DB7093')" style="cursor:hand; background-color:DB7093; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#DAA520')" style="cursor:hand; background-color:DAA520; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#DA70D6')" style="cursor:hand; background-color:DA70D6; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#D8BFD8')" style="cursor:hand; background-color:D8BFD8; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#D3D3D3')" style="cursor:hand; background-color:D3D3D3; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#D2B48C')" style="cursor:hand; background-color:D2B48C; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#D2691E')" style="cursor:hand; background-color:D2691E; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#CD853F')" style="cursor:hand; background-color:CD853F; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#CD5C5C')" style="cursor:hand; background-color:CD5C5C; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#C71585')" style="cursor:hand; background-color:C71585; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#C0C0C0')" style="cursor:hand; background-color:C0C0C0; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#BDB76B')" style="cursor:hand; background-color:BDB76B; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#BC8F8F')" style="cursor:hand; background-color:BC8F8F; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#BA55D3')" style="cursor:hand; background-color:BA55D3; width:15px; height:15px;"></td//-->
  </tr>                                                                                                           
  <tr>                                                                                                            
    <td onClick="setColor('#B8860B')" style="cursor:hand; background-color:B8860B; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#B22222')" style="cursor:hand; background-color:B22222; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#B0E0E6')" style="cursor:hand; background-color:B0E0E6; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#B0C4DE')" style="cursor:hand; background-color:B0C4DE; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#AFEEEE')" style="cursor:hand; background-color:AFEEEE; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#ADFF2F')" style="cursor:hand; background-color:ADFF2F; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#ADD8E6')" style="cursor:hand; background-color:ADD8E6; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#A9A9A9')" style="cursor:hand; background-color:A9A9A9; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#A52A2A')" style="cursor:hand; background-color:A52A2A; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#A0522D')" style="cursor:hand; background-color:A0522D; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#9ACD32')" style="cursor:hand; background-color:9ACD32; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#9932CC')" style="cursor:hand; background-color:9932CC; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#98FB98')" style="cursor:hand; background-color:98FB98; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#9400D3')" style="cursor:hand; background-color:9400D3; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#9370DB')" style="cursor:hand; background-color:9370DB; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#90EE90')" style="cursor:hand; background-color:90EE90; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#8FBC8B')" style="cursor:hand; background-color:8FBC8B; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#8B4513')" style="cursor:hand; background-color:8B4513; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#8B008B')" style="cursor:hand; background-color:8B008B; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#8B0000')" style="cursor:hand; background-color:8B0000; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#8A2BE2')" style="cursor:hand; background-color:8A2BE2; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#87CEFA')" style="cursor:hand; background-color:87CEFA; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#87CEEB')" style="cursor:hand; background-color:87CEEB; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#808080')" style="cursor:hand; background-color:808080; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#808000')" style="cursor:hand; background-color:808000; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#800080')" style="cursor:hand; background-color:800080; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#800000')" style="cursor:hand; background-color:800000; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#7FFFD4')" style="cursor:hand; background-color:7FFFD4; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#7FFF00')" style="cursor:hand; background-color:7FFF00; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#7CFC00')" style="cursor:hand; background-color:7CFC00; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#7B68EE')" style="cursor:hand; background-color:7B68EE; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#778899')" style="cursor:hand; background-color:778899; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#708090')" style="cursor:hand; background-color:708090; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#6B8E23')" style="cursor:hand; background-color:6B8E23; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#6A5ACD')" style="cursor:hand; background-color:6A5ACD; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#696969')" style="cursor:hand; background-color:696969; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#66CDAA')" style="cursor:hand; background-color:66CDAA; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#6495ED')" style="cursor:hand; background-color:6495ED; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#5F9EA0')" style="cursor:hand; background-color:5F9EA0; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#556B2F')" style="cursor:hand; background-color:556B2F; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#4B0082')" style="cursor:hand; background-color:4B0082; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#48D1CC')" style="cursor:hand; background-color:48D1CC; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#483D8B')" style="cursor:hand; background-color:483D8B; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#4682B4')" style="cursor:hand; background-color:4682B4; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#4169E1')" style="cursor:hand; background-color:4169E1; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#40E0D0')" style="cursor:hand; background-color:40E0D0; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#3CB371')" style="cursor:hand; background-color:3CB371; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#32CD32')" style="cursor:hand; background-color:32CD32; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#2F4F4F')" style="cursor:hand; background-color:2F4F4F; width:15px; height:15px;"></td>
    <!--td onClick="setColor('#2E8B57')" style="cursor:hand; background-color:2E8B57; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#228B22')" style="cursor:hand; background-color:228B22; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#20B2AA')" style="cursor:hand; background-color:20B2AA; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#1E90FF')" style="cursor:hand; background-color:1E90FF; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#191970')" style="cursor:hand; background-color:191970; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#00FFFF')" style="cursor:hand; background-color:00FFFF; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#00FFFF')" style="cursor:hand; background-color:00FFFF; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#00FF7F')" style="cursor:hand; background-color:00FF7F; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#00FF00')" style="cursor:hand; background-color:00FF00; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#00FA9A')" style="cursor:hand; background-color:00FA9A; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#00CED1')" style="cursor:hand; background-color:00CED1; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#00BFFF')" style="cursor:hand; background-color:00BFFF; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#008B8B')" style="cursor:hand; background-color:008B8B; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#008080')" style="cursor:hand; background-color:008080; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#008000')" style="cursor:hand; background-color:008000; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#006400')" style="cursor:hand; background-color:006400; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#0000FF')" style="cursor:hand; background-color:0000FF; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#0000CD')" style="cursor:hand; background-color:0000CD; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#00008B')" style="cursor:hand; background-color:00008B; width:15px; height:15px;"></td//-->
    <td onClick="setColor('#000080')" style="cursor:hand; background-color:000080; width:15px; height:15px;"></td>       
    <!--td onClick="setColor('#000000')" style="cursor:hand; background-color:000000; width:15px; height:15px;"></td//-->
  </tr>
</table>
<table border=0 cellspacing="0" cellpadding="0">
  <tr>
    <td colspan=2 height=7>
    </td>
  </tr>
  <tr>
    <td colspan=2 width=5>
    </td>
    <td>
      <!-- 본격적인 입력 화면이다. //-->
      <table border=0 width=590 cellspacing="0" cellpadding="0">
        <tr>
          <td>
            <form id="inputForm" name="inputForm" onSubmit="return chat()">
            
            <input type="text" size="75" id="inputText" name="inputText">
            
          </td>
          <td width=10>
          </td>
          <td id="colorTab" name="colorTab" width=50 bgcolor=#ffffff>
          <center>글자색</center>
          </td>
        </tr>
        <tr>
          <td height=7>
          </td>
        </tr>
      </table>
      <table border=0 cellspacing="0" cellpadding="0">
        <tr>
          <td>
            <select id="fontNameSelect" name="fontNameSelect" onChange="selFontName()">
	      <option value="serif" selected>기본
	      <option value="굴림체">굴림체
	      <option value="궁서체">궁서체
	      <option value="돋움체">돋움체
	      <option value="바탕체">바탕체
	      <option value="serif">serif
	      <option value="sans-serif">sans-serif
	      <option value="cursive">cursive
	      <option value="fantasy">fantasy
	      <option value="monospace">monospace
            </select>
          </td>
          <td width=7>
          </td>
          <td>
	    <select id="fontSizeSelect" name="fontSizeSelect" onChange="selFontSize()">
	      <option>8
	      <option>9
	      <option>10
	      <option selected>12
	      <option>14
	      <option>18
	      <option>20
	      <option>24
	      <option>30
	      <option>36
	      <option>40
	    </select>
          </td>
          <td width=7>
          </td>
	  <td width=20 align="center" style="font-size:12px; cursor:hand; background-color:#dddddd;">
	    <a href="javascript:selFontStyle(1)" title="굵은 글씨">
	    <font id="selFontStyle1" name="selFontStyle1" color=#000000>
	    <b>가</b>
	    </font>
	    </a>
	  </td>
	  <td width=20 align="center" style="font-size:12px; cursor:hand; background-color:#dddddd;">
	    <a href="javascript:selFontStyle(2)" title="기울임 글씨">
	    <font id="selFontStyle2" name="selFontStyle2" color=#000000>
	    <i>가</i>
	    </font>
	    </a>
	  </td>
	  <td width=20 align="center" style="font-size:12px; cursor:hand; background-color:#dddddd;">
	    <a href="javascript:selFontStyle(3)" title="밑줄 글씨">
	    <font id="selFontStyle3" name="selFontStyle3" color=#000000>
	    <u>가</u>
	    </font>
	    </a>
	  </td>
          <td width=7>
          </td>
          
          <td width=5>
          </td>
          <td width=30 align="center" style="font-size:12px; cursor:hand; background-color:#D7E5B0;" bgcolor="D7E5B0">&nbsp;</td>
          <td width=109 align="center" style="font-size:12px; cursor:hand; background-color:#D7E5B0;" bgcolor="D7E5B0"><a href="javascript:addImage()" style="cursor:hand;" title="그림을 보냅니다"><img src="image/pic_icon.gif" width="64" height="31"></a></td>
          <td colspan="2" align="center" style="font-size:12px; cursor:hand; background-color:#D7E5B0;" bgcolor="D7E5B0"><a href="javascript:addLink()" style="cursor:hand;" title="인터넷 링크를 보냅니다."><img src="image/link_icon.gif" width="64" height="31"></a></td>
          <td width=100 align="center" style="font-size:12px; cursor:hand; background-color:#D7E5B0;" bgcolor="D7E5B0"><a href="javascript:selectFgColor()" style="cursor:hand;" title="글자색을 변경합니다."><img src="image/fontcolor_icon.gif" width="76" height="31"></a></td>
          <td width=86 align="center" style="font-size:12px; cursor:hand; background-color:#D7E5B0;" bgcolor="D7E5B0"><a href="javascript:selectBgColor()" style="cursor:hand;" title="배경색을 변경합니다."><img src="image/backcolor_icon.gif" width="76" height="31"></a></td>
        </tr>
      </table>
    </td>
  </tr>
</table>
</body>
</html>
