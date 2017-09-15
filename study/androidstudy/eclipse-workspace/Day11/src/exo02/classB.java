package exo02;

class classA{
	public void methodOne(int i) {
		
	}
	public void methodTwo(int i) {
		
	}
	public static void methodThree(int i) {
		
	}
	public static void methodFour(int i) {
		
	}
}

public class classB extends classA{
	public static void methodOne(int i) {
		
	}
	public void methodTwo(int i) {
		
	}
	public void methodThree(int i) {
		
	}
	public static void methodFour(int i) {
		
	}
	public static void main(String[] args) {
		System.out.println("안녕하세요");
	}
}

// 1 - methodTwo, methodThree // static 으로 메소드 재정의(오버로딩) 불가능하다. 슈퍼클래스에서 정의한대로만 사용 가능하다.
// 2 - methodFour // A.methodFour, B.methodFour과 같이 사용해야함.객체.methodFour이라고 하면 가림.
// 3 - methodOne과 methodThree