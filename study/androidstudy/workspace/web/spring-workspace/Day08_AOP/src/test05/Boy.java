package test05;
 
import java.util.Random;
 
public class Boy implements Person{
    public String doSomething(int n) throws Exception {
        // �ٽɰ��ɻ���(���൵�� ���� �߻��� �� ����)
        System.out.println("�������� �����."+n+"�κ�");
        if (new Random().nextBoolean()) {
            System.out.println("���� ����!!!!");
            throw new Exception("�ҳ���!!!!!");
        }
        return "������ ���ֳ�";
    }
}