package ver5;

import org.springframework.stereotype.Component;

@Component
public class ChinaTire implements Tire{
	private String model = "�߱� Ÿ�̾�";
	
	public String getModel() {
		return model;
	};
}
