package com.controlstatements;

public class TernaryCondition {

	public static void main(String[] args) {

		int salesAmount = 2000;//We are setting a sales amount for the salesman. 
		String syed = (salesAmount >= 2000) ? "Syed is a Rockstar" : "Syed is a failure";
		System.out.println(syed);
		
		/* String syed --> We are setting the salesman's name. Syed is our salesman
		 * (salesAmount >= 2000) We are comparing the sales amount for syed to our target of 2000. He meets the target since salesAmount of 2000 is greater than or equal to target amount of 2000
		 * The ? sets the condition. Is salesAmount equal to (==) the target amount?
		 * "Syed is a Rockstar" : "Syed is a failure" --> setting the result set for our "?" condition
		 * " : " determines which side to shows based on the condition. We the answer is true, the left side of : is displayed. Otherwise, the right side of : is displayed
		 * So, if Syed's salesAmount is greater than or equal to our target of 2000, then we will see "Syed is a Rockstar". Otherwise, we will see "Syed is a failure" 
		 */
		
		
		int expense = 300; //We know we spent 300 this month 
		int earning = 500; // We know we earned 500 this month
		String savings = (expense > earning) ? "Did not save money" : "Saved " + '$'+ (earning - expense);
		System.out.println(savings);
		
		/*What we want to test is did we have more expense or more earnings FIRST!!!
		 * String savings = (expense > earning) ? ------ is the first part of the test
		 * We are then setting the result set ---> "Did not save money" : "Saved " + '$'+ (earning - expense)
		 * The left side is pretty clear, ""Did not save money"
		 * On the right side, what we want is 'if we saved money, how much did we save?' Hence, we write the following: "Saved " + '$'+ (earning - expense)
		 * "Saved " + '$'+ (earning - expense) ----> '$' - character hence, gets single quotes
		 * (earning - expense) - subtraction
		 * "Saved " + '$'+ (earning - expense) - everything combined
		 */
		
		int targetSavings = 1800;
		String targetDetermination = (targetSavings >=2000) ? "Saved Enough Money" : "Did not saving Enough Money";
		System.out.println(targetDetermination);
		
	}

}
