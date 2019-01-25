package com.bookpractice;

import static java.lang.System.out;

class Employee {

	private String name;
	private String jobTitle;

	void setName(String name) {
		this.name = name;
	}

	String getname() {
		return name;
	}

	void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	String getJobTitle() {
		return jobTitle;
	}

	public void cutCheck(double amountPaid) {
		out.printf("Pay to the name of %s", name);
		out.printf("(%s) ***$", jobTitle);
		out.printf("%, .2f\n", amountPaid);
	}

}
