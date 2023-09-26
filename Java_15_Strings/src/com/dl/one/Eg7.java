package com.dl.one;

public class Eg7 {

	public static void main(String[] args) {
		
		// length() and length keyword
		String s1 = "java";
		System.out.println(s1.length());
		
		char ch[] = {'j','a','v','a'};
		System.out.println(ch.length);
		
		//replace
		String s2 = "The best programming is Java or Python";
		System.out.println(s2.replace("Java","JavaScript"));
		System.out.println(s2);
		
		String s3 = "Java Progress Python Progress JavaScript Progress";
		System.out.println(s3.replaceAll("Pro","pro"));
		
		String s4 = "Python";
		System.out.println(s4.replaceFirst("P","p"));
		
	}
}
