package test05;

public class Car {
	private int speed;
	private String color;
	
	public Car(int speed, String color) {
		this.speed = speed;
		this.color = color;
	}
	
	public void speedUp() throws Exception {             // ��ø� �������
		if(speed > 300) {
			throw new Exception("�ӵ� �ְ�ġ �Ѵ´�~~~~");      // ��������~
		} else {
			speed += 10;
		}
	}
	
	public void speedDown() {
		speed -= 10;
	}
}
