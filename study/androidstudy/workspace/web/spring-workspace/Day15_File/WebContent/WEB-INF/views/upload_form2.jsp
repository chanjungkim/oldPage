<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<html>
<head>
<title>upload_form2.jsp</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#btnAdd').click(function(){
			var inputElement ='÷������ : ';
			inputElement += 
			'<input type="file" name="fileList"><br>';
			
			$('input[type=submit]').before(inputElement);
			return false;
		})
	})
</script>
</head>
<body>
	<form action="uploadMulti.do" method="post" enctype="multipart/form">
		ID : <input type="text" name="id"><br> 
		PW : <input type="password" name="pw"><br>
		<div>
			<button id="btnAdd">���� ADD</button>
			<button id="btnRemove">���� REMOVE</button>
		</div> 
		<input type="submit" value="���ε�">
	</form>
</body>
</html>