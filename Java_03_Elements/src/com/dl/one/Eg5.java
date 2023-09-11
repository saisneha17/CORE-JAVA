package com.dl.one;

public class Eg5 {
	
	public Eg5(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		//user defined
		new Eg5(10);
		
		//build in
		new Byte((byte) 10);
		new Short((short) 10);
		new Integer(10);
		new Long(10);
		//these are all buildin constructors
	}

}

//build in constructors(all wrapper clases,string classes)
