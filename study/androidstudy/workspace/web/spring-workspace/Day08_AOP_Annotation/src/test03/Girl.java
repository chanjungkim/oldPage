package test03;
 
import java.util.Random;

import org.springframework.stereotype.Component;
 
@Component
public class Girl implements Person{
    public String doSomething(int n) throws Exception {
        // �ٽɰ��ɻ���(���൵�� ���� �߻��� �� ����)
        System.out.println("���뱹�� �����."+n+"�κ�");
        if (new Random().nextBoolean()) {
            System.out.println("���� ����!!!!");
            throw new Exception("�ҳ���!!!!!");
        }
        return "�߲��� ���뱹 �ϼ���";
    }
}