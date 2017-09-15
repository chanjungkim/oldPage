package test05;

public class Car {
	private int speed;
	private String color;
	
	public Car(int speed, String color) {
		this.speed = speed;
		this.color = color;
	}
	
	public void speedUp() throws Exception {             // 고시를 해줘야함
		if(speed > 300) {
			throw new Exception("속도 최고치 넘는다~~~~");      // 던져버려~
		} else {
			speed += 10;
		}
	}
	
	public void speedDown() {
		speed -= 10;
	}
}
