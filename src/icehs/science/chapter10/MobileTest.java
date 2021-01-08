package icehs.science.chapter10;

public class MobileTest {
	public static void main(String[] args) {
		Mobile[] phones = {new Galaxy(), new IPhone()};
		phones[0].call(5);
		phones[0].charge(30);
		phones[1].call(10);
		phones[1].charge(15);
	}
}
