package test01;
 
import java.util.Random;
 
import org.springframework.stereotype.Component;
 
@Component
public class Boy implements Person{
    public void doSomething() throws Exception {
        // �ٽɰ��ɻ���(���൵�� ���� �߻��� �� ����)
        System.out.println("�������� �����.");
        if (new Random().nextBoolean()) {
            System.out.println("���� ����!!!!");
            throw new Exception("�ҳ���!!!!!");
        }
    }
}