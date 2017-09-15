package test02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		BufferedInputStream in = null;                  // Buffer: 중간 다리(저장소) 역할
		BufferedOutputStream out = null;
		
		try {
			// FileInputStream이 효율이 떨어지니 BufferedInputStream으로 하자. 반복문 100번 돌릴 거 10번 돌리자. 뭉텅뭉텅
			in = new BufferedInputStream(new FileInputStream("Koala.jpg"));           
			out = new BufferedOutputStream(new FileOutputStream("file_test.jpg"));

			int c;	
			while((c=in.read()) != -1 ){
				out.write(c);
			}
			System.out.println("파일 복사가 완료되었습니다.");
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
