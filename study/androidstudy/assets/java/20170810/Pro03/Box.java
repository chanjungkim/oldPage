package Pro03;

public class Box {
	private double height;
	private double horizontal;
	private double vertical;
	private boolean empty;
	
	public Box() {
		this(0, 0, 0);
	}
	public Box(double height, double horizontal, double vertical) {
		this.height=height;
		this.vertical=vertical;
		this.horizontal=horizontal;
		this.empty=false;
	}
	public void setBox(boolean fill) {
		this.empty=fill;
	}
	public void setSize(double a, double b, double c) {
		this.height=a;
		this.horizontal=b;
		this.vertical=c;
	}
	public double getVolume() {
		return height*horizontal*vertical;
	}
	public String toString() {
		return "높이: "+height+", 가로: "+horizontal+", 세로: "+vertical+", 부피: "+getVolume()+", 내용: "+empty;
	}
}