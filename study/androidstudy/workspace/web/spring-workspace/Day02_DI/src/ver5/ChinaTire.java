package ver5;

import org.springframework.stereotype.Component;

@Component
public class ChinaTire implements Tire{
	private String model = "중국 타이어";
	
	public String getModel() {
		return model;
	};
}
