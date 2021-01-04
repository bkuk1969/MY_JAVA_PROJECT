package icehs.sicence.chapter06;

public class Chocolate {
	String name;
	String type;
	int price;
	
	String getName() {
		return name;
	}
	
	int calculateTotalPrice(int count) {
		return count * price;
	}
	
	void changeChocolateInfo(String newName, int newPrice) {
		name = newName;
		price = newPrice;
		printChocolateInfo();
	}
	
	void printChocolateInfo() {
		System.out.println("이름 : " + name +", 종류 : " + type +", 가격 : " + price);
	}
}
