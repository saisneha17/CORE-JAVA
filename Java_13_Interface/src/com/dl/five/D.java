package com.dl.five;

public class D implements C {

	@Override
	public void m1() {
		System.out.println("M1 Method");

	}
	
	public static void main(String[] args) {
		
		new D().m1();
	}

}
