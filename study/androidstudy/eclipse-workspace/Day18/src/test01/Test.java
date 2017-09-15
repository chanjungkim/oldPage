package test01;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Box box = new Box();
		
		box.setData(10);
		box.setData("Hello");
		box.setData((new Scanner(System.in)));
		
		String result = (String) box.getData();
	}
}
