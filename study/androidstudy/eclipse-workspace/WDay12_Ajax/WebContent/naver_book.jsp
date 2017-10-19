<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>네이버 책 검색 화면</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#btnSearch').on('click', function(){
			var keyword = $('#keyword').val();
			
			$.ajax({
				type:'post',
				url:'NaverServlet',
				data:'keyword='+keyword,
				dataType: 'json',
				success: function(resultData){
					alert('네이버 책 검색 완료')
					
					var bookData = "<table border = '1'>"
					$.each(function(resultData, item){
						bookData += "<tr>";
						bookData += "<td>";
						bookData += "<img src='"+item['image']+"'>";
						bookData += "</td>";
						bookData += "<td>"+item['title']+"</td>";
						bookData += "<td>"+item['price']+"</td>";
						bookData += "<td>"+item['discount']+"</td>";
						bookData += "<td>"+item['title']+"</td>";
						bookData += "</tr>";
					})
				},
				error: function(){}
			})
		})
	})
</script>
</head>
<body>
	<h2>네이버 책 검색 결과를 볼 수 있는 화면입니다.</h2>
	검색어 입력:<input type="text" size="20" id="keyword">
	<button id="btnSearch">검색</button>
	<hr>
	<div id="searchResult"></div>
</body>
</html>