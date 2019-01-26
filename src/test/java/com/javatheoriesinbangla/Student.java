package com.javatheoriesinbangla;

class Student {

	String name;
	int rollNo;
	int age;

	Student() {
		 name = "Syed";
		 rollNo = 14;
		 age = 15;
	}

	void displayStudentInfo() {
		System.out.println(
				"Student's name is " + name + " and his roll number is " + rollNo + " and he is " + age + " old");
	}

	void displayMoreStudentInfo() {

		System.out.println(
				"Student's name is " + name + " and his roll number is " + rollNo + " and he is " + age + " old");
	}

}
