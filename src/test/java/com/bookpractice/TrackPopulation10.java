package com.bookpractice;

public class TrackPopulation10 {
	
		static int doBirth(PopulationN<Integer> aCity) {
			PopulationN<Integer> myCity = new PopulationN<Integer>();
			myCity.population = aCity.population + 1;
			int cityPopulation = myCity.population;
			return cityPopulation;
		}

		public static void main(String[] args) {
			PopulationN<Integer> obj = new PopulationN<Integer>();
			obj.population = 2232;
			System.out.println(doBirth(obj));
		}
	}
