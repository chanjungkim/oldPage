package test07;

public class Test {
	public static void main(String[] args) {
		Television tv = new Television();
		Aircon air = new Aircon();
		Remocon remocon = new Television();  // ��ü ������ �ȵ����� ���������ν� ��� ���� (new Remocon()�� �Ұ���)

		remocon.turnOn();
		remocon.turnOff();
		
	/*
		((Aircon)remocon).turnOff();
		((Aircon)remocon).turnOn();
	*/
		tv.turnOff();
		tv.turnOn();

		((Television)remocon).turnOff();
		((Television)remocon).turnOn();
		
		air.turnOff();
		air.turnOn();
	}
}
/*
���: 
TV ����!
TV ����!
TV ����!
TV ����!
TV ����!
TV ����!
������ ����!
������ ����!
*/