<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#btnAjax').click(function(){
			$.ajax({
				type:'get',
				url:'HelloServlet?task=requestData',
				dataType:'json',
				success:function(result){
					var memberData = "<table border='1'>"
					$.each(result, function(index, item){
						memberData += "<tr>";
						memberData += "<td>"+(index+1) + "</td>";
						memberData += "<td>" + item['id'] + "</td>";
						memberData += "<td>" + item['pw'] + "</td>";
						memberData += "<td>" + item['name'] + "</td>";
						memberData += "<td>" + item['phone'] + "</td>";
						memberData += "</tr>";
					})
					memberData += "</table>"
					$('#ajaxResult').html(memberData);
				},
				error:function(){
					alert('ajax 요청 실패함;;')
				}
			})
		})
	})
</script>
</head>
<body>
	<h2>이곳은 html화면입니다.</h2>
	<textarea rows="10" cols="10"></textarea>
	<hr>
	<button id="btnAjax">ajax비둘기 요청버튼</button>
	<div id="ajaxResult"></div>
</body>
</html>