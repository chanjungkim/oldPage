package test04;
 
import org.aspectj.lang.ProceedingJoinPoint;
 
public class MyAspect {
    public void myAround(ProceedingJoinPoint joinPoint) {
    	
    	// before
    	// �ٽ� ���ɻ������� ���� �� �̸� �޾ƺ���
    	Object[] param = joinPoint.getArgs();
    	int n = (Integer) param[0];
    	System.out.println("�̸� �޾ƺ���"+n);
    	System.out.println("�谡 ������");
    	n++; // ���� �� ���Ƿ� �����ϱ�
    	
    	try {
    		//before�� ������ ������ ���� �� ����
			Object result = joinPoint.proceed(new Object[]{++n});
			System.out.println("���������, ���: "+result);
		} catch (Throwable e) {
			System.out.println("�ٽɰ��ɻ��� ���߿�������");
			System.out.println("���� �޽���: "+e.getMessage());
			e.printStackTrace();
		} finally {
			//after
			System.out.println("������.......");
		}
    }
}