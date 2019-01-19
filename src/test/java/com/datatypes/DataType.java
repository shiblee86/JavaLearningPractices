package com.datatypes;

public class DataType {

	public static void main(String[] args) {
		// Class - blueprint
		//method - behavior
		//Class starts with capital world
		
		/*Java String and string concatenation using plus operator
		 * In Java, String is a class and it can be instantiated likes other classes
		 * Combine two or more strings into a single string (+ operator)*/
		
		{boolean b = true;
		String s1 = "this is " +b;
		System.out.println(s1);}
		
		String e = "Welcome";
		String n = "IT TRAINING";
		String a = "Java";
		
		String all = e + " " + n +" " + a;
		System.out.println(all);
		
		int x = 5;
		int y = 6;
		
		/*switch(expression) {
		case value1:
			//code to be executed
			break;
		case value2:
			break;
		case value3
		
		default:
		}*/
		
		int number = 30;
		switch(number) {
		case 10: System.out.println(10);
			break;
		case 20:System.out.println(20);
			break;
		case 30: System.out.println(30);
		break;
		default: System.out.println("Not in range");
		
		}
		

		
		
		
		
		
	}

}
