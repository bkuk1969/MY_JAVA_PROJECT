package icehs.science.chapter07;

public class Publication {
	private String title;
	private int price;
	private int page;
	static int numberOfObjects = 0;
	
	
	public Publication() {
		this.numberOfObjects++;
	}
	
	public Publication(String title, int price, int page) {
		this.numberOfObjects++;
		this.title = title;
		this.price = price;
		this.page = page;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price < 0) {
			System.out.println("[에러] 가격 정보는 음수를 입력할 수 없습니다!!");
		}else {
			this.price = price;
		}
		
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		if( page < 0) {
			System.out.println("[에러] 페이지 정보는 음수를 입력할 수 없습니다!!");
		} else {
			this.page = page;
		}
		
	}
	
	
}
