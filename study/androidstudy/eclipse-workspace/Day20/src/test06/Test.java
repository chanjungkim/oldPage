package test06;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		File f = new File("c:/yyj");
		
		if(f.exists()==false) {
			f.mkdirs();               // make directory
			System.out.println("폴더를 생성하였습니다.");   // c드라이브 하단에 yyj의 폴더가 만들어짐.
		} else {
			// yyj 폴더 안의 파일이름 배열 얻어오기
			String fileNames[] = f.list();
			for(String fileName: fileNames) {
				File file = new File("c:/yyj/"+fileName);
				
				System.out.println("--파일정보출력--");
				System.out.println(file.getAbsolutePath());
				System.out.println(file.isDirectory());
				System.out.println(file.getName());
				System.out.println(file.exists());
				System.out.println("------------");
			}
		}
	}
}
