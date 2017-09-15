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
		st.put("map", "지도");
		st.put("java", "자바");
		st.put("school", "학교");
	}
	public static String menu() {
		return "메뉴를 선택하세요.\n1 추가 \n2 검색  \n3 삭제 \n4 종료\n: ";
	}
	public static String add(String en, String ko){
//		System.out.println("추가할 영어 단어를 입력하시오.: ");
//		System.out.println("추가한 영어 단어의 한글 뜻을 입력하시오.: ");
		st.put(en, ko);
		return "추가되었습니다.";
	}
	public static String search(String key){
//		System.out.print("검색할 영어 단어를 입력하시오: ");
		if(st.containsKey(key)) {
			return "의미: "+st.get(key);
		}
		return "존재 하지 않는 단어입니다.";
	}
	public static String remove(String key) {
		st.remove(key);
		return "삭제되었습니다.";
	}
	public static String getMean(String key) {
		mean = st.get(key);
		return mean;
	}
}