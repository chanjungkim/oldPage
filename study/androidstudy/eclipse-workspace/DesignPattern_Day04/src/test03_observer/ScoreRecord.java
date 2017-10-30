package test03_observer;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject{
	private List<Integer> scores = new ArrayList<>();
	private MinMaxView minMaxView;
	
	public void setMinMaxView(MinMaxView minMaxView) {
		this.minMaxView = minMaxView;
	}
	
	public void addScore(int score) {
		scores.add(score);
		
		minMaxView.update();
	}
	
	public List<Integer> getScores(){
		return scores;
	}
}
