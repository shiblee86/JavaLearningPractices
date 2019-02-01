package com.bookpractice;

class TrackPopulation {

	static void birth(int cityPop) {
		cityPop++;
	}

	public static void main(String[] args) {

		int smackoverARpop = 2232;

		birth(smackoverARpop);
		System.out.println(smackoverARpop);
	}

}

/*When you pass a parameter that has one of the eight primitive types of method, that parameter is passed by value. Any changes that the method makes to the value of its parameter don't affect the value of the variables back in the calling code. 

birth() method can apply ++ operator to cityPop, however, ++ will not have any affect on the value of smackoverARpop inside the main() method.

In the example, main() method calls birth() method. Birth method has a parameter (int cityPop). birth() method is also incrementing cityPop inside the method. 

Main method's call to birth() method, sends smackoverARpop as the value for parameterized value, taking place of (int cityPop). 

Once inside birth() method, the value of smackoverARpop does not change by cityPop++ because, smackoverARpop is of type int. The value of smackoverARpop remains the same inside birth() method because of java's pass by value rule.*/ 

