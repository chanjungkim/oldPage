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
			//... �ܺ� Ŭ������ ��� ����� �����Ӱ� ��밡���ϴ�.
		}
	}
	/*
	 * �� ���� Ŭ������ ����ϳ�?
	 * 
	 *  ��� ������ private���� �����ϸ鼭 �����Ӱ� ����� �� �ִ�.
	 *  �ϳ��� ��ҿ����� ���Ǵ� Ŭ�������� �Ѱ��� ���� �� �ִ�.
	 *  ���� �б� ���� ���� ������ ���� �ڵ尡 �ȴ�.
	 */
}
