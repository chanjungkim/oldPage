package test05;

public class Test {
	public static void main(String[] args) {
		System.out.println(calcArea(new Shape()));
		System.out.println(calcArea(new Rectangle(10, 10, 100, 200)));
	}
	public static String calcArea(Shape s) {
		double result;
		if( s instanceof Rectangle ) {
			result = ((Rectangle)s).getWidth() * ((Rectangle)s).getHeight(); // �þ߰� �о���
		}else if( s instanceof Circle) {
			result = Math.pow((((Circle) s).getRadius()), 2)*Math.PI; // �þ߰� �о���
		}else {
			result = -1;
		}
		return Integer.parseInt(String);
	}
}
