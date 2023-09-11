package com.dl.casting;

public class Eg3 {

	public static void main(String[] args) {
		
		double d1 = 10;
		long b1 = (byte)(short)(int)(long)(float)(double)d1;
		System.out.println(b1);
		
		int i1 = 20;
		long l1 = i1;
		
		int i2 = 30;
		long l2 = i2;
		
		int i3 = (int)(l1+l2);
		System.out.println(i3);
		
		//integer i1 = 100;
		//long l1 = (Long)l1;
	

	}
}
