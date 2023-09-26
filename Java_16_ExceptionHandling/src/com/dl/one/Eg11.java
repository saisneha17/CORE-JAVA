package com.dl.one;

public class Eg11 {

	public static void main(String[] args) {
		
		try {
			System.out.println("Try Block 01");
		}catch (Exception e) {
			System.out.println("Catch Block 01");
	}
		try {
			System.out.println("Try Block 02");
		}finally {
			System.exit(0);
			System.out.println("Final Block 02");
			
		}
        try {
        	System.out.println("Try Block 03");
        }catch (Exception e) {
        	
        }finally {
        	System.exit(0);
			System.out.println("Final Block 03");
        }
}
}
