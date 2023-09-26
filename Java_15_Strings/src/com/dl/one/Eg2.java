package com.dl.one;

public class Eg2 {

	public static void main(String[] args) {
		
		// SCP Area (String Constact Pool Area) It is present in Heap Area
		String s1 = "Java"; // 1 object
		String s2 = "Python"; // 1 object
		String s3 = "Java"; // 1 object
		
		//SCP Area (Java)s1, s3, s4 (Python)s2
		
		//Content Comparision
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equals(s3)); // true
		
		String s4 =  new String("Java"); //2 Objects, 1 in Heap Area, 1 in Pool Area
		
		System.out.println(s4.equals(s1));
		
		//HeapArea (Java)S4
		
		//ref
		System.out.println(s1 == s2); // false
		System.out.println(s1 == s2); // True
		
		String s5 = new String("Java");
		System.out.println(s4 == s5); // false	

	}
}
