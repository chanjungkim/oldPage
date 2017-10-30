package test03_observer;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();
		
		DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
		DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);
		MinMaxView minMaxView = new MinMaxView(scoreRecord);
		
		scoreRecord.attach(dataSheetView3);
		scoreRecord.attach(dataSheetView5);
		scoreRecord.attach(minMaxView);
		
		for(int i = 1 ; i <= 10 ; i++) {
			int score = new Random().nextInt(100);
			System.out.println("점수  추가>" + score);
			scoreRecord.addScore(score);
			System.out.println("====================");
		}
	}
}
