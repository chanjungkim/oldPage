<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src='https://cdn.rawgit.com/admsev/jquery-play-sound/master/jquery.playSound.js'></script>
</head>
<script type="text/javascript">
	var speed = 30000;
	var positions = ["10%","30%","50%","70%","90%"];
	var wordList = [ '직박구리', '강호동', '안녕하세요', '반갑습니다', '지금', '여러분' ];
	var score = 0;
	var count = 1;
	var level = 1;
	$(function() {
		$('#type-area').on('keyup', function(event) {
			if (event.which == 13) {
				console.log("count: "+count);
				console.log(wordList[count].length);

				console.log("type-area: " + $('#type-area').val() + " label: " + $('label').text())
				if ($('#type-area').val() == $('label').text()) {
					$('label').text("");
					$.playSound('sound/correct.mp3');
															
					$("label").stop();
					$('label').attr('style', 'top:0');

					start(speed, count);					
					
					if(count>4){
						count=1;
						speed-=1000;
						score+=(10+(wordList[count-1].length));
						$('#score').text(score);
						$('#level').text(++level);
						
					}else{
						score+=(wordList[count-1].length);
						$('#score').text(score);
					}
					if(speed < 28000){
						$('label').text("");
						$('label').stop();
						$('#status').attr('style', 'color:red;');
						$('#status').text('우승!!!');
					}else{
						$('#status').attr('style', 'color:green;');
						$('#status').text("맞았습니다!");
					}
				} else {
					score-=3;
					$('#score').text(score);
					$('#status').attr('style', 'color:red;')
					$('#status').text("같은 단어가 없음");
				}
				$('#type-area').val("");
				++count;
			}
		})
	})
	
	function start(speed, count){
		$('label').text(wordList[count]);
		$("label").animate({
			top : '500px',
			opacity : '0',
		}, speed, "linear", function() {
		
		});	
	}
	function restart(){
		speed=30000;
		count=0;
		score=0;
		level=1;
		
		console.log("count: "+count);
		console.log(wordList[count].length);
		$('#status').attr('style', 'color:black;');
		$('#status').text('');
		$('#level').text(level);
		$('#score').text(score);
		start(speed, count);
		count++;
	}
</script>
<style type="text/css">
#word-field {
	background-color: yellow;
	width: 100%;
	height: 500px;
}

#type-field {
	background-color: gray;
	width: 100%;
	height: auto;
}

#type-area {
	background-color: white;
	width: 100%;
	height: auto;
}

#game-field {
	border-width: 5px;
	border-style: groove;
}
label{
	position:absolute;
	top:0px;
}
</style>
<body>
	<div class="container">
		<div id="game-field">
			<div id="word-field">
				<label></label>
			</div>
			<div id="type-field">
				<input id="type-area" type="text">
			</div>
		</div>
		<button onclick="restart()">시작하기</button>
		<div id="result-container">
			레벨: <span id="level">1</span> 점수: <span id="score">0</span> 상태: <span id="status"></span>
		</div>
<!-- 		<ol id="new-projects"></ol> -->
	</div>
 <script>
// $( "#new-projects" ).load( "/resources/load.html #projects li" );
</script>
</body>
</html>