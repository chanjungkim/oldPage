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
		// �ٽ� ���ɻ������� ���� �� �̸� �޾ƺ���
		Object[] param = joinPoint.getArgs();
		int n = (Integer) param[0];
		System.out.println("�̸��޾ƺ���"+n);
		System.out.println("�谡 ������.");
		n++; // ���� �� ���Ƿ� �����ϱ�.
	}
	
	@AfterReturning(value="myPoint()", returning="result")
	public void afterReturning(Object result) {
		System.out.println("������ �Դ´� �ȳ�");
		System.out.println("�ٽɱ�� ���:"+result);
	}
	
	@AfterThrowing(value="myPoint()", throwing="ex")
	public void afterThrowing(Throwable ex) {		
		System.out.println("���� �޼���:"+ex.getMessage());
		System.out.println("�ٽɰ��ɻ��� ���� ���� ����");
	}

	@After(value="myPoint()")
	public void after() {
		System.out.println("������.........");
    }
}