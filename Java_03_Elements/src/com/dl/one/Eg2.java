package com.dl.one;

public class Eg2 {
	
	//static variables
	
	static int a = 10;
	static int b = 20;

	public static void main(String[] args) {

		//Direct access because main method is static
		System.out.println(a);
		System.out.println(b);
		
		//we can also write as ClassName.staticVariables
		System.out.println(Eg2.a);
		System.out.println(Eg2.b);
		
		
	}

}
