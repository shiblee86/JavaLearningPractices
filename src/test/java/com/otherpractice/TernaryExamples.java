package com.otherpractice;

public class TernaryExamples {

	public static double getMonthlyInterestRate(double principalAmount, double totalLoanAmount, int numberOfMonths) {

		double interestRate = (1 / Double.valueOf(numberOfMonths)) * (((totalLoanAmount) / (principalAmount)) - 1);

		return (interestRate * 100);

	}

	public static void main(String[] args) {
		
		String interestRate = getMonthlyInterestRate(50000, 70000, 3) + " is monthly interest rate";
		
		System.out.println(interestRate);
	}

}
