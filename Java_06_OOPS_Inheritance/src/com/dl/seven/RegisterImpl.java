package com.dl.seven;

public class RegisterImpl extends Register {
	
	public static void main(String[] args) {
		
		RegisterImpl impl = new RegisterImpl();
		impl.setUserName("Sneha");
		impl.setUserEmail("enugurthisneha103@gmail.com");
		impl.setUserContactNo(9014979933L);
		impl.setUserAddress("Hyd");
		
		System.out.println(impl.getUserName());
		System.out.println(impl.getUserEmail());
		System.out.println(impl.getUserContactNo());
		System.out.println(impl.getUserAddress());
		
	}

}
