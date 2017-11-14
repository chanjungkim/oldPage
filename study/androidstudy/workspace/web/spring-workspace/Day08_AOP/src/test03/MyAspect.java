package test03;
 
import org.aspectj.lang.ProceedingJoinPoint;
 
public class MyAspect {
    public void myAround(ProceedingJoinPoint joinPoint) {
        System.out.println("배가 고프다."); // before
        try {
            joinPoint.proceed(); // 핵심관심사항 호출시점
            System.out.println("음식을 먹는다."); // after-returning
        } catch (Throwable e) {
            System.out.println("불났음!!!! 엄마!!!!!"); // after-throwing
            e.printStackTrace();
        } finally {
            System.out.println("설거지를 한다.");// after
        }
    }
}