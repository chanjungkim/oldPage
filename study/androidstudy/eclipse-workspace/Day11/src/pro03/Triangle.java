package pro03;

public class Triangle extends Shape{
	private double circumference;
	private double area;
	private int[][] positions = new int[3][2];
	
	public Triangle(){
		
	}
	public Triangle(int[][] positions) {
		this.positions = positions;
		this.area = ((positions[1][0]-positions[0][0])*(positions[1][1]-positions[0][1]))/2+
				((positions[2][0]-positions[1][0])*(positions[1][1]-positions[2][1]))/2;
		this.circumference = positions[2][0]-positions[0][0]+Math.sqrt(Math.pow(positions[1][0]-positions[0][0], 2)+Math.pow(positions[1][1]-positions[0][1],2))
		+Math.sqrt(Math.pow(positions[2][0]-positions[1][0], 2)+Math.pow(positions[1][1]-positions[2][1],2));
	}
	public double getCircumference() {
		return this.circumference;
	}
	public double getArea() {
		return this.area;
	}
	public int[][] getPositions(){
		return positions;
	}

}