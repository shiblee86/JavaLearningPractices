package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class SiginingIntoAmazon {

	public SiginingIntoAmazon() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", // We changed the system property. Setting up the driver property
				"/Users/shiblee/chromedriver/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();

		PageFactoryVariables obj = PageFactory.initElements(driver, PageFactoryVariables.class);

		obj.getMyAccount().click();
		obj.getEmailAddress().sendKeys("syed.r.abdullah@gmail.com");
		obj.getContinueButton().submit();
		obj.getPassword().sendKeys("$Sa038575");
		obj.getSigninButton().click();

		System.out.println("Logging in was a success");

	}

}
