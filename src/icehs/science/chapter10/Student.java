package icehs.science.chapter10;

public class Student extends Person {
	
	String department;
	
	@Override
	void eat() {
		
		System.out.println("조별로 먹어요.");
	}
	
	void study() {
		System.out.println("공부를 합니다.");
	}
}
