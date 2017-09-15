package pro05;

public class Triangle extends Shape{
	private double base=0;
	private double height=0;
		
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double calcArea() {
		double result = 0;
		result=(this.base*this.height)/2;
		return result;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"밑변의 길이는 "+this.base+" 높이는 "+this.height;
	}
}
