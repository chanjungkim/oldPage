package pro03;

public class Shape {
	private int x;
	private int y;
	private double size;
	public Shape() {
		this(0, 0, 0);
	}
	public Shape(int x, int y, int size) {
		this.x = x;
		this.y = y;
		this.size = size;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void size(double size) {
		this.size = size;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public double getSize() {
		return size;
	}
}
