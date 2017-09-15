package test05;

import java.util.HashMap;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		HashMap<String, Student> students = new HashMap<>();
		
		students.put("111", new Student("111", "������", 3.2));
		students.put("121", new Student("121", "������", 4.2));
		students.put("133", new Student("133", "���ƶ�", 3.0));
		students.put("124", new Student("124", "������", 4.4));
		
		// �й��� 111�� �л� ���� ���
		System.out.println(students.get("111"));
		
		// �й��� 11�� �л� ����
		students.remove("111");
		
		// Map�� ����ִ� ��� �л����� ����ϱ�
		System.out.println(students.get("111"));
		
		// Map�� ����ִ� ��� �л����� ����ϱ�
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
