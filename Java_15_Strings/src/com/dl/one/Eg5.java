package com.dl.one;

public class Eg5 {

	public static void main(String[] args) {
		
		String s1 = "Java is Easy Programming Language";
		
		System.out.println(s1.length()); //33
		
		System.out.println(s1.charAt(3));
	    //System.out.println(s1.charAt(35)); // java.lang.StringIndexOutOfBoundsException
		
		//System.out.println(s1.charAt(-1)); // java.lang.StringIndexOutOfBoundsException
		
        String s2 = "Java Programming and Java Framework and Java Testing";
		System.out.println(s2.length()); //32
		
		System.out.println(s2.indexOf('J'));
		System.out.println(s2.lastIndexOf('J'));
		System.out.println(s2.indexOf("J", 2));
		System.out.println(s2.lastIndexOf("J", 39));
		
		String s3 = "Java";
		System.out.println(s3.contains("J"));
		System.out.println(s3.contains("j"));	
	}
}
