package lab01;

public class Circle {
	private double radius;
	private final static double PI = 3.141592;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public double square() {
		return getRadius()*getRadius();
	}
	public double getArea() {
		return PI*Math.pow(radius, 2);
	}
	public double getPerimeter() {
		return 2*PI*radius;
	}
	public static double getPI() {
		return PI;
	}
	
	public static void main(String[] args) {
		// square(10.0); 1-7. square 메소드는 정적 메소드가 아니기 때문에 객체 생성 없이 사용할 수 없다.
		System.out.println(getPI());  // 1-8. 결과: 3.141592
	}
}
