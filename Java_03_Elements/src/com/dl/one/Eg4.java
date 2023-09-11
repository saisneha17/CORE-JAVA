package com.dl.one;

public class Eg4 {
	//instance block
	{	
		int a = 10;
		int b = 20;
		System.out.println(a);
		System.out.println(b);
		System.out.println("Instance Block");
	}
	
	//static block
	static {
		int a = 10;
		int b = 20;
		System.out.println(a);
		System.out.println(b);
		System.out.println("Static Block"); 
		// as it is static we can run the program directly as the main method is static
		//at the time of class loading only it will load
	}
	public static void main(String[] args) {
		
		new Eg4(); //for instance class we need to create an object
		//instance block is loaded at the time of object creation
		//we will get access when we create an instance here new Eg4(); is nothing but an instance/object
		
	}

}
