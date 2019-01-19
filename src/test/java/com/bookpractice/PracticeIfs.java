package com.bookpractice;

class PracticeIfs {

	int examScore;
	char grade;
	static PracticeIfs obj;
	
	private void printGrade() {

		examScore = 75;
		if (examScore >= 95) {
			grade = 'A';
		} else if (examScore >= 80 && examScore <= 90) {
			grade = 'B';

		} else if (examScore >= 70 && examScore <= 80) {
			grade = 'C';
		} else if (examScore >= 65 && examScore <= 69) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("Grade is " + grade);

	}

	public static void main(String[] args) {
		//PracticeIfs obj = new PracticeIfs();
		obj = new PracticeIfs();
		obj.printGrade();
	}

}
