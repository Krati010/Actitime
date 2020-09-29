package com.actitime.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage 
{

	@FindBy(xpath="//span[text()='Create New User']")
	private WebElement createNewUserBtn;
	
	
	public UserListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getCreateNewUserBtn() {
		return createNewUserBtn;
	}
	
	@FindBy(id="logoutLink")
	private WebElement logoutBtn;


	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
	
}
