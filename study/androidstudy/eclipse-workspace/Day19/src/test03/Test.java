package test03;

public class Test {
	public static void main(String[] args)  {
		Horse h1 = new Horse("���");
		Horse h2 = new Horse("����");
		Horse h3 = new Horse("����");
		Horse h4 = new Horse("����");
		
//		h1.run();
//		h2.run();
//		h3.run();
//		h4.run();
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		System.out.println("�����...");
	}
}
