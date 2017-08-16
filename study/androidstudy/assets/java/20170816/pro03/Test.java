package pro03;

public interface Test {
	public static void main(String[] args) {
		int[][] positions = { {0, 0}, {3, 3}, {6, 0}};
		
		Triangle tr = new Triangle(positions);
		
		System.out.println(tr.getArea());
		System.out.println(tr.getCircumference());
	}
}
