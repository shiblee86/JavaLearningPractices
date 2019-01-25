package com.bookpractice;

class Account {

	private String name;
	private String address;
	private double balance;
	private double interestRate;

	public void setName(String n) {
		this.name = n;
	}

	public String getName() {
		return name;
	}

	public void setAddress(String a) {
		this.address = a;
	}

	public String getAddress() {
		return address;
	}

	public void setBalance(double b) {
		this.balance = b;
	}

	public double getBalance() {
		return balance;
	}

	/*
	 * void display() { out.println(name); out.println(address);
	 * out.println(balance); }
	 */
	public void setInterest(double i) {
		this.interestRate = i;
	}

	public double getInterestRate() {
		return interestRate;
	}

	double getInterestAmount() {
		return (balance * interestRate) / 100.00;

	}

}
