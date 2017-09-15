
public class Circle {
	private int r, cx, cy;
	
	double area(int r) {
		return Math.PI*Math.pow(r, 2);
	}
	void setR(int r) {
		this.r=r;
	}
	void setCX(int x) {
		cx = x;
	}
	void setCY(int y) {
		cy = y;
	}
	int getR() {
		return r;
	}
	int getCX() {
		return cx;
	}
	int getCY() {
		return cy;
	}
}
