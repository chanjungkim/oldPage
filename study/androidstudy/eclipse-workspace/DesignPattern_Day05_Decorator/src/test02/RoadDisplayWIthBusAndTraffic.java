package test02;

public class RoadDisplayWIthBusAndTraffic extends RoadDisplayWithBusLane{
	@Override
	public void draw() {
		super.draw();
		System.out.println("교통 상황 표시");
	}
}
