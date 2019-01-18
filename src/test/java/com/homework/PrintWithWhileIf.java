package com.homework;

public class PrintWithWhileIf {

	public static void main(String[] args) {

		int x = 0;

		while (x < 2) {
			if (x == 1) {
				System.out.println("Option 2");
			} else {
				System.out.println("Option 1");
			}
			x=x+1;
		}
	}

}
