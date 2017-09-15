package test04;

public class Shape {
	private int x, y;
	public Shape() {
		x = y = 0;
	}
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void draw() {
		System.out.println("Shape... draw!!!!!!");
	}
}
