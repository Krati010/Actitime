package com.actitime.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage
{
   //store the common elements
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement taskEle;
	
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getTaskEle() {
		return taskEle;
	}
	
	
	//store the user as it is common ele
	
	@FindBy(xpath="//div[text()='Users']")
	private WebElement userEle;

	public WebElement getUserEle() {
		return userEle;
	}
	
	
	
}
