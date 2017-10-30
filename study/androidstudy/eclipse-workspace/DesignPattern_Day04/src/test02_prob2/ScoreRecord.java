package test02_prob2;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
	private List<Integer> scores = new ArrayList<>();
	private MinMaxView minMaxView;
	private DataSheetView dataSheetView;
	
	public void setDataSheetView(DataSheetView dataSheetView) {
		this.dataSheetView = dataSheetView;
	}
	
	public void setMinMaxView(MinMaxView minMaxView) {
		this.minMaxView = minMaxView;
	}
	
	public List<Integer> getScore(){
		return scores;
	}
	
	public void addScore(int score) {
		scores.add(score);
		minMaxView.update();
	}
}
