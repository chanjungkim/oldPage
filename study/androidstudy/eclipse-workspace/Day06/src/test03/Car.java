package test03;

public class Car {
	
	int speed;
	String color;
	String model;
	
	void printCar() {
		System.out.println("-현재 차량객체의 정보-");
		System.out.println("속도: "+speed);
		System.out.println("색상: "+color);
		System.out.println("차종: "+model);
		System.out.println("-------------");
	}
}
