package com.arrayys;

public class PracitceArrays {

	public void printTwoDimentionalArray() {
		String[][] credentials = new String[5][2];
		credentials[0][0] = "test2";
		credentials[0][1] = "Joe";
		credentials[1][0] = "Abdullah";
		credentials[1][1] = "BB";
		credentials[2][0] = "fdfdfsdfsdfdf";
		credentials[3][0] = "sdfsdfdsf";
		credentials[3][1] = "fsdfsdf";
		credentials[4][0] = "erwrwerwer";
		credentials[4][1] = "j,jh,j,jh,j,";

		System.out.println(credentials[2][0]);

	}

	public void printSingleDimentionalArray() {
		String[] name = { "Syed", "Abdullah", "dlkdkfjsdfj", "dsflksdfjdf", "dfslkfjdfjsdffsdfjdkfj"

		};
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}

	public static void main(String[] args) {
		PracitceArrays obj = new PracitceArrays();
		obj.printSingleDimentionalArray();

	}

}
