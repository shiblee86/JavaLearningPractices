package com.ecopuzzle;

public class EchoTestDrive {

	public static void main(String[] args) {

		Echo e1 = new Echo();
		Echo e2 = new Echo();

		int x = 0;

		while (x < 4) {

			e1.hello();
			e1.count = e1.count + 1;
			/*
			 * when x = 0, e1.count = 1
			 * when x = 1, e1.count = 2
			 * when x = 2, e1.count = 3
			 * when x = 3, e1.count = 4*/

			if (x == 3) {
				e2.count = e2.count + 1;
			}
			/*
			 * When x = 0, if does not run, e2.count = 0, e1.count = 1
			 * when x = 1, if does not run, e2.count = 0, e1.count = 2
			 * when x = 2, if does not run, e2.count = 0, e1.count = 3
			 * when x = 3, if runs, e2.count = 6, e1.count = 4*/

			if (x > 0) {
				e2.count = e2.count + e1.count;
			}
			/*
			 * When x = 0, if does not run, e1.count = 1, e2.count = 0
			 * When x = 1, e1.count = 2, e2.count = 2
			 * when x = 2, e1.count = 3, e2.count = 5
			 * when x = 3, e1.count = 4, e2.count = 6*/

			x = x + 1;
		}
		System.out.println(e2.count);
		System.out.println(e1.count);

	}
}
