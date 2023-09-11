package com.dl.one;

public class Eg7 {

	public static void main(String[] args) {
		// While Loop
		//if we don't know the number of iterations in advance
//		while (true) {
//			System.out.println("Infinity Loop");
//		}
		
//		while (false) {
//		System.out.println("Infinity Loop");
//	}
		
		//System.out.println("Hello World")
		
		int a = 1;
		while (a <= 5) {
		System.out.println("While Loop: " + a);
		a++;
		}
		
		System.out.println(" ");
		
		int b = 5;
		while (b >= 1) {
		System.out.println("While Loop: " + b);
		b--;
		}
		
		//complete the different implementations using while loop
		Integer i = null;
		Integer j = null;
		while (i <= j) {
			System.out.println(i + " " + j);
		}
		
	}

}
