<h1>Dependencies:</h1>
<ul>
    <li><a href="#context">Spring context</a>
    </li>
    <li><a href="#core">Spring core</a>
    </li>
    <li><a href="#jdbc">Spring jdbc</a>
    </li>
    <li><a href="#dbcp">commons-dbcp</a>
    </li>
    <li><a href="#mysql">mysql-connector</a>
    </li>
</ul>
<h3>Add these on POM.xml</h3>

```
<project>
    ...
    </build>
    <dependencies>
        // You write Dependencies here.
    </dependencies>
</project>
```

<div id="context">
<h4>Spring context</h4>
<pre>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>4.2.5.RELEASE</version>
</dependency>
</pre>
</div>
<div id="core">
<h4>Spring core</h4>
<pre>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-core</artifactId>
    <version>4.2.5.RELEASE</version>
</dependency>
</pre>
</div>
<div id="jdbc">
<h4>Spring jdbc</h4>
<pre>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-jdbc</artifactId>
    <version>4.2.5.RELEASE</version>
</dependency>
</pre>
</div>
<div id="dbcp">
<h4>Commons-dbcp</h4>
<pre>
<dependency>
    <groupId>commons-dbcp</groupId>
    <artifactId>commons-dbcp</artifactId>
    <version>1.4</version>
</dependency>
</pre>
</div>
<div id="mysql">
<h4>MySQL connector</h4>
<a href="https://github.com/chanjungkim/chanjungkim.github.io/blob/master/study/drivers/WEB-INF/db/mysql-connector-java-5.1.44-bin.jar">Download MySQL Connector</a><br>
Project Folder Right Click > Build Path > Configure Build Path > Add External JARs > (Add this jar file)
</div>

<h2>Insert</h2>
<ol>
    <li><a href="#dao">BookDaoSpring.java</a></li>
    <li><a href="#test">Test.java</a></li>
    <li><a href="#context2">applicationContext.xml</a></li>
</ol>
<h4>BookDaoSpring.java</h4>
<div id="dao">
<pre>
public class BookDaoSpring {
    // dao relies on this Object
    private JdbcTemplate jdbcTemplate;
    // Constructor, Setter for DI
    public BookDaoSpring() {}
    public BookDaoSpring(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
////////////////////////////////////////////////////////
    public int insert(BookVO book) {
        String sql = 
            "INSERT INTO BOOK(TITLE,PUBLISHER,PRICE,WRITER)"
            +"VALUES(?,?,?,?)"; 
        return jdbcTemplate.update(sql,
                book.getTitle(),
                book.getPublisher(),
                book.getPrice(),
                book.getWriter());
    }
}
</pre>
</div>
<h4>Test.java</h4>
<div id="test">
<pre>
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test02_spring/applicationContext.xml");
        BookDaoSpring dao = context.getBean("dao", BookDaoSpring.class);
	<!-- aaa -->	
        BookVO book = new BookVO("Spring textbook", "meme", 30000, "Samsung");
	<!-- aaa -->System.out.println("insert Result"+dao.insert(book));
    }
}
</code></pre>
</div>
<h4>applicationContext.xml</h4>

Right Click its package > New > Spring Bean Configuration File > name it 'applicationContext'

<div id="context2">
<pre>
	<bean id="ddd" class="org.apache.commons.dbcp.BasicDataSource">
		<property name="driverClassName" value="com.mysql.jdbc.Driver"/>
		<property name="url" value="jdbc:mysql://127.0.0.1./spring"/>
		<property name="username" value="root"/>
		<property name="password" value="sds1501"/>
	</bean>
<!-- -->
	<bean id="jjjj" class="org.springframework.jdbc.core.JdbcTemplate">
<!-- -->
            <property name="dataSource" ref="ddd"/>
	</bean>
<!-- -->
        <bean id="dao" class="test02_spring.BookDaoSpring">
<!-- -->            <property name="jdbcTemplate" ref="jjjj"/>
        </bean>

</pre>
</div>
