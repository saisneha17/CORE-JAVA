package com.dl.two;

public class UserProfile {
	
	//instance methods
	public void add() {
		//this.update();
		update();
		System.out.println("add method");
		//this.delete();
		delete();
	}
	
	public void update() {
	System.out.println("update method");
	}
	
	public void delete() {
		System.out.println("delete method");
		}
	

	public static void main(String[] args) {
		UserProfile profile = new UserProfile();
		profile.add();

	}

}
