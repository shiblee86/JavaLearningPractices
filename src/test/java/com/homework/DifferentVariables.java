package com.homework;

public class DifferentVariables {
	
	int a =10;
	
	static int b=20;

static void printA() {
	System.out.println(b);
}
void printB() {
	System.out.println(a);
}

public static void main(String [] args) {
	printA();
	DifferentVariables obj = new DifferentVariables();
	obj.printB();
}
	}
