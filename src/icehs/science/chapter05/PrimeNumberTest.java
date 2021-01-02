package icehs.science.chapter05;

public class PrimeNumberTest {
	public static void main(String[] args) {
		int firstNum = 23;
		int secondNum = 26;
		
		for(int i = 2; i <= firstNum; i++) {
			if(i != firstNum && firstNum % i == 0) {
				System.out.println(firstNum +"은 소수가 아닙니다.");
				break;
			}else if(i == firstNum) {
				System.out.println(firstNum+"은 소수입니다.");
			}
		}
		for(int i = 2; i <= secondNum; i++) {
			if(i != secondNum && secondNum % i == 0) {
				System.out.println(secondNum + "은 소수가 아닙니다.");
				break;
			}else if(i == secondNum) {
				System.out.println(secondNum + "은 소수입니다.");
			}
		}
	}//2부터 10000까지 수중에서 가장 큰 소수를 구하시오.
}
