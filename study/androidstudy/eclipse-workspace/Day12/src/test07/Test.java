package test07;

public class Test {
	public static void main(String[] args) {
		Television tv = new Television();
		Aircon air = new Aircon();
		Remocon remocon = new Television();  // 객체 생성은 안되지만 참조변수로써 사용 가능 (new Remocon()은 불가능)

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
결과: 
TV 켜짐!
TV 꺼짐!
TV 꺼짐!
TV 켜짐!
TV 꺼짐!
TV 켜짐!
에어컨 켜짐!
에어컨 꺼짐!
*/