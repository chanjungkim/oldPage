package ver6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sonata")
public class Car {
//	@Autowired �� ��
	@Autowired
	private Tire tire;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

//	@AutoWired �����ڷε� ����
//	public Car(Tire tire) {
//		this.tire = tire;
//	}
//	
//	@Autowired
//	public void setTire(Tire tire) {
//		this.tire = tire;
//	}
	
	public void printCarInfo() {
		System.out.println("���� ������� Ÿ�̾�:"+tire.getModel());
	}
}
