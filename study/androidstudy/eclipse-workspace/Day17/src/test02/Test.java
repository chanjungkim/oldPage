 package test02;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		for(int i = 10; i>0; i--) {
			System.out.println("카운트다운:"+i);
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
