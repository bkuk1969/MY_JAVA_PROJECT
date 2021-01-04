package icehs.sicence.chapter06;

public class Student {
	String name;
	String id;
	int korean;
	int english;
	int math;
	
	int calcAverage() {
		int result = (korean + english + math) / 3;
		return result;
	}
	
	void printStudentInfo() {
		System.out.println("학생성명 : " + name);
		System.out.println("학번 : " + id);
		System.out.println("국어성적 : " + korean);
		System.out.println("영어성적 : " + english);
		System.out.println("수학성적 : " + math);
	}
	
	void changeStudentID(String newID) {
		id = newID;
	}
}
