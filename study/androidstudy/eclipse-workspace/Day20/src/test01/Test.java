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
			out.flush(); // Buffer가 축적해놓은 내용을 다 흘려보내버림.
			System.out.println("파일 복사 완료");
		} catch (FileNotFoundException e) {
			System.out.println("파일 이름 잘못됨. 없는 파일명");
			e.printStackTrace();
		} catch ( IOException e ){
			System.out.println("입출력 에러 발생;;");
			e.printStackTrace();
		} finally {
			if(in != null) {
				try {
					in.close();  // inputStream 반납하고 종료하기
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(out != null) {
				try {
					out.close();  // inputStream 반납하고 종료하기
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
