1.
-1. ��ü ���� �� �������� ���� �� �ִ�.
-2. ��ȯ���� �ڷ���, ������ �ڷ���, ������ ����
-3. ���� Ŭ������ �ν��Ͻ� �ʵ忡 �ִ� ������
-4. ���� ������ ���α׷��� ���� �� �ڵ� �����Ǿ� �׻� �޸𸮿� �����ϰ� �ִ� ���̰� �ν��Ͻ� ������ ��ü ���� �Ŀ� ������� ���̻� ������ ������ ������ �ݷ��Ͱ� ó���Ѵ�.
-5. ��ü �ȿ� ���������ڿ� ���� ��ü�� ���ڷ� �ް� �Ǿ��� �� �ٷ� �� �ִ� �����Ͱ� ������ �ִ�.
-6. ���� ������ ���α׷� ����� �ٷ� �޸𸮿� �ö󰡾��ϴµ� �ν��Ͻ� ������ �޸𸮿� �������� �ʴ� �����̱� ������ �׷���.
static���� ������ �����ϸ� �����ϴ�.

2.
-1.
public class Point{
	private int x, y;
	public void Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

-2.
public class MyMath{
	public int getRandom() {
		return (int)Math.random()*1;
	}
	public double getRandom() {
		return Math.random()*1;
	}
}
-3.
public class MyClass {
	private static String getName() {
		return "MyClass";
	}
	public static String getClassName() {
		return getName();
	}
}

3.
public class Cube{
	private double side;
	public double getSide() {
		return side;
	}
	public double getVolume() {
		return side*side*side;
	}
	//-1
	public Cube() {
		side=0;
	}
	public Cube(double side) {
		this.side=side;
	}
}

5. 
class Single {
	private static Single s_instance;
	public static Single getInstance() {
		if(s_instance==null) {
			s_instance = new Single();
		}
		return s_instance;
	}
}
public class SingleTest{
	public static void main(String[] args) {
		Single obj1 = Single.getInstance();
		Single obj2 = Single.getInstance();
	}
}

getInstance�� static �޼ҵ�� �ϳ��� �����Ѵ�.
�׷��Ƿ� ojb1 == obj2 �̴�. (���� ���� �����ϰ� �ִ�.)