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
		Point2D p = new Point3D();        // 1. ����!
		p.setX(100);
		p.setZ(40);    // 2. �ȵ�
		// ((Point3D)p).setZ(40); �� ���ľ���.
		Point3D p = new Point2D(); // 3. �ȵ�. �θ� ��ü���� �ڽ� ��ü�� �ϸ� ���� ����.
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
