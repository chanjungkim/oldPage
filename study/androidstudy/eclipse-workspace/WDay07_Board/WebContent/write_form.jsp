<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>글 작성 화면</title>
<meta http-equiv="Content-type" content="text/html; charset=utf-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script>
	$(function(){
		$('#submit').on('click', function(){
			var title = $('#title').val();
			var writer = $('#writer').val();
			var contents = $('#contens').val();

			if(title == "" || writer == "" || contents == ""){
				if(title == "" && writer == "" && contents == ""){
					alert('글 내용이 하나도 없습니다.')
				}else if(title == "" && writer == ""){
					alert('제목과 작성자가 없습니다.')
				}else if(writer == "" && contents == ""){
					alert('작성자와 내용이 없습니다.')
				}else if(title == "" && contents == ""){
					alert('제목과 내용이 없습니다.')
				}else if(title == ""){
					alert('제목이 없습니다.')
				}else if(wrtier == ""){
					alert('작성자가 없습니다.')
				}else if(contents == ""){
					alert('내용이 없습니다.')
				}
				$("#submit").attr("type", "button")
		        return;
			}else{
				$("#submit").attr("type", "submit")
				$('form').submit();
			}
		})
	})
</script>
</head>
<body>
	<form action="<%=request.getContextPath()%>/board" method="post">
		<input type="hidden" name="type" value="write">												
	<table border="1">
		<tr>
			<td>제목:</td>
			<td>
				<input id="title" type="text" name="title" size="10">
			</td>
		</tr>
		<tr>
			<td>작성자:</td>
			<td>
				<input id="writer" type="text" name="writer" size="10">
			</td>
		</tr>
		<tr>
			<td>패스워드:</td>
			<td>
				<input type="password" name="password" size="10">
			</td>
		</tr>
		<tr>
			<td>내용:</td>
			<td>
				<textarea id="contents" rows="5" cols="10" name="contents" placeholder="여기에 내용을 입력하세요."></textarea>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" id="submit" value="작성완료">
			</td>
		</tr>
	</table>
	</form>
</body>
</html>