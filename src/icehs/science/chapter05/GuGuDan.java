package icehs.science.chapter05;

public class GuGuDan {
	public static void main(String[] args) {
		for(int dan = 2; dan <= 9; dan++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(dan + " * " + j + " = " + (dan * j) + "\t");
			}
			System.out.println();
		}
	}
}
