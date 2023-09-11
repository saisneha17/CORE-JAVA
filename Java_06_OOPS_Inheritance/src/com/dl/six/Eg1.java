package com.dl.six;

abstract class A {
	
	public abstract void m1();
	
	public void m2() {
		System.out.println("M2 Method");
	}
}

class B extends A{
	
	@Override
	public void m1() {
	  System.out.println("M1 Method");
	  
	}
}
public class Eg1 {
	
	public static void main(String[] args) {
	 //Inheritance
	B b = new B();
	b.m1();
	
	//Polymorphism
	A a = new B();
	a.m1();

	}
}