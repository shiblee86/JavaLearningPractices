package com.bookpractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DoPayroll {

	static void payOneEmployee(Scanner aScanner) {
		Employee anEmployee = new Employee();

		anEmployee.setName(aScanner.nextLine());
		anEmployee.setJobTitle(aScanner.nextLine());
		anEmployee.cutCheck(aScanner.nextDouble());
		aScanner.nextLine();
	}

	public static void main(String[] args) throws IOException {

		String userDirectory = System.getProperty("user.home");
		String employeeFile = (userDirectory
				+ "/git/JavaLearningPractices/src/test/java/com/bookpractice/EmployeeInfo.txt");

		Scanner diskScanner = new Scanner(new File(employeeFile));

		for (int empNum = 1; empNum <= 3; empNum++) {
			payOneEmployee(diskScanner);
		}
		diskScanner.close();

	}

}
