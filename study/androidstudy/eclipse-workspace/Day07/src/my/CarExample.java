package my;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		
		// �߸��� �ӵ� ����
		myCar.setSpeed(-50);
		myCar.getSpeed();
		myCar.isStop();
		myCar.getSpeed();
		myCar.setSpeed(1000);
		myCar.getSpeed();
		myCar.setStop(true);
		myCar.isStop();
		myCar.getSpeed();
		
	}
}
