package com.dl.one;

import java.util.Scanner;

public class Eg3 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your salary: ");
		float userSalary = scanner.nextFloat();
		if(userSalary == 10000) {
			System.out.println("User Salary is " + userSalary);	
		}else if(userSalary == 20000) {
			System.out.println("User Salary is " + userSalary);
		}else if(userSalary == 30000) {
			System.out.println("User Salary is " + userSalary);
		}else if(userSalary == 40000) {
			System.out.println("User Salary is " + userSalary);
		}else {
			System.out.println("User Salary is not matched");
		}
	}
}
	