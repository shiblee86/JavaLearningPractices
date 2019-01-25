package com.bookpractice;

public class UseAccount {

	public static void main(String[] args) {

		Account myAccount = new Account();

		Account yourAccount = new Account();

		/*
		 * myAccount.name = "Syed"; yourAccount.name = "Tannu";
		 * 
		 * myAccount.address = "350 Fifth Ave"; yourAccount.address = "Rego Park";
		 * 
		 * myAccount.balance = 24.02; yourAccount.balance = 55.63;
		 * 
		 * myAccount.display(); System.out.println("..................");
		 * 
		 * double myInterest = myAccount.genInterest(5.00);
		 * System.out.println(myAccount.genInterest(5.00));
		 * System.out.println("..................");
		 * System.out.println("My account's interest is " + myInterest);
		 * 
		 * System.out.println("..................");
		 * 
		 * yourAccount.display(); double yourInterestRate = 7.00;
		 * System.out.println("Your interest amount is " +
		 * yourAccount.genInterest(yourInterestRate));
		 */

		myAccount.setName("Syed Abdullah");
		myAccount.setAddress("8319 151st");
		myAccount.setBalance(2000.00);
		myAccount.setInterest(2.25);

		yourAccount.setName("Tuni");
		yourAccount.setAddress("8319 141st");
		yourAccount.setBalance(1600.00);
		yourAccount.setInterest(3.00);
		
		System.out.println("My Account details...............................");
		System.out.println(myAccount.getName());
		System.out.println(myAccount.getAddress());
		System.out.println(myAccount.getBalance());
		System.out.println(myAccount.getInterestRate());
		System.out.println(myAccount.getInterestAmount());
		
		System.out.println("Your Account details...............................");
		System.out.println(yourAccount.getName());
		System.out.println(yourAccount.getAddress());
		System.out.println(yourAccount.getBalance());
		System.out.println(yourAccount.getInterestRate());
		System.out.println(yourAccount.getInterestAmount());
		

	}

}
