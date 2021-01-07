package icehs.science.chapter08;

public class Student {
	private String name;
	private String id;
	private String phone;
	
	public Student(String name, String id, String phone) {
		super();
		this.name = name;
		this.id = id;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void printStudentInfo() {
		System.out.println(this.name + "(" + this.id + ") / 전화번호 : " 
	    + this.phone);
	}
	
}
