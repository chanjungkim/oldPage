package test02;

public class CarTest1 {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setColor("red");
		myCar.setSpeed(100);
		myCar.setGear(1);
		
		System.out.println("현재 자동차의 색상은 "+myCar.getColor());
		System.out.println("현재 자동차의 속도는 "+myCar.getSpeed());
		System.out.println("현재 자동차의 기어는 "+myCar.getGear());
	}
}
