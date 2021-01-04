package icehs.sicence.chapter06;

public class BuildingTest {
	public static void main(String[] args) {
		Building building = new Building();//객체 생성하기
		
		//객체의 멤버 변수에 값 부여
		building.name ="국제선타워";
		building.address ="김포동";
		building.totalFloor = 5;
		
		System.out.println("건물명 : " + building.name);
		System.out.println("주소 : " + building.address);
		System.out.println("전체 층 수 : " + building.totalFloor);
		
		//객체의 멤버 메서드를 호출
		building.moveElevator();
		building.changeAddress("비행로");
		
		System.out.println("새 주소 : " + building.address);

	}
}
