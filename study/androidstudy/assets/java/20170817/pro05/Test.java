package pro05;

public class Test {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.setColor("빨간색");
		System.out.println(s.calcArea());
		System.out.println(s);
		System.out.println("--------------");
		Rectangle r = new Rectangle();
		r.setWidth(100);
		r.setLength(400);
		r.setColor("노란색");
		System.out.println("너비는 "+r.calcArea());
		System.out.println(r);
		System.out.println("--------------");
		Triangle t = new Triangle();
		t.setBase(10);
		t.setHeight(5);
		t.setColor("주황색");
		System.out.println("너비는 "+t.calcArea());
		System.out.println(t);
	}
}
