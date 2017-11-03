package ver5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ver5/applicationContext.xml");
		
		Car myCar = context.getBean("car", Car.class);
		Tire tire = context.getBean("chinaTire", Tire.class);
		
		myCar.setTire(tire);
		myCar.printCarInfo();
	}
}
