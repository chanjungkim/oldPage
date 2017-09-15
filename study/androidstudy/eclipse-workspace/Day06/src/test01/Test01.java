package test01;

public class Test01 {
	public static void main(String[] args) {
		String msg = new String("Hello Java Class");
		
		String result1 = msg.toUpperCase();
		
		System.out.println(result1);
		
		String result2= msg.replace('H', 'T');
		
		System.out.println(result2);
		
	}
}
