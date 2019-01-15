package com.controlstatements;

public class IfElseIf {
	
	public static void main(String[]args) {
		
		int x = 10;
		int y = 20;
		String s = "X and Y have the same value";
		String xy = "X is not equal to Y";
		String x1 = "X is greater than Y";
		String y1 = "Y is greater than X";
		
		if (x == y)
		{System.out.println(s);}
		else if(x > y){
			System.out.println(x1);
		}
		else if(x < y){
			System.out.println(y1);
		}
		else {
			System.out.println(xy);
			}
	}

}
