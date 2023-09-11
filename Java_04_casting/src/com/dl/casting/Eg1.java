package com.dl.casting;

public class Eg1 {

	public static void main(String[] args) {
		//structure should be maintained
		
		//implicit
		byte b1 = 10;
		System.out.println(b1);
		
		short s1 =  b1;
		System.out.println(s1);
		
		int i1 = s1;
		System.out.println(i1);
		
		long l1 = i1;
		System.out.println(l1);
		
		float f1 = l1;
		System.out.println(f1);
		
		double d1 = f1;
		System.out.println(d1);
		
		char ch1 = 'A';
		System.out.println(ch1);
		int i2 = ch1;
		long l2 = ch1;
//		byte  b2 = ch1;
//		short s2 = ch1;
		System.out.println(ch1);
		System.out.println(i2);
		System.out.println(l2);
		

	}

}