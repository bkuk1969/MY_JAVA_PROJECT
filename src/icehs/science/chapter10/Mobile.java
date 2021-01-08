package icehs.science.chapter10;

public class Mobile {
	private String product;
	private int price;
	
	public Mobile(String product) {
		this.product = product;
	}

	public void call(int time) {
		System.out.println(this.product +" : " + time +"분 통화했습니다.");
	}
	
	public void charge(int time) {
		System.out.println(this.product +" : " + time +"분 충전했습니다.");
		
	}
}
