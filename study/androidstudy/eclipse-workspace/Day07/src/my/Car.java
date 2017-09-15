package my;

public class Car {
	private int speed = 0;
	private String color = "WHITE";
	private String model = "Sonata";
	
	public void printCarInfo() {
		System.out.println("현재속도:"+speed);
		System.out.println("색상:"+color);
		System.out.println("차종:"+model);
	}
}
