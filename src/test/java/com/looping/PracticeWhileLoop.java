package com.looping;

public class PracticeWhileLoop {

	int n = 10;

	private void executeWhileMethod() {

		while (n < 100) {
			System.out.println(n);
			break;
		}
	}
	
	protected void executeDoWhileMethod() {
		do {
			System.out.println(n);
			break;
		}while(n<100);
	}

	public static void main(String[] args) {

		PracticeWhileLoop obj = new PracticeWhileLoop();
		obj.executeWhileMethod();
		obj.executeDoWhileMethod();
	}

}
