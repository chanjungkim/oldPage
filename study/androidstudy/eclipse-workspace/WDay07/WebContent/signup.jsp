<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입 폼 만들기</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<style>
.s {
	font-size: 8pt
}

TABLE {
	font-size: 9pt;
	font-family: 굴림체
}
</style>

<script type="text/javascript">
	$(function(){
		var pwText = $('input[name=memPwd]').val();
		$('#btnCheck').on('click', function(){
			console.log(pwText.length);
			if(check("pw", pwText)){
				$('.pw').hide();
			}else{
				$('.pw').show();
			}
		})
	})
	function winOpen(){
		var idText = $('input[name=memId]').val().toLowerCase();
	
		if(check("id", idText)){
			$('.id').hide();
		}else{
			$('.id').show();
		}
	}
	function check(type, text){
		if(type == "id"){
			var pattern1 = /(^[a-zA-Z])/;
			var pattern2 = new RegExp(/^[a-z0-9]+$/);

			if(text.length >= 4 && text.length <= 12){
				if(pattern1.test(text) && pattern2.test(text)){
					return true;
				}
			}
			return false;
		}else if(type == "pw"){
			if(text.length >= 4 && text.length <= 12){
				return true;
			}
			return false;
		}
	}
</script>
</head>

<body>
	<form action="#" method="post" name="frm">

		<table border="0" cellpadding="0" cellspacing="0">
			<caption align="left">
				<font color="white">..</font><font color="red">*</font><font id="s">표시
					항목은 필수 입력 항목입니다.</font>
			</caption>
			<tr height="60">
				<td align="right" width="100" bgcolor="#efefef">아&nbsp;이&nbsp;디&nbsp;</td>
				<td valign="top">&nbsp;&nbsp;<font color="red">*&nbsp;</font></td>
				<td width="600"><input type="text" name="memId" size="16">&nbsp;&nbsp;
					<input id="idCheck" type="button" value="ID중복검사" onClick="winOpen()"><br>
					<font class="id">아이디는 영문,숫자 조합으로 하셔야 합니다.[4자리이상 12자리이하]<br>
						아이디는 <font color="red">소문자</font>로 저장 됩니다.
				</font></td>
			</tr>

			<tr height="45">
				<td align="right" bgcolor="#efefef">암<font color="white">....</font>호&nbsp;
				</td>
				<td valign="top">&nbsp;&nbsp;<font color="red">*</font></td>
				<td><input type="password" name="memPwd" size="16">
					<input type="button" id="btnCheck" value="비밀번호 유효성 체크"> <br>
					<font class="pw">비밀번호는 4자리이상 12자리이하로 입력해주세요.</font></td>
				<!-- 비밀번호 문자와 숫자 혼합사용 체크....? -ㅅ-a -->
			</tr>

			<tr height="30">
				<td align="right" bgcolor="#efefef">암호확인&nbsp;</td>
				<td valign="top">&nbsp;&nbsp;<font color="red">*</font></td>
				<td><input type="password" name="memPwdChk" size="16">
				</td>
			</tr>

			<tr height="30">
				<td align="right" bgcolor="#efefef">이<font color="white">....</font>름&nbsp;
				</td>
				<td valign="top">&nbsp;&nbsp;<font color="red">*</font></td>
				<td><input type="text" name="memName" size="16" maxlength="28">
				</td>
			</tr>

			<tr>

			</tr>

			<tr height="30">
				<td align="right" bgcolor="#efefef">주민등록번호&nbsp;</td>
				<td valign="top">&nbsp;&nbsp;<font color="red">*</font></td>
				<td><input type="text" name="memJumin01" size="7" maxlength="6">-
					<input type="text" name="memJumin02" size="7" maxlength="7">
				</td>
				<!-- 주민등록 번호 유효성체크 -.-a -->
			</tr>

			<tr height="30">

			</tr>
			<!-- 주민번호 입력에 따른 남녀 성별 체크 -.-a -->

			<tr height="30">
				<td align="right" bgcolor="#efefef">E - mail&nbsp;</td>
				<td valign="top">&nbsp;&nbsp;<font color="red">*</font></td>
				<td><input type="text" name="memEmail" size="28"></td>
			</tr>

			<tr height="30">
				<td align="right" bgcolor="#efefef">메일수신&nbsp;</td>
				<td valign="top">&nbsp;&nbsp;<font color="red">*</font></td>
				<td><input type="radio" name="memEmailYes" value="mailYes"
					checked>수신동의&nbsp; <input type="radio" name="memEmailNo"
					value="mailNo">수신거부</td>
				<!-- 이메일 검사...-.-? -->
			</tr>

			<tr height="30">
				<td align="right" bgcolor="#efefef">우편번호&nbsp;</td>
				<td valign="top">&nbsp;&nbsp;<font color="red">*</font></td>
				<td><input type="text" name="memZipCode01" size="4"
					maxlength="3">- <input type="text" name="memZipCode02"
					size="4" maxlength="3"> <input type="button" value="검색"
					onClick="zipChk()"></td>
				<!-- 우편번호 검색 ...? -->
			</tr>

			<tr>
				<td align="right" bgcolor="#efefef">주<font color="white">....</font>소&nbsp;
				</td>
				<td valign="top">&nbsp;&nbsp;<font color="red">*</font></td>
				<td><input type="text" name="memAddr1" size="28"><br>
					<input type="text" name="memAddr2" size="16"></td>
			</tr>

			<tr height="30">

			</tr>

			<tr height="30">
				<td align="right" bgcolor="#efefef">직<font color="white">....</font>업&nbsp;
				</td>
				<td valign="top">&nbsp;</td>
				<td><select name="memJob">
						<option value="Not">선택하세요</option>
						<option value="j1">관리</option>

				</select>
			</tr>

			<tr height="85">
				<td align="right" bgcolor="#efefef">자기소개&nbsp;</td>
				<td valign="top"></td>
				<!-- 자기소개 10글자 이상 어떻게?? -->
				<td><textarea name="memIntro" rows="4" cols="65"></textarea></td>
			</tr>

			<tr align="center">
				<td colspan="3"><input type="button" value="등록"
					onClick="memChk()"> <font color="white">...</font> <input
					type="reset" value="취소"></td>
			</tr>
		</table>
	</form>
</body>
</html>