package com.bookpractice;

import static java.lang.System.out;

public class TemperatureNice extends Temperature {

	public TemperatureNice() {
		super();
	}

	public TemperatureNice(double number) {
		super(number);
	}

	public TemperatureNice(TempScale scale) {
		super(scale);
	}

	public TemperatureNice(double number, TempScale scale) {
		super(number, scale);
	}

	public void display() {
		out.printf("%5.3f degrees %s\n", getNumber(), getScale());
	}
}
