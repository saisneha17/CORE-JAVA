package com.dl.five;

//Constructor Overloading

public class Eg3 {
	
	public Eg3() {
		System.out.println("Default Cons");
	}
	public Eg3(int a) {
		System.out.println(a);
	}
	public Eg3(int b, int c) {
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		new Eg3();
		new Eg3(10);
		new Eg3(100, 200);
	}
}
