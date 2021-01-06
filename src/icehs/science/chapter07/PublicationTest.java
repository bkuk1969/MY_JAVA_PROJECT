package icehs.science.chapter07;

public class PublicationTest {
	public static void main(String[] args) {
		System.out.println("===== 출판물 정보를 세팅 합니다. =====");
		
		Publication pub1 = new Publication();
		pub1.setPrice(-100);
		pub1.setPage(-100);
		pub1.setPrice(5000);
		pub1.setPage(300);
		pub1.setTitle("만화 삼국지");
		System.out.println("출판물 정보 : " + pub1.getTitle() 
		+ " ( " + pub1.getPrice() + "원, " + pub1.getPage() +" page )" );
	}
}
