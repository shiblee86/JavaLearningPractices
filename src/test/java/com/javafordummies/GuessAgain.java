package com.javafordummies;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class GuessAgain {

public static void main(String[] args) {
	
	Scanner keyboard = new Scanner(System.in);
	
	int numGuesses = 0;
	int randomNumber = new Random().nextInt(3) + 1;
	
	//out.println(" ************ ");
	out.println("Welcome to the guessing game");
	//out.println(" ************ ");
	//out.println();
	//out.println();
	
	//out.print("Enter an int from 1 to 10: ");
	int inputNumber = keyboard.nextInt();
	//numGuesses++;
	//out.println(numGuesses);
	
	while(inputNumber != randomNumber) {
		//out.println();
		//out.println("Try again...");
		//out.println("Enter an int between 1 and 10");
		//inputNumber = keyboard.nextInt();
		//numGuesses++;
	}
	//out.println(" You win after" );
	//out.println(numGuesses + " gusses");
	
	//keyboard.close();
}

}
