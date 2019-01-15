package com.controlstatements;

public class Switch {
	
	public static void main(String[]args) {
	
		int grade = 75;
		char a = 'A';
		char b = 'B';
		char c = 'C';
		char d = 'D';
		char f = 'F';
		String s = "Syed received grade ";
		
		switch (grade) {
		case 50: System.out.println(s + f);break;
		case 60: System.out.println(s + f);break;
		case 70: System.out.println(s + d);break;
		case 75: System.out.println(s + c);break;
		case 80: System.out.println(s + c);break;
		case 90: System.out.println(s + b);break;
		case 100: System.out.println(s + a);break;
		default: System.out.println("Student did not take the exam");
		
		}
	}

}
