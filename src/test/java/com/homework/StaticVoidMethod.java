package com.homework;

public class StaticVoidMethod {

	public StaticVoidMethod() {
		// TODO Auto-generated constructor stub
	}
	
	
	void logingTest(){
		
		System.out.println("Login Home Work");
	}
	
	static void submitHomework() {
		System.out.println("I submitted my homework");
	}

	public static void main(String[] args) {
		
		StaticVoidMethod obj = new StaticVoidMethod();
		obj.logingTest();
		submitHomework();

	}

}