package com.javafordummies;

public class UseAccount {

	public static void main(String[] args) {

		Account myAccount = new Account();

		Account yourAccount = new Account();

		myAccount.name = "Syed";
		yourAccount.name = "Tannu";

		myAccount.address = "350 Fifth Ave";
		yourAccount.address = "Rego Park";

		myAccount.balance = 100.50;
		yourAccount.balance = 200.40;

		myAccount.display();
		System.out.println("..................");
		yourAccount.display();
	}

}
