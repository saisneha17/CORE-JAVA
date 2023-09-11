package com.dl.two;
class GrandParent{
	void m1() {
		System.out.println("M1 Method");
	}
}
class Parent extends GrandParent{
	void m2() {
		System.out.println("M2 Method");
	}
}
class Child extends Parent{
	void m3() {
		System.out.println("M2 Method");
	}
}
//multilevel
public class Eg1 {
	public static void main(String[] args) {
		Child child = new Child();
		child.m1();
		child.m2();
		child.m3();
	}
	

}
