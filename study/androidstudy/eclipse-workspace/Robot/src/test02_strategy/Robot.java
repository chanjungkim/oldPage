package test02_strategy;

public abstract class Robot {
	private String name;
	private MovingStrategy movingStrategy;
	private AttactStrategy attackStrategy;
	
	public Robot(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setMovingStrategy(MovingStrategy movingStrategy) {
		this.movingStrategy = movingStrategy;
	}
	public void setAttackStrategy(AttactStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}
	
	public void move() {
		movingStrategy.move();
	}
	public void attack() {
		attackStrategy.attack();
	}
}