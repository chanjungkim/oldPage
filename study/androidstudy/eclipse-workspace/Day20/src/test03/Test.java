package test03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		FileInputStream in = null;
		
		try {
			in = new FileInputStream("나메모장임.txt");
			
			byte[] readByte = new byte[1024];
			String readMsg = "";                       // 쪼갠 후 합쳐지지 않은 상태
			
			try {
				while(in.read(readByte) != -1) {
						readMsg += new String(readByte);   // 합치는 작업
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("읽은 메시지: "+readMsg);
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
