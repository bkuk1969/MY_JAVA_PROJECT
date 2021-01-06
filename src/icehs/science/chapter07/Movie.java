package icehs.science.chapter07;

public class Movie {
	private String title;
	private String genre;
	String director;
	
	void setTitle(String title) {
		this.title = title;
	}
	
	public Movie() {
		
	}
	
	public Movie(String title, String director) {
		this.title = title;
		this.director = director;
	}
	
	public Movie(String title, String director, String genre) {
		this(title, director);
		this.genre = genre;
	}
}
