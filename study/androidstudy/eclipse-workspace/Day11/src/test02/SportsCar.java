package test02;

public class SportsCar extends Car{
	private boolean turbo;
	
	public SportsCar() {
		//super();  // �θ��� ������ ���� ȣ�� �Ǿ�� �ڽ� ������ ȣ�� ����, �ڵ�����
		this.turbo = false;
		System.out.println("SportsCar�� �Ű����� ���� ������");
	}
	
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	} 

}