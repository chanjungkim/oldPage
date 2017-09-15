package test01;

public class Test02 {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.speed = 100;
		myCar.model = "BMW";
		myCar.color = "RED";
		
		myCar.printCar();
		
		Car secondCar = new Car();
		
		secondCar.speed = 0;
		secondCar.model = "AUDI";
		secondCar.color = "WHITE";
		
		secondCar.printCar();
	}
}
