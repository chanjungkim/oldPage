package pro06;

public class Novel extends Book {
	private int delayDays;
	
	public int getDelayDays() {
		return delayDays;
	}

	public void setDelayDays(int delayDays) {
		this.delayDays = delayDays;
	}

	public int getLateFees() {
		return this.delayDays*300;
	}
	
	public String toString() {
		return super.toString()+"��ü�� ��: "+this.delayDays+" ��ü��: "+this.getLateFees();
	}
}
