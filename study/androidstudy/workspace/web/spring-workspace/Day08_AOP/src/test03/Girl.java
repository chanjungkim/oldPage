package test03;
 
import java.util.Random;
 
public class Girl implements Person{
    public void doSomething() throws Exception {
        // �ٽɰ��ɻ���(���൵�� ���� �߻��� �� ����)
        System.out.println("���뱹�� �����.");
        if (new Random().nextBoolean()) {
            System.out.println("���� ����!!!!");
            throw new Exception("�ҳ���!!!!!");
        }
    }
}