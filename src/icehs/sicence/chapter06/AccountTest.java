package icehs.sicence.chapter06;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.name ="È«±æµ¿";
		acc.accNo = "123-456789";
		acc.balance = 10000;
		
		acc.printAccountInfo();
		acc.deposit(20000);
		System.out.println("ÀÜ¾× : " + acc.balance +"¿ø");
		acc.deposit(-20000);
		acc.withdraw(-20000);
		acc.withdraw(45000);
		System.out.println("ÀÜ¾× : " + acc.balance +"¿ø");		
	}
}
