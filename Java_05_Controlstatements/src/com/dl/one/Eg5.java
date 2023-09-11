package com.dl.one;
import java.util.Scanner;
public class Eg5 {
	
	static Scanner scanner = null;

	public static void main(String[] args) {
		
//Iteration statements(for,while,do-while,for-each)
//for loop : if we know the number of iterations in advance
//int i = 1 initialization; condition; increment/decrement		
		
	for(int i = 1; i <= 10; i++) {
		System.out.println("for loop: " + i);	
		}
	System.out.println();
	
	for(int i = 10; i >= 1; i--) {
		System.out.println("for loop: " + i);
	}
	scanner = new Scanner(System.in);
	System.out.println("Enter any number: ");
	int a = scanner.nextInt(); //int a = 5;
	for(System.out.println(a);a <= 10; a++) {
		System.out.println("For Loop: " + a);
	}
	scanner.close();
	
    //Buffer Reader	
	}

}
