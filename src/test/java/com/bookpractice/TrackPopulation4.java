package com.bookpractice;

public class TrackPopulation4 {

	static City2 doBirth(City2 aCity) {
		City2 myCity = new City2();
		myCity.population = aCity.population + 1;
		return myCity;
	}

	public static void main(String[] args) {
		City2 smackoverAR = new City2();
		smackoverAR.population = 2232;
		smackoverAR = doBirth(smackoverAR);
		System.out.println(smackoverAR.returnString());

	}

}
