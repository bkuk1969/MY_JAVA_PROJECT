package icehs.science.chapter09;

public class DoctorTest {
	public static void main(String[] args) {
		Dentist den = new Dentist("È«±æµ¿");
		System.out.println(den.getDepartment() +" : " + den.getName() +"¼±»ý´Ô");
		den.treatPatient();
		den.pullOutTooth();
	}
}
