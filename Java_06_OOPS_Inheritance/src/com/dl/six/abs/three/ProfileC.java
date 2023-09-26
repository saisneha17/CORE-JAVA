package com.dl.six.abs.three;

public class ProfileC extends ProfileB {

	@Override
	public void put() {
		System.out.println("Put() Method");
		
	}

	@Override
	public void post() {
		System.out.println("Post() Method");
		
	}
	
	public static void main(String[] args) {
		
		//poly
		ProfileA profileA = new ProfileC();
		profileA.add();
		profileA.post();
		profileA.put();
		profileA.delete();
		
		//Inheritance
		ProfileC profileC = new ProfileC();
		profileC.add();
	}
	
}
