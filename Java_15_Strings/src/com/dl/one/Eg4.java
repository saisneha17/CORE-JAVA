package com.dl.one;

public class Eg4 {

	public static void main(String[] args) {
		
		String s1 = "java";
		String s2 = "Java";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String s3 = "A";
		String s4 = "B";
		String s5 = "C";
		String s6 = "A";
		String s7 = "a";
		System.out.println(s3.compareTo(s6));
		System.out.println(s4.compareTo(s5));
		System.out.println(s5.compareTo(s4));
		
		System.out.println(s6.compareTo(s7));
		System.out.println(s6.compareToIgnoreCase(s7));
	}

}
