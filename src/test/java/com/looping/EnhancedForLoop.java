package com.looping;

import java.util.ArrayList;
import java.util.List;

import com.arrayys.Array;

public class EnhancedForLoop {

	public static void main(String[] args) {

		List<String> words = new ArrayList<>();
		words.add("Boy");
		words.add("girl");
		words.add("man");
		words.add("woman");

		System.out.println("Regular for loop for words");
		for (int i = 0; i < words.size(); i++) {
			System.out.print("\t" + words.get(i));
			// System.out.println(words);
			// With each iteration println() prints out the entire ArrayList if we send the
			// name of the ArrayList to println().
		}

		System.out.println();
		System.out.println();
		System.out.println("Enhanced for loop for words");
		for (String word : words) {
			System.out.print("\t" + word);
		}
		/*
		 * Please notice two things: 1. In Enhanced for Loop, the variable inside for
		 * which stores the value we receive from the ArrayList IS NOT int 2. The
		 * variable type which, stores the values obtained from the ArrayList is type as
		 * the ArrayList Here, words ArrayList is of type String, hence, the variable
		 * inside Enhanced For Loop is String 3. When we use Enhanced for loop, in order
		 * to print ArrayList, words, we do not need to send variable, word to the index
		 * of ArrayList We simple send the variable to println() method and Enhanced for
		 * loop iterates through the ArrayList word and stores the value to variable,
		 * word and prints the variable with each iteration. PLEASE NOTICE THE
		 * DIFFERENCE
		 * 
		 * Regular for loop System.out.print("\t" + words.get(i)); --> We are sending i
		 * to take on the value of the index in order for print() method to print the
		 * ArrayList
		 * 
		 * Enhanced for loop System.out.print("\t" + word); --> We are NOT sending word
		 * to take of the value of the ArraList's index. We are sending word to the
		 * print() method.
		 */
		ArrayList<Character> vowels2 = new ArrayList<>();
		vowels2.add('a');
		vowels2.add('e');
		vowels2.add('i');
		vowels2.add('o');
		vowels2.add('u');

		System.out.println();
		System.out.println();
		System.out.println("Regular for loop for vowels2");
		for (int i = 0; i < vowels2.size(); i++) {
			// System.out.println();
			System.out.print("\t" + vowels2.get(i));
		}

		System.out.println();
		System.out.println();
		System.out.println("Enhanced for loop for vowels2");
		for (char letter : vowels2) {
			System.out.print("\t" + letter);
		}
		
		char someChar[] = { 'b', 'c', 'd', 'f', 'g' };

		System.out.println();
		System.out.println();
		System.out.println("Regular for loop for someChar");
		for (int i = 0; i < someChar.length; i++) {
			System.out.print("\t" + someChar[i]);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Enhanced for loop for someChar");
		for (char otherLetter : someChar) {
			System.out.print("\t" + otherLetter);
		}
		
		int[] someNumber = new int[5];
		someNumber[0] = 1;
		someNumber[1] = 2;
		someNumber[2] = 3;
		someNumber[3] = 4;
		someNumber[4] = 5;
		
		System.out.println();
		System.out.println();
		System.out.println("Regular for loop for someNumber for x");
		
		int x = 0;
		
		for (int i = 0; i < someNumber.length; i++) {
			System.out.print("\t someNumber2 value is : " + someNumber[i]);
			x += someNumber[i];
			System.out.println("\t Value of x is " + x);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Enhanced for loop for someNumber for x");
		for (int i : someNumber) {
			System.out.print("\t someNumber value is : " + i);
			x += i;
			System.out.println("\t Value of x is " + x);
		}
		
		int y = 0;
		System.out.println();
		System.out.println();
		System.out.println("Enhanced for loop for someNumber for y");
		for (int i : someNumber) {
			System.out.print("\t someNumber value is : " + i);
			y += i;
			System.out.println("\t Value of y is " + y);
		}
		
		/*Notice the difference in the way we find the value of x when we use for loop and when 
		we use enhanced for loop. When we use for loop, we do the the following:

		x += someNumber[i];

		When we use enhanced for loop, we do the following:

		x += i;

		That is because when we use enhanced for loop, i stores the value from the array. 

		However, in for loop, i does not store the value from the array. i's initial value is 0 and increments
		with i++. i takes the place of the index of the Array and send the value back. However, i DOES NOT take/store
		value of the array.*/
		
		System.out.println();
		System.out.println();
		System.out.println("Regular for loop for newArray");
		String[] newArray = new String[3];
		newArray[0] = "Syed";
		newArray[1] = "Abdullah";
		newArray[2] = "Java";
		
		for (int i = 0; i < newArray.length; i++) {
			System.out.print("\t" + newArray[i]);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Enhanced for loop for newArray");
		for (String name : newArray) {
			System.out.print("\t" + name);
		}
	}
}
