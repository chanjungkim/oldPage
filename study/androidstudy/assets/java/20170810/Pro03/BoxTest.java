package Pro03;

public class BoxTest {
	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box(20, 20, 20);
		b1.setSize(20, 20, 20);
		b1.setBox(true);
		
		b2.setSize(10,15,8);

		System.out.println(b1);
		System.out.println(b2);
	}
}
