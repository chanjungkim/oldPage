package ver5;

import org.springframework.stereotype.Component;

@Component
public class KoreaTire implements Tire{
	private String model = "�ѱ�Ÿ�̾�";
			
	@Override
	public String getModel() {
		return this.model;
	}
}
