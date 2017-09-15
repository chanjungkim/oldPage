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
		System.out.println("속도: "+getSpeed());
		System.out.println("색상: "+getColor());
		System.out.println("차종: "+getModel());
		System.out.println("터보모드: "+turbo);
	}
}