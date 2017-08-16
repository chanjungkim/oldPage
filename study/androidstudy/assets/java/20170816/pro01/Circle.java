package pro01;

public class Circle {
	private double radius;
	private String color="WHITE";
	
	public Circle() {
		this(0);
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
}
