package com.dl.one;

public class Eg1 {
	
	//Instance variable
	int a = 10;
	int b = 20;

	public static void main(String[] args) {
		
		//eg1 is object reference and it is local variable
		//because we are writing inside the method
		Eg1 eg1 = new Eg1();
		
		//objectRef.instanceVariable
		System.out.println(eg1.a);
		System.out.println(eg1.b);
		
		//we can also write as
		System.out.println(new Eg1().a);
		System.out.println(new Eg1().a);
		
	}

}
