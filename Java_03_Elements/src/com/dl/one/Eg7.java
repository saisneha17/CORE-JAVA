package com.dl.one;

public class Eg7 {

	public static void main(String[] args) {
		Eg7 c1 = new Eg7();
		c1.getCustomerDetails("NameThree",9014979933L,"nameone@gmail.com","Hyd",2345975980921L);
		getCustomerBankDetails("ICICI", "ICI0202", "Hyd");
		
		System.out.println();
		
		Eg7 c2 = new Eg7();
		c2.getCustomerDetails("NameTwo",9014979933L,"nametwo@gmail.com","Hyd",2345922980921L);
		getCustomerBankDetails("ICICI", "ICI0202", "Hyd");
		
		System.out.println();
		
		Eg7 c3 = new Eg7();
		c3.getCustomerDetails("NameThree",9014979933L,"namethree@gmail.com","Hyd",2345922980921L);
		getCustomerBankDetails("ICICI", "ICI0202", "Hyd");	
	}
	
	public void getCustomerDetails(String userName, long contactNo, String email, String address,long accountNo) {
		System.out.println(userName);
		System.out.println(contactNo);
		System.out.println(email);
		System.out.println(address);
	}
	public static void getCustomerBankDetails(String bankName, String ifsc, String branch) {
		System.out.println(bankName);
		System.out.println(ifsc);
		System.out.println(branch);
		
	}

}
