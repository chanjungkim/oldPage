package exe02;

public interface MyInterface {
	void MyMethod(int value) { // 생성자 불가능
		System.out.println("인터페이스의 메소드 안입니다.");   // 메소드 내 명세 불가능
	}
}
