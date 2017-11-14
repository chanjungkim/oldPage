package test05;
 
import org.aspectj.lang.ProceedingJoinPoint;
 
public class MyAspect {
    public void myAround(ProceedingJoinPoint joinPoint) {
        // before
        // �ٽ� ���ɻ������� ���� �� �̸� �޾ƺ���
        Object[] param = joinPoint.getArgs();
        int n = (Integer) param[0];
        System.out.println("�̸��޾ƺ���"+n);
        System.out.println("�谡 ������.");
        n++; // ���� �� ���Ƿ� �����ϱ�.
         
        try {
            // �ٽɰ��ɻ��� doSomething ����
            // before�� ������ ������ ���� �� ����
            Object result = joinPoint.proceed(new Object[]{n});
             
            // after-returning
            System.out.println("���������. ���:"+result);
            System.out.println("������ �Դ´�.");
        } catch (Throwable ex) {
            // after-throwing
            System.out.println("�ٽɰ��ɻ��� ���� ���� ����");
            System.out.println("���� �޼���:"+ex.getMessage());
//          ex.printStackTrace();
        } finally {
            // after
            System.out.println("������.........");
        }
    }
}