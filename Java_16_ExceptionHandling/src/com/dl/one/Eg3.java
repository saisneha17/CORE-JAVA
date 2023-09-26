package com.dl.one;

public class Eg3 {

	public static void main(String[] args) {
		
		try {
			int a[] = {10, 20, 30, 40, 50};
			
			System.out.println(a[0]);
			System.out.println(a[5]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("After");
		}
	}
