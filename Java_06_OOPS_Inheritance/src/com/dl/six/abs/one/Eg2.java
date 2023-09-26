package com.dl.six.abs.one;

abstract class AA {
	
	public abstract void add(int a, int b);

}
class BB extends AA{
	
	@Override
	public void add(int a, int b) {
		System.out.println(a+b);	
	}
}
public class Eg2 {
	public static void main(String [] args) {
		
		BB bb = new BB();
		bb.add(10, 20);
	}
}