package com.bookpractice;

public class FullTimeEmployee extends Employee{

	private double weeklySalary;
	private double benfitDeduction;

	public void setWeeklySalary(double weeklySalaryIn) {
		this.weeklySalary = weeklySalaryIn;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setBenefitDeduction(double benefitDedIn) {
		this.benfitDeduction = benefitDedIn;
	}

	public double getBenefitDedection() {
		return benfitDeduction;
	}

	public double findPaymentAmount() {
		return weeklySalary - benfitDeduction;
	}
	
public static void main(String[] args) {
	
	
}
}
