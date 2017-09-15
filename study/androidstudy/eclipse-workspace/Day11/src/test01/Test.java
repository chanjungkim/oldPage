package test01;

public class Test {
	public static void main(String[] args) {
		SportsCar myCar = new SportsCar();
		
		myCar.setColor("RED");
		myCar.setModel("SONATA");
		myCar.setTurbo(true);
		
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		
		myCar.printCarInfo();
	}
}
