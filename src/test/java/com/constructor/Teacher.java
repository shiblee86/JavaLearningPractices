package com.constructor;

class Teacher {

	String name, gender;
	int phone;

	// Overloading constructor

	Teacher() {
		System.out.println("No info");
	}

	Teacher(String name, String gender) {
		this.name = name;
		this.gender = gender;

	}

	Teacher(String name, String gender, int phone) {
		this.name = name;
		this.gender = gender;
		this.phone = phone;

	}
	
	void displayInformation() {
		System.out.println("Name : " + name);
		System.out.println("Gender : + " + gender);
		System.out.println("Phone : " + phone);
	}

}
