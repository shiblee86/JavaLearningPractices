package com.javafordummies;

public class UseAccount {

	public static void main(String[] args) {

		Account myAccount = new Account();

		Account yourAccount = new Account();

		myAccount.name = "Syed";
		yourAccount.name = "Tannu";

		myAccount.address = "350 Fifth Ave";
		yourAccount.address = "Rego Park";

		myAccount.balance = 24.02;
		yourAccount.balance = 55.63;

		myAccount.display();
		System.out.println("..................");

		double myInterest = myAccount.genInterest(5.00);
		System.out.println(myAccount.genInterest(5.00));
		System.out.println("..................");
		System.out.println("My account's interest is " + myInterest);

		System.out.println("..................");

		yourAccount.display();
		double yourInterestRate = 7.00;
		System.out.println("Your interest amount is " + yourAccount.genInterest(yourInterestRate));

	}

}
