package com.dl.one;

public class Eg12 {

	public static void main(String[] args) throws Exception {
		
		//throw
		new Eg12().login("Admins", "Admin");

	}
    public void login(String userName, String password) throws Exception{
    	if(userName == "Admin" && password == "Admin") {
    		System.out.println("Login Succes");
    	}else {
    		throw new Exception("Login Faild Due to Wrong Credentails");
    	}
    }
}
