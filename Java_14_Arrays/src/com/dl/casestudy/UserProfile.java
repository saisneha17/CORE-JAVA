package com.dl.casestudy;

public class UserProfile {
	
	// properties
	int userId;
	String userName;
	long contactNo;
	String city;
	
	//1.we need to convert all the properties  as array elements
	//2.UserProfile can be change as Array as property in Next Class
	
	//cons using fields
	public UserProfile(int userId, String userName, long contactNo, String city) {
		this.userId = userId;
		this.userName = userName;
		this.contactNo = contactNo;
		this.city = city;
		

	}

}
