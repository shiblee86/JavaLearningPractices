package com.returningvalue;

public class TestReturningValue {
	/*
	 * With construction we initialize an object. With method we express the behaviors/properties of the object
	 * Constructor is invoked implicitly. Method is invoked explicitly.*/

	public static void main(String[] args) {

		ReturningValue obj = new ReturningValue();

		int result = obj.square(7);

		System.out.println("Square of result is " + result);
		System.out.println("Sqaure of square method is " + obj.square(5));
	}

}
