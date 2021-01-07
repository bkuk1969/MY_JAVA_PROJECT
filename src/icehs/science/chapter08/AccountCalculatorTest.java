package icehs.science.chapter08;

public class AccountCalculatorTest {
	public static void main(String[] args) {
		Account[] acc = new Account[5];
		for(int i = 0; i < acc.length ;i++) {
			acc[i] = new Account("1111-2222-5555"+(i+1),(i+1)*10000,4.5);
		}
		
		for(int i = 0; i < acc.length; i++) {
			acc[i].printAccountInfo();
		}
		
		System.out.println("이율을 변경합니다.");
		for(int i = 0; i < acc.length; i++) {
			acc[i].setInterestRate(3.7);
			acc[i].calculateInterest();
		}
		
		for(int i = 0; i < acc.length; i++) {
			acc[i].printAccountInfo();
		}
	}
}
