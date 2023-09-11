package com.dl.one;

public class Eg6 {

	public static void main(String[] args) {
		
		Eg6 eg6 = new Eg6();
		eg6.m1(10, 20);      //instance
		 
		m2(10, 20); //static
		
		System.out.println(eg6.getDetails("Sneha","Admin"));
		System.out.println(eg6.add(10, 20));
	}
	public void m1(int a, int b) {
		System.out.println(a);
		System.out.println(b);
		
	}
	public static void m2(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	public String getDetails(String username, String password){
		return username + " and " + password;
	}
	public int add(int a,int b) {
		return a + b;
	}

}
