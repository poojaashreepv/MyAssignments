package org.student;

import org.department.Department;

public class Student extends Department {
	//Assignment 2
	public void studentName() {
		System.out.println("Student name is Poojaa");
	}
	public void studentDept() {
		System.out.println("Student Ddepartment is CSE");
	}
	public void studentId() {
		System.out.println("Student Id is 1234");
	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		
	}

}
