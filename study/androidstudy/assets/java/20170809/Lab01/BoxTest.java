package lab01;

public class BoxTest {
	public static void main(String[] args) {
		Box box1;
		box1 = new Box();
		box1.setWidth(100);
		box1.setLength(100);
		box1.setHeight(100);
		
		box1.getVolume();
		
		Box box2 = new Box();
		box2.setWidth(200);
		box2.setLength(200);
		box2.setHeight(200);
		
		box1 = box2; // ���簡 �ȴ�.
		box1.printProperties();
	}
}

/*
 * EXERCISE
 * 1. �����ϴ�. �߸� ������ �����Ͽ� �����ϸ� ū�� ���� �κ��� �������ش�.
 * 2.
 * class Television{
 * 	private String model1;
 * 	void setModel(String b){
 * 		model = b;
 * 	}
 * 	int getModel(){
 * 		return model;
 * 	}
 * 
 * 	class TelevisionTest{
 * 		public static void main(String[] args){
 * 			Television t = new Television;
 * 			t.setModel("STV-101");
 * 			String b = getModel();
 * 		}
 * 	}
 * 
 *  // b�� "STV-101"
 *  
 *  3.
 *  public class Movie{
 *  	private String title, director, actors;
 *  
 *  	void setTitle(String a){
 *  		title = a;
 *  	}
 *  	void setDirector(String a){
 *  		director = a;
 *  	}	
 *  	void setTitle(String a){
 *  		title = a;
 *  	}	
 *  	String getTitle(){
 *  *  		return title;
 *  	}
 *  	String getDirector(String a){
 *  		return setDirectr();
 *  	}
 *  	String getTitle {
 *  		return title;
 *  	}	
 *  }
 *  
 *  public class MovieTest{
 *  	public static void main(String[] args){
 *  		Movie mv = new Movie();
 *  		mv.setTitle("Transformer");
 *  	}
 *  }
 *  
 */

