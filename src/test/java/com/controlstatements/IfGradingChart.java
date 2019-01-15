package com.controlstatements;

public class IfGradingChart {
	
	public static void main(String[]args) {
	
		int grade = 75;
		char a = 'A';
		char b = 'B';
		char c = 'C';
		char d = 'D';
		char f = 'F';
		String s = "Syed received grade ";
		
		if (grade < 65) {
			System.out.println(s + f);
		}
		else if(grade >= 65 && grade < 70) {
			System.out.println(s + d);
		}
		else if(grade >= 70 && grade <80 ) {
			System.out.println(s + c);
		}
		else if(grade >= 80 && grade <85 ) {
			System.out.println(s + b);
		}
		else {
			System.out.println(a);
		}
	
	}
}


