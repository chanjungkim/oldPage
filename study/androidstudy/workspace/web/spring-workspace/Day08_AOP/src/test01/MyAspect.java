package test01;

public class MyAspect {
	public void MyBefore() {
		System.out.println("배가 고프다");
	}
	
	public void myAfterReturning() {
		System.out.println("음식을 먹는다.");
	}
	
	public void myAfterThrwing() {
		System.out.println("ㅋㅋ");
	}
}
