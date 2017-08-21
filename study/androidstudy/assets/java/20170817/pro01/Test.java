package pro01;

public class Test {
	public static void main(String[] args) {
		Circle cc = new Circle();
		Rectangle rt = new Rectangle();
		Triangle tr = new Triangle();
		
		cc.move(10, 30);
		cc.move(15, 30);
		cc.move(17, 30);

		rt.move(7, 2);
		rt.move(8, 5);
		rt.move(7, 15);

		tr.move(53, 55);
		tr.move(57, 55);
		tr.move(60, 60);
	}
}
