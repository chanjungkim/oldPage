package test02_prob2;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();
		
		DataSheetView dataSheetView = new DataSheetView(scoreRecord, 5);
		MinMaxView minMaxView = new MinMaxView(scoreRecord);
		
		scoreRecord.setDataSheetView(dataSheetView);
		scoreRecord.setMinMaxView(minMaxView);
		
		for(int i = 1 ; i <= 10 ; i++) {
			int score = new Random().nextInt(100);
			
			System.out.println("점수 추가>"+score);
			scoreRecord.addScore(score);
		}
	}
	
}
