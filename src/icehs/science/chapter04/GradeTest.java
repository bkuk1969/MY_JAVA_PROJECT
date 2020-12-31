package icehs.science.chapter04;

public class GradeTest {
	public static void main(String[] args) {
		int score = 75;
		boolean aScore = score >= 90 && score <= 100;
		boolean bScore = score >= 80 && score < 90;
		boolean cScore = score >= 70 && score < 80;
		boolean dScore = score >= 60 && score < 70;
		
		System.out.println("A학점 : " + aScore);
		System.out.println("B학점 : " + bScore);
		System.out.println("C학점 : " + cScore);
		System.out.println("D학점 : " + dScore);
	}
}
