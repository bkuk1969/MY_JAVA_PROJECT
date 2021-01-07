package icehs.science.chapter08;

public class Account {
	private String number;
	private int balance;
	private double interestRate;
	public Account(String number, int balance, double interestRate) {
		super();
		this.number = number;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public int calculateInterest() {
		int result = (int)(this.balance * this.interestRate / 100);
		balance += result;
		return result;
	}
	
	public void printAccountInfo() {
		System.out.println("°èÁÂ¹øÈ£ : " + this.number + " / ÀÜ¾× : " 
	    + this.balance + " / ÀÌÀ² : " + this.interestRate);
	}
}
