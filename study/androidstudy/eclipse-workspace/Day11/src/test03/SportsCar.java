package test03;

public class SportsCar extends Car {
	private boolean turbo;
	
	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
	private boolean isTurbo() {    // boolean => isXxxx
		return turbo;
	}
	
	public void printCarInfo() {
		System.out.println("�ӵ�: "+getSpeed());
		System.out.println("����: "+getColor());
		System.out.println("����: "+getModel());
		System.out.println("�ͺ����: "+turbo);
	}
}