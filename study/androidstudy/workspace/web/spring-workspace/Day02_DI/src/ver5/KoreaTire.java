package ver5;

import org.springframework.stereotype.Component;

@Component
public class KoreaTire implements Tire{
	private String model = "한국타이어";
			
	@Override
	public String getModel() {
		return this.model;
	}
}
