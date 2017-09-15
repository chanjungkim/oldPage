package test03;

import java.util.Random;

public class Horse extends Thread{
	// 쓰래드에 아래와 같이도 작성 가능
	private String name;
	private int sleepTime;
	
	public Horse(String name) {
		this.name = name;
		
		sleepTime = new Random().nextInt(3000);
	}
	// end
	
	@Override
	public void run() {
		System.out.println(name+"말 출발!!");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+"말 도착!!");
	}
}
