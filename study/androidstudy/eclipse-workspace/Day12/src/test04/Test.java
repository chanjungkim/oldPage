package test04;

public class Test {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 10, 100, 50);
	
		Shape[] shapes = new Shape[3];
		
		shapes[0] = new Rectangle(10, 10, 100, 50);
		shapes[1] = new Circle(100, 150, 30);
		shapes[2] = new Rectangle(100, 300, 100, 50);
		
		for(Shape s:shapes) {
			s.draw();
		}
	}
}
