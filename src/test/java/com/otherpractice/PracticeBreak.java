package com.otherpractice;

public class PracticeBreak {
	
	int i = 100;
	
	private void getwhileloop() {
		
		while(i <100) {
			System.out.println(i);
			break;
		}
	}
	
	public static void main(String[] args) {
		PracticeBreak obj = new PracticeBreak();
		obj.getwhileloop();
	}

}
