package test03_observer;

import java.util.List;
import java.util.Observer;

public class DataSheetView implements Observer {
	private ScoreRecord scoreRecord;
	private int viewCount;
	
	
	public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
		this.scoreRecord = scoreRecord;
		this.viewCount = viewCount;
	}
	
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
