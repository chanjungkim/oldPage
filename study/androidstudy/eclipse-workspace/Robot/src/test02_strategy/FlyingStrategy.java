package test02_strategy;

public class FlyingStrategy implements MovingStrategy {

	@Override
	public void move() {
		System.out.println("날아다닌다 슝슝~");
	}

}
