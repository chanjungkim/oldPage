package test02_strategy;

public class PunchStrategy implements AttactStrategy {

	@Override
	public void attack() {
		System.out.println("펀치 날리기!");
	}

}
