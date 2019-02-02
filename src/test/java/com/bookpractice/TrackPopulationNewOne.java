package com.bookpractice;

public class TrackPopulationNewOne {
	
	static CityNewOne doBirth(CityNewOne aCity) {
		CityNewOne myCity = new CityNewOne();
		myCity.population = aCity.population + 1;
		return myCity;
	}

	public static void main(String[] args) {
		CityNewOne obj = new CityNewOne();
		obj = doBirth(obj);
		System.out.println(obj);
	}

}
