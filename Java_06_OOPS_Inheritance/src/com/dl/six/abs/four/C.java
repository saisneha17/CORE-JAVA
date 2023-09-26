package com.dl.six.abs.four;

public class C extends B {

	@Override
	void m3() {
		System.out.println("M3 Method");

	}

	@Override
	void m4() {
		System.out.println("M4 Method");
		
	}
	
	public static void main(String[] args) {
		
		A a = new C();
		a.m1();
		a.m2();
		
		B b = new C();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		
		C c = new C();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
	}

}
