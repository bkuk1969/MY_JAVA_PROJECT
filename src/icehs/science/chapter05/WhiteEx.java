package icehs.science.chapter05;

public class WhiteEx {
	public static void main(String[] args) {
		int sum = 0;
		int index = 1;
		while(sum < 10) {
			sum += index;
			System.out.println(index++ + ":" + sum);
		}
	}
}
