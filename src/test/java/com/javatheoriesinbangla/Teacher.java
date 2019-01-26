package com.javatheoriesinbangla;

public class Teacher {

	String name, gender;
	int phone;

//	void setTeacherDetails() {
//		
//		System.out.println("Name : " + name);
//		System.out.println("Genger : " + gender);
//		System.out.println("Telephone : " + phone);
//		System.out.println(" \n ");
//		
//	}

	Teacher() {
		name = "Tuni";
		gender = "female";
		phone = 3248790;

		//System.out.println("No Value");
	}

	Teacher(String name, String gender, int phone) {
		this.name = name;
		this.gender = gender;
		this.phone = phone;
	}

	void setTeachersDetails(String name, String gender, int phone) {

		this.name = name;
		this.gender = gender;
		this.phone = phone;

//		System.out.println("Name : " + name);
//		System.out.println("Genger : " + gender);
//		System.out.println("Telephone : " + phone);
//		System.out.println(" \n ");

	}

	void displayTeachersInfo() {
		System.out.println("Name : " + name);
		System.out.println("Genger : " + gender);
		System.out.println("Telephone : " + phone);
		System.out.println(" \n ");
	}

	String getName() {
		return " Name: " + name;
	}

	String getGender() {
		return "Gender: " + gender;
	}

	String getPhone() {
		return "Phone: " + phone;
	}

}
