package icehs.science.chapter07;

public class ComputerTest {
	public static void main(String[] args) {
		Computer r500 = new Computer("R500", "Win 7", 100);
		r500.printComputerInfo();
		
		Computer r570 = new Computer("R570", "Win 10", 200, 30);
		r570.printComputerInfo();
		
		Movie m1 = new Movie();
		m1.setTitle("π„ø° ∏‘¿∫ µ˛±‚∞° ∏¿¿÷¥Ÿ.");
		//m1.title="π„ø° ∏‘¿∫ µ˛±‚∞° ∏¿¿÷¥Ÿ.";
		
	}
}
