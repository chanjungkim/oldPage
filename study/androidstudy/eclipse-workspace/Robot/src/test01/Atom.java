package test01;

public class Atom extends Robot{
	public Atom(String name) {
		super(name);
	}
	@Override
	public void attack() {
		System.out.println("펀치를 날린다 !");
	}
	
	@Override
	public void move() {
		System.out.println("날아다닌다 슝슝~");
	}
}
