package icehs.sicence.chapter06;

public class BuildingTest {
	public static void main(String[] args) {
		Building building = new Building();//��ü �����ϱ�
		
		//��ü�� ��� ������ �� �ο�
		building.name ="������Ÿ��";
		building.address ="������";
		building.totalFloor = 5;
		
		System.out.println("�ǹ��� : " + building.name);
		System.out.println("�ּ� : " + building.address);
		System.out.println("��ü �� �� : " + building.totalFloor);
		
		//��ü�� ��� �޼��带 ȣ��
		building.moveElevator();
		building.changeAddress("�����");
		
		System.out.println("�� �ּ� : " + building.address);

	}
}