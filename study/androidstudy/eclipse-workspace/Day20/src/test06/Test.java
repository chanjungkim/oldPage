package test06;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		File f = new File("c:/yyj");
		
		if(f.exists()==false) {
			f.mkdirs();               // make directory
			System.out.println("������ �����Ͽ����ϴ�.");   // c����̺� �ϴܿ� yyj�� ������ �������.
		} else {
			// yyj ���� ���� �����̸� �迭 ������
			String fileNames[] = f.list();
			for(String fileName: fileNames) {
				File file = new File("c:/yyj/"+fileName);
				
				System.out.println("--�����������--");
				System.out.println(file.getAbsolutePath());
				System.out.println(file.isDirectory());
				System.out.println(file.getName());
				System.out.println(file.exists());
				System.out.println("------------");
			}
		}
	}
}
