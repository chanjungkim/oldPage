package ver6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sonata")
public class Car {
//	@Autowired 가 필
	@Autowired
	private Tire tire;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

//	@AutoWired 생성자로도 가능
//	public Car(Tire tire) {
//		this.tire = tire;
//	}
//	
//	@Autowired
//	public void setTire(Tire tire) {
//		this.tire = tire;
//	}
	
	public void printCarInfo() {
		System.out.println("현재 사용중인 타이어:"+tire.getModel());
	}
}
