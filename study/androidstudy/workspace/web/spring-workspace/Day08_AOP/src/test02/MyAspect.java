package test02;
 
public class MyAspect {
    public void myBefore() {
        System.out.println("�谡 ������.");
    }
     
    public void myAfterReturning() {
        System.out.println("������ �Դ´�.");
    }
     
    public void myAfterThrowing() {
        System.out.println("������ �θ���~!!!");
    }
     
    public void myAfter() {
        System.out.println("�������� �Ѵ�.");
    }
}