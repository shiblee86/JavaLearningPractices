package com.controlstatements;

public class Nestedfor {

	public static void main(String[] args) {

		int[] ids = new int[16];
		int start = 20171101;

		for (int x = 0; x < ids.length; x++) {
			ids[x] = start;
			start++;
		}

		for (int salesid = 0; salesid < ids.length; salesid++) {

			System.out.println(ids[salesid]);
		}

	}
}