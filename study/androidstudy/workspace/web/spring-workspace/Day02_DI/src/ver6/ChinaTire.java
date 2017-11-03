package ver6;

import org.springframework.stereotype.Component;

//@Component
public class ChinaTire implements Tire{
	private String model = "중국 타이어";

	@Override
	public String getModel() {
		return this.model;
	}
}
