package com.bookpractice;

public class TrackPopulation4 {

	static City doBirth(City aCity) {
		City myCity = new City();
		myCity.population = aCity.population + 1;
		return myCity;
	}

	public static void main(String[] args) {
		City smackoverAR = new City();
		smackoverAR.population = 2232;
		smackoverAR = doBirth(smackoverAR);
		System.out.println(smackoverAR.population);

	}

}
