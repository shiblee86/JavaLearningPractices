package com.controlstatements;

public class ForLoop {
	
	public static void main(String[]args) {
	
		//Lets say we have a sales system. We recorded twenty bookings in a notebook. 
		//Now we want to bring these into our sales software
		//The result will be our booking numbers in the system;
		
		for(int salesid = 20171101; salesid<20171117; salesid++) {
			System.out.println(salesid);
		}
	}

}
