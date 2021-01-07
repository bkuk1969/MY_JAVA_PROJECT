package icehs.science.chapter08;

public class ScoreArrayTest {
	public static void main(String[] args) {
		int[] scores = {93,87,90};
		String[] subjects = {"국어","영어","수학"};
		//String[] subjects = new String[3];
	
		for(int i = 0; i < scores.length; i++) {
			System.out.println(subjects[i] + " : " + scores[i]);
		}
//		System.out.println(subjects[0] + " : " + scores[0]);
//		System.out.println(subjects[1] + " : " + scores[1]);
//		System.out.println(subjects[2] + " : " + scores[2]);
		
		double average = (double)(scores[0] + scores[1] + scores[2]) / 3;
		System.out.println("평균 : " + average);
	}
}
