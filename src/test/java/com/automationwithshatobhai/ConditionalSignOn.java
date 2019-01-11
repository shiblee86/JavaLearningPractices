package com.automationwithshatobhai;

public class ConditionalSignOn {

	public static void main(String[] args) {

		// WebElement signOnDisplayed = driver.findElement(By.id(#email));

		boolean signOnDisplayed = false;

		// signOnDisplayed - UI locator
		// if(signOnDisplayed.isDisplayed){obj.sendkey }
		
		if (signOnDisplayed == true) {
			System.out.println("Username sent");
		} else {
			System.out.println("Username is not displayed");
		}

		String tabButton = "one";

		switch (tabButton) {

		case "one":
			System.out.println("Hotel");
			break;
		case "two":
			System.out.println("Flights");
			break;
		case "three":
			System.out.println("Hotel + Flight");
			break;
		case "four":
			System.out.println("Cars");
			break;
		case "five":
			System.out.println("Cruises");
			break;
		default:
			System.out.println("There is no match");

		}

		int i;
		for (i = 1; i <= 2;) {
			if (i > 1) {
				System.out.println("Option 2");
			} else {
				System.out.println("Option 1");
			}
			i++;
		}

	}

}
