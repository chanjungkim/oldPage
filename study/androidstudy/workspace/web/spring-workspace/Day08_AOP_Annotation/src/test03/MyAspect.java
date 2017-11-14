package test03;
 
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
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
	@Pointcut("execution(String doSomething(int))")
	public void myPoint() {}
	
	@Before(value="myPoint()")
	public void myBefore(JoinPoint joinPoint) {
		// before
		// 핵심 관심사항으로 들어가는 값 미리 받아보기
		Object[] param = joinPoint.getArgs();
		int n = (Integer) param[0];
		System.out.println("미리받아보기"+n);
		System.out.println("배가 고프다.");
		n++; // 들어가는 값 임의로 수정하기.
	}
	
	@AfterReturning(value="myPoint()", returning="result")
	public void afterReturning(Object result) {
		System.out.println("음식을 먹는다 냠냠");
		System.out.println("핵심기능 결과:"+result);
	}
	
	@AfterThrowing(value="myPoint()", throwing="ex")
	public void afterThrowing(Throwable ex) {		
		System.out.println("예외 메세지:"+ex.getMessage());
		System.out.println("핵심관심사항 도중 예외 종료");
	}

	@After(value="myPoint()")
	public void after() {
		System.out.println("설거지.........");
    }
}