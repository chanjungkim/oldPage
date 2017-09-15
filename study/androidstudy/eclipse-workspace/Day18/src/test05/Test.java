package test05;

import java.util.HashMap;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		HashMap<String, Student> students = new HashMap<>();
		
		students.put("111", new Student("111", "양유진", 3.2));
		students.put("121", new Student("121", "김혜미", 4.2));
		students.put("133", new Student("133", "조아라", 3.0));
		students.put("124", new Student("124", "최은혜", 4.4));
		
		// 학번이 111인 학생 정보 출력
		System.out.println(students.get("111"));
		
		// 학번이 11인 학생 삭제
		students.remove("111");
		
		// Map에 들어있는 모든 학생정보 출력하기
		System.out.println(students.get("111"));
		
		// Map에 들어있는 모든 학생정보 출력하기
		Set<String> stuNums = students.keySet();
		
		for(String stuNum : stuNums) {
			Student stu = students.get(stuNum);
			System.out.println(stu);
		}
		
		for(Student st : students.values()) {
			System.out.println(st);
		}
	}
}
