package test02;
 
import java.util.Random;
 
import org.springframework.stereotype.Component;
 
@Component
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