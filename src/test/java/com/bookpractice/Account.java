package com.bookpractice;

import static java.lang.System.out;

class Account {

	String name;
	String address;
	double balance;

	void display() {
		out.println(name);
		out.println(address);
		out.println(balance);
	}

	double genInterest(double percentageRate) {
		return (balance * percentageRate) / 100.00;

	}

}
