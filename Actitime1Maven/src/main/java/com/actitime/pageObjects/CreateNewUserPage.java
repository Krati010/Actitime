package com.actitime.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewUserPage
{

@FindBy(name="username")
private WebElement usernameEle;

@FindBy(name="passwordText")
private WebElement passwordTxtEle;

@FindBy(name="passwordTextRetype")
private WebElement passwordTxtRetypeEle;

@FindBy(name="firstName")
private WebElement firstNameEle;

@FindBy(name="lastName")
private WebElement lastNameEle;

@FindBy(name="email")
private WebElement emailEle;

//@FindBy(name="workdayDurationStr")
//private WebElement workDurationEle;


@FindBy(id="right9")
private WebElement chckBxEle;

@FindBy(xpath="//input[@type='submit']")
private WebElement submitEle;


public CreateNewUserPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getUsernameEle() {
	return usernameEle;
}


public WebElement getPasswordTxtEle() {
	return passwordTxtEle;
}


public WebElement getPasswordTxtRetypeEle() {
	return passwordTxtRetypeEle;
}


public WebElement getFirstNameEle() {
	return firstNameEle;
}


public WebElement getLastNameEle() {
	return lastNameEle;
}


public WebElement getEmailEle() {
	return emailEle;
}


public WebElement getChckBxEle() {
	return chckBxEle;
}


public WebElement getSubmitEle() {
	return submitEle;
}


public void createUser(String userName, String password, String retypePassword, String FirstName, String LastName, String email) 
{
	usernameEle.sendKeys(userName);
	passwordTxtEle.sendKeys(password);
	passwordTxtRetypeEle.sendKeys(retypePassword);
	firstNameEle.sendKeys(FirstName);
	lastNameEle.sendKeys(LastName);
	emailEle.sendKeys(email);
	
	if(chckBxEle.isSelected())
	{
		
	}else
	{
		chckBxEle.click();
	}
	
	submitEle.click();
}

}
