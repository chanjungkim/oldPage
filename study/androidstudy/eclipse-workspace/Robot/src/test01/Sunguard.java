package test01;

public class Sunguard extends Robot{
	public Sunguard(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		System.out.println("미사일을 쏜다!");
	}
	@Override
	public void move() {
		System.out.println("날아다닌다 슝슝~");
	}
	
}
