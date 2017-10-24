package test02_strategy;

public class MissileStrategy implements AttactStrategy {

	@Override
	public void attack() {
		System.out.println("미사일 날리기!");
	}

}
