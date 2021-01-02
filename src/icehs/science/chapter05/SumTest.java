package icehs.science.chapter05;

public class SumTest {
	public static void main(String[] args) {
		int sum = 0;//결과값에 0
		int i ;
		for ( i = 0; i <= 100; i++ ) {
			sum += i; //sum = sum + i;
			//System.out.println(sum);
		}
		System.out.println(sum);
		System.out.println(i);
	}
}
