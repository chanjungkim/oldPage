package ver5;

import org.springframework.stereotype.Component;

@Component
public class Car {
	private Tire tire;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(Tire tire) {
		this.tire = tire;
	}
	
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	public void printCarInfo() {
		System.out.println("���� ������� Ÿ�̾�:"+tire);
	}
}
