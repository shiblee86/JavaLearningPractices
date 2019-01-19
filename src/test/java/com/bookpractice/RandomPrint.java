package com.bookpractice;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class RandomPrint {

public static void main(String[] args) {
	
	Scanner keyboard = new Scanner(System.in);
	
	int numGuesses = 1;
	int randomNumber = new Random().nextInt(10) + 1;
	
	System.out.println(randomNumber);
	
	int inputNumber = keyboard.nextInt();
	//System.out.println("User entered " + inputNumber);
	System.out.println(numGuesses);
}
}