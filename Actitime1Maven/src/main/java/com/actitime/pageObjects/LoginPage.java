package com.actitime.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
@FindBy(name = "username")   //through @findBy we just store element in pom class
private WebElement unTxtBx;

@FindBy(name = "pwd")
private WebElement pwdTxtBx;

@FindBy(id = "loginButton")
private WebElement loginBtn;

@FindBy(xpath="//div[@id='ServerSideErrorMessage']//span")
private WebElement invalidLoginMsgEle;

public LoginPage(WebDriver driver) //parameterised constructor
{
  PageFactory.initElements(driver, this);   //throght pagefactory class we initialise this
}

public WebElement getUnTxtBx() {   //getters
	return unTxtBx;
}

public WebElement getPwdTxtBx() {
	return pwdTxtBx;
}

public WebElement getLoginBtn() {
	return loginBtn;
}


public WebElement getInvalidLoginMsgEle() {
	return invalidLoginMsgEle;
}

public void login(String username, String password)   //reusable method that is parameterised
{
	unTxtBx.sendKeys(username);
	pwdTxtBx.sendKeys(password);
	loginBtn.click();
	
}


}
