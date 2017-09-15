package exo07;

public class MyClass {
	private int a;
	protected int b;
	int c;
	
	class MyInner{
		int d;
		
		public MyInner() {
			System.out.println("MyInner Created!");
		}
		
		public void m() {
			a = 0; 
			b = 0;
			c = 0;
			d = 0;
			
			System.out.println(a+" "+b+" "+c+" "+d);
			//... 외부 클래스의 모든 멤버를 자유롭게 사용가능하다.
		}
	}
	/*
	 * 왜 내부 클래스를 사용하나?
	 * 
	 *  멤버 변수를 private으로 유지하면서 자유롭게 사용할 수 있다.
	 *  하나의 장소에서만 사용되는 클래스들을 한곳에 모을 수 있다.
	 *  보다 읽기 쉽고 유지 보수가 쉬운 코드가 된다.
	 */
}
