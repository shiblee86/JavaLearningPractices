package com.datatype;
/*
 * Normally, array is a collection of similar type of elements that have contiguous memory location.

Java array is an object the contains elements of similar data type. It is a data structure where we store similar elements. We can store only fixed set of elements in a java array.

Array in java is index based, first element of the array is stored at 0 index.

Single dimension and Multi dimention

Two dimentional - row and column
column and row*/

public class Array {

	public static void main(String[] args) {
		int row = 3;
		int col = 3;
		
		int table[][] = new int [row][col];
		
		table [0][0] = 21;
		table [0][1] = 23;
		table [0][2] = 25;
		
		table [1][0] = 11;
		table [1][1] = 10;
		table [1][2] = 9;
		
		table [2][0] = 44;
		table [2][1] = 35;
		table [2][2] = 15;
		
/*		System.out.println(table[0].length);
		System.out.println(table[0][2]);*/
		
		for (int i = 0; i <row; i++ ) {
			for(int j = 0; j < col; j++) {
				System.out.print(" " + table [i][j]);
			}
			System.out.println(" ");
		}
		
		
		
		int a [] = new int [5];
		a [0] = 10;
		a [1] = 20;
		a [2] = 30;
		a [3] = 40;
		a [4] = 50;
		
		for (int k=0; k<a.length; k++) {
			System.out.print(" " + a[k]);
			
		}
		
		int b [] = {3, 4, 6, 7, 9};
		
			for (int h = 0; h<b.length; h++) {
				
				System.out.println("   " + b[h]);
				
			}
			
		char [] copyfrom = {'m', 'n', 'o', 'p', 'q', 'r'};
		
		System.out.println(copyfrom[3]);
		
		char [] copyTo = new char[6];
		
		System.arraycopy(copyfrom, 2, copyTo, 0, 2);
		//2 - starting from second index from the arrary - 'm', 'n', 'o', 'p', 'q', 'r'
		
		//0, 2 - two characters fills up the array. the array can store to 7 characters. However, 
		//0 is the lat/long of the character, string, number.
		System.out.println(new String (copyTo));
			}
	}

