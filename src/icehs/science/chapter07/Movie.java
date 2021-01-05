package icehs.science.chapter07;

public class Movie {
	String title;
	String genre;
	String director;
	
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
