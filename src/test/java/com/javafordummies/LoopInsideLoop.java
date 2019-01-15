package com.javafordummies;

public class LoopInsideLoop {

	public static void main(String[] args) {

		for (int i = 0; i <= 7; i++) {

			for (int j = 0; j < 6; j++) {
				System.out.println("Value of i is " + i + " Value of j is " + j);
				System.out.println(".............................................");
			}
		}
	}

}
