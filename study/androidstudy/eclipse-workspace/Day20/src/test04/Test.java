package test04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
// FileInputStream: 데이터 읽어들이는 핵심 주체
// InputStreamReader: 읽은 데이터 문자열로 변환작업 대행
// BufferedReader: 데이터 이동 버퍼써서 효율적으로. 빠르게. / 뭉텅 뭉텅 읽자.
public class Test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("나메모장임.txt")));
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("나메모장임2.txt")));
			
			String msg = br.readLine(); // 한 줄 읽을 수 있음
		
			bw.write(msg);              // 기록함
			bw.flush();
			System.out.println("기록 완료됨:"+msg);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(br != null) {
				try {
					br.close();
					bw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
