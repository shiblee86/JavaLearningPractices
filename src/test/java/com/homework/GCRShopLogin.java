package com.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GCRShopLogin {
	
	void loggingIntoMyAccount() {
		
		System.setProperty("webdriver.chrome.driver", //We changed the system property. Setting up the driver property
		        "/Users/shiblee/chromedriver/chromedriver");
		
		WebDriver driver = new ChromeDriver();	
		
		
		driver.navigate().to("http://www.gcrit.com/build3/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//*[@class='ui-button-text'])[3]")).clear();
		driver.findElement(By.xpath("//*[@name='email_address']")).sendKeys("syed.r.abdullah@gmail.com");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("sa038575");
		driver.findElement(By.xpath("(//*[@class='ui-button-text'])[5]")).submit();
		
		System.out.println("Logging in was a success");
	}


}
