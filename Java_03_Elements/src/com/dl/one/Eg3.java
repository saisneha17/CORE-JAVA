package com.dl.one;

public class Eg3 {

	public static void main(String[] args) {
	  
		//local variable -local variables are declared inside the method
		//where as static and instance variables are declared inside the class and outside the method
		//to call instance variables we need instance, to call static variables we need class...
		//whereas to call local variables we can call directly if we are writing in the main method....
			
		//local variable
		int a = 10;
		int b = 20;
		System.out.println(a);
		System.out.println(b);
		
//new Eg3().m1();
//m2();
		//we can also store in another way
		
		Eg3 eg3 = new Eg3();
		eg3.m1();
//		m2(); or
		Eg3.m2();	
	}
	
	//instance method //non static method
	public void m1() {
		
		//local variables
		int i = 100;
		int j = 200;
		System.out.println(i);
		System.out.println(j);
	}
	
	//static method
	public static void m2() {
		
		//local variables
		int aa = 1000;
		int bb = 2000;
		System.out.println(aa);
		System.out.println(bb);
		
		//now to call the methods we have to go inside the main method then we have to call them
	
	}

}
