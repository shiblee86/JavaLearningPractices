package com.bookpractice;

public class TrackPopulation11 {

	static int doBirth(PopulationN<Integer> aCity) {
		PopulationN<Integer> myCity = new PopulationN<Integer>();
		myCity.population = aCity.population + 1;
		int city = myCity.population;
		return city;

	}

	static String checkPopulation(PopulationN<String> aCity) {
		PopulationN<String> myCity = new PopulationN<String>();
		myCity.population = aCity.population + " in 2019 ";
		String city = myCity.population;
		return city;
	}

	public static void main(String[] args) {
		PopulationN<Integer> obj = new PopulationN<Integer>();
		obj.population = 2232;
		System.out.println(doBirth(obj));

		PopulationN<String> obj2 = new PopulationN<String>();
		obj2.population = "Census of my city is " + doBirth(obj) + " poeple";
		System.out.println(checkPopulation(obj2));
	}
}
