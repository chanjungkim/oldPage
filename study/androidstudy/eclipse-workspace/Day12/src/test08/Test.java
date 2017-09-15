package test08;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Car c1 = new Car(100, "Sonata", "RED");
		Car c2 = new Car(200, "Sonata", "BLUE");
		
		Car[] cars = new Car[5];
		
		cars[0] = new Car(100, "Sonata", "RED");
		cars[1] = new Car(10, "Sonata", "YELLOW");
		cars[2] = new Car(0, "Sonata", "BLUE");
		cars[3] = new Car(150, "Sonata", "ORANGE");
		cars[4] = new Car(40, "Sonata", "WTHIE");
		
		Arrays.sort(cars);
		
		for(Car c : cars) {
			c.printCarInfo();
		}
		
		System.out.println(c1.compareTo(c2));
	}
}
