package ver6;

import org.springframework.stereotype.Component;

//@Component
public class ChinaTire implements Tire{
	private String model = "�߱� Ÿ�̾�";

	@Override
	public String getModel() {
		return this.model;
	}
}
