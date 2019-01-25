package com.bookpractice;

public class DoNewPayroll {

	public static void main(String[] args) {

		FullTimeEmployee ft = new FullTimeEmployee();
		PartTimeEmployee pt = new PartTimeEmployee();

		ft.setName("Barry Burd");
		ft.setJobTitle("CEO");
		ft.setWeeklySalary(5000.00);
		ft.setBenefitDeduction(500.00);
		ft.cutCheck(ft.findPaymentAmount());
		System.out.println();

		pt.setName("Stevie");
		pt.setJobTitle("Driver");
		pt.setHourlyRate(7.53);
		pt.cutCheck(pt.findPaymentAmount(10));

	}

}
