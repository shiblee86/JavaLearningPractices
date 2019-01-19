package com.bookpractice;

public class NewExample {
	
	public void printThis() {
		
		int x = 10;
		int y = 10;
		int z = x+y;
		
	}
	
	public int letsPrintThis() {
		
		int x = 10;
		int y = 10;
		int z = x+y;
		
		return z;
	}
	
	public static void main(String[] args) {
		
		NewExample obj = new NewExample();
		
		obj.printThis();
		
		NewExample obj2 = new NewExample();
		
		obj2.letsPrintThis();
		
		System.out.println(obj.printThis());
		
		System.out.println(obj2.letsPrintThis());
		
	}

}
