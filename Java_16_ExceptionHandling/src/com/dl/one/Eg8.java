package com.dl.one;

public class Eg8 {

	public static void main(String[] args) {
		
		try {
			//logic
			int a = 10;
			int b = 2;
			System.out.println(a/b);
			
			String s1 = "10";
			System.out.println(s1.length());
			
            int aa[] = {10, 20, 30, 40, 50};
			
			System.out.println(aa[0]);
			System.out.println(aa[4]);
			
			String s11 = "10";
			int parseInt = Integer.parseInt(s11);
			System.out.println(parseInt);
			
			String s111 = "Java is Easy Programming";
			System.out.println(s111.length());
			System.out.println(s111.charAt(20));
			System.out.println(s111.charAt(23));

	} catch (Exception e) {
		System.out.println("Exception is: "+e);
	}
		System.out.println("After");
	}


	}


