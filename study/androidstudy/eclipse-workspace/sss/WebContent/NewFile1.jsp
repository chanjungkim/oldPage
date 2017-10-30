<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>경로 테스트</title>

<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
   href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet"
   href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
   src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script
   src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
   
<style type="text/css">
.bs-wizard {
   margin-top: 40px;
}

/*Form Wizard*/
.bs-wizard {
   border-bottom: solid 1px #e0e0e0;
   padding: 0 0 10px 0;
}

.bs-wizard>.bs-wizard-step {
   padding: 0;
   position: relative;
}

.bs-wizard>.bs-wizard-step+.bs-wizard-step {
   
}

/* Step 글씨 */
.bs-wizard>.bs-wizard-step .bs-wizard-stepnum {
   color: #595959;
   font-size: 16px;
   margin-bottom: 5px;
}

/* 요약 글씨 */
.bs-wizard>.bs-wizard-step .bs-wizard-info {
   color: #999;
   font-size: 14px;
}

/* 큰 원 */
.bs-wizard>.bs-wizard-step>.bs-wizard-dot {
   position: absolute;
   width: 30px;
   height: 30px;
   display: block;
   background: #fbe8aa;
   top: 45px;
   left: 50%;
   margin-top: -15px;
   margin-left: -15px;
   border-radius: 50%;
}

/* 작은 원 */
.bs-wizard>.bs-wizard-step>.bs-wizard-dot:after {
   content: ' ';
   width: 14px;
   height: 14px;
   background: #fbbd19;
   border-radius: 50px;
   position: absolute;
   top: 8px;
   left: 8px;
}

/* 진행바(막대기) */
.bs-wizard>.bs-wizard-step>.progress {
   position: relative;
   border-radius: 0px;
   height: 8px;
   box-shadow: none;
   margin: 15px 0;
}

.bs-wizard>.bs-wizard-step>.progress>.progress-bar {
   width: 0px;
   box-shadow: none;
   background: #fbe8aa;
}

.bs-wizard>.bs-wizard-step.complete>.progress>.progress-bar {
   width: 100%;
}

.bs-wizard>.bs-wizard-step.active>.progress>.progress-bar {
   width: 50%;
}

.bs-wizard>.bs-wizard-step:first-child.active>.progress>.progress-bar {
   width: 0%;
}

.bs-wizard>.bs-wizard-step:last-child.active>.progress>.progress-bar {
   width: 100%;
}

/* 진행 안 된 원 */
.bs-wizard>.bs-wizard-step.disabled>.bs-wizard-dot {
   background-color: #f5f5f5;
}

.bs-wizard>.bs-wizard-step.disabled>.bs-wizard-dot:after {
   opacity: 0;
}

.bs-wizard>.bs-wizard-step:first-child>.progress {
   left: 50%;
   width: 50%;
}

.bs-wizard>.bs-wizard-step:last-child>.progress {
   width: 50%;
}

.bs-wizard>.bs-wizard-step.disabled a.bs-wizard-dot {
   pointer-events: none;
}
/*END Form Wizard*/
</style>
<style type="text/css">
#route-container{
	height:100px;
	background-color:yellow;
}
.routes{
	display:inline-block;
	background-color:green;
	height:100px;
}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	var count = 1;
	var newRoute;
		
	$('#addBtn').on('click', function(){
		newRoute = "<div class='routes' id='route"+count+"'><input type='text' size='5'>"+count+"번째 div<input type='text' size='5'></div>"
		$('#route-area').before(newRoute);
		$('.routes').attr("style", 'width:'+100/count+'%')
		count++;
	})	
})
function add(){
	
}
</script>

</head>
<body>
   <div class="container">
      <div class="row bs-wizard" style="border-bottom: 0;">
      <%
         int count=1;
      %>
  <div class = "route-countainer">
         <div class="col-xs-<%=12/(count+1)%> bs-wizard-step complete">
            <div class="text-center bs-wizard-stepnum">
               <input type="text" size="7">
            </div>
            <div class="progress">
               <div class="progress-bar"></div>
            </div>
            <a href="#" class="bs-wizard-dot"></a>
            <div class="bs-wizard-info text-center">
               <input type="text" size="10">
            </div>
         </div>
	</div>
      </div>
      <button id="btn" type="button" class="btn btn-default btn-lg">
         <span class="glyphicon glyphicon-plus" aria-hidden="true"></span> 경로 추가
      </button>
   </div>
   <hr>
   에디터~~~~~~~~~<br>
   <div id="route-container">
   		<div id="route-area">asdfsd</div>
   </div>
   <br>
   <button id="addBtn" onclick="add()">경로 추가</button>
   <textarea rows="5" cols="5">adasf</textarea>
</body>
</html>