package icehs.sicence.chapter06;

public class Car {
	String name ="[ICE 카~]";
	int oilAmount;		//남은 기름의 양
	double distance;  	//총주행거리
	
	void addOil(int oil) {
		oilAmount += oil;
		System.out.println("휘발유 " + oil +"L 주유합니다");
	}
	
	void printCarInfo() {
		System.out.println(name + " 남은 기름양 : " + oilAmount 
				+ "L, 총 주행거리 : " + distance +"km");
	}
	
	void driveCar(String start, String end, double driveDistance) {
		System.out.println(start +"에서 " + end +"까지 " 
	            + driveDistance +"km 주행하였습니다.");
		distance += driveDistance;
		int driveOil = (int)driveDistance / 20;
		oilAmount -= driveOil;
	}
	
	void calcEnableDistance() {
		double enableDistance = oilAmount * 20;
		System.out.println("주행 가능한 거리는 약 " + enableDistance +"km 입니다.");
	}
}
