package com.dl.one;

//Down Casting
public class B extends A{
	
	public void m2() {
		System.out.println("M2 Method");
	}

	public static void main(String[] args) {
		
		//A a = new A();
		//B b = a; // - Type mismatch cannot convert from A to B
		
    	//A a = new A();
		//B b = (B)a;
		//b.m1();  //java.lang.ClassCastException
		
		A a = new B();
		B b = (B)a;
		b.m1();
		b.m2();

	}

}
