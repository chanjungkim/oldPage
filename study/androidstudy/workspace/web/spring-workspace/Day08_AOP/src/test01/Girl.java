package test01;

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
			System.out.println("������ �Դ´�.");
		}catch(Exception ex){
			System.out.println("������ �θ���.");
		}finally {
			System.out.println("�������� �Ѵ�.");
		}
	}
}
