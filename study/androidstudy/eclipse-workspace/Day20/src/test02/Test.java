package test02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		BufferedInputStream in = null;                  // Buffer: �߰� �ٸ�(�����) ����
		BufferedOutputStream out = null;
		
		try {
			// FileInputStream�� ȿ���� �������� BufferedInputStream���� ����. �ݺ��� 100�� ���� �� 10�� ������. ���ֹ���
			in = new BufferedInputStream(new FileInputStream("Koala.jpg"));           
			out = new BufferedOutputStream(new FileOutputStream("file_test.jpg"));

			int c;	
			while((c=in.read()) != -1 ){
				out.write(c);
			}
			System.out.println("���� ���簡 �Ϸ�Ǿ����ϴ�.");
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
