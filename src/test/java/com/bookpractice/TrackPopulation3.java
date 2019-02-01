package com.bookpractice;

public class TrackPopulation3 {

	static void birth(City aCity) {
		aCity.population++;
	}

	public static void main(String[] args) {
		City smackoverAR = new City();
		smackoverAR.population = 2232;
		birth(smackoverAR);
		System.out.println(smackoverAR.population);
	}

}

/*
 * When you pass an object to a method, the object is passed by reference. The statements inside the method can change any values that are stored in  the object's variables. 
 * Those changes do affect the values that are seen by the method.
 * 
 * In the example above, birth() method has a parameter. Instance of sending variables inside the parameter, we are now sending the object of class City. Hence, in the statement
 * birth(City aCity) --> City is the class and aCity is the object.
 * 
 * Inside the main method, we create an object of class City called, smackoverAR. The object, smackoverAR then calls int population variable from City class and assigned the value of 2232 to population variable
 * We are then sending the object, smackoverAR (which has population as a property) to the birth() method.
 * Since birth() has parameter of Class City and object of City class, aCity, and  since smackoverAR is an object of class City, the value carried over by smackoverAR to birth() method, works perfectly.
 * 
 * Remember, birth() has (City aCity) as parameter. smackoverAR is an object of class City. Hence, the value carried by smackoverAR inside birth() creates an output.
 * 
 * Since, smackoverAR is an object, the increment inside birth() method increases the value of smackoverAR to 2232, which is then sent back to main() method's System.out.println(smackoverAR.population);
 * Hence, we see an output of 2233
 * 
 * To clarify certain things, The output is 2233, only because the parameter inside birth() method is Class City and smackoverAR is an object of class City. We we had the following, we would get a compilation error:

				public class City2 {
				
					int population;
				
				}
				
						public class TrackPopulation3 {
		
								static void birth(City aCity) {
									aCity.population++;
								}
		
								public static void main(String[] args) {
									City2 smackoverAR = new City2();
									smackoverAR.population = 2232;
									birth(smackoverAR);
									System.out.println(smackoverAR.population);
								}
		
				}
				
				Here we created an object from City2, called smackoverAR. We are then passing this object into birth(). However, birth() has City aCity as a parameterized variable. Hence, 
				we get a compilation error. 
				
				*/
				
				

