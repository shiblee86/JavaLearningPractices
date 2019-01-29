package com.bookpractice;

public class UseTemperatureNice {

	public static void main(String[] args) {

		/*
		 * Each time a different constructor is called, object temp is being dropped and
		 * a new object of temp is being created
		 */
		TemperatureNice temp = new TemperatureNice();
		temp.setNumber(70.00);
		temp.setScale(TempScale.FAHRENHEIT);
		temp.display();

		temp = new TemperatureNice(32.00);
		temp.display();

		temp = new TemperatureNice(TempScale.CELCIUS);
		temp.display();

		temp = new TemperatureNice(2.73, TempScale.KELVIN);
		temp.display();

		TemperatureNice temp1 = new TemperatureNice(5.00, TempScale.REAUMUR);
		temp1.display();

		/*
		 * In the above example, object temp is NOT being destroyed since we are
		 * creating a new object temp1
		 */
	}

}
