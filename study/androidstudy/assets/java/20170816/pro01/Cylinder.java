package pro01;

public class Cylinder extends Circle {
	private double height;
	public Cylinder(){
		this(0, 0);
	}
	public Cylinder(double radius) {
		this(radius, 0);
	}
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return super.getArea()*height;
	}
}
