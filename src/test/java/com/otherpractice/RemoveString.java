package com.otherpractice;

public class RemoveString {
	
	public static void main(String[] args) {
		
		String s = new String("RABO BANK");
		
		String obj = new StringBuffer(s).reverse().toString();
		
		System.out.println(obj);
		
	}


	
	
}
