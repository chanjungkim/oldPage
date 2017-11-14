package test02;
 
import java.util.Random;
 
import org.springframework.stereotype.Component;
 
@Component
public class Girl implements Person{
    public void doSomething() throws Exception {
        // 핵심관심사항(수행도중 예외 발생할 수 있음)
        System.out.println("순대국을 만든다.");
        if (new Random().nextBoolean()) {
            System.out.println("불이 났다!!!!");
            throw new Exception("불났어!!!!!");
        }
    }
}