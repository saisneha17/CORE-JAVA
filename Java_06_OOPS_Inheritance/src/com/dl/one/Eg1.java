package com.dl.one;

class Parent{
	
	void m1() {
		System.out.println("M1 Method");
	}
}
class Child extends Parent{
	
	void m2() {
		System.out.println("M2 Method");
	}
}
//Single Level
public class Eg1 {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.m2();
		child.m1();

	}

}
