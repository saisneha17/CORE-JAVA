package com.dl.eight;

public class Student {
	
	public String studentName;
	public String studentEmail;
	public College college; //data member (has a relationship)
	
	public Student() {
		
	}
	public Student(String studentName, String studentEmail, College college) {
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.college = college;
		
	}
	public void display() {
		System.out.println(studentName);
		System.out.println(studentEmail);
		System.out.println(college.collegeName);
		System.out.println(college.collegeAddress);
		
	}

	public static void main(String[] args) {
		
		College c1 = new College("JNTU","Hyd");
		Student student = new Student("Sai chandra", "saichandra@gmail.com", c1);
		student.display();

	}

}
