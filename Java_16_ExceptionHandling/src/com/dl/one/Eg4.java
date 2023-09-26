package com.dl.one;

public class Eg4 {

	public static void main(String[] args) {
		
		try {
			String s1 = "Ten";
			int parseInt = Integer.parseInt(s1);
			System.out.println(parseInt);
		}catch (NumberFormatException e) {
			System.out.print(e);
		}
		System.out.print("After");    
	}

}
