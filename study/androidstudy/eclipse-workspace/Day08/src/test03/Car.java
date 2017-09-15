package test03;

public class Car {
	private String color = "WHITE";
	private String model = "Sonata";
	private int speed = 0;
	
	public void speedUp() {
		speed+=10;
	}
	
	public void speedUP(int s) {
		speed+=s;
	}
	
	public void printCarInfo() {
		System.out.println("차종:"+model+"/현재속도"+speed);
	}
}
