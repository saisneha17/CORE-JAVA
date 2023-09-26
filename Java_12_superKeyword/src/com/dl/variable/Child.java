package com.dl.variable;

public class Child extends Parent {
	
	int a = 100;
	int b = 200;
	
	public void m2() {
		int a = 1000;
		int b = 2000;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(this.a);
		System.out.println(this.b);
		
		System.out.println(super.a);
		System.out.println(super.b);
	}
	public static void main(String[] args) {
		
		Child child = new Child();
		child.m2();
	}

}
