package com.dl.one;

import java.util.Scanner;

public class Eg4 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your salary: ");
		int userSalary = scanner.nextInt();
		switch (userSalary) {
		case 10000:
			System.out.println("User Salary is " + userSalary);	
			break;
			
		case 20000:
			System.out.println("User Salary is " + userSalary);	
			break;
			
		case 30000:
			System.out.println("User Salary is " + userSalary);	
			break;
			
		case 40000:
			System.out.println("User Salary is " + userSalary);	
			break;
		default: 
			System.out.println("User Salary is not validated ");	
			break;
		}
		scanner.close();
    }
}