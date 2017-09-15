package test04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
// FileInputStream: ������ �о���̴� �ٽ� ��ü
// InputStreamReader: ���� ������ ���ڿ��� ��ȯ�۾� ����
// BufferedReader: ������ �̵� ���۽Ἥ ȿ��������. ������. / ���� ���� ����.
public class Test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("���޸�����.txt")));
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("���޸�����2.txt")));
			
			String msg = br.readLine(); // �� �� ���� �� ����
		
			bw.write(msg);              // �����
			bw.flush();
			System.out.println("��� �Ϸ��:"+msg);
			
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
