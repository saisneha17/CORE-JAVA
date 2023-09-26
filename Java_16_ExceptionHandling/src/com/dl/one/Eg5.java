package com.dl.one;

class JDBC{
	
	static {
		System.out.println("Driver Loaded");
	}
}

public class Eg5 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.dl.ones.JDBC");
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
