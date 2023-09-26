package com.dl.one;

public class Eg6 {

	public static void main(String[] args) {
		
		try {
			String s1 = "Java is Easy Programming";
			System.out.println(s1.length());
			System.out.println(s1.charAt(20));
			System.out.println(s1.charAt(25));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

}
