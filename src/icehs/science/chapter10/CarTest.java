package icehs.science.chapter10;

public class CarTest {
	public static void main(String[] args) {
		Car[] cars = {new Taxi(), new Truck()};
		cars[0].setOilSize(10);
		cars[0].go(20);
		
		cars[1].setOilSize(10);
		cars[1].go(30);
	}
}
