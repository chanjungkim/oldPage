package Pro02;

public class PlaneTest {
	public static void main(String[] args) {
		Plane p1 = new Plane();
		System.out.println(p1);

		Plane p2 = new Plane("�������", "A380", 500);
		System.out.println(p2);

		Plane p3 = new Plane("�Ｚ", null, 20);
		System.out.println(p3);

		Plane p4 = new Plane("����", "�����װ�");
		System.out.println(p4);
	}
}
