package test01;

public class MyAspect {
	public void MyBefore() {
		System.out.println("�谡 ������");
	}
	
	public void myAfterReturning() {
		System.out.println("������ �Դ´�.");
	}
	
	public void myAfterThrwing() {
		System.out.println("����");
	}
}
