package com.dl.one;

public class Eg1 {
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		//primitive to object type
		int i = 10;
		System.out.println(i); //10
		
		//Para Cons
		Integer ii = new Integer(i);
		System.out.println(ii);
		
		//valueOf()
		Integer valueOf = Integer.valueOf(i);
		System.out.println(valueOf);
		
		//autoBoxing
		Integer auto = i; //new Integer(i);
		System.out.println(auto);
		
		//objectType to primitive type (2 ways)
		//Para Cons
		Integer iii = new Integer(100);
		int intValue = iii.intValue();
		System.out.println(intValue);
		
		//autoBoxing
		int i2 = iii;
		System.out.println(i2);
		
		
	}
}
