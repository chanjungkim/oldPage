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
		System.out.println("�ȳ��ϼ���");
	}
}

// 1 - methodTwo, methodThree // static ���� �޼ҵ� ������(�����ε�) �Ұ����ϴ�. ����Ŭ�������� �����Ѵ�θ� ��� �����ϴ�.
// 2 - methodFour // A.methodFour, B.methodFour�� ���� ����ؾ���.��ü.methodFour�̶�� �ϸ� ����.
// 3 - methodOne�� methodThree