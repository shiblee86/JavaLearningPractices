package com.javatheoriesinbangla;

public class CreateTeachersInfo {

	public static void main(String[] args) {

		Teacher teacher1 = new Teacher(null, null, 0);

		// teacher1.name = "Anisul Islam";
		// teacher1.gender = "male";
		// teacher1.phone = 01713401234;

		teacher1.setTeachersDetails("Anisul Islam", "male", 01713401234);
		teacher1.displayTeachersInfo();

		System.out.println("*******************************");

		System.out.println(teacher1.getName());
		System.out.println(teacher1.getGender());
		System.out.println(teacher1.getPhone());

		System.out.println("*******************************");

		Teacher teacher2 = new Teacher(null, null, 0);

		teacher2.setTeachersDetails("Syed Abdullah", "male", 34722345);

//		teacher2.name = "Aminul Islam";
//		teacher2.gender = "male";
//		teacher2.phone = 017134012;

		teacher2.displayTeachersInfo();

		System.out.println("*******************************");

		System.out.println(teacher2.getName());
		System.out.println(teacher2.getGender());
		System.out.println(teacher2.getPhone());

		System.out.println("*******************************");

	}

}
