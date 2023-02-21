package week3.day1;

public class Students {
	//Day1 Assignment 5
	public void getStudentInfo(int id) {
		System.out.println("Student Id: "+ id);
		
	}
	
	public void getStudentInfo(int id,String name) {
		System.out.println("Student Id: "+ id);
		System.out.println("Student Name: "+ name);
		
	}
	
	public void getStudentInfo(String email,long phone) {
		System.out.println("Student Email: "+ email);
		System.out.println("Student Phone Number : "+ phone);
	}

	public static void main(String[] args) {
		Students obj=new Students();
		obj.getStudentInfo(121);
		obj.getStudentInfo(123, "Poojaashree");
		obj.getStudentInfo("poojaashreepv@gmail.com", 1234567890l);
	}

}
