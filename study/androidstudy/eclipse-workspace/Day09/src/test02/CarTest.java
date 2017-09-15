package test02;

import test03.Car;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.printInfo();
		
		Car c2 = new Car(100);
		c2.printInfo();
		
		Car c3 = new Car(50, "520d", "RED");
		c3.printInfo();
	}
}
