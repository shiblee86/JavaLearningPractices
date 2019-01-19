package com.bookpractice;

import java.util.Scanner;
import static java.lang.System.out;

public class PracticeSwitch {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		out.print("Which verse?");
		String verse = keyboard.next();

		switch (verse) {

		case "one":
			out.print("Last");
			out.println("refrain");
			break;
		case "two":
			out.print("Do not");
			out.println("Do this");
			break;
		case "three":
			out.print("Blah");
			out.println("Blue");
			break;

		}
		//out.println("In the rain");

		keyboard.close();
	}

}
