package com.bookpractice;

public class NewUseAccount {

	public static void main(String[] args) {

		NewBankAccount myAccount = new NewBankAccount();
		NewBankAccount yourAccount = new NewBankAccount();

		myAccount.setName("Syed");
		/*
		 * When you call a setter method, you feed the setter method with value of the
		 * type being set by the setter method
		 * 
		 * For getter method you do not send any value back to the getter method
		 */
		myAccount.setAddress("Briarwood");
		myAccount.setBalance(55.09);

		yourAccount.setName("Tannu");
		yourAccount.setAddress("Rego Park");
		yourAccount.setBalance(90.99);

		myAccount.setBalance(myAccount.getBalance() + 1);

		System.out.println(myAccount.getName());
		System.out.println(myAccount.getAddress());
		System.out.println(myAccount.getBalance());
		System.out.println(">>..>>>>>>>.....>>>>");
		System.out.println(yourAccount.getName());
		System.out.println(yourAccount.getAddress());
		System.out.println(yourAccount.getBalance());
	}

}
