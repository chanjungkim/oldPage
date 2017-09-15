package exo08;

public class Point3D extends Point2D {
	private double z;

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	public static void main(String[] args) {
		Point2D p = new Point3D();        // 1. 가능!
		p.setX(100);
		p.setZ(40);    // 2. 안됨
		// ((Point3D)p).setZ(40); 로 고쳐야함.
		Point3D p = new Point2D(); // 3. 안됨. 부모 객체에서 자식 객체로 하면 오류 생김.
	}
}

class Point2D{
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
}
