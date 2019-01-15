package com.controlstatements;

public class ConditionalIfElse {
	
	int score = 20;
	char grade;
	
	private void printGrade() {
		if(score >= 95) {
			grade = 'A';
		}
		else if(score <=95 && score >=85) {
			grade = 'B';
		}
		else if(score <85 && score>=75) {
			grade = 'C';
		}
		else if(score <75 && score >=65) {
			grade = 'D';
		}
		else if(score == 65) {
			grade = 'P';
		}
		else if(score >30 && score <65) {
			grade = 'F';
		}
		 System.out.println((score < 30) ? "The student is an idiot" : grade);
	}
	
	public static void main(String[] args) {
		ConditionalIfElse obj = new ConditionalIfElse();
		obj.printGrade();
	}

}
