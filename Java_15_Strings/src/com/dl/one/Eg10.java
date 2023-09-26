package com.dl.one;

public class Eg10 {

	public static void main(String[] args) {
		
		// Diff b.w String StringBuilder StringBuffer
		String s1 = "Java";
		System.out.println(s1);
		
		StringBuffer sb1 = new StringBuffer("Java");
		System.out.println(sb1);
		System.out.println(sb1.append("Python"));
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("Java");
		System.out.println(sb2);
		System.out.println(sb2.append("Python"));
		System.out.println(sb2);
	}

}
