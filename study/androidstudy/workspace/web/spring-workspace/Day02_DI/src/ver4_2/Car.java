package ver4_2;

public class Car {
	private Tire tire;
	private String color;
	
//	�⺻ �����ڰ� �־�� property���� �ν��� ��
	public Car() {
	}
	
//	�̰Ÿ� ������ �⺻ �����ڰ� ������. 
	public Car(Tire tire) {
		this.tire = tire;
	}
	
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setColor() {
		
	}
	
	public void printCarInfo() {
		System.out.println("���� ������ Ÿ�̾�:"+color+tire.getModel());
	}
}
