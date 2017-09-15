package test04;

public class Test {
	public static void main(String[] args) {
		
		//System.out.println("학생 수: "+Student.numOfStudent); private으로 해서 사용 불가능
		System.out.println("학생 수: "+Student.getNumOfStudent()); // 객체 생성하지 않아도 쓸 수 있다.(단, 클래스명.변수명);
		
		Student s = new Student("양유진", "01075640626", 20); // s객체 생성
		
		System.out.println(s.toString());
		System.out.println(s); // 객체 이름만 넣어도 출력이 된다.
		
		Student s1 = new Student("홍길동", "11111111", 30);
		Student s2 = new Student("홍길똥", "22222222", 20);
		Student s3 = new Student("홍길중", "33333333", 70);

		//System.out.println("학생 수: "+Student.numOfStudent); private으로 해서 사용 불가능
		//System.out.println("학생 수: "+s1.numOfStudent); 객체마다 .numOfStudent를 해줘야함 -> numOfStudent를 static으로 바꿈
		System.out.println("학생 수: "+Student.getNumOfStudent()); // 결과 4
	}
}
