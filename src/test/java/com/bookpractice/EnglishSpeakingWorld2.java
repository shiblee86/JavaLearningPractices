package com.bookpractice;

class EnglishSpeakingWorld2 {

	String mars;

	void visitIdaho() {

		System.out.println("visitIdaho is running:");

		mars = " red planet";
		String atomicCity = " Population: 25";

		System.out.println(mars);
		System.out.println(atomicCity);
	}

	void visitNJ() {

		// mars = " no oxygen";
		System.out.println("visitNJ is running:");

		System.out.println(mars);
		// System.out.println(atomicCity);
	}
}

/*When EnglishSpeakingWorld2 class first flashes into existence, the computer sees String mars and creates space for the mars field/instance variable
*When visitIdaho() method is executed, the method assigns value " red planet" to the mars field. (The visitIdaho() method also prints the value of the mars field
*When visitNJ() method is executed, the method accepts mars value from visitIdaho method and prints the mars value once again
*Since mars is not initiated again inside visitNJ() method, the value of mars is passed from visitIdaho() to visitNJ()
*mars field value is passed from from one method to another.
*If we change the value of mars inside visitNJ(), visitNJ() methods assigns the new value to mars and prints the new value*/