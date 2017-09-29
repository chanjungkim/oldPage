<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>test02_login_form.jsp</title>
</head>
<body>
<%
	Cookie[] cookies = request.getCookies();
	String savedId = "";
	String checked = "false";
	if(cookies.length>0){
		for(Cookie c : cookies){
			if(c.getName().equals("savedId")){
				savedId = c.getValue();
				checked = "true";
			}
		}
	}
	if(request.getParameter("chk") == "false"){
		for(Cookie c : cookies){
			if(c.getName().equals("savedId")){
				c.setMaxAge(0);
			}
		}
	}
%>
<fieldset>
		<legend>Log In</legend>
		<form action='mission01_loginCheck.jsp' method="post">
			<table>
				<tr>
					<td>
						<label>ID</label>
					</td>
					<td>
						<input type="text" name="id" size="15" value="<%=savedId%>">
					</td>
					<td>
						<span><input type="checkbox" name="chk" checked="<%=checked%>">아이디 기억하기</span>
					</td>
				</tr>
				<tr>
					<td>
						<label>PW</label>
					</td>
					<td>
						<input type="password" name="pw" size="15">
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<input type="submit" value="Login">
					</td>
				</tr>
			</table>
		</form>	
</fieldset>
</body>
</html>