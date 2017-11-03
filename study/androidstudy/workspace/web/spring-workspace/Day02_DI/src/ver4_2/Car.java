package ver4_2;

public class Car {
	private Tire tire;
	private String color;
	
//	기본 생성자가 있어야 property에서 인식이 됨
	public Car() {
	}
	
//	이거만 있으면 기본 생성자가 없어짐. 
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
		System.out.println("현재 장착된 타이어:"+color+tire.getModel());
	}
}
