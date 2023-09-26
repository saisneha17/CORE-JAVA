package com.dl.five;

class B{
	
	A a; //Data Member
	
	//Cons using fields
	public B(A a) {
		this.a = a;
	}
	
	public void idNumber() {
		System.out.println(a.id);
	}
}

public class A {
	
	int id = 10;
	
	public A() {
		new B(this).idNumber();
	}

	public static void main(String[] args) {
		
		new A();
		new A();
		new A();

	}

}
