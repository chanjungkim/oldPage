package lab01;

import java.util.HashMap;
import java.util.Map;

public class EnglishDic {
	private static Map<String, String> st = new HashMap<String, String>();
	private static char i = 0;
	private static boolean flag = true;
	private static String key;
	private static String mean;
	
	public EnglishDic(){
		st.put("map", "����");
		st.put("java", "�ڹ�");
		st.put("school", "�б�");
	}
	public static String menu() {
		return "�޴��� �����ϼ���.\n1 �߰� \n2 �˻�  \n3 ���� \n4 ����\n: ";
	}
	public static String add(String en, String ko){
//		System.out.println("�߰��� ���� �ܾ �Է��Ͻÿ�.: ");
//		System.out.println("�߰��� ���� �ܾ��� �ѱ� ���� �Է��Ͻÿ�.: ");
		st.put(en, ko);
		return "�߰��Ǿ����ϴ�.";
	}
	public static String search(String key){
//		System.out.print("�˻��� ���� �ܾ �Է��Ͻÿ�: ");
		if(st.containsKey(key)) {
			return "�ǹ�: "+st.get(key);
		}
		return "���� ���� �ʴ� �ܾ��Դϴ�.";
	}
	public static String remove(String key) {
		st.remove(key);
		return "�����Ǿ����ϴ�.";
	}
	public static String getMean(String key) {
		mean = st.get(key);
		return mean;
	}
}