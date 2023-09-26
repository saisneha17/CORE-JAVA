package com.dl.casestudy;

public class UserDetails {
	
	//Properties
	int userDetailsId;
	UserProfile[] profile; // Data Member / Has A Relationship
	
	//cons using fields
	public UserDetails(int userDetailsId, UserProfile[] profile) {
		this.userDetailsId = userDetailsId;
		this.profile = profile;
	}
	
	public void display() {
		
		System.out.println("User Details Id is: " + userDetailsId);
		
		//For Each (objects)
		for (UserProfile userProfile : profile) {
			System.out.println("User Profile Id is: " + userProfile.userId);
			System.out.println("User Name is: " + userProfile.userName);
			System.out.println("User Profile: " + userProfile.contactNo);
			System.out.println("User City: " + userProfile.city);
			
		}
	}

}
