package com.dl.one;

public class Eg1 {

	public static void main(String[] args) {
		
		// Exception: Disturbs the normal flow of the program
		//Types of Exceptions:
		//Compile Time Error and Run Time Error
		
		try {
			//logic
			int a = 10;
			int b = 0;
			System.out.println(a/b);
		}catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("After");
	}

}
