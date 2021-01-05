package icehs.science.chapter07;

public class TelevsionTest {

	public static void main(String[] args) {
		Television infinia = new Television("INFINIA", 1500000);
		infinia.printTelevisionInfo();
		
		Television xcanvas = new Television("XCANVAS", 200000,"LCD TV");
		xcanvas.printTelevisionInfo();
		
		Television cinema = new Television("CINEMA", 2000000, "3D TV");
		cinema.printTelevisionInfo();

	}

}
