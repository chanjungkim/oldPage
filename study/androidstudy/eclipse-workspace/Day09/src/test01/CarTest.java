package test01;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.setModel("Sonata");
		c1.setPrice(500);
		
		c2.setModel("BMW");
		c2.setPrice(300);
		
		if(c1.comparePrice(c2)){
			System.out.println("������ �����ϴ�.");
		}else{
			System.out.println("������ �ٸ��ϴ�.");
		}
	}
}
