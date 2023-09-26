package com.dl.one;

public class Eg1 {
	
	int i = 1000;
	
	public void m1() {
		int a = 10;
		System.out.println(a);
		int b = 20;
		System.out.println(b);
		a = 30;
		System.out.println(a);
		b = 40;
		System.out.println(b);	
	}
	public static void main(String[] args) {
		
		new Eg1().m1();
	}
	}
