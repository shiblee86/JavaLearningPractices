package com.variables;

public class DataTypes {

	public static void main(String[] args) {

	//Literal - fixed value
		
		//int has a width of 32
		int myMinValue = -2_147_483_648;
		
		int a = 2;
		int b = 3;
		
		//expression - something containing value through an action
				int mathFormula = (a*b);
				
				//byte has a width of 8
				byte myByteValue = -128;
				byte myMaxByte = 127;
				
				//cast
				//To cast but the datatype of your variable in bracket in front on the function
				byte myNewByteV = (byte) (myMaxByte/2);
				
				double d = (double) (b);
				
				//cast
				int converter = (int) (a/2.5);
				
				//short has a width of 16
				short myShortValue = -32768;
				
				//long has a width of 64
				long myLongValue = 100L;
				
				
				/*--------------Challenge-------------------*/
				
				byte udemyChallenge = 10;
				short number = 10000;
				int newNumber = 50;
				
				long resultOfCodeChallenge = 50000L + (udemyChallenge + number + newNumber) * 10L;
				
				System.out.println(resultOfCodeChallenge);
				
	}

}
