function OnBtnClick( strLink, strTarget )
{
  if ( strTarget && strTarget.length > 0 ) window.open( strLink, strTarget );
  else document.location = strLink;
}

function GetStrWidth( str, nUnit )
{
  var i, nCode;
  var nWidth = 0;
  if ( !str ) return 0;

  for ( i = 0 ; i < str.length; i++ )
  {
    nCode = str.charCodeAt( i );
    if ( ( nCode < 0 ) || ( nCode > 127 ) ) nWidth += nUnit * 2;
    else nWidth += nUnit;
  }

  return nWidth;
}

function ForceQuote( str )
{
  var nDouble = 0;
  var ch;
  var i;

  ch = str.charCodeAt( 0 );
  if ( ( ch == 34 ) || ( ch == 39 ) ) return str;

  for ( i = 1 ; i < str.length - 1 ; i++ )
  {
    ch = str.charCodeAt( i );
    if ( ch == 39 )
    {
      nDouble = 1;
      break;
    }
  }

  if ( nDouble ) strQuote = "\"";
  else strQuote = "'";

  return ( strQuote + str + strQuote );
}

function GetBtnHREF( strLink )
{
  var strOnBtnClick = "";
  var nPos = -1;
  var strHREF = "";
  var strTarget = "";
        var strLow;

  strLow = strLink;
  strLow.toLowerCase();
  nPos = strLow.indexOf( "javascript:" );
  if ( nPos >= 0 ) return ForceQuote( strLink );

  nPos = strLink.indexOf( " " );
  if ( nPos > 0 ) strHREF = strLink.substring( 0, nPos );
  else strHREF = strLink;

  nPos = strLink.indexOf( "target=" );
  if ( nPos > 0 ) strTarget = strLink.substr( nPos + 7 );

  strHREF = ForceQuote( strHREF );
  strTarget = ForceQuote( strTarget );
  strOnBtnClick = "javascript:OnBtnClick( " + strHREF + " , " + strTarget + " )";
//  strOnBtnClick = strHREF + " target=" + strTarget + " ";
  strOnBtnClick = ForceQuote( strOnBtnClick );

  return strOnBtnClick;
}

function SayButton( strBtnTitle, strLink, nWidth, strLiteCR, strMidCR, strDarkCR, strCSS, strImg, nLeftGap, nImgGap, nRiteGap )
{
  var strFormat;

  if ( !strBtnTitle ) strBtnTitle = "확 인";
  if ( !strLink ) strLink = "#";
  strLink = GetBtnHREF( strLink );

  if ( !nWidth || ( nWidth <= 0 ) ) nWidth = GetStrWidth( strBtnTitle, 10 );

  if ( !strLiteCR ) strLiteCR = "#EFEFEF";
  if ( !strMidCR ) strMidCR = "#D1D1D1";
  if ( !strDarkCR ) strDarkCR = "#9F9F9F";
  if ( !strCSS ) strCSS = "btn2";
  if ( !nImgGap ) nImgGap = 4;

  strFormat = "<table border=0 width=" + nWidth + " cellpadding=0 cellspacing=0 onclick="+strLink+" onmouseover=\"this.style.cursor='hand'\">";
  document.write( strFormat );

  strFormat = "<tr><td colspan=2 width=2></td><td colspan=3 width=" +
    ( nWidth - 4 ) + " bgcolor=black></td><td colspan=2 width=2></td></tr>";
  document.write( strFormat );

  strFormat = "<tr><td width=1></td><td width=1 bgcolor=black></td><td width=1 bgcolor=" + strLiteCR + "></td><td width=" +
    ( nWidth - 6 ) + " bgcolor=" + strLiteCR + "></td><td width=1 bgcolor=" + strDarkCR +
    "></td><td width=1 bgcolor=black></td><td width=1></td></tr>";
  document.write( strFormat );

  strFormat = "<tr><td width=1 bgcolor=black></td><td width=2 colspan=2 bgcolor=" + strLiteCR + "></td><td colspan=2 width=" +
    ( nWidth - 5 ) + " bgcolor=" + strMidCR + "></td><td width=1 bgcolor=" + strDarkCR + "></td><td colspan=1 width=1 bgcolor=black></td></tr>";
  document.write( strFormat );

  strFormat = "<tr><td width=1 bgcolor=black></td><td width=1 bgcolor=" + strLiteCR + "></td><td  colspan=3 width=" + 
    ( nWidth - 4 ) + " bgcolor=" + strMidCR + "></td><td width=1 bgcolor=" + strDarkCR + "></td><td width=1 bgcolor=black></td></tr>";
  document.write( strFormat );

  strFormat = "<tr><td width=1 bgcolor=black></td><td width=1 bgcolor=" + strLiteCR + "></td>";
  strFormat += "<td class=" + strCSS + " colspan=3 width=" + ( nWidth - 4 ) + " bgcolor=" + strMidCR + " align=center>";
  if ( strImg && ( strImg.length > 1 ) )
  {
    strFormat += "<table border=0 cellpadding=0 cellspacing=0><tr>";
    if ( nLeftGap ) strFormat += "<td width=" + nLeftGap + "></td>";
    strFormat += "<td><a href=" + strLink + " onclick='window.event.returnValue=false'><img src='" + strImg + "' border=0></a></td>";
    strFormat += "<td width=" + nImgGap + "></td>";
    strFormat += "<td class='" + strCSS + "'><a href=" + strLink + " onclick='window.event.returnValue=false'>" + strBtnTitle + "</a></td>";
    if ( nRiteGap ) strFormat += "<td width=" + nRiteGap + "></td>";
    strFormat += "</tr></table></td>";
  }
  else
  {
    strFormat += "<a href=" + strLink + " onclick='window.event.returnValue=false'>" + strBtnTitle + "</a></td>";
  }
  strFormat += "<td width=1 bgcolor=" + strDarkCR + "></td><td width=1 bgcolor=black></td></tr>";
  document.write( strFormat );

  strFormat = "<tr><td width=1 bgcolor=black></td><td width=1 bgcolor=" + strDarkCR + "></td><td colspan=2 width=" + 
    ( nWidth - 5 ) + " bgcolor=" + strMidCR + "></td><td colspan=2 width=2 bgcolor=" + strDarkCR + "></td><td width=1 bgcolor=black></td></tr>";
  document.write( strFormat );

  strFormat = "<tr><td width=1></td><td width=1 bgcolor=black></td><td colspan=3 width=" +
    ( nWidth - 4 ) + " bgcolor=" + strDarkCR + "></td><td width=1 bgcolor=black></td><td width=1></td></tr>";
  document.write( strFormat );

  strFormat = "<tr><td colspan=2 width=2></td><td colspan=3 width=" + ( nWidth - 4 ) +
    " bgcolor=black></td><td colspan=2 width=2></td></tr></table>";
  document.write( strFormat );
}

function SayFlatButton( strBtnTitle, strLink, nWidth, strCR, strCSS, strImg, nLeftGap, nImgGap, nRiteGap )
{
  var strFormat;

  if ( !strBtnTitle ) strBtnTitle = "<b>선 택</b>";
  else strBtnTitle = "<b>" + strBtnTitle + "</b>";

  if ( !strLink ) strLink = "#";
  strLink = GetBtnHREF( strLink );
  if ( !nWidth ) nWidth = GetStrWidth( strBtnTitle, 20 );
  if ( !strCR ) strCR = "#D1D1D1";
  if ( !strCSS ) strCSS = "btn2";
  if ( !nImgGap ) nImgGap = 4;

  strFormat = "<table border=0 cellpadding=0 cellspacing=0 width=" + nWidth + " onclick="+strLink+" onmouseover=\"this.style.cursor='hand'\">";
  document.write( strFormat );

  strFormat = "<tr><td colspan=2 width=2></td><td width=" + ( nWidth - 4 ) + " bgcolor=black></td><td colspan=2 width=2></td></tr>";
  document.write( strFormat );

  strFormat = "<tr><td width=1></td><td width=1 bgcolor=black></td><td width=" + ( nWidth - 4 ) + " bgcolor=" + strCR + "></td><td width=1 bgcolor=black></td><td width=1></td></tr>";
  document.write( strFormat );

  strFormat = "<tr><td width=1 bgcolor=black></td><td colspan=3 width=" + ( nWidth - 2 ) + " bgcolor=" + strCR + "><table border=0 cellspacing=1 cellpadding=0><tr><td></td></tr></table> </td><td width=1 bgcolor=black></td></tr>";
  document.write( strFormat );

  strFormat = "<tr><td width=1 bgcolor=black></td><td colspan=3 width=" + ( nWidth - 2 );
  strFormat += " bgcolor=" + strCR + " align=center>";

  if ( strImg && ( strImg.length > 1 ) )
  {
    strFormat += "<table border=0 cellpadding=0 cellspacing=0><tr>";
    if ( nLeftGap ) strFormat += "<td width=" + nLeftGap + "></td>";
    strFormat += "<td><a href=" + strLink + " onclick='window.event.returnValue=false'><img src='" + strImg + "' border=0></a></td>";
    strFormat += "<td width=" + nImgGap + "></td>";
    strFormat += "<td class='" + strCSS + "'><a href=" + strLink + " onclick='window.event.returnValue=false'>" + strBtnTitle + "</a></td>";
    if ( nRiteGap ) strFormat += "<td width=" + nRiteGap + "></td>";
    strFormat += "</tr></table></td>";
  }
  else
  {
    strFormat += "<a href=" + strLink + " onclick='window.event.returnValue=false' >" + strBtnTitle + "</a></td>";
  }
  strFormat += "<td width=1 bgcolor=black></td></tr>";
  document.write( strFormat );

  strFormat = "<tr><td width=1 bgcolor=black></td><td colspan=3 width=" + ( nWidth - 2 ) + " bgcolor=" + strCR + "><table border=0 cellspacing=1 cellpadding=0><tr><td></td></tr></table> </td><td width=1 bgcolor=black></td></tr>";
  document.write( strFormat );

  strFormat = "<tr><td width=1></td><td width=1 bgcolor=black></td><td width=" + ( nWidth - 4 ) + " bgcolor=" + strCR + "></td><td width=1 bgcolor=black></td><td width=1></td></tr>";
  document.write( strFormat );

  strFormat = "<tr><td colspan=2 width=2></td><td width=" + ( nWidth - 4 ) + " bgcolor=black></td><td colspan=2 width=2></td></tr></table>";
  document.write( strFormat );
}

function SayTab( strBtnTitle, strLink, nWidth, strCR, strCSS )
{
  var strFormat;

  if ( !strBtnTitle ) strBtnTitle = "선 택";
  if ( !strLink ) strLink = "#";
  strLink = GetBtnHREF( strLink );
  if ( !nWidth ) nWidth = GetStrWidth( strBtnTitle, 20 );
  if ( !strCR ) strCR = "#D1D1D1";
  if ( !strCSS ) strCSS = "tab";

  strFormat = "<table border=0 cellpadding=0 cellspacing=0 width=" + nWidth + " onmouseover=\"this.style.cursor='hand'\" onclick=" + strLink + ">";
  document.write( strFormat );

  strFormat = "<tr><td colspan=2 width=2></td><td width=" + ( nWidth - 4 ) + " bgcolor=black></td><td colspan=2 width=2></td></tr>";
  document.write( strFormat );

  strFormat = "<tr><td width=1></td><td width=1 bgcolor=black></td><td width=" + ( nWidth - 4 ) + " bgcolor=" + strCR + "></td><td width=1 bgcolor=black></td><td width=1></td></tr>";
  document.write( strFormat );

  strFormat = "<tr><td width=1 bgcolor=black></td><td colspan=3 width=" + ( nWidth - 2 ) + " bgcolor=" + strCR + "><table border=0 cellspacing=1 cellpadding=0><tr><td></td></tr></table> </td><td width=1 bgcolor=black></td></tr>";
  document.write( strFormat );

  strFormat = "<tr><td width=1 bgcolor=black></td><td colspan=3 width=" + ( nWidth - 2 ) + " bgcolor=" + strCR + " class='" + strCSS + "' align=center><a href=" + strLink + " onclick='window.event.returnValue=false'>" + strBtnTitle + "</a></td><td width=1 bgcolor=black></td></tr>";
  document.write( strFormat );

  strFormat = "<tr><td width=1 bgcolor=black></td><td colspan=3 width=" + ( nWidth - 2 ) + " bgcolor=" + strCR + "><table border=0 cellspacing=1 cellpadding=0><tr><td></td></tr></table> </td><td width=1 bgcolor=black></td></tr>";
  document.write( strFormat );

  document.write( "</table>" );
}
