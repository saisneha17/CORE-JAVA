package com.dl.one;

public class Eg14 {

	public static void main(String[] args) {
		
		try {
			System.out.println("Try Block");
			return;
		}catch (Exception e) {
			System.out.println("Catch Block");
			return;
		}finally {
			System.out.println("Finally Block");
			return;
		}

	}

}
