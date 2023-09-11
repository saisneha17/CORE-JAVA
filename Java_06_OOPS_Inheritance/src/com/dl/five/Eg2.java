package com.dl.five;

class A{
	
	void m1() {
		System.out.println("M1 Method A");
	}
}

class B extends A{
	
	void m1() {
		System.out.println("M1 Method B");
	}
}
//Method Overriding
public class Eg2 {
	
	public static void main(String[] args) {
		
		//Inheritance
		B b = new B();
		b.m1();
		
		//Polymorphism
		A aa = new B();
		aa.m1();
		
	}

}
