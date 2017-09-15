package test07;

public class Aircon implements Remocon{
	@Override
	public void turnOff() {
		System.out.println("¿¡¾îÄÁ ÄÑÁü!");
	}
	@Override
	public void turnOn() {
		System.out.println("¿¡¾îÄÁ ²¨Áü!");
	}
}
