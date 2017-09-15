package test02;

public class SportsCar extends Car{
	private boolean turbo;
	
	public SportsCar() {
		//super();  // 부모의 생성자 먼저 호출 되어야 자식 생성자 호출 가능, 자동생성
		this.turbo = false;
		System.out.println("SportsCar의 매개변수 없는 생성자");
	}
	
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	} 

}