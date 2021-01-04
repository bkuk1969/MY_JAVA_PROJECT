package icehs.sicence.chapter06;

public class StudentTest {
	public static void main(String[] args) {
		Student gildong = new Student();
		
		gildong.name = "홍길동";
		gildong.id = "S001";
		gildong.korean = 94;
		gildong.english = 80;
		gildong.math = 89;
		
		gildong.printStudentInfo();
		System.out.println("평균 : "  + gildong.calcAverage());
		
		System.out.println("* 학번을 변경합니다!!!");
		
		gildong.changeStudentID("STU0001");
		
		gildong.printStudentInfo();
		
	}
}
