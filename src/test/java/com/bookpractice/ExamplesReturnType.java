package com.bookpractice;

public class ExamplesReturnType {

	
	//I am declaring and instantiating the variables income, and bonus inside returnValue() method.
	public int returnValue() {
		int income = 50000;
		int bonus = 5000;
		int salary = income + bonus;
		return salary;

	}
	
	//I am instantiating variable x and y inside method checkFormula().
	public float checkFormula(float x, float y) {

		float something = (x + y) / (x - y);
		return something;
	}

	public static void main(String[] args) {
		
		//I am initializing obj of Class ExamplesReturnType. I can use one or multiple objects to call the above methods inside main method.
		ExamplesReturnType obj = new ExamplesReturnType();
		
		//Setting mySalary variable equal to the method.
		int mySalary = obj.returnValue();

		//Sending double values to parameterized checkFormula().
		float gibrish = obj.checkFormula(10.0f, 30.0f);

		//Declaring local variables x and y inside main method.
		float x = 10.0f;
		float y = 2.0f;
		double z = obj.checkFormula(x, y);

		//Declaring variable anotherInstance and Instantiating anotherInstance inside parameterized method checkFormula.
		double anotherInstance = obj.checkFormula(15.0f, 5.0f);

		//Declaring and instantiating local variables a, b and c.
		float a = 50.2f;
		float b = 2.0f;
		float c = obj.checkFormula(a, b); 
		
		
		float ab = 10.2f;
		float bc = 9.9f;
		float cd = obj.checkFormula(ab, bc); 

		System.out.println("Value of mySalary is " + mySalary);
		System.out.println("Value of gibrish is " + gibrish);
		System.out.println("Value of mySalary + gibrish is " + (Float.valueOf(mySalary) + gibrish));
		System.out.println("Value of z is " + z);
		System.out.println("Value of anotherInstance is " + anotherInstance);
		System.out.println("Value of c is " + c);

		//Initializing the variables from checkFormula() directly in the main method:
		System.out.println("Value of checkFormula of 1 and 2 is " + obj.checkFormula(1, 2));
		
		//Directly calling returnValue without declaring an object in main method:
		System.out.println("Value of returnValue is " + obj.returnValue());
		
		//Though declared and initialized local variable ab and bc, we are sending values for the parameterized method, rather than using ab and bc variables for cd.
		System.out.println("Value of cd is " + cd);

	}

}
