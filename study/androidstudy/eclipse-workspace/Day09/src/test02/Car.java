package test02;

public class Car {
	private int speed;
	private String model;
	private String color;
	
	public Car(){
		speed = 0;
		model = "SONATA";
		color = "WHITE";
	}
	
	public Car(int s) {
		speed = s;
		model = "SONATA";
		color = "WHITE";
	}
	
	public Car(int s, String m, String c) {
		speed = s;
		model = m;
		color = c;
	}
	
	public void speedUp(int s) {
		speed += s;
	}
	
	public void printInfo() {
		System.out.println("속도:"+speed+"/차종:"+model+"/색상:"+color);
	}
}