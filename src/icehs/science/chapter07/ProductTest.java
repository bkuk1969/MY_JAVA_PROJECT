package icehs.science.chapter07;

public class ProductTest {
	public static void main(String[] args) {
		Product mix =  new Product("Ä¿ÇÇ¹Í½º", 12000, 20);
		mix.printProductInfo();
		
		Product cup = new Product("Á¾ÀÌÄÅ", 3000);
		cup.printProductInfo();
	}
}
