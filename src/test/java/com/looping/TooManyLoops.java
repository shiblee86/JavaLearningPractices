package com.looping;

//Control statment 
//if else, switch, for loop, while loopo, do while loopo, break, continue
public class TooManyLoops {

	public static void main(String[] args) {

		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i == 2 && j == 2) {
					continue;
					}
				System.out.println("Value of i: " + i + " " + "Value of j: " + j);
				}
			}
			
	}
			
}






