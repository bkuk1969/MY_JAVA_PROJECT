package icehs.science.chapter07;

import icehs.sicence.chapter06.Account;

public class Book {
	Account acc = new Account();
	private String title;
	private int price;
	private String author;
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Book() {	
	}
	
	public Book(String title) {
		this.title = title;
	}
	
	public Book(String title, int price) {
		this(title);
		this.price = price;
	}
	
	public Book(String title, String author, int price) {
		this(title, price);
		this.author = author;
		
	}
	
	void printBookInfo() {
		System.out.println(this.title);
		System.out.println(this.price);
	}
}
