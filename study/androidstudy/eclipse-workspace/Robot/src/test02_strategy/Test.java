package test02_strategy;

public class Test {
	public static void main(String[] args) {
		Atom atom = new Atom("아톰");
		
		atom.setMovingStrategy(new FlyingStrategy());
//		atom.setAttackStrategy(new PunchStrategy());
		atom.setAttackStrategy(new MissileStrategy());
		
		atom.move();
		atom.attack();
	}
}
