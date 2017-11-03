package ver4_2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ver4_2/applicationContext.xml");
		
		Car myCar = context.getBean("sonata", Car.class);
		
		myCar.printCarInfo();
	}
}
