package test04;
 
import org.aspectj.lang.ProceedingJoinPoint;
 
public class MyAspect {
    public void myAround(ProceedingJoinPoint joinPoint) {
    	
    	// before
    	// 핵심 관심사항으로 들어가는 값 미리 받아보기
    	Object[] param = joinPoint.getArgs();
    	int n = (Integer) param[0];
    	System.out.println("미리 받아보기"+n);
    	System.out.println("배가 고프다");
    	n++; // 들어가는 값 임의로 수정하기
    	
    	try {
    		//before가 수정한 값으로 들어가는 값 셋팅
			Object result = joinPoint.proceed(new Object[]{++n});
			System.out.println("정상종료됨, 결과: "+result);
		} catch (Throwable e) {
			System.out.println("핵심관심사항 도중예외종료");
			System.out.println("예외 메시지: "+e.getMessage());
			e.printStackTrace();
		} finally {
			//after
			System.out.println("설거지.......");
		}
    }
}