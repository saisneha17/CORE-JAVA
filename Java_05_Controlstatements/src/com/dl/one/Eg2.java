package com.dl.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Eg2 {
	
	public static void main(String[] args) throws IOException {
		
//		int age = 18;
//		
//		if(age >= 18) {
//			System.out.println("You can vote");
//		}else {
//			System.out.println("You cannot vote");
//		}
		
/*-------------------------------------------------------------------------------------------------------------*/		
		//Scanner is a class, we create scanner object using new keyword
		//Scanner takes a single argument as System.in
/*-----------------------------------------------------------------------------------------------------------*/	
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the user age: ");
//		int age = scanner.nextInt();
//		if(age >= 18) {
//			System.out.println("You can vote");
//		}else {
//			System.out.println("You cannot vote");
//		}
//		scanner.close();
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the age:");
			String readLine = bufferedReader.readLine();
			int age = Integer.parseInt(readLine);
			if(age >= 18) {
				System.out.println("You can vote");
			}else {
				System.out.println("You cannot vote");
			}
			bufferedReader.close();
		}
	}
