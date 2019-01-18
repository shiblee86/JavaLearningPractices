package com.homework;

public class UsingSwitchStatement {

	public static void main(String[] args) {

		// In Printing switch statement, the value which is assigned to the variable,
		// must match the name of the case.
		/*
		 * For example
		 */

		String firstAttempt = "Handbag";

		switch (firstAttempt) {
		case "Handbag":
			System.out.println(firstAttempt);
			break;
		case "Bigbag":
			System.out.println("Bigbag");
			break;
		default:
			System.out.println("No bag");
		}

		/*
		 * In the above example, the value which is assigned to variable/string object
		 * firstAttempt, "Handbag" is the case as the first case name.
		 * 
		 * 
		 * If the value of the variables/string objects do not match the case name, then
		 * java will print default. For example, the following will not work
		 */
		String first = "Hotel";
		String second = "Motel";
		String third = "Home";
		String last = "Nothing";

		switch (second) {
		case "first":
			System.out.println(first);
			break;
		case "Motel":
			System.out.println(second);
			break;
		case "third":
			System.out.println(third);
			break;
		case "last":
			System.out.println(last);
			break;
		default:
			System.out.println("Does not exist");
		}

		String variable = "three";
		switch (variable) {
		case "one":
			System.out.println("first");
			break;
		case "two":
			System.out.println("second");
			break;
		case "three":
			System.out.println(variable);
			break;
		case "four":
			System.out.println("last");
			break;
		default:
			System.out.println("Does not exist");
		}

	}

}
