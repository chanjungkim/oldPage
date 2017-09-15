package test03;

public class Car {
	private int speed;
	private String model;
	private String color;
	
	public Car(){
		this(0, "SONATA", "WHITE");
	}
	
	public Car(int s) {
		this(s,"SONATA", "WHITE");
	}
	
	public Car(int speed, String model, String color) {
		this.speed=speed;
		this.model=model;
		this.color=color;
	}
	
	public void speedUp(int s) {
		speed += s;
	}
	
	public void printInfo() {
		System.out.println("속도:"+speed+"/차종:"+model+"/색상:"+color);
	}
}