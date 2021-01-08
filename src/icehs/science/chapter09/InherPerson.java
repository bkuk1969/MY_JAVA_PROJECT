package icehs.science.chapter09;

public class InherPerson {
	public static void main(String[] args) {
		Person p1 = new Person();
		Student st1 = new Student();
		Teacher te1 = new Teacher();
		
		p1.eat();
		p1.sleep();
		
		st1.eat();
		st1.sleep();
		st1.study();
		
		te1.eat();
		te1.sleep();
		te1.teach();
	}
}
