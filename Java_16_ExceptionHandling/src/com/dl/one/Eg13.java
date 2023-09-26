package com.dl.one;

public class Eg13 {
	
	//chaining
	public void m1() {
		m2();
		System.out.println("m1 Method");
	}
	
	public void m2() {
		m3();
	    System.out.println("m2 Method");	    
	}
	
	public void m3() {
		 try {
				
				throw new NullPointerException();
				
			}catch (RuntimeException e) {
				
				throw new RuntimeException();
			}
	}

	public static void main(String[] args) {
		
	    new Eg13().m1();
	}

}
