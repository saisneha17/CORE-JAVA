package com.dl.methods;

public class Child extends Parent {
	
	public void m1() {
		System.out.println("M1 Method Child");
	}
	
	public void m2() {
		this.m1();
		super.m1();
	}
	
	public static void main(String[] args) {
		
		new Child().m2();
	}

}
