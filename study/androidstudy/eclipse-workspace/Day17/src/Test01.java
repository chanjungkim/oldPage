import java.util.Random;

public class Test01{
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println(rand.nextInt(9));
		System.out.println(rand.nextBoolean());
		System.out.println(rand.nextDouble());
	}
}