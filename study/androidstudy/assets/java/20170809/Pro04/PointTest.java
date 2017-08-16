class Point {
	private int x, y;
	
	void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void printXY() {
		System.out.println("x: "+x+" y: "+y);
	}
}

public class PointTest{
	public static void main(String[] args) {
		Point pt = new Point();
		pt.setXY(2, 3);
		pt.printXY();
	}
}