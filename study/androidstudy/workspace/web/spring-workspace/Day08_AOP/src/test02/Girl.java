package test02;

import java.util.Random;

public class Girl {
	public void doSomething() {
		System.out.println("�谡 ������.");

		try {
			// �ٽ� ���ɻ���(���൵�� ���� �߻��� �� ����)
			System.out.println("���뱹�� �����.");
			if(new Random().nextBoolean()) {
				System.out.println("���� ����!!!");
				throw new Exception("�ҳ���!!!");
			}
			// after-returning
			System.out.println("������ �Դ´�.");
		}catch(Exception ex){
			// after-throwing
			System.out.println("������ �θ���.");
		}finally {
			// after
			System.out.println("�������� �Ѵ�.");
		}
	}
}
