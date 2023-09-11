package com.dl.five;

//Method Overloading with args
public class Eg5 {
	
	public void check(int a, int b) {
		System.out.println("Int: " + (a + b));
	}
	
	public void check(float a, float b) {
		System.out.println("Float: " + (a + b));
	}
	
	public void check(String a, String b) {
		System.out.println("String: " + (a + b));
	}
	public static void main(String[] args) {
		
		Eg5 eg5 = new Eg5();
		eg5.check(10, 20);
		eg5.check(10f, 20f);
		eg5.check("10", "20");
		
	}
}
