package test03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		FileInputStream in = null;
		
		try {
			in = new FileInputStream("���޸�����.txt");
			
			byte[] readByte = new byte[1024];
			String readMsg = "";                       // �ɰ� �� �������� ���� ����
			
			try {
				while(in.read(readByte) != -1) {
						readMsg += new String(readByte);   // ��ġ�� �۾�
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("���� �޽���: "+readMsg);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(in != null) {
				try {
					in.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
