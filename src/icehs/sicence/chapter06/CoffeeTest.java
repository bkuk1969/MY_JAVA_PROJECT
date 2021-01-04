package icehs.sicence.chapter06;

public class CoffeeTest {
	public static void main(String[] args) {
		Coffee ame = new Coffee();
		Coffee latte = new Coffee();
		Coffee maki = new Coffee();
		ame.name ="아메리카노";
		ame.price = 3500;
		ame.printCoffeeInfo();
		
		latte.name = "카페라떼";
		latte.price = 4000;
		latte.printCoffeeInfo();
		
		maki.name = "카라멜 마키아또";
		maki.price = 4500;
		maki.printCoffeeInfo();
		
		int priceSum = ame.getPrice() + latte.getPrice() + maki.getPrice();
		System.out.println("합계 : " + priceSum +"원");
	}
}
