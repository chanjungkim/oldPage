package test04;

import java.util.HashMap;

public class Test3 {
	public static void main(String[] args) {
		HashMap<String, Integer> javaScore = new HashMap<>();
		
		javaScore.put("양유", 30);
		javaScore.put("길동", 45);
		javaScore.put("혜미", 100);
		
		System.out.println(javaScore.get("양유"));
		
		javaScore.put("양유", 70);

		System.out.println(javaScore.get("양유"));

		javaScore.remove("혜미");
		
		System.out.println(javaScore.get("혜미"));
	}
}
