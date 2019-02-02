package com.bookpractice;

public class TrackPopulationNew {

	static CityNew doBirth(CityNew aCity) {
		CityNew myCity = new CityNew();
		myCity.population = aCity.population + 1;
		return myCity;
	}

	public static void main(String[] args) {
		CityNew obj = new CityNew();
		obj.population = 2232;
		obj = doBirth(obj);
		System.out.println(obj);
	}
}
