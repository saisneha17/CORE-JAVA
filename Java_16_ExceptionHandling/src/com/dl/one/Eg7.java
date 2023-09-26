package com.dl.one;

public class Eg7 {

	public static void main(String[] args) {
		
		try {
			//logic
			int a = 10;
			int b = 2;
			System.out.println(a/b);
			
			String s1 = "Java";
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

	} catch (ArithmeticException e) {
		System.out.println("AE: "+e);
	} catch (NullPointerException e) {
		System.out.println("NE: "+ e);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("AIOE:" + e);
	}catch (NumberFormatException e) {
		System.out.print("NFE:" + e);
	} catch (StringIndexOutOfBoundsException e) {
		System.out.println("SB:" + e);
	}
		System.out.println("After");
	}
}
