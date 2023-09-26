package com.dl.one;

public class Eg9 {

	public static void main(String[] args) {
		
		// String to Array of Elements
		String s1 = new String("Java Python JavaScript");
		String[] split = s1.split(" ");
		for (String string : split) {
			System.out.println(string);
		}
		
		//Array of Elements to String
		String join = String.join(" ", "Java", "Python", "JavaScript");
		System.out.println(join);
	}
}
