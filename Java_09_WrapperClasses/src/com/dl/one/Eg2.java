package com.dl.one;

public class Eg2 {

	public static void main(String[] args) {
		
		// String type to Object Type
		
		//Cons
		String s1 = "10";
		Integer i = new Integer(s1);
		System.out.println(i);
		
		//valueOf()
		Integer valueOf = Integer.valueOf(s1);
		System.out.println(valueOf);
		
		System.out.println(i + valueOf);
		
		//object to String
		//Cons
		String s2 = "10";
		Integer ii = new Integer(s2);
		String string = ii.toString();
		System.out.println(string);
		
		String s3 = "" + ii; //ii.toString();
		System.out.println(s3);
		
		System.out.println(string + s3);	
	}
}
