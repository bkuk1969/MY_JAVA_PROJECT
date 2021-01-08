package icehs.science.chapter09;

public class Doctor {
	private String name;
	private String department;
	
	public Doctor(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void treatPatient() {
		System.out.println("환자를 진료합니다.");
	}
	
}
