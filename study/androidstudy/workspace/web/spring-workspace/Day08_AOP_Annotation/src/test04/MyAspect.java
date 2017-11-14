package test04;
 
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
 
@Component
@Aspect
public class MyAspect {
	
	@Around("execution(String doSomething(int))")
    public void myAround(ProceedingJoinPoint joinPoint) {
        // before
        // 핵심 관심사항으로 들어가는 값 미리 받아보기
        Object[] param = joinPoint.getArgs();
        int n = (Integer) param[0];
        System.out.println("미리받아보기"+n);
        System.out.println("배가 고프다.");
        n++; // 들어가는 값 임의로 수정하기.
         
        try {
            // 핵심관심사항 doSomething 실행
            // before가 수정한 값으로 들어가는 값 셋팅
            Object result = joinPoint.proceed(new Object[]{n});
             
            // after-returning
            System.out.println("정상종료됨. 결과:"+result);
            System.out.println("음식을 먹는다.");
        } catch (Throwable ex) {
            // after-throwing
            System.out.println("핵심관심사항 도중 예외 종료");
            System.out.println("예외 메세지:"+ex.getMessage());
//          ex.printStackTrace();
        } finally {
            // after
            System.out.println("설거지.........");
        }
    }
}