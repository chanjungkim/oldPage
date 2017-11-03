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
```htmlmixed=
<!Doctype html>
<html>
<head>
    <title>JSP 스터디</title>
</head>
<body>
</body>
</html>
```
