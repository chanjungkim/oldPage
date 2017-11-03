package ver6;

import org.springframework.stereotype.Component;

@Component
public class KoreaTire implements Tire{
	private String model = "한국 타이어";
	
	@Override
	public String getModel() {
		return this.model;
	}
}
