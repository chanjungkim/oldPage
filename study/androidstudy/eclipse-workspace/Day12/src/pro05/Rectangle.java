package pro05;

public class Rectangle extends Shape{
	private double length;
	private double width;
		
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	@Override
	public double calcArea() {
		double result = this.length * this.width;
		return result;
	}
	
	@Override
	public String toString() {
		return super.toString()+"길이는 "+this.length+" 너비는 "+this.width;
	}
}
