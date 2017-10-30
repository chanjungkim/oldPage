지난 글에서는 'JSP소개 & 기본 세팅(JDK, Tomcat, Eclipse)'에 대해 살펴보았습니다. 이번 글에 대해서는 Dynamic Web Project 안에서 Java 기초 문법에 대해 간단히 알아보겠습니다.


1. <span style="color:#BBB">JSP소개 & 기본 세팅(JDK, Tomcat, Eclipse)</span>
2. <span style="color: blue">JAVA 기초 문법</span>
3. JSP 기초 문법
4. JSP 내부 객체
5. SQL 기초 & 데이터베이스(MySQL) 연동 
6. 세션과 쿠키
7. EL, JSTL 그리고 Custom Tag

# Review
다음의 내용이 기억나지 않는다면 [지난 글](https://github.com/chanjungkim/chanjungkim.github.io/blob/master/blog/jsp/lec1.md)에서 확인해주시기 바랍니다.
* JSP란?
* 우리가 설치했던 프로그램들의 이름은?
* 우리가 진행하는 프로젝트의 파일 구성
* *.jsp는 어디 폴더에서 생성하게 되나?
* 'Hello World'를 출력하는 2가지 방법과 그 차이

<hr>

# 프로그램 설명
지난 글에서 세 가지의 프로그램을 설치하였는데 각 프로그램들의 역할에 대해 간단히 설명하겠습니다.

* **JDK**: Java Developement Kit의 약자로 Java 소스를 컴파일할 수 있고 컴파일 된 Java 소스를 읽을 수 있도록 합니다.
* **Tomcat**: 서버 역할을 하기 위해 필요한 프로그램입니다.
* **Eclipse**: 개발자가 프로젝트를 좀 더 편히 진행할 수 있도록 자동완성 기능과 툴들을 제공해주는 IDE(Integrated Development Environment, 통합 개발 환경). 이 곳에서 Java나 JSP 파일들을 작성할 수 있습니다.

# HTML과 JSP의 차이
지난 번 글에서 **HTML**과 **JSP**에서 Hello World를 출력해보았는데요. 그 차이는 **HTML**는 바로 브라우저에 보여지는 반면 **JSP**는 서버에서 **compile**을 한 후에 **HTML형식**(파일 확장자는 그대로 *.jsp임)으로 결과값이 클라이언트(브라우저)에게 보여지게 됩니다.

* *.html : 브라우저에서 HTML을 interpret함.
* *.jsp : 서버에서 compile 후 HTML형식을 결과값으로 클라이언트 쪽으로 보내면 브라우저에서 interpret함.

지난 번 글에서는 *.jsp를 사용했었는데요. 첫 번 째 예시에서는 Java를 작성하지는 않았지만 *.jsp이기 때문에 내부적으로는 빈 내용의 Java파일을 compile 후 HTML형식의 결과값을 출력했다고 할 수 있겠습니다.

## HTML형식
Compile 없이 브라우저에서 Interpret(해석)을 하여 곧 바로 볼 수 있습니다.
'Day02'이란 이름으로 **Dynamic Web Project**를 생성한 후, **WebContent 폴더**에서 마우스 오른쪽 클릭 후 'test01'이름의 HTML파일을 생성합니다.(test01.html)
그리고 body 태그 사이에 다음 내용을 작성합니다.
```html
<h1>Hello World</h1>
```
결과적으로 다음과 같이 될 것입니다.
```html
<!DOCTYPE html">
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
    <h1>Hello World</h1>
</body>
</html>
```

## JSP형식
**JSP > Compile > (HTML형식 > Interpret)**
HTML와의 차이는 Compile이 포함된다는 것, *.jsp라는 것 그리고 소스 안에서는 <!DOCTYPE html>위의
```jsp
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
```
가 추가되었다는 것입니다.

<span style="color:#eee">contentType은 글의 type. 즉, html형식을 의미하고 charset와 pageEncoding은 문자의 encoding형식을 의미합니다. charset은 클라이언트가 페이지(HTML형식)를 받았을 때의 인코딩 방식, pageEncoding은 *.jsp(jsp페이지)의 인코딩 방식을 의미합니다.)</span>

<hr>

# Java 기초 문법
Java를 공부하는 게 목표가 아니기 때문에 좀 더 자세한 내용을 공부하고 싶다면 다음을 참고하시기 바랍니다.
* [자바 입문](https://programmers.co.kr/learn/courses/5)
* [자바 중급](https://programmers.co.kr/learn/courses/9)


#### 간단히 살펴보는 Java 언어의 역사 & 특징
1. OOP(Object Oriented Programming, 객체 지향 프로그래밍) 언어.
2. 만든이: Gosling[고슬링]
3. 만든 목적: 한 번 작성한 후에 OS에 상관없이 작동하도록하기 위해(X-Platform), JVM(Java Virtual Machine)을 사용하여 실현함.
4. 소유권: 현재는 Oracle이 Sun MicroSystems를 인수하여 Oracle의 소유가 됨.
5. JavaScript와는 전혀 다른 언어다. 원래는 LiveScript 였는데 Java의 유명세를 이용하여 이름을 바꾸게 됨.

#### 준비
우리가 진행할 프로젝트는 **Dynamic Web Project**입니다. **src폴더**에서는 Java(*.java 파일)를 사용하고 **WebContent폴더**에서는 JSP(Java + HTML, *.jsp 파일)를 다루게 됩니다. 우선 기본 Java에서 다루어 보고 JSP에 똑같이 적용을 해보겠습니다. 

### - 기본 문법 구조
자바는 다음과 같이 클래스라는 것 갖습니다.
```java=
class Name{
    ...
}
```
클래스명은 Java파일 명과 동일해야하며 낙타등 표기법(CamelCase)이라 불리는 방식으로 명명합니다. 이는 낙타 등처럼 울퉁불퉁하게 표기하는 방법을 의미합니다.
1. 대문자로 시작해야함(숫자 불가) 
ex) class Car, class House, ...
2. 단어의 구분은 대문자로 함 
ex) class My2Cars, class BigHouse35, ...

클래스는 값과 함수로 이루어져 있습니다.
```java=
class Name{
    값1
    값2
    값3
    ...
    
    함수1(){
        ...
    }
    함수2(){
        ...
    }
    ...
}
```
이 값과 함수는 각각 변수와 메소드란 이름으로 불립니다.

### - 데이터 타입과 변수(Variable<span style="color:#ccc">[베리어블]</span>)
변수는 '변할 수 있는 수'를 의미합니다.
메소드는 '객체 지향 언어에서의 함수'를 의미합니다.

#### 데이터 타입
변수는 '값을 저장하는 메모리 상의 공간'입니다. 메모리의 공간을 효율적으로 나누어 사용할 수 있도록 데이터 타입이란 것이 존재합니다. 이를테면, **운동장**의 공간은 큰데 **마티즈 한 대**만 사용할 수 있으면 비효율적일 것입니다.

메모리(RAM)도 4GB, 8GB, 16GB처럼 정해져있기 때문에 그 안의 공간을 데이터 타입을 사용하여 효율적으로 사용할 수 있도록 했습니다.

메모리는 0과 1로 이루어져있고 이 하나를 트랜지스터로 나타내게 되는데, 문자나 그림 등 조차 모두 0과 1로 이루어져 있습니다. 숫자도 각 숫자마다 값이 정해져있고 숫자 갯수에 따라 컴퓨터가 표현을 하는 것입니다.

자바의 **데이터 타입**은 크게 **char**, **int**, **String**이 있습니다.
(<span style="color:red">String은 대문자로 시작.</span> [참조 타입](https://programmers.co.kr/learn/courses/자바-입문/lessons/참조타입)이라고함.)

**char**는 한 글자를 나타날 때 사용합니다. 이를테면, 'a', '1', '뷁', '子' 등과 같습니다.
(Java는 유니코드(UTF-8)를 사용함.)

**int**는 -21억 ~ +21억 정도의 크기의 수를 담을때 사용하는 변수입니다.

**String**은 한 글자 이상의 문자열로도 나타내고자 할 때 사용합니다.

CamelCase방식처럼 String의 이름도 정해진 것입니다. 이는 내부적으로 다음과 같을 것입니다.
```java=
class String{
    ...
}
```
다음과 같이 데이터 타입은 변수와 메소드에 사용될 수 있습니다.
```java=
class Book{
    int price
    String title
    
    int getPrice(){
        return price
    }
}
```
여기서 return은 getPrice()를 호출하였을 때,
```java
return 결과값으로 내보내는 값
```
즉, 여기선 가격(price)을 돌려주게 됩니다.

실제로는 컴파일러가 끝을 알 수 있게 끝에 세미콜론(;)을 붙여주여야 합니다.
```java=
class Book{
    int price;
    String title;

    int getPrice(){
        return price;
    }
}
```
price와 title라는 변수가 데이터 타입과 이름은 있지만 값이 없는 상태입니다.
값은 다음과 같이 넣을 수 있습니다.
```java=
class Book{
    int price = 13000;
    char type = 'c';
    String title = "Java 기초";

    int getPrice(){
        return price;
    }
}
```
숫자는 곧바로 숫자를 작성하고, char는 '', String은 ""을 사용하여 값을 입력합니다.

### - 연산자와 입출력문

#### 연산자
위에서 배운 데이터 타입으로 간단한 계산을 해보겠습니다. 계산을 할 때 사용할 수 있는 것은 **연산자**입니다.

흔히 아는 -, +, *, /가 자주 사용되는 연산자입니다. 자바에서는 %라는 연산자가 하나 더 있는데요. a%b의 결과로 a를 b로 나누었을 때의 나머지를 얻을 수 있습니다.


#### 출력문
출력을 할 때는 println()이란 메소드를 사용합니다.

간단하게 출력을 하는 방법을 알아보기 위해 **src** 폴더에 Test01.java를 생성합니다.
```java=
class Test01{
}
```
그러면 위와 같이 보일 것입니다.
```java=
class Test01{
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}
```
와 같이 작성하고 실행(Ctrl+F11 혹은 run버튼)을 해보면 Console창에
```
Hello World
```
와 같이 출력이 되는 것을 볼 수 있습니다.

#### 단축키
```java
public static void main(String[] args){

}
```
이 부분은
```java
class Name{
    (여기)
}
```
'여기'란 부분에 커서를 두고 main을 쓴뒤 '**Ctrl+Shift**'를 누르면 목록이 쭉 뜨는데 그 중 **main - main method**란 것에서 엔터를 치면 자동으로 입력이 됩니다.

System.out.println()은 syso를 쓰고 '**Ctrl+Shift**'를 누르면 **sysout - print to standard out**이란 것을 누르면 일일이 다 입력하지 않아도 자동으로 완성이 됩니다. main메소드와 출력문은 자주 사용하므로 단축키를 알아두면 좋습니다.

#### 연산자+출력문
이번엔 연산자를 사용하여 출력하는 예제를 해보겠습니다. 같은 폴더(src)에 Test02.java 파일을 생성하고 다음을 작성 후 실행해봅니다.
```java=
import java.util.Scanner;

class Test02{
    public static void main(String[] args){
        System.out.println(3+8);
    }
}
```

Console창에는 다음과 같이 출력됩니다.
```
8
```
덧셈이란 연산은 되었지만 만약 a와 b라는 변수가 있다면 어떻게 연산을 할 수 있을까요?
```java=
class Test02{
    public static void main(String[] args){
        int a = 3;
        int b = 5;
        System.out.println(a+b);
    }
}
```
결과는 동일하게 8이 나옵니다.

#### 입력문
변수의 연산을 할 수 있었지만 계산기처럼 고정되지 않은 값을 입력받아 연산할 경우엔 어떻게 하면 될까요?

이땐 다음을 사용하여 입력을 받을 수 있습니다.
```java
Scanner sc = new Scanner(System.in);
```
Test03.java를 만들고 다음을 작성해봅니다.
```java=
class Test03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
    }
}
```
그리고 나서 'Ctrl+Shift+O'를 누르면 
```java=
import java.util.Scanner;

class Test03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
    }
}
```
와 같이 import가 자동으로 되는 것을 볼 수 있습니다.

#### <span style="color:red">부가 설명</span>
##### main()
```
public static void main(String[] args){
    
}
```
클래스를 run시키면 메소드가 호출되어 동작하게 됩니다. 자바에서는 main메소드가 있어야 클래스가 비로소 동작할 수 있게 됩니다. 이것은 하나의 약속이므로 사용 불가피한  메소드입니다.

##### println()
```
System.out.println()
```
나중에 클래스와 객체 부분에서 설명이 가능해지는데 여기서 간단히 말하면 **System의 out에 println()이란 메소드**를 호출한 것입니다. System은 클래스 이름, out는 참조 변수, println()은 out안에 있는 메소드를 의미합니다. 이와같이 .(점)으로 접근할 수 있습니다. 
##### Scanner
```
Scanner sc = new Scanner(System.in)
```
Scanner는 또 다른 class입니다. class을 사용하려면 변수로 만들어야하는데 그 방법이 바로
```
클래스명 변수명 = new 클래스명();
```
인 것입니다. 우리가 int, char, String에 값을 넣을 때처럼 왼쪽의 모양은 같습니다. 다만 우측 모양이 다른데, 이것은 클래스를 통해 참조 변수를 만드는 방법입니다.
String은 이 과정이 생략되고 기본 자료형처럼 바로 쓸 수 있게 처리가 되어있습니다.
사실은
```java
String str = new String("문자열");
```
처럼 사용이 가능합니다.
##### import
```java
import java.util.Scanner;
```
이것은 다른 Package(패키지)의 클래스를 연결하여 사용할 수 있도록 해주는 것입니다.  .(점)은 하위 폴더를 의미합니다.
Scanner 클래스를 사용하려면 import를 해줘야합니다.

### - 비교 연산자, 논리 연산자와 조건문(Condition)
**비교 연산자**란 비교를 하기 위한 연산자로 흔히 아는 **<, >, =** 이 바로 그 주인공인데요. 컴퓨터에서는 좀 다르게 **==** 가 '같다'라는 의미의 논리 연산자입니다. **=** (대입 연산자)과 구분하기 쉽고, **===** 와 같은 경우는 데이터형까지 비교해주는 비교 연산자로 사용될 수도 있기 때문에 헷갈리지 않도록 합시다. 그 밖에 같거나 크다, 같거나 작다는 **=<, >=** 로 표시합니다(화살표 모양 =>, <=이 안 되도록 사용하면 된다.)

**논리 연산자**는 참, 거짓을 연산하기 위한 즉, 컴퓨터에 있어서는 1과 0을 계산하기 위한 연산자입니다. 흔히 아는 **OR(이거나), AND(그리고)** 인데요. 프로그래밍에선 **||, &&** 로 사용됩니다. **|** 를 pipe[파이프], **&** 를 ampersand[엠퍼샌드]라고도 읽습니다.

이 두가지를 합쳐 조건문을 만들 수 있습니다. 조건문의 종류에는 **if와 switch**가 있습니다. 조건문을 작성하는 형식이 있는데요. 이는 다음과 같습니다.

#### if
```java=
if(조건문){
    // 조건문이 만족하면 실행하는 부분.
}
// 조건문이 맞지 않는다면 그냥 넘어감.
```
Test04 class파일을 새로 만들고 이를 다음과 같이 작성해봅시다.
```java=
class Test04(){
    int count = 3;
    
    public static void main(String[] args){
        if(count > 3){
            System.out.println("count는 3보다 커요");
        }
    }
}
```
조건이 두 가지로 나뉠 경우(조건을 만족하거나 아니면 만족하지 않거나) 다음과 같이도 쓸 수 있습니다.
```java=
class Test04(){
    int count = 3;
    
    public static void main(String[] args){
        if(count > 3){
            System.out.println("count는 3보다 커요");
        }else{
            System.out.println("count는 3보다 작거나 같아요.)
        }
    }
}
```
여러가지의 조건문이 있을 경우에 다음과 같이 사용할 수 있습니다.
```java=
class Test04(){
    int count = 3;
    
    public static void main(String[] args){
        if(count > 7){
            System.out.println("count는 7보다 커요");
        }else if(count > 5){
            System.out.println("count는 5보다 커요");            
        }else if(count >= 2){
            System.out.println("count는 2보다 크거나 같아요");            
        }else {
            System.out.println("count는 2보다 작아요.")
        }
    }
}
```
if 조건문은 위부터 비교하기 시작하므로 count = 8 일경우 첫 조건문을 실행하게 되므로 오류가 생길 수 있으므로 주의해야합니다.
```java=
if(count > 3){
    // 먼저 비교 후 충족하면 실행됨.
}else if(count > 5){
    // 그냥 넘어갈 수도...
}
```
switch에 대해서는 생략하겠습니다.

### - 반복문(Loop)
반복문에는 for문과 while문이 있습니다.

#### while loop
while도 if와 비슷합니다. 다만 조건식이 충족한다면 계속 반복된다는 특징이 있습니다.
Test05 파일을 만들어 다음을 작성해봅시다.
```java=
public class Test05{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 빨간줄 뜨면 Ctrl+Shift+O로 import 시킴.
        int count = 1;
        int input = sc.nextInt();
        
        while(count < input){
            System.out.println("실행됨. count: "+count);
            count = 1+count;
        }
    }
}
```
입력으로 3을 입력해보면 
```
3
실행됨. count: 1
실행됨. count: 2
```
이라고 출력이 되고 5가 입력이 되면
```
5
실행됨. count: 1
실행됨. count: 2
실행됨. count: 3
실행됨. count: 4
```
-1이 입력이된다면 다음과 같이 아무것도 출력되지 않을 것입니다.
```
-1
```
#### for loop
for loop의 일반적인 형식은 다음과 같습니다.
```java=
int n = 종료될 숫자
for(int i = 시작 숫자 ; i < n ; i++ ){
    // 조건이 맞으면 실행됨.
}
```
한 번 반복할 때마다 i를 증가시키고 (i < n)이 충족이 되면 루프를 종료시키는 것입니다.

while로도 바꿀 수 있는데.while loop 버전으로 치자면
```java=
int i = 시작 숫자;
int n = 종료될 숫자;
while(i < n){
    // 조건이 맞으면 실행됨.
    i++;
}
```
이 됩니다.
### - 클래스와 객체

**클래스**란 저희가 지금까지
```
class ...{

}
```
라고 파일을 만든 것을 의미합니다. 이 파일 하나를 설계도처럼 사용할 수 있게 됩니다. *.java를 컴파일하게 되면 *.class란 파일이 생성되게 됩니다.

**객체**란 사용되는 클래스를 의미합니다. 예를 들면 String은 다음과 같이 사용했습니다.
```java=
public class Test{
    String str = "Hello";
    
    public static void main(String[] args){
        System.out.println(str);
    }
}
```
여기에서 String은 class이며 다른 class 안에서 참조형타입으로 사용되었습니다.

또 다른 예로는 Scanner가 있습니다.
```java=
public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(); 
        System.out.println(sc.next());
    }
}
```
여기에서 new는 클래스를 객체화(실제 클래스를 사용할 수 있게끔)하는 키워드로
```
클래스명 변수명 = new 클래스명();
```
과 같은 형식을 취하지 않으면 객체로 사용을 할 수 없습니다.(String은 자주 사용되므로 내부적으로 이 과정을 생략하고도 사용할 수 있게 되었습니다.)

<hr>

다음 글에서는 Java 기초 문법을 토대로 JSP의 기초 문법을 다뤄보도록 하겠습니다. JSP는 Java 뿐만 아니라 HTML, CSS, JavaScript 대한 약간의 이해가 필요하므로 다 같이 살펴보는 시간을 가지겠습니다.
