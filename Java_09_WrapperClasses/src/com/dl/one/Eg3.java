package com.dl.one;

public class Eg3 {

	public static void main(String[] args) {
		
		// Primitive to String Type
		//toString
		int i = 10;
		String string = Integer.toString(i);
		System.out.println(string);
		
		//+
		int ii = 10;
		String s2 = ""+ii;
		System.out.println(s2);
		
		System.out.println(string + s2);
		
		//String to Primitive
		String userSalary = "20000";
		float parseFloat = Float.parseFloat(userSalary);
		System.out.println(parseFloat);
	}
}
