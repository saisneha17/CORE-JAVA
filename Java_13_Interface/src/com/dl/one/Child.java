package com.dl.one;

public class Child implements Parent {

	@Override
	public void m1() {
		System.out.println("M1 Method");
	}

	@Override
	public void m2() {
		System.out.println("M2 Method");
	}
	
	public void m3() {
		System.out.println("M3 Method");
	}
	
	public static void main(String[] Args) {
		
		//Inheritance
		Child child = new Child();
		child.m1();
		child.m2();
		child.m3();
		
		//polymorphism
		Parent parent = new Child();
		parent.m1();
		parent.m2();
	}

}
