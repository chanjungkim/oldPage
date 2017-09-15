package test01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("Koala.jpg");
			out = new FileOutputStream("file_test.jpg");

			int c;	
			while((c=in.read()) != -1 ){
				out.write(c);
			}
			out.flush(); // Buffer�� �����س��� ������ �� �����������.
			System.out.println("���� ���� �Ϸ�");
		} catch (FileNotFoundException e) {
			System.out.println("���� �̸� �߸���. ���� ���ϸ�");
			e.printStackTrace();
		} catch ( IOException e ){
			System.out.println("����� ���� �߻�;;");
			e.printStackTrace();
		} finally {
			if(in != null) {
				try {
					in.close();  // inputStream �ݳ��ϰ� �����ϱ�
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(out != null) {
				try {
					out.close();  // inputStream �ݳ��ϰ� �����ϱ�
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
