<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>�� �ۼ� ȭ��</title>
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
					alert('�� ������ �ϳ��� �����ϴ�.')
				}else if(title == "" && writer == ""){
					alert('����� �ۼ��ڰ� �����ϴ�.')
				}else if(writer == "" && contents == ""){
					alert('�ۼ��ڿ� ������ �����ϴ�.')
				}else if(title == "" && contents == ""){
					alert('����� ������ �����ϴ�.')
				}else if(title == ""){
					alert('������ �����ϴ�.')
				}else if(wrtier == ""){
					alert('�ۼ��ڰ� �����ϴ�.')
				}else if(contents == ""){
					alert('������ �����ϴ�.')
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
			<td>����:</td>
			<td>
				<input id="title" type="text" name="title" size="10">
			</td>
		</tr>
		<tr>
			<td>�ۼ���:</td>
			<td>
				<input id="writer" type="text" name="writer" size="10">
			</td>
		</tr>
		<tr>
			<td>�н�����:</td>
			<td>
				<input type="password" name="password" size="10">
			</td>
		</tr>
		<tr>
			<td>����:</td>
			<td>
				<textarea id="contents" rows="5" cols="10" name="contents" placeholder="���⿡ ������ �Է��ϼ���."></textarea>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" id="submit" value="�ۼ��Ϸ�">
			</td>
		</tr>
	</table>
	</form>
</body>
</html>