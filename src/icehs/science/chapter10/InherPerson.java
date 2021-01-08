package icehs.science.chapter10;

public class InherPerson {
	public static void main(String[] args) {
		Person[] persons = {new Person(),new Student(),new Teacher()};
		
		for(int i = 0; i< persons.length; i++) {
			persons[i].eat();
			persons[i].sleep();
		}
		

		//p2.study();
	
		//p3.teach();
	}
}
