안녕하세요? C-an입니다. 지난 글에서는 'JAVA 기초 문법'에 대해 살펴보았습니다. 지난 번 Dynamic Web Project 안에서 Java 파일을 만들어 진행했는데요. 이번에도 새 Dynamic Web Project를 만들어 JSP에 대해 알아보는 시간을 가져보겠습니다.


1. <span style="color:#BBB">JSP소개 & 기본 세팅(JDK, Tomcat, Eclipse)</span>
2. <span style="color:#BBB">JAVA 기초 문법</span>
3. <span style="color: blue">JSP 기초 문법</span>
4. JSP 내부 객체
5. SQL 기초 & 데이터베이스(MySQL) 연동 
6. 세션과 쿠키
7. EL, JSTL 그리고 Custom Tag

# Review
### JSP 소개
다음의 내용이 기억나지 않는다면 [지난 글](https://github.com/chanjungkim/chanjungkim.github.io/blob/master/blog/jsp/lec1.md)에서 확인해주시기 바랍니다.
* JSP란?
* 우리가 설치했던 프로그램들의 이름은?
* 우리가 진행하는 프로젝트의 파일 구성
* *.jsp는 어디 폴더에서 생성하게 되나?
* 'Hello World'를 출력하는 2가지 방법과 그 차이
### 자바
다음의 내용이 기억나지 않는다면 [지난 글](https://github.com/chanjungkim/chanjungkim.github.io/blob/master/blog/jsp/lec2.md)에서 확인해주시기 바랍니다.
* 자바를 만든사람은? 왜 만들었을까?
* JavaScript란 무엇인가?
* 우리가 진행하는 Project 명은?
* 클래스와 객체란?
* 자바 데이터 타입의 종류?
* 변수란 무엇이고 변수를 영어로 뭐라고 하는가?
* 입출력은 어떻게 하는가?
* import를 할 때 사용하는 단축키는?
* 자동완성 단축키는?
* 클래스의 구성
* 조건문과 반복문이란?

<hr>

# HTML 기초
HTML은 Hyper Text Markup Language의 약자로 태그를 사용하여 문서를 표현하였다는 것과 하이퍼 링크를 통해 여러 문서를 이동하거나 한 문서의 특정 위치로 이동이 가능하다는 특징이 있습니다. Dynamic Web Project를 하나 만들고  난 후WebContent 폴더에서 test01.html파일을 생성해보면 다음과 같이 생겼습니다.
```htmlmixed=
<!Doctype html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
```
좀 복잡해보이지만 HTML도 버전이 여러가지가 있는데 <!Doctype html>은 브라우저가 이 문서는 HTML5이라는 것을 인식하기 위해 적어주는 태그입니다. meta 태그는 문서의 속성을 나타내는 것으로 지금은 몰라도 됩니다.
```htmlmixed=
<!Doctype html>
<html>
<head>
    <title></title>
</head>
<body>
</body>
</html>
```
<name>는 시작태그 </name>은 끝태그인 것을 알 수 있으며 html 태그 안에 머리(head)와 몸통(body)으로 구성되어있습니다. title은 브라우저를 띄우면 탭에 나오는 글씨가 나오는 부분입니다.

우리가 브라우저 상에서 보게되는 부분은 **body**부분입니다.

다음과 같이 **HTML**은 단지 글씨, 표, 이미지, 입력폼, 비디오/오디오 폼 정도만 나타낼 수 있습니다.

꺽쇠 부분은 코멘트입니다.

```htmlmixed=
<!Doctype html>
<html>
<head>
    <title>JSP 스터디</title>
</head>
<body>
    <!-- h1는 header(제목)를 나타냅니다. -->
    <h1>
        제목1
    </h1>
    
    <!-- table은 표를 나타냅니다 -->
    <!-- tr: table row-->
    <!-- th: table header-->
    <!-- th: table data-->
    <table>
        <tr>
            <th>번호</th>
            <th>이름</th>
            <th>성별</th>
        </tr>
        <tr>
            <td>1</td>
            <td>홍길동</td>
            <td>남자</td>    
        </tr>
        <tr>
            <td>2</td>
            <td>순이</td>
            <td>여자</td>    
        </tr>
    </table>
    
    <!-- 링크 입니다. anchor -->
    <a href="www.naver.com"> 네이버 가기 </a>
    
    <!-- image를 나타냅니다. -->
    <img src="이미지 주소">
    
    <!-- 버튼 -->
    <button>버튼</button>
    
    <!-- 입력 폼 -->
    <input type="text">
</body>
</html>
```

문서 안에서의 배치나 색상, 움직임을 넣는 것은 할 수가 없는데요. 그래서 **HTML**은 스타일을 적용하기 위해 **CSS(Cascading Style Sheets)** 라고 불리는 언어를 내부에서 사용할 수가 있습니다.

## CSS 기초
CSS를 적용하는 방법은 HTML태그에 직접 적용하는 방법과 분리해서 적용하는 방법이렇게 두 가지가 있습니다.

test02.html를 새로 만들어 다음을 작성해봅시다.
```htmlmixed=
<!Doctype html>
<html>
<head>
    <title>JSP 스터디</title>
</head>
<body>
    <!-- h6까지 있습니다 -->
    <h3 style="color:red;">빨간 글씨</h3>
    <h4 style="color:blue;">파란 글씨</h4>
    <h6 style="color:gray;">회색 글씨</h6>
</body>
</html>
```
이처럼 개별 스타일을 줄 수 있고, 또 다른 방법은 따로 분리하는 것인데요. test03.html을 만들어 다음을 테스트 해봅시다.
```htmlmixed=
<!Doctype html>
<html>
<head>
    <title>JSP 스터디</title>
<style>
    h3{
        color: red;
    }    
</style>
</head>
<body>
    <!-- h6까지 있습니다 -->
    <h3>빨간 글씨</h3>
    <h3>빨간 글씨</h3>
    <h3>빨간 글씨</h3>
</body>
</html>
```
위와 같이 쓴다면 모든 h3태그는 빨간색이 되겠죠. 문서 규모가 커지고 복잡해진다면 같은 h3 태그라도 다른 색을 주고 싶을 때가 있을 것입니다. 그러기 위해 나온 것이 id와 class 개념입니다.

참고로 CSS에서는 /* */이 코멘트입니다.
```htmlmixed=
<!Doctype html>
<html>
<head>
    <title>JSP 스터디</title>
<style>
   /* class는 .이고 id는 #사용 */
    .red{
        background-color:red;
    }
    .blue{
        background-color:blue;
    }
    #blue{
        color: blue;
    }
    #yellow{
        color: yellow;
    }
</style>
</head>
<body>
    <!-- h6까지 있습니다 -->
    <h3 class="yellow">글씨</h3>
    <h4 id="blue">글씨</h4>
    <h5 class="red" id="red">글씨</h5>
    <h3 class="red blue" id="yellow">글씨</h3>     <h4 >글씨</h4>
    <h5 class="red">글씨</h5>
</body>
</html>
```
id는 이름 그대로 태그마다 단 하나만 주어지고 class는 그룹을 지정할 때 사용되며 두 개 이상의 그룹에 속할 수 있습니다.(이름은 제가 아무거나 지은 것입니다.)

#### padding과 margin
모든 태그에는 영역을 갖고 있는데요. 그것은 크게 자기자신의 본 크기 그리고 padding과 margin이라는 것으로 구분이 됩니다.
pad는 무엇을 채울 때 쓰죠? margin은 여백이란 뜻이고요. 그것처럼 모든 태그에는 border로 둘러 쌓여 있는데요. 

<img src="http://www.avajava.com/tutorials/cascading-style-sheets/how-are-margins-borders-padding-and-content-related/how-are-margins-borders-padding-and-content-related-01.gif" style="width:500px;height:300px;">


위의 사진처럼 padding은 border와 content안을 채우는 영역이고 margin은 border외부를 차지하는 영역입니다. border는 선 두께라고 생각하시면 되겠습니다.

#### 절대 위치
```htmlmixed=
<!Doctype html>
<html>
<head>
    <title>JSP 스터디</title>
<style>
    div{
    	background-color: blue;
       
        width: 500px;
        height: 500px;
    }
    h1{
    	background-color: red;
    }
    #first{
    	margin:0;
    	padding:10px;
    }
    #second{
    	margin:10px;
    	padding:0px;
    }
    #third{
    	margin:10px;
    	padding:10px;
    }
    #fourth{
    	position:absolute;
    	left: 50px;
    	top: 10px;
    	
    	
    	background-color: yellow;
    }
</style>
</head>
<body>
    <div>
        <h1 id="first">영역</h1>
        <h1 id="second">영역</h1>
        <h1 id="third">영역</h1>
        <h1 id="fourth">영역</h1>
    </div>
</body>
</html>
```
[크롬 개발자 도구](https://www.jbfactory.net/10866)를 참고 하시면 브라우저의 각 태그들의 padding, margin 등의 영역 크기를 직접 볼 수 있으며 편집도 가능합니다.

**HTML**에 **CSS**를 사용하여 스타일도 주고 배치도 어느 정도 해결하였지만 글씨를 클릭하여 이동 시킨다든지 엔터를 누르면 글씨가 사라진다든지하는 이벤트 혹은 동작을 부분이 빠져있는데요. 그것은 우리가 JavaScript로 해결을 할 수 있습니다.

## JavaScript 기초
JavaScript는 브라우저 상에서 이벤트를 담당하는 프로그래밍 언어라고 생각하시면 됩니다.

자바와 자바스크립트는 이름이 비슷한데요. 직접적인 관련성이 없고 JavaScript의 이름은 원래 LiveScript였습니다. 단지 Java의 인기를 이용하기 위해 붙인 이름이죠. - [참고](https://ko.wikipedia.org/wiki/자바스크립트)

test04.html를 만들어 다음을 테스트해봅시다.

```htmlmixed=
<!Doctype html>
<html>
<head>
    <title>JSP 스터디</title>
</head>
<script>
    function changeColor(){
        var title = document.getElementById("title");
        if(title.style.color == "red"){
        	title.style.color = "blue";
        }else{
        	title.style.color = "red";
        }
    }
</script>
<body>
    <h1 id="title" onclick="changeColor()">
        색아 변해라!
    </h1>
</body>
</html>
```
JavaScript는 <script></script> 태그 안에 작성하며 메소드를 작성할 때 아래와 같이 작성합니다.
```javascript=
function 메소드명(파라미터){
    // 내용
}
```

이처럼 같이 동작을 시키고자 하는 태그에 id나 class 이름 등을 주어 document.getElementById("이름") 혹은 document.getElementByClassName("이름")을 통해 변수에 넣고 그 변수를 활용하는 식으로 사용합니다. 

글씨를 클릭하면 색이 변하는 걸 알 수 있습니다.

자료형은 variable의 준말인 var만 있습니다. Java에서 int, char, String 등 모두가 var로 표현이 됩니다. 그래서 Java보다 자료형에 있어서 조금 더 자유롭습니다. 그 밖에 조건문, 반복문, 연산자들은 동일하게 사용됩니다.

JavaScript로 키보트 이벤트나 마우스 이벤트 등을 작성하여 동적으로 CSS의 속성을 변화시킬 수 있고 alert창이나 prompt 등의 창의 형태로 출력도 가능하게 됩니다.

JavaScript가 좀 지저분한 느낌도 주는데요. 그래서 jQuery와 같은 언어를 사용하기도 합니다. jQuery도 자바스크립트이긴 한데 짧게 쓰기 위한 버전이라고 할 수 있습니다.

```javascript=
<!Doctype html>
<html>
<head>
    <title>JSP 스터디</title>
</head>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script>
    function changeColor(){
        if($('#title').css("color") == "rgb(255, 0, 0)"){
        	$('#title').attr('style', 'color: blue');
        }else{
        	$('#title').attr('style', 'color: red');
        }
    }
</script>
<body>
    <h1 id="title" onclick="changeColor()">
        색아 변해라!
    </h1>
</body>
</html>
```
뭔가 간단해 진 거 같나요? 지금은 몇 줄 되어 크게 못 느끼지만 나중에 큰 프로젝트를 할 때 jQuery를 사용하면 같은 결과를 간단하게 해결할 수 있게 됩니다.

JavaScript에 대한 더 자세한 내용은 [여기](https://opentutorials.org/course/1375)를 참조하시기 바랍니다.

# JSP 기초
위에서 배운 HTML, CSS, JavaScript 모두 JSP에서 사용할 수 있습니다. 단지, JSP는 클라이언트가 서버에게 요청을 던지게 되면 그 요청에 따라 서버가 결과물을 HTML 형식으로 바꿔 클라이언트에게 전달하게 되는 것입니다.

예를 들어 로그인 정보와 같은 것은 사람마다 다를 것입니다. 그럴 경우 다음과 같이 사용하게 됩니다.
```htmlmixed=
아이디: <%= id %>
생일: <%= birthDate %>
마지막으로 로그인한 날짜: <%= lastDate %>
```
나중에 웹 프로젝트를 하게 되면 Servlet이라고 하는 클래스에서 클라이언트의 요청을 받아 정보를 jsp에게 넘겨주게 됩니다. 그렇게 된다면 서버에서 위의 <%= %>는 그 회원의 알맞는 정보를 던져주게 되고 클라이언트는 <%= %>의 부분은 보이지 않고 단지 HTML형식의 파일로만 볼 수 있게되는 원리입니다.

<img src="img/mvc model.png" width="400px" height="400px">

<%와 같은 태그는 Scriptlet[스크립트럿]이라고 불리는데요. 이 태그 안에는 Java를 사용할 수 있습니다. HTML문서 안에 스크립트럿으로 Java를 혼용하여 쓸 수있게 되는 것이죠.

이제 Dynamic Web Project를 만들고 WebContent에 test05.jsp파일을 만들어 다음과 같이 작성해봅시다.
```htmlmixed=
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%	
	String str = "스크립트럿!";
    
    for(int i = 0 ; i < 5 ; i++){
        str += i; 
    }
%>
<h1><%=str %></h1>
</body>
</html>
```
일단, jsp파일을 실행하려면 Server가 있어야하는데요. New > Server으로 가서 설치한 Tomcat 버전과 같은 것을 선택 후에 경로를 Program Files > Apache Software Foundation로 지정하여 Servers를 생성하고 위의 파일을 Ctrl+F11을 눌러 실행합니다.

결과화면은 다음과 같습니다.
```
스크립트럿!01234
```
이런 식으로 Java를 HTML에 적용할 수 있습니다. 여기서 <% %>안에는 자바를 작성할 수 있지만 <%= %>는 좀 다른데요. 변수를 HTML문서에 출력하기 위한 '표현식(EL, Expression Language)'입니다. 스크립트럿과 표현식이 있는 거죠.

JSP는 다음과 같이도 사용할 수 있게 됩니다.

```htmlmixed=
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%	
	String str = "스크립트럿!";    

	for(int i = 0 ; i < 5 ; i++){
%><h1><%=i%><%=str %></h1>
<%}%>


</body>
</html>
```

결과는 다음과 같습니다.

```
0스크립트럿!

1스크립트럿!

2스크립트럿!

3스크립트럿!

4스크립트럿!
```

즉, 태그도 반복을 해서 여러번 보여줄 수가 있죠. 이 원리로 댓글이나 게시판을 구현할 때 데이터베이스의 정보를 있는 만큼(i개 만큼)만 보여줄 때 사용하게 됩니다.

물론, 조건문도 가능합니다. 게시판에서 현재 로그인한 사람과 글쓴이가 같으면 해당 글을 삭제/수정 버튼이 보이고 아이디가 서로 다르면 보이지 않게 할 수 있습니다.

이를테면 다음과 같겠죠.
```htmlmixed=
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%	
	String currentId = "master";
	String title = "반갑습니다~";
	String contents = "첫 가입했습니다 ㅎㅎ";
	String writer = "test04";
%>
<% if(currentId.equals(writer)){ %>
<h1>같을 때</h1>
<table border="1">
	<tr>
		<th>제목</th>
		<th>글 내용</th>
		<th>글쓴이</th>
	</tr>
	<tr>
		<td><%=title %></td>
		<td><%=contents %></td>
		<td><%=currentId %></td>
	</tr>
	<tr>
		<td colspan="3"><button>수정</button><button>삭제</button>
		</td>
	</tr>
</table>
<%}else{%>
<h1>다를 때</h1>
<table border="1">
	<tr>
		<th>제목</th>
		<th>글 내용</th>
		<th>글쓴이</th>
	</tr>
	<tr>
		<td><%=title %></td>
		<td><%=contents %></td>
		<td><%=writer %></td>
	</tr>
	<tr>
		<td colspan="3"><button>댓글달기</button>
		</td>
	</tr>
</table>
<%}%>
</body>
</html>
```
위의 소스를 수정해서 같을 때가 출력되도록 해보시길 바랍니다.

<hr>

이상 JSP 기초에 대해서 간단히 알아보았습니다. 다음 시간엔 내부 객체에 알아볼 건데요. 내부 객체를 다루면서 간단히 MVC 구조도 한 번 살펴보는 시간을 가지겠습니다.
