package com.dl.two;

class A{
	
	public void m1() {
		System.out.println("M1 Method A");
	}
}

class B extends A{
	
	public void m1() {
		System.out.println("M1 Method B");
	}
}

public class Test {

	public static void main(String[] args) {
		
		A a = new A();
		a.m1();
		
		//A aa = new B();
		B bb = new B();
		A aa = bb;
		aa.m1();
	}
}
