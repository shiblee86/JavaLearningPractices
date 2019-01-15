package com.looping;

public class Loops {

	public static void while_loop() {
		
		int a = 200;
		while (a<100) {
			System.out.println(a);
			a++;
		}
	}
	public void forLoop() {
		for(int i=0; i<=100; i++) {
			System.out.println(i);
		}
	}
	
	public void doWhile() {
		int i = 60;
		do {
			System.out.println(i);
			i++;
		}while(i<10);
	}
	
	public static void main(String[]args) {
		;/*
		Loops obj = new Loops();
		obj.forLoop();
		
		System.out.println("Loop Finished");*/
		Loops obj1 = new Loops();
		obj1.doWhile();
		System.out.println("End of doWhile Loop");
		while_loop();
		System.out.println("End of While Loop");
	}

}
