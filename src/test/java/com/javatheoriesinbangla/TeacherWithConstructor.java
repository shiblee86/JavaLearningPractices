package com.javatheoriesinbangla;

public class TeacherWithConstructor {

	public static void main(String[] args) {

		/*
		 * Construction is doing the same thing as a setter method. However, by using
		 * the constructor, we no longer need to create a setter method
		 * Constructors have to use class fields. 
		 * The following will not work:
		 * 
		 * 
		 * public class Student {

	 		Student() {
					String name = "Syed";
					int rollNo = 14;
					int age = 15;
				}
				 
				 void displayStudentInfo() {
					 System.out.println("Student's name is " + name + " and his roll number is " + rollNo + "and he is " + age + "old");
				 }
				 
				 void displayMoreStudentInfo() {
					 String name;
					 int rollNo;
					 int age;
					 System.out.println("Student's name is " + name + " and his roll number is " + rollNo + "and he is " + age + "old");
				 }
				 
				}
				
				The following will also not work:

					class Student {
					
						String name;
						int rollNo;
						int age;
					
						Student() {
							String name = "Syed";
							int rollNo = 14;
							int age = 15;
						}
					
						void displayStudentInfo() {
							System.out.println(
									"Student's name is " + name + " and his roll number is " + rollNo + "and he is " + age + " old");
						}
					
						void displayMoreStudentInfo() {
					
							System.out.println(
									"Student's name is " + name + " and his roll number is " + rollNo + "and he is " + age + " old");
						}
					
					}
					
					The following WILL work:
					
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
		 */

		Teacher teacher1 = new Teacher("Anisul Islam", "male", 01713401234);

		// teacher1.name = "Anisul Islam";
		// teacher1.gender = "male";
		// teacher1.phone = 01713401234;

		// teacher1.setTeachersDetails("Anisul Islam", "male", 01713401234);

		System.out.println("***********With Constructor********************");
		teacher1.displayTeachersInfo();

		System.out.println("*******************************");

		System.out.println(teacher1.getName());
		System.out.println(teacher1.getGender());
		System.out.println(teacher1.getPhone());

		System.out.println("*******************************");

		Teacher teacher2 = new Teacher("Syed Abdullah", "male", 34722345);

		// teacher2.setTeachersDetails("Syed Abdullah", "male", 34722345);

//		teacher2.name = "Aminul Islam";
//		teacher2.gender = "male";
//		teacher2.phone = 017134012;

		System.out.println("***********With Constructor********************");
		teacher2.displayTeachersInfo();

		System.out.println("*******************************");

		System.out.println(teacher2.getName());
		System.out.println(teacher2.getGender());
		System.out.println(teacher2.getPhone());

		System.out.println("*******************************");
		
		Teacher teacher3 = new Teacher();
		teacher3.displayTeachersInfo();

	}

}
