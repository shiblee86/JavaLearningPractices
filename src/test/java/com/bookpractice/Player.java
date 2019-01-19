package com.bookpractice;

public class Player {
	
	int number = 8;
	
	public void guessNumber() {
		int targetNumber = (int) (Math.random()*10);
		System.out.println("I am thinking of a number between 0 and 9");
		System.out.println("Numer to guess is " + targetNumber);
	}

}
