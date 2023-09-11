package com.dl.five;

//Method Overloading
public class Eg1 {
	public void m1(int a, int b) {
		System.out.println("a " + "b ");
	}
	public void m1(long a, int b) {
		System.out.println("a " + "b ");
	}
	public void m1(float a, int b) {
		System.out.println("a " + "b ");
	}
	public static void main(String[] args) {
		new Eg1().m1(10f, 10);
	}
	
}
