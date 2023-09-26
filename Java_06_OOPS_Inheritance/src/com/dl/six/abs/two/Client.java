package com.dl.six.abs.two;

public abstract class Client {
	
	//instance v
	int a =10;
	int b = 20;
	
	//static
	static int x = 10;
	static int y = 20;
	
	static {
		System.out.println("Static Block");
		System.out.println(x);
		System.out.println(y);	
	}
	{
		System.out.println("Instance Block");
		System.out.println(a);
		System.out.println(b);
	}
	//constructor
	public Client() {
		System.out.println("Default Cons Client");
	}
	
	public static void main(String[] args) {
		
		//new Eg1();
	}
}
