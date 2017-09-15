package test03;

public class Test {
	public static void main(String[] args)  {
		Horse h1 = new Horse("Èñ°Ç");
		Horse h2 = new Horse("À¯Èñ");
		Horse h3 = new Horse("º¸ÈÆ");
		Horse h4 = new Horse("ÂùÁß");
		
//		h1.run();
//		h2.run();
//		h3.run();
//		h4.run();
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		System.out.println("°æ±âÁß...");
	}
}
