package com.constructor;

public class OverloadingContructorTeacher {

	public static void main(String[] args) {

		Teacher teacher1 = new Teacher();
		teacher1.displayInformation();

		Teacher teacher2 = new Teacher("Syed", "male");
		teacher2.displayInformation();

		Teacher teacher3 = new Teacher("Lisa", "Female", 123458);
		teacher3.displayInformation();

	}

}
