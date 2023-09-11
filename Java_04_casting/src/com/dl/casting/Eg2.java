package com.dl.casting;

public class Eg2 {

	public static void main(String[] args) {
	
		//explicit
		double d1 = 10.0d;
		float f1 = (float)d1;
		System.out.println(f1);
		
		long l1 = (long)f1;
		System.out.println(l1);
		
		int i1 = (int)l1;
		System.out.println(i1);
		
		
		short s1 = (short)i1;
		System.out.println(s1);

		byte b1 = (byte)s1;
		System.out.println(b1);
		
		char ch1 = 'A';
		byte b2 = (byte)ch1;
		short s2 = (byte)ch1;
		System.out.println(b2);
		System.out.println(s2);
		
		int i3 = 128;
		byte b3 = (byte)i3;
		System.out.println(b3);
	}

}