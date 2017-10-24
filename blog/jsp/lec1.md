
�ȳ��ϼ���? ...�Դϴ�.
������ �� �ް� JSP�� �����ϰ� �Ұ��ϴ� ������ �ø��ڽ��ϴ�.

JSP�� JAVA�� ���� �ϰ� �ֽ��ϴ�. �׷��� ������ JAVA�� ���� ���ذ� �ʼ����̹Ƿ� �Թ��� �е鵵 ���ظ� �� �� �ֵ��� JAVA�� �����ϰ� �ٷ� �����Դϴ�.

������ �� �ް� �ٷ� �����Դϴ�.
> 1. JSP�Ұ� & �⺻ ����(JDK, Tomcat, Eclipse)
> 2. JAVA ���� ����
> 3. JSP ���� ����
> 4. JSP ���� ��ü 
> 5. SQL ���� & �����ͺ��̽�(MySQL) ����
> 6. ���ǰ� ��Ű
> 7. EL, JSTL �׸��� Custom Tag
> [color=#ed8486]
> 
������ �׷� �����ϰ� JSP�� ���� ������ �Ұ��� �⺻ ������ �غ��ڽ��ϴ�.

# JSP
JSP�� Java Server Pages�� ���ڷ� *.jsp ������ ���Ϸ� ������ �Ǹ� HTML�� Java�� ���� ȥ���� �� �ֵ��� ������� ����Դϴ�. JSP�� ����ϰ� �Ǹ� Ŭ���̾�Ʈ�� ��û�� ���� ��������� ������ HTML������ ������ Ŭ���̾�Ʈ���� �����ְ� �˴ϴ�.

# �⺻ ����
windows �������� �����ϰڽ��ϴ�.
## 1. JDK
1. [�ٿ�ε�](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)�� Ŭ���� ��, �ֽ� �������� �ٿ�ε带 �մϴ�.
���� �ֽ� ������ 8u151�Դϴ�.
Accept License Agreement�� üũ�� �ؾ��մϴ�.
2. �ý��� �Ӽ����� ȯ�� ���� ��θ� �����մϴ�.
��ǻ��(������ Ŭ��) > �Ӽ� >
��� �ý��� ���� > ��� > ȯ�� ����(N)
Path�� jdk�� ��ġ�� ��θ� �߰��մϴ�.
ex. C:\Jsp\jdk1.8.0_111\bin;
��ε� ���̿� ���� ;�� �������ݴϴ�.
3. ��ġ ���� Ȯ��
'Win+R' > cmd �� ��� ������Ʈ ����
java
javac
�� ���� ��ɾ �ν��ϸ� ��ġ �����Դϴ�.
## 2. Tomcat
1. [�ٿ�ε�](https://tomcat.apache.org/download-80.cgi)�� Ŭ���� ��, �ֽ� �������δٿ�ε带 �մϴ�.
���� �ֽ� ������ 8.5.23�Դϴ�.
������ ����ڴ� 32-bit/64-bit Windows Service Installer�� �ޱ� �����մϴ�.
2. ��ġ�� Port��ȣ�� Login ������ ��ũ������ ��ų� �ؽ�Ʈ ���Ϸ� �� �����صνñ� �ٶ��ϴ�.
## 3. Eclipse
1. [�ٿ�ε�](http://www.eclipse.org/downloads/)�� Ŭ���� ��, �ֽ� �������δٿ�ε带 �մϴ�.
���� �ֽ� ������ Oxygen�Դϴ�.
2. 'File > New > Other...'���� Server�� �����ϴ�.
3. �Ʊ� ��ġ�� Tomcat������ ���� �����ϰ� ���� ȭ�鿡 Tomcat�� ���� ���丮�� �������ݴϴ�.
4. ������ 'File > New > Dynamic Web Project'�� ��� ����� ���Դϴ�. ���� �� ���δٸ� Other...�� ���� ���Դϴ�.

### ���� ����
1. **src**: Java ������ ����Ǵ� ���Դϴ�.
2. **WebContent**: jsp ������ ����Ǵ� ���Դϴ�.

### ������Ʈ ���� ���
1. 'File > New > Dynamic Web Project'���� 'Next >'�� ������ ���� �� 'Generate web.xml deployment descripter'�� ������ üũ ǥ�� �� Finish�� �����ϴ�.

# HelloWorld
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
���� ���� HTML������ �ſ� ���������� ������ ���� Java�� ȥ���Ͽ� ����� �� �ֽ��ϴ�.

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

���� �ۿ����� JSP�� ����Ͽ� Java���� ������ �ٷﺸ�ڽ��ϴ�.