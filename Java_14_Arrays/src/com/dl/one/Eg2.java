package com.dl.one;

import java.util.Arrays;

public class Eg2 {

	public static void main(String[] args) {
		
		//Create an Array and provide size first
		int a[] = new int[5];
		System.out.println(Arrays.toString(a));
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
	}
}
