package com.bookpractice;

public class TrackPopulation5 {
	
	static City5 doBirth(City5 aCity) {
		City5 myCity = new City5();
		myCity.population = aCity.population + 1;
		return myCity;
	}

	public static void main(String[] args) {
		City5 smackoverAR = new City5();
		smackoverAR.population = 2232;
		smackoverAR = doBirth(smackoverAR);
		System.out.println(smackoverAR.returnString());

	}

}
