package com.bookpractice;

class NewBankAccount {

	/*
	 * When a variable, class or method is set to private, other class cannot call
	 * variables and methods of private access modifier type
	 */

	private String name;
	private String address;
	private double balance;

	void setName(String n) {
		this.name = n;
	}

	String getName() {
		return name;
	}

	void setAddress(String a) {
		this.address = a;
	}

	String getAddress() {
		return address;
	}

	void setBalance(double b) {
		this.balance = b;
	}

	double getBalance() {
		return balance;
	}
}
