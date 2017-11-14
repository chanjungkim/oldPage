package test01;
 
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
 
@Component
@Aspect
public class MyAspect {
    @Pointcut("execution(void doSomething())")
    public void myPoint() {}
     
    @Before("myPoint()")
    public void myBefore() {
        System.out.println("배가 고프다.");
    }
     
    @AfterReturning("myPoint()")
    public void myAfterReturning() {
        System.out.println("음식을 먹는다.");
    }
     
    @AfterThrowing("myPoint()")
    public void myAfterThrowing() {
        System.out.println("엄마를 부른다~!!!");
    }
     
    @After("myPoint()")
    public void myAfter() {
        System.out.println("설거지를 한다.");
    }
}