package com.polymorphism;

public abstract class Animal2 {
	
	// there are body(implementation) in a method also has abstract method 
    // there are no constructor 
    // must be abstract class for use abstract method
    // without body a method that calls abstract method
	
	public abstract void livingPlace();
	
	public void smell() {
		
		System.out.println("Animals can smell");
	}
	
	

}
