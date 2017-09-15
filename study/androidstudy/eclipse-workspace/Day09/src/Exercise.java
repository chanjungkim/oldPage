1.
-1. 객체 생성 시 설정값을 넣을 수 있다.
-2. 반환값의 자료형, 인자의 자료형, 인자의 갯수
-3. 현재 클래스의 인스턴스 필드에 있는 데이터
-4. 정적 변수는 프로그램이 시작 후 자동 생성되어 항상 메모리에 상주하고 있는 것이고 인스턴스 변수는 객체 생성 후에 만들어져 더이상 사용되지 않으면 가비지 콜렉터가 처리한다.
-5. 객체 안에 접근제어자에 따라 객체를 인자로 받게 되었을 때 다룰 수 있는 데이터가 정해져 있다.
-6. 정적 변수는 프로그램 실행시 바로 메모리에 올라가야하는데 인스턴스 변수는 메모리에 존재하지 않는 상태이기 때문에 그렇다.
static으로 변수를 선언하면 가능하다.

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

getInstance는 static 메소드로 하나만 존재한다.
그러므로 ojb1 == obj2 이다. (같은 곳을 참조하고 있다.)