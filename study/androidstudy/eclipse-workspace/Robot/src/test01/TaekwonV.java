package test01;

public class TaekwonV extends Robot{
	public TaekwonV(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		System.out.println("미사일을 쏜다!");
	}
	
	@Override
	public void move() {
		System.out.println("난 걸어다닌다...");
	}
}
