package pro06;

public class Poet extends Book{
	private int delayDays;
	
	public int getDelayDays() {
		return delayDays;
	}

	public void setDelayDays(int delayDays) {
		this.delayDays = delayDays;
	}

	public int getLateFees() {
		return this.delayDays*200;
	}
	public String toString() {
		return super.toString()+"��ü�� ��: "+this.delayDays+" ��ü��: "+this.getLateFees();
	}
}
