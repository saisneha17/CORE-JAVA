package com.dl.one;

import java.util.Arrays;

public class Eg1 {

	public static void main(String[] args) {
		
		// Arrays are fixed in Size
		//Array have homogeneous data
		//If we add over the size we get an ArrayIndexOutOfBonException
		
		//Create a Array and Initialise it
		int a[] = {10, 20, 30, 40, 50};
		//          0   1   2   3   4
		System.out.println(a);  //[I@27f674d
		
		//Arrays Method
		System.out.println(Arrays.toString(a));
		
		
		//index
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		//System.out.println(a[5]); // java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println(a.length);
	}

}
