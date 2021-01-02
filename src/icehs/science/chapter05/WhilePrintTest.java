package icehs.science.chapter05;

public class WhilePrintTest {
	public static void main(String[] args) {
		int number = 1;
		while(number <= 10) {
			System.out.println(number++ +". while실습입니다.");
			
			//number++; //number += 1;
		}
		for(int i = 1; i<= 10; i++) {
			System.out.println(i + ".while실습입니다.");
		}
	}
}
