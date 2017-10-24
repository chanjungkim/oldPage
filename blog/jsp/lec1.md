
안녕하세요? ...입니다.
앞으로 한 달간 JSP을 간단하게 소개하는 내용을 올리겠습니다.

JSP는 JAVA를 토대로 하고 있습니다. 그렇기 때문에 JAVA에 대한 이해가 필수적이므로 입문자 분들도 이해를 할 수 있도록 JAVA를 간단하게 다룰 예정입니다.

다음은 한 달간 다룰 내용입니다.
> 1. JSP소개 & 기본 세팅(JDK, Tomcat, Eclipse)
> 2. JAVA 기초 문법
> 3. JSP 기초 문법
> 4. JSP 내부 객체 
> 5. SQL 기초 & 데이터베이스(MySQL) 연동
> 6. 세션과 쿠키
> 7. EL, JSTL 그리고 Custom Tag

오늘은 그럼 간단하게 JSP에 대한 간단한 소개와 기본 세팅을 해보겠습니다.

# JSP
JSP는 Java Server Pages의 약자로 *.jsp 형식의 파일로 저장이 되며 HTML과 Java를 같이 혼용할 수 있도록 만들어진 언어입니다. JSP를 사용하게 되면 클라이언트의 요청에 대한 결과값으로 서버는 HTML형식의 파일을 클라이언트에게 보여주게 됩니다.

# 기본 세팅
windows 기준으로 설명하겠습니다.
## 1. JDK
1. [다운로드](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)를 클릭한 후, 최신 버전으로 다운로드를 합니다.
현재 최신 버전은 8u151입니다.
Accept License Agreement에 체크를 해야합니다.
2. 시스템 속성에서 환경 변수 경로를 지정합니다.
컴퓨터(오른쪽 클릭) > 속성 >
고급 시스템 설정 > 고급 > 환경 변수(N)
Path에 jdk가 설치된 경로를 추가합니다.
ex. C:\Jsp\jdk1.8.0_111\bin;
경로들 사이와 끝엔 ;로 구분해줍니다.
3. 설치 여부 확인
'Win+R' > cmd 로 명령 프롬프트 실행
java
javac
두 개의 명령어를 인식하면 설치 성공입니다.
## 2. Tomcat
1. [다운로드](https://tomcat.apache.org/download-80.cgi)를 클릭한 후, 최신 버전으로다운로드를 합니다.
현재 최신 버전은 8.5.23입니다.
윈도우 사용자는 32-bit/64-bit Windows Service Installer를 받길 권장합니다.
2. 설치시 Port번호와 Login 정보는 스크린샷을 찍거나 텍스트 파일로 잘 저장해두시기 바랍니다.
## 3. Eclipse
1. [다운로드](http://www.eclipse.org/downloads/)를 클릭한 후, 최신 버전으로다운로드를 합니다.
현재 최신 버전은 Oxygen입니다.
2. 'File > New > Other...'에서 Server을 누릅니다.
3. 아까 설치한 Tomcat버전에 맞춰 선택하고 다음 화면에 Tomcat의 실제 디렉토리를 지정해줍니다.
4. 앞으로 'File > New > Dynamic Web Project'를 계속 사용할 것입니다. 만약 안 보인다면 Other...에 있을 것입니다.

### 파일 구성
1. **src**: Java 파일이 저장되는 곳입니다.
2. **WebContent**: jsp 파일이 저장되는 곳입니다.

### 프로젝트 생성 방법
1. 'File > New > Dynamic Web Project'에서 'Next >'를 끝까지 누른 후 'Generate web.xml deployment descripter'가 나오면 체크 표시 후 Finish를 누릅니다.

# HelloWorld
간단한 예제로 JSP의 특징을 느껴보겠습니다.
프로젝트를 아무 이름(예를들면, HelloWorld)으로 만든 후 WebContect에서 마우스 오른쪽 클릭 > New > JSP File(없으면 Other에서)를 눌러 JSP 파일을 .생성합니다.
그리고 다음의 내용을 적습니다.
```jsp
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
</head>
<body>
    <h1>Hello World</h1>
</body>
</html>
```
(실행은 run또는 'Ctrl+F11'로 할 수 있습니다.)

보다 시피 HTML문서와 매우 유사하지만 다음과 같이 Java를 혼용하여 사용할 수 있습니다.
```jsp
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
</head>
<body>
<% String str = "Hello World"; %>
    <h1><%=str%></h1>
</body>
</html>
```

다음 글에서는 JSP를 사용하여 Java기초 문법을 다뤄보겠습니다.
