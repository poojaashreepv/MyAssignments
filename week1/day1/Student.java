package week1.day1;

public class Student {
	
	public void classReport() {
    //Day1 Assignment 5	
	String studentName="Sri";
	int rollNo=1234;
	String collegeName="ABC College";
	float markScored=551.0f;//(90+94+89+92+95+85)
	float cgpa=9.183f;
	System.out.println("Student Name: " +studentName);
	System.out.println("Roll Number: " +rollNo);
	System.out.println("College Name: " +collegeName);
	System.out.println("Mark Scored: " +markScored);
	System.out.println("CGPA: " +cgpa);
	}

	public static void main(String[] args) {
		Student obj=new Student();
		obj.classReport();
		
		
		
		

	}

}
