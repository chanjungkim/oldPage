package test04;

public class Test {
	public static void main(String[] args) {
		
		//System.out.println("�л� ��: "+Student.numOfStudent); private���� �ؼ� ��� �Ұ���
		System.out.println("�л� ��: "+Student.getNumOfStudent()); // ��ü �������� �ʾƵ� �� �� �ִ�.(��, Ŭ������.������);
		
		Student s = new Student("������", "01075640626", 20); // s��ü ����
		
		System.out.println(s.toString());
		System.out.println(s); // ��ü �̸��� �־ ����� �ȴ�.
		
		Student s1 = new Student("ȫ�浿", "11111111", 30);
		Student s2 = new Student("ȫ���", "22222222", 20);
		Student s3 = new Student("ȫ����", "33333333", 70);

		//System.out.println("�л� ��: "+Student.numOfStudent); private���� �ؼ� ��� �Ұ���
		//System.out.println("�л� ��: "+s1.numOfStudent); ��ü���� .numOfStudent�� ������� -> numOfStudent�� static���� �ٲ�
		System.out.println("�л� ��: "+Student.getNumOfStudent()); // ��� 4
	}
}
