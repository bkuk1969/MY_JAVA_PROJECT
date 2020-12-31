package icehs.science.chapter05;

public class ConditionIfIfElseIfEx {
	public static void main(String[] args) {
		int age = 5;
		
		if (age >=19) {
			System.out.println("성인입니다.");
			System.out.println("입장하세요.");
		}else if(age >= 13) {
			System.out.println("청소년입니다.");
			System.out.println("조금만 기다리세요.");
			
		}else {
			System.out.println("어린이 입니다.");
			System.out.println("집으로 가세요.");
		}
	}
}
