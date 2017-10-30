package test02_prob2;

import java.util.List;

import test02_prob1.ScoreRecord;

public class DataSheetView {
	private ScoreRecord scoreRecord;
	private DataSheetView dataSheetView;
	private int minMaxView;
	
	public void setMinMaxView(MinMaxView minMaxView) {
		this.minMaxView = minMaxView;
	}
	
	public void setDataSheetView(DataSheetView dataSheetView) {
		this.dataSheetView = dataSheetView;
	}
	
	public List<Integer> getScores(){
		return scores;
	}
	
	public void addScore(int score) {
		scores.add(score);
		minMaxView.update();
		dataSheetView.update();
	}
	
}
