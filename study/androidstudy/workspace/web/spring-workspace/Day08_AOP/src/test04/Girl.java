package test04;

import java.util.Random;

public class Girl implements Person {

	@Override
	public String doSomething(int n) throws Exception {

		// �ٽɰ��ɻ���(���൵�� ���� �߻��� �� ����)
		System.out.println("���뱹�� �����.");
		if (new Random().nextBoolean()) {
			System.out.println("���� ����!!!!");
			throw new Exception("�ҳ���!!!!!");
		}
		return "�߲��� ���뱹 �ϼ���";
	}

}