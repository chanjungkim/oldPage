package tets;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
 
//import org.apache.commons.codec.binary.Hex;
 
public class TestAES {
    private static String message = "This is just an example!";
 
    public static void main(String[] args) throws Exception {
//      // 1. 128 비트 비밀키 생성
//      KeyGenerator kgen = KeyGenerator.getInstance("AES");
//      kgen.init(128);
//      SecretKey skey = kgen.generateKey();
//
//      // 2. 비밀 키를 이렇게 저장하여 사용하면 암호화/복호화가 편해진다.
//      sKeyString = Hex.encodeHexString(skey.getEncoded());
         
        byte[] sKey = new byte[16];
//      String key = "1234567890123456";
        String key = 
            TestHash.testMD5("yangyuPw").substring(0, 16);
        sKey = key.getBytes();
 
        System.out.println("암호화 하기 전 평문 : "+message);
         
        // 암호화 도구 준비작업
        SecretKeySpec skeySpec = new SecretKeySpec(sKey, "AES");
        Cipher cipher = Cipher.getInstance("AES");
         
        // 3. 암호화 수행
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(message.getBytes());
        System.out.println("encrypted string: " + new String(encrypted));
 
        // 4. 복호화 수행
        cipher.init(Cipher.DECRYPT_MODE, skeySpec);
        byte[] original = cipher.doFinal(encrypted);
        System.out.println("Original string: " + new String(original));
    }
}