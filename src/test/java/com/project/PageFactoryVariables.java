package com.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactoryVariables {

@FindBy(xpath = "(//*[@id='nav-link-accountList'])")
private WebElement myAccount;

@FindBy(xpath = "(//*[@id='ap_email'])")
private WebElement emailAddress;

@FindBy(xpath ="(//*[@id='continue'])")
private WebElement continueButton;

@FindBy(xpath = "(//*[@id='ap_password'])")
private WebElement password;

@FindBy(xpath = "(//*[@id='signInSubmit'])")
private WebElement signinButton;

public WebElement getMyAccount() {
	return myAccount;
}

public WebElement getEmailAddress() {
	return emailAddress;
}

public WebElement getContinueButton() {
	return continueButton;
}

public WebElement getPassword() {
	return password;
}

public WebElement getSigninButton() {
	return signinButton;
}



}
